# BitMEX-Delta-Server

BitMEX-Delta-Server is the easiest way to get started with realtime market data.

This project is a NodeJS server that automatically subscribes to
[BitMEX's RealTime Feed](https://www.bitmex.com/app/wsAPI). It processes deltas for you and keeps
a copy of all public exchange data in memory, so you can poll it as often as you like without worrying
about exchange ratelimits.

Use BitMEX-Delta-Server if you have a need for up-to-the-millisecond data from BitMEX and you don't
want to write websocket integration yourself.

### Usage

Usage of this server requires [installing Node.JS](https://nodejs.org/download/). Be sure you have at least
Node 6.x or later. On most Linux distributions, you can download via the
[NodeSource PPA](https://github.com/nodesource/distributions#installation-instructions).

After installing, clone this repository, install the dependencies, and start the server.

```bash
git clone https://github.com/BitMEX/api-connectors.git

# Install dependencies
cd official-ws/nodejs
npm install
cd ../official-ws/delta-server
npm install

# Setup config
cp config.example.js config.js
# Edit config.js to add the symbols and streams (instrument, orderBookL2, etc) that you want to watch.
nano config.js
# Will start the server on port 4444. Pass a port as the first argument,
# set the PORT environment variable, or set 'port' in config.js to change this.
node index.js

# In another terminal...
curl "http://localhost:4444"
curl "http://localhost:4444/instrument"
curl "http://localhost:4444/instrument?symbol=XBTUSD"
```

### Details

BitMEX-Delta-Server, by default, subscribes to the data streams specified in `config.js`. Copy `config.example.js`
to `config.js` to get started.

By default, this tool only connects to the `XBTUSD` stream. Add other contracts as needed. A list of open instruments
is available via [this endpoint](https://www.bitmex.com:443/api/v1/instrument?filter=%7B%22state%22%3A%20%22Open%22%7D).

At this time, symbol aliases, like `XBT:perpetual`
([the full list is available here](https://www.bitmex.com/api/v1/instrument/activeIntervals)) are not available
for use with the Delta Server.

### Public Data

By default, BitMEX-Delta-Server makes the endpoints `/orderBookL2`, `/instrument`, `/quote`, and `/trade` available.
These endpoints take an optional symbol in the querystring (e.g. `?symbol=XBTUSD`), otherwise they return all data.

Data is returned as an array. To get data for a particular symbol, check the `symbol` property of each data item
or send a symbol query.

### Authenticated data

If you want to get realtime `margin`, `position`, `execution`, or `order` data, you need to authenticate.

The best way to get and stay authenticated is to [create an API Key](https://www.bitmex.com/app/apiKeys).

### Debugging

For much more information on what this module is doing, run it with the `DEBUG` environment variable. For example:

```bash
# Display all debug messages
DEBUG=* node index.js
# Display all high-level debug messages
DEBUG=BitMEX:* node index.js
```
