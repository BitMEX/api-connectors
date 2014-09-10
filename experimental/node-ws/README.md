# NodeJS Sample Connector

### Summary

A websocket client using mux-demux and sockjs-client to connect to the BitMEX WSS API. The implementation here
is similar in many ways to the implementation used in the BitMEX web interface.

For a more simple solution, one could use the [ws](https://github.com/einaros/ws) instead, and simply
send subscribe commands. When messages come down, simply read the `table` attribute and route to the handler
of your choice.

### Running

```bash
npm install
node app.js
```
