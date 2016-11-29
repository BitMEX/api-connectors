## BitMEX Websocket Adapters

Reference adapters for connecting to BitMEX's realtime API.

These adapters do the hard work of connecting and processing deltas so you can just handle full-data events, just
like a REST API; but you receive the significant benefit of real-time updates without being ratelimited.

#### General Adapters

* [BitMEX Delta Server](delta-server) - Generic locally-runnable webserver that emulates the BitMEX API. Works
  with any framework or service. Start here.

#### Language-specific Adapters

* [Browser (Primus)](browser-primus)
* [NodeJS](nodejs)
* [Python](python)

#### Connecting to the REST API

See the [API Connectors](https://github.com/BitMEX/api-connectors) repository for HTTP adapters.
