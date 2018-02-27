# Authenticated requests with `node-fetch`

This example implements a `makeRequest()` method that uses the lightweight
[node-fetch](https://github.com/bitinn/node-fetch) module to sign and make
a request to the BitMEX REST API.


# Usage

Supply the `apiKey` and `apiSecret`, then run:

```sh
npm install
node index
```

The example will dump information about your current position(s).
