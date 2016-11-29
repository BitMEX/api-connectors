### Python Adapter for BitMEX Realtime Data

This is a reference adapter for receiving realtime data from the BitMEX API. See the source for documentation.

### Usage

Edit main.py to include your credentials. I recommend starting out on the
[Testnet](https://testnet.bitmex.com).

```bash
python setup.py install
python main.py
> 2015-07-29 11:30:09,870 - bitmex_websocket - INFO - Connecting to wss://testnet.bitmex.com/realtime?subscribe=execution:XBTN15,order:XBTN15,orderBook25:XBTN15,position:XBTN15,quote:XBTN15,trade:XBTN15,margin
> 2015-07-29 11:30:09,870 - bitmex_websocket - INFO - Authenticating with email/password.
> 2015-07-29 11:30:10,872 - bitmex_websocket - INFO - Connected to WS.
> 2015-07-29 11:30:11,081 - bitmex_websocket - INFO - Got all market data. Starting.
> 2015-07-29 11:30:11,082 - root - INFO - Instrument data: {u'quoteCurrency': u'USD', u'askPrice': 282.33, ....
```



