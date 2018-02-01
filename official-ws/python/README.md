# Python Adapter for BitMEX Realtime Data

This is a reference adapter for receiving realtime data from the BitMEX API. See [the BitMEX documentation](https://testnet.bitmex.com/app/wsAPI)
for more information on the websocket API.

# Installation

`pip install bitmex-ws`

# Quickstart

`BitMEXWebsocket` is the main entry point to connect to the BitMEX websocket API. The API supports both authenticated
and unauthenticated clients. Some endpoints require credentials, for more info see
[the documentation on authentication.](https://testnet.bitmex.com/app/wsAPI#Authentication)

To get started, instantiate a connection:

    from bitmex_websocket import BitMEXWebsocket
    ws = BitMEXWebsocket(endpoint="https://testnet.bitmex.com/api/v1", symbol="XBTUSD", api_key=None, api_secret=None)

If you want to subscribe to authenticated data streams, [create an API key](https://testnet.bitmex.com/app/apiKeys) and
supply the corresponding values in `api_key` and `api_secret`. BitMEX has two systems - `testnet` for simulated
trading and testing, and `www` for live trading. API keys are specific to one system. If you created the key on testnet,
make sure your connection string points to testnet as well.

Once you are connected, you can retrieve data via the connector's methods. The latest data will be streamed to the
client - no need to poll the server.

    ws.get_instrument()
    ws.get_ticker()
    ws.funds()
    ws.market_depth()
    ws.open_orders()
    ws.recent_trades()

`main.py` has a full example of how to connect to BitMEX:

    $ python main.py
    2018-02-01 11:51:53,355 - bitmex_websocket - INFO - Connecting to wss://testnet.bitmex.com/realtime?subscribe=execution:XBTUSD,instrument:    ...
    2018-02-01 11:51:53,356 - bitmex_websocket - INFO - Not authenticating.
    2018-02-01 11:51:54,357 - bitmex_websocket - INFO - Connected to WS.
    2018-02-01 11:51:54,360 - bitmex_websocket - INFO - Got all market data. Starting.
    2018-02-01 11:51:54,364 - root - INFO - Ticker: {'last': 8947.0, 'sell': 8948.0, 'buy': 8947.0, 'mid': 8947.0}
    2018-02-01 11:51:54,369 - root - INFO - Market Depth: [{'id': 15500000950, 'side': 'Sell', 'size': 384, 'price': 999990.5, 'symbol': 'XBTUSD' ...
    2018-02-01 11:51:54,370 - root - INFO - Recent Trades: [{'side': 'Sell', 'size': 29856, 'price': 8947, 'symbol': 'XBTUSD', 'timestamp':       ...

# Compatibility
This module supports Python 3.5+.

