#!/usr/bin/env python

from bravado.client import SwaggerClient
from bravado.requests_client import RequestsClient
from BitMEXAPIKeyAuthenticator import APIKeyAuthenticator


def bitmex(test=True, config=None, api_key=None, api_secret=None):

    if config is None:
        # See full config options at http://bravado.readthedocs.io/en/latest/configuration.html
        config = {
            # Don't use models (Python classes) instead of dicts for #/definitions/{models}
            'use_models': False,
            # bravado has some issues with nullable fields
            'validate_responses': False,
            # Returns response in 2-tuple of (body, response); if False, will only return body
            'also_return_response': True,
        }

    if test:
        host = 'https://testnet.bitmex.com'
    else:
        host = 'https://www.bitmex.com'

    spec_uri = host + '/api/explorer/swagger.json'

    api_key = api_key
    api_secret = api_secret

    if api_key and api_secret:
        request_client = RequestsClient()
        request_client.authenticator = APIKeyAuthenticator(host, api_key, api_secret)

        return SwaggerClient.from_url(spec_uri, config=config, http_client=request_client)

    else:
        return SwaggerClient.from_url(spec_uri, config=config)
