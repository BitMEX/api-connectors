#!/usr/bin/env python

from bravado.client import SwaggerClient
from bravado.requests_client import RequestsClient
from BitMEXAPIKeyAuthenticator import APIKeyAuthenticator

HOST = "https://testnet.bitmex.com"
SPEC_URI = HOST + "/api/explorer/swagger.json"

# See full config options at http://bravado.readthedocs.io/en/latest/configuration.html
config = {
  # Don't use models (Python classes) instead of dicts for #/definitions/{models}
  'use_models': False,
  # This library has some issues with nullable fields
  'validate_responses': False,
}

bitMEX = SwaggerClient.from_url(
  SPEC_URI,
  config=config)

# You can get a feel for what is available by printing these objects.
# See also https://testnet.bitmex.com/api/explorer
print(dir(bitMEX))
print(dir(bitMEX.Trade))

# Basic unauthenticated call
res = bitMEX.Trade.Trade_get(symbol='XBTUSD', count=40).result()
print(res)


#
# Authenticated calls
#
# To do authentication, you must generate an API key.
# Do so at https:https://testnet.bitmex.com/app/apiKeys

API_KEY = '<API_KEY_HERE>'
API_SECRET = '<API_SECRET_HERE>'

request_client = RequestsClient()
request_client.authenticator = APIKeyAuthenticator(HOST, API_KEY, API_SECRET)

bitMEXAuthenticated = SwaggerClient.from_url(
  SPEC_URI,
  config=config,
  http_client=request_client)

print(dir(bitMEXAuthenticated.Position))

# Basic unauthenticated call
res = bitMEXAuthenticated.Position.Position_get().result()
print(res)
