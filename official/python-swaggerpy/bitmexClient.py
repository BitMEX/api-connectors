#!/usr/bin/env python

from swaggerpy.client import SwaggerClient
from swaggerpy.http_client import SynchronousHttpClient

http_client = SynchronousHttpClient()

bitMEX = SwaggerClient(
    "https://testnet.bitmex.com/api/explorer/resources",
    http_client=http_client)

res = bitMEX.trade.trade_getRecent({symbol: 'XBTUSD', count: 40})

print(res)
