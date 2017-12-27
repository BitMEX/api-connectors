// Sample configuration for BitMEX-Delta-Server.
// Copy me to config.js to use custom settings.

module.exports = {
  port: 4444,

  // If false, will connect to live exchange.
  // Testnet is https://testnet.bitmex.com
  testnet: true,

  // Symbols to watch. Add any/all symbols you are going to poll here.
  symbols: ['XBTUSD'],

  // Available streams:
  // Public:
  // ["instrument","orderBookL2","quote","trade"]
  // Private:
  // ["execution","margin","order","position"]
  streams: ["instrument","orderBookL2","quote","trade"],

  // If you want to use any of the above "private" streams, you must authenticate with an API Key.
  apiKeyID: '',
  apiKeySecret: '',

  // This prevents memory usage from getting out of control. Tweak to your needs.
  maxTableLen: 10000,
};
