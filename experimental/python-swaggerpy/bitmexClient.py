#!/usr/bin/env python

import json

from swaggerpy.client import SwaggerClient
from swaggerpy.http_client import SynchronousHttpClient

http_client = SynchronousHttpClient()

bitMEX = SwaggerClient(
    "https://www.bitmex.com/api/explorer/resources",
    http_client=http_client)

res = bitMEX.trade.trade_getRecent({symbol: 'XBTP14', count: 40})

print(res)
