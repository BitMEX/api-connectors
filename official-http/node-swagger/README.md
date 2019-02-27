BitMEX API Node.js Connector
============================

This is an example of using the `swagger-client` package to authenticate with BitMEX and send requests.

`swagger-client` is especially nice because it exports an object that can call our methods directly.

You don't have to worry about headers or form encoding using this package - just call the methods are if they
were direct RPC.

[swaggerClient.js](https://github.com/BitMEX/api-connectors/blob/master/official-http/node-swagger/swaggerClient.js) contains a simple example of how to use this.

Usage
-----

If you're building your own project, copy the contents of this one into it.

In the near future we will release this as a standalone NPM module.

Authentication
--------------

Most of the time, when using the API, you'll want to [generate a permanent API key](https://www.bitmex.com/app/apiKeys).

See also the official BitMEX [documentation on authentication](https://www.bitmex.com/app/restAPI#authentication).
