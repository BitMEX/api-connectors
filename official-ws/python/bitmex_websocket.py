from dateutil.tz import tzutc
import websocket
import threading
import traceback
from time import sleep
import json
import logging
import urllib
import math
from datetime import datetime, timedelta
from util.api_key import generate_nonce, generate_signature


# Naive implementation of connecting to BitMEX websocket for streaming realtime data.
# The Marketmaker still interacts with this as if it were a REST Endpoint, but now it can get
# much more realtime data without polling the hell out of the API.
#
# The Websocket offers a bunch of data as raw properties right on the object.
# On connect, it synchronously asks for a push of all this data then returns.
# Right after, the MM can start using its data. It will be updated in realtime, so the MM can
# poll really often if it wants.
class BitMEXWebsocket:

    # Don't grow a table larger than this amount. Helps cap memory usage.
    MAX_TABLE_LEN = 200

    def __init__(self, endpoint, symbol, rest_client, api_key=None, api_secret=None, on_candle_callback=None):
        '''Connect to the websocket and initialize data stores.'''
        self.logger = logging.getLogger(__name__)
        self.logger.debug("Initializing WebSocket.")

        self.endpoint = endpoint
        self.symbol = symbol
        self.bad_minute = True
        self.candle = { 'timestamp': None,
                        'low': 0,
                        'high': 0,
                        'open': 0,
                        'close': 0 }

        self.rest_client = rest_client
        self.on_candle = on_candle_callback

        if api_key is not None and api_secret is None:
            raise ValueError('api_secret is required if api_key is provided')
        if api_key is None and api_secret is not None:
            raise ValueError('api_key is required if api_secret is provided')

        self.api_key = api_key
        self.api_secret = api_secret

        self.data = {}
        self.keys = {}
        self.exited = False

        # We can subscribe right in the connection querystring, so let's build that.
        # Subscribe to all pertinent endpoints
        wsURL = self.__get_url()
        self.logger.info("Connecting to %s" % wsURL)
        self.__connect(wsURL, symbol)
        self.logger.info('Connected to WS.')

        # Connected. Wait for partials
        self.__wait_for_symbol(symbol)
        if api_key:
            self.__wait_for_account()
        self.logger.info('Got all market data. Starting.')

    def exit(self):
        '''Call this to exit - will close websocket.'''
        self.exited = True
        self.ws.close()

    def get_instrument(self):
        '''Get the raw instrument data for this symbol.'''
        # Turn the 'tickSize' into 'tickLog' for use in rounding
        instrument = self.data['instrument'][0]
        instrument['tickLog'] = int(math.fabs(math.log10(instrument['tickSize'])))
        return instrument

    def get_ticker(self):
        '''Return a ticker object. Generated from quote and trade.'''
        lastQuote = self.data['quote'][-1]
        lastTrade = self.data['trade'][-1]
        ticker = {
            "last": lastTrade['price'],
            "buy": lastQuote['bidPrice'],
            "sell": lastQuote['askPrice'],
            "mid": (float(lastQuote['bidPrice'] or 0) + float(lastQuote['askPrice'] or 0)) / 2
        }

        # The instrument has a tickSize. Use it to round values.
        instrument = self.data['instrument'][0]
        return {k: round(float(v or 0), instrument['tickLog']) for k, v in ticker.items()}

    def funds(self):
        '''Get your margin details.'''
        return self.data['margin'][0]

    def market_depth(self):
        '''Get market depth (orderbook). Returns all levels.'''
        return self.data['orderBookL2']

    def open_orders(self, clOrdIDPrefix):
        '''Get all your open orders.'''
        orders = self.data['order']
        # Filter to only open orders (leavesQty > 0) and those that we actually placed
        return [o for o in orders if str(o['clOrdID']).startswith(clOrdIDPrefix) and o['leavesQty'] > 0]

    def recent_trades(self):
        '''Get recent trades.'''
        return self.data['trade']

    def get_candles(self, num=None):
        '''Get num (or all) candles'''
        if num:
            if num > len(self.data['candle']):
                return self.data['candle']
            else:
                return self.data['candle'][-num:]
        else:
            '''num not given, return all'''
            return self.data['candle']

    #
    # End Public Methods
    #

    def __connect(self, wsURL, symbol):
        '''Connect to the websocket in a thread.'''
        self.logger.debug("Starting thread")

        self.ws = websocket.WebSocketApp(wsURL,
                                         on_message=self.__on_message,
                                         on_close=self.__on_close,
                                         on_open=self.__on_open,
                                         on_error=self.__on_error,
                                         header=self.__get_auth())

        self.wst = threading.Thread(target=lambda: self.ws.run_forever())
        self.wst.daemon = True
        self.wst.start()
        self.logger.debug("Started thread")

        # Wait for connect before continuing
        conn_timeout = 5
        while not self.ws.sock or not self.ws.sock.connected and conn_timeout:
            sleep(1)
            conn_timeout -= 1
        if not conn_timeout:
            self.logger.error("Couldn't connect to WS! Exiting.")
            self.exit()
            raise websocket.WebSocketTimeoutException('Couldn\'t connect to WS! Exiting.')

    def __get_auth(self):
        '''Return auth headers. Will use API Keys if present in settings.'''
        if self.api_key:
            self.logger.info("Authenticating with API Key.")
            # To auth to the WS using an API key, we generate a signature of a nonce and
            # the WS API endpoint.
            expires = generate_nonce()
            return [
                "api-expires: " + str(expires),
                "api-signature: " + generate_signature(self.api_secret, 'GET', '/realtime', expires, ''),
                "api-key:" + self.api_key
            ]
        else:
            self.logger.info("Not authenticating.")
            return []

    def __get_url(self):
        '''
        Generate a connection URL. We can define subscriptions right in the querystring.
        Most subscription topics are scoped by the symbol we're listening to.
        '''

        # You can sub to orderBookL2 for all levels, or orderBook10 for top 10 levels & save bandwidth
        symbolSubs = ["execution", "instrument", "order", "orderBookL2", "position", "quote", "trade"]
        genericSubs = ["margin"]

        subscriptions = [sub + ':' + self.symbol for sub in symbolSubs]
        subscriptions += genericSubs

        urlParts = list(urllib.parse.urlparse(self.endpoint))
        urlParts[0] = urlParts[0].replace('http', 'ws')
        urlParts[2] = "/realtime?subscribe={}".format(','.join(subscriptions))
        return urllib.parse.urlunparse(urlParts)

    def __wait_for_account(self):
        '''On subscribe, this data will come down. Wait for it.'''
        # Wait for the keys to show up from the ws
        while not {'margin', 'position', 'order', 'orderBookL2'} <= set(self.data):
            if self.exited:
                break
            sleep(0.1)

    def __wait_for_symbol(self, symbol):
        '''On subscribe, this data will come down. Wait for it.'''
        while not {'instrument', 'trade', 'quote', 'orderBookL2', 'candle'} <= set(self.data):
            if self.exited:
                break
            sleep(0.1)
        while not len(self.data['candle']) > 0:
            if self.exited:
                break
            sleep(0.1)

    def __send_command(self, command, args=None):
        '''Send a raw command.'''
        if args is None:
            args = []
        self.ws.send(json.dumps({"op": command, "args": args}))

    def __on_message(self, message):
        '''Handler for parsing WS messages.'''
        message = json.loads(message)
        self.logger.debug(json.dumps(message))

        table = message['table'] if 'table' in message else None
        action = message['action'] if 'action' in message else None
        try:
            if 'subscribe' in message:
                self.logger.debug("Subscribed to %s." % message['subscribe'])
            elif action:

                if table not in self.data:
                    self.data[table] = []

                # There are four possible actions from the WS:
                # 'partial' - full table image
                # 'insert'  - new row
                # 'update'  - update row
                # 'delete'  - delete row
                if action == 'partial':
                    self.logger.debug("%s: partial" % table)
                    self.data[table] += message['data']
                    # Keys are communicated on partials to let you know how to uniquely identify
                    # an item. We use it for updates.
                    self.keys[table] = message['keys']
                elif action == 'insert':
                    self.logger.debug('%s: inserting %s' % (table, message['data']))
                    self.data[table] += message['data']
                    # Added for OHLC candles
                    if table == 'trade':
                        self.__add_candle(message)

                    # Limit the max length of the table to avoid excessive memory usage.
                    # Don't trim orders because we'll lose valuable state if we do.
                    if table not in ['order', 'orderBookL2'] and len(self.data[table]) > BitMEXWebsocket.MAX_TABLE_LEN:
                        self.data[table] = self.data[table][int(BitMEXWebsocket.MAX_TABLE_LEN / 2):]
                elif action == 'update':
                    self.logger.debug('%s: updating %s' % (table, message['data']))
                    # Locate the item in the collection and update it.
                    for updateData in message['data']:
                        item = findItemByKeys(self.keys[table], self.data[table], updateData)
                        if not item:
                            return  # No item found to update. Could happen before push
                        item.update(updateData)
                        # Remove cancelled / filled orders
                        if table == 'order' and item['leavesQty'] <= 0:
                            self.data[table].remove(item)
                elif action == 'delete':
                    self.logger.debug('%s: deleting %s' % (table, message['data']))
                    # Locate the item in the collection and remove it.
                    for deleteData in message['data']:
                        item = findItemByKeys(self.keys[table], self.data[table], deleteData)
                        self.data[table].remove(item)
                else:
                    raise Exception("Unknown action: %s" % action)
        except:
            self.logger.error(traceback.format_exc())

    def __add_historic_candles(self):
        historic = self.rest_client.Trade.Trade_getBucketed(symbol=self.symbol,
                                                        count=62,binSize='1m',
                                                        reverse=True,
                                                        partial=False).result()[0]
        for period in reversed(historic):
            candle_timestr = datetime.strftime(self.candle['timestamp'], '%Y%m%d%H%M%S')
            period_timestr = datetime.strftime(period['timestamp'], '%Y%m%d%H%M%S')
            if candle_timestr == period_timestr:
                break
            else:
                new_candle = { 'timestamp': period['timestamp'],
                               'open': period['open'],
                               'high': period['high'],
                               'low': period['low'],
                               'close': period['close'] }
                self.data['candle'].append(new_candle)

    def __replace_last_candle(self):
        # detect gap
        timen = self.data['candle'][-1]['timestamp']
        timeo = self.data['candle'][-2]['timestamp']
        gap_size = int((timen - timeo).seconds / 60)
        if gap_size > 1:
            self.logger.warning('%s minute gap in candle data detected' % gap_size)
        historic = self.rest_client.Trade.Trade_getBucketed(symbol=self.symbol,
                                                        count=3,binSize='1m',
                                                        reverse=True,
                                                        partial=False).result()[0]
        for period in historic:
            candle_timestr = datetime.strftime(self.data['candle'][-1]['timestamp'], '%Y%m%d%H%M%S')
            period_timestr = datetime.strftime(period['timestamp'], '%Y%m%d%H%M%S')
            if candle_timestr == period_timestr:
                new_candle = { 'timestamp': period['timestamp'],
                               'open': period['open'],
                               'high': period['high'],
                               'low': period['low'],
                               'close': period['close'] }
                self.data['candle'][-1] = new_candle

    def __trim_candle_data(self):
        if len(self.data['candle']) > BitMEXWebsocket.MAX_TABLE_LEN:
            self.data['candle'] = self.data['candle'][int(BitMEXWebsocket.MAX_TABLE_LEN / 2):]

    def __start_new_candle(self, trade_time, price):
        delta_to_next = timedelta(seconds=(59 - trade_time.second),
                                  microseconds=(1000000 - trade_time.microsecond))
        new_candle_time = trade_time.replace(tzinfo=tzutc()) + delta_to_next
        self.candle = { 'timestamp': new_candle_time,
                        'open': price,
                        'low': 0,
                        'high': 0,
                        'close': 0 }

    def __bump_prices(self, trades):
        for trade in trades:
            price = trade['price']
            if price > self.candle['high']:
                self.candle['high'] = price
            if self.candle['low'] == 0 or price < self.candle['low']:
                self.candle['low'] = price
            self.candle['close'] = price

    def __publish_candle(self, trade_time, price):
        self.__replace_last_candle()
        self.data['candle'].append(self.candle)
        self.__trim_candle_data()
        if self.on_candle:
            self.on_candle(self, trade_time, price)

    def __add_candle(self, message):
        '''add candle data'''
        trade_time = datetime.strptime(message['data'][-1]['timestamp'], '%Y-%m-%dT%H:%M:%S.%fZ')
        # bins are labeled for the top of the minute
        current_minute = trade_time.minute + 1
        if current_minute == 60:
            # don't use 60 as a minute name
            current_minute = 0
        last_price = message['data'][-1]['price']
        try:
            candle_minute = self.candle['timestamp'].minute
        except AttributeError:
            # First time through the code, no current candle time (building mode)
            candle_minute = -1
        if current_minute != candle_minute:
            if candle_minute > -1:
                if not self.bad_minute:
                    if 'candle' not in self.data:
                        self.data['candle'] = []
                        self.__add_historic_candles()
                    '''Publish candle'''
                    self.__publish_candle(trade_time, last_price)
                else:
                    self.bad_minute = False
            self.__start_new_candle(trade_time, last_price)
        self.__bump_prices(message['data'])

    def __on_error(self, error):
        '''Called on fatal websocket errors. We exit on these.'''
        if not self.exited:
            self.logger.error("Error : %s" % error)
            self.exited = True
            raise websocket.WebSocketException(error)

    def __on_open(self):
        '''Called when the WS opens.'''
        self.logger.debug("Websocket Opened.")

    def __on_close(self):
        '''Called on websocket close.'''
        self.logger.info('Websocket Closed')
        self.exited = True


# Utility method for finding an item in the store.
# When an update comes through on the websocket, we need to figure out which item in the array it is
# in order to match that item.
#
# Helpfully, on a data push (or on an HTTP hit to /api/v1/schema), we have a "keys" array. These are the
# fields we can use to uniquely identify an item. Sometimes there is more than one, so we iterate through all
# provided keys.
def findItemByKeys(keys, table, matchData):
    for item in table:
        matched = True
        for key in keys:
            if item[key] != matchData[key]:
                matched = False
        if matched:
            return item
