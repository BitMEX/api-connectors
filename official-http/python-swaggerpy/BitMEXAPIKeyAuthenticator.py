import urllib.parse
import time
import hashlib
import hmac
from bravado.requests_client import Authenticator


class APIKeyAuthenticator(Authenticator):
    """?api_key authenticator.
    This authenticator adds BitMEX API key support via header.
    :param host: Host to authenticate for.
    :param api_key: API key.
    :param api_secret: API secret.
    """

    def __init__(self, host, api_key, api_secret):
        super(APIKeyAuthenticator, self).__init__(host)
        self.api_key = api_key
        self.api_secret = api_secret

    # Forces this to apply to all requests.
    def matches(self, url):
        if "swagger.json" in url:
            return False
        return True

    # Add the proper headers via the `expires` scheme.
    def apply(self, r):
        # 5s grace period in case of clock skew
        expires = int(round(time.time()) + 5)
        r.headers['api-expires'] = str(expires)
        r.headers['api-key'] = self.api_key
        prepared = r.prepare()
        body = prepared.body or ''
        url = prepared.path_url
        # print(json.dumps(r.data,  separators=(',',':')))
        r.headers['api-signature'] = self.generate_signature(self.api_secret, r.method, url, expires, body)
        return r

    # Generates an API signature.
    # A signature is HMAC_SHA256(secret, verb + path + expires + data), hex encoded.
    # Verb must be uppercased, url is relative, expires must be an increasing 64-bit integer
    # and the data, if present, must be JSON without whitespace between keys.
    #
    # For example, in psuedocode (and in real code below):
    #
    # verb=POST
    # url=/api/v1/order
    # expires=1518064237
    # data={"symbol":"XBTUSD","quantity":1,"price":52000.50}
    # message='POST/api/v1/order1518064237{"symbol":"XBTUSD","quantity":1,"price":52000.50}'
    # signature = HEX(HMAC_SHA256(secret, message))
    def generate_signature(self, secret, verb, url, expires, data):
        """Generate a request signature compatible with BitMEX."""
        # Parse the url so we can remove the base and extract just the path.
        parsedURL = urllib.parse.urlparse(url)
        path = parsedURL.path
        if parsedURL.query:
            path = path + '?' + parsedURL.query

        message = bytes(verb + path + str(expires) + data, 'utf-8')
        # print("Computing HMAC: %s" % message)

        signature = hmac.new(bytes(secret, 'utf-8'), message, digestmod=hashlib.sha256).hexdigest()
        # print("Signature: %s" % signature)

        return signature

