# BitMEX Python client
A Python library to interact with [BitMEX's](https://www.bitmex.com) public API. The library can be used to fetch
market data, make trades, or create third-party clients.

Python objects are created dynamically using [Bravado](https://github.com/Yelp/bravado) to auto-generate
a `BitMEX` adapter object from BitMEX's [Swagger JSON](https://www.bitmex.com/api/explorer/swagger.json).

Unauthenticated clients are rate-limited to 150 requests per 5 minutes. The limit is increased to 300 requests per 5
minutes for authenticated clients.

For applications requiring higher limits, try [the Websocket API.](https://www.bitmex.com/app/wsAPI) For more
information on rate limiting, see [the BitMEX documentation.](https://www.bitmex.com/app/restAPI#Rate-Limits)


## Installation

    $ pip install bitmex

## Quickstart
This is an introduction on how to get started with BitMEX. First, make sure the BitMEX library is installed.

The next thing you need to do is import the library and get an instance of the client:

    import bitmex
    client = bitmex.bitmex()

Bravado creates a function for each API endpoint exposed by BitMEX.
[You can view the list of endpoints here.](https://testnet.bitmex.com/api/explorer/) Endpoints are accessed like
regular class attributes: for example, `client.Quote` or `client.Trade`.

Each one has a set of methods that mirror the corresponding REST methods. They can be listed via `dir()`,
and are called like regular methods. Call `result()` to make the request and get results. For example:

    client.Quote.Quote_get(symbol='XBTUSD').result()

The `result()` function returns a 2-tuple of the form `(body, response)`. The parameters supported by each method are
listed in [the API explorer documentation.](https://testnet.bitmex.com/api/explorer)

### Testnet vs Live
BitMEX has an environment for testing programs and strategies at [Testnet.](https://testnet.bitmex.com/) Trading is
completely free and is identical to the live market.

The client connects to testnet by default. To connect to the live environment, create a client with the parameter
`test=False`:

    import bitmex
    client = bitmex.bitmex(test=False, api_key=<API_KEY>, api_secret=<API_SECRET>)

### Get a quote
Get the most recent bid/ask price for an instrument:

    >>> import bitmex
    >>> client = bitmex.bitmex()
    >>> result = client.Quote.Quote_get(symbol="XBTUSD", reverse=True, count=1).result()
    >>> result[0][0]['bidPrice']
    13489.5

    >>> result[0][0]['bidSize']
    4950

    >>> result[0][0]['askPrice']
    13495.5

### Instrument data
The API supports fetching full data for one or multiple instruments.

    >>> client.Instrument.Instrument_get(filter=json.dumps({'symbol': 'XBTJPY'})).result()
    ([{'symbol': 'XBTJPY', 'rootSymbol': 'XBJ', 'state': 'Open', 'typ': 'FFWCSX', 'listing': datetime.datetime(2017, 10, 29, 12, 0, ...

### Date ranges
Any time-based parameters accept Python `datetime` objects. All timestamps returned from BitMEX are UTC.

    >>> client = bitmex.bitmex()
    >>> client.Quote.Quote_get(symbol="XBTUSD", startTime=datetime.datetime(2018, 1, 1)).result()
    ([{'timestamp': datetime.datetime(2018, 1, 1, 0, 0, 11, 701000, tzinfo=tzutc()), 'symbol': 'XBTUSD', ...

    >>> client.Quote.Quote_get(symbol="XBTUSD", endTime=datetime.datetime.utcnow()).result()
    ([{'timestamp': datetime.datetime(2018, 1, 11, 12, 14, 9, 392000, tzinfo=tzutc()), 'symbol': 'XBTUSD', ...

### Authenticated endpoints
Private endpoints require authentication. Clients authenticate with an API key. [Keys can be
generated here.](https://testnet.bitmex.com/app/apiKeys)

To get an authenticated client instance:

    >>> client = bitmex.bitmex(api_key=<YOUR API KEY>, api_secret=<YOUR API SECRET>)

If you try to access a private endpoint with an unauthenticated client, an `HTTPUnauthorized` error is raised. Calls
to private endpoints work the same as regular ones:

    client.Position.Position_get(filter=json.dumps({'symbol': 'XBTUSD'})).result()


## Advanced usage

### Placing orders
An order can be placed through the `Order_new()` function. See
[the API explorer](https://testnet.bitmex.com/api/explorer/#!/Order/Order_new) for required and optional parameters.

    client.Order.Order_new(symbol='XBTUSD', orderQty=10, price=12345.0).result()

Instruments can be shorted by specifying a negative order quantity:

    client.Order.Order_new(symbol='XBTUSD', orderQty=-10, price=12345.0).result()

### Amending orders
Orders can be amended by providing the original order ID. Quantity or price can be amended:

    >>> client.Order.Order_new(symbol='XBTUSD', orderQty=10, price=1389.0).result()
    ({'orderID': '688e6956-95df-4b12-a411-7df0edc82135', ...

    >>> client.Order.Order_amend(orderID='688e6956-95df-4b12-a411-7df0edc82135', price=13890.0).result()

### Canceling orders
An order can be canceled given the order ID:

    client.Order.Order_cancel(orderId='').result()

You can cancel all open orders:

    client.Order.Order_cancelAll().result()

### Filtering results
Results can be filtered by most attributes. Use a regular python dict in the form `{'key': 'value'}`. The endpoint
requires JSON - use `json.dumps` to convert your python dict into a properly-formatted string. For example:

    client.Instrument.Instrument_get(filter=json.dumps({'rootSymbol': 'XBT'})).result()

### Pagination
The BitMEX API returns a maximum of 500 results per request. The default number of results is 100. Use the parameter
`count` to increase this:

    client.Instrument.Instrument_get(count=250).result()

To get more than 500 results, use the parameter `start` to specify the first result. Results are zero-indexed:

    first_page = client.Instrument.Instrument_get(count=500).result()
    second_page = client.Instrument.Instrument_get(count=500, start=500).result()

By default, results are returned oldest first. To get newest rows first, use `reverse=True`:

    newest_instruments = client.Instrument.Instrument_get(reverse=True).result()

### Error codes

#### HTTP 429
You have hit your rate limit. For each request, BitMEX returns these headers:

    'X-RateLimit-Limit': '150',
    'X-RateLimit-Remaining': '147',
    'X-RateLimit-Reset': '1516119556'

To view the headers for a response, use the `headers` attribute of the response object:

    >>> result = client.Instrument.Instrument_get(symbol='XBTUSD').result()
    >>> result[1].headers
    {'X-RateLimit-Limit': '150', 'Content-Type': 'application/json; charset=utf-8', ...


Use these headers to determine your current limit and remaining requests. At the UNIX timestamp designated by
`X-Ratelimit-Reset`, you will have enough requests left to retry your current request. If you have not exceeded your
limit, this value is always the current timestamp.

If you are limited, you will receive a 429 response and an additional header, `Retry-After`, that indicates the number
of seconds you should sleep before retrying.

#### HTTP 503
The trading engine is under heavy load. To help improve responsiveness during high-load periods, the
BitMEX trading engine will begin load-shedding when requests reach a critical queue depth. When this happens, you will
quickly receive a 503 status code with the message "The system is currently overloaded. Please try again later." The
request will not have reached the engine, and you should retry after at least 500 milliseconds.
