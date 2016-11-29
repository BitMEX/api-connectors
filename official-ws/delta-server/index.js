'use strict';

var _ = require('lodash');
var baseConfig = require('./config.example.js');
var config;
try {
  config = _.extend({}, baseConfig, require('./config'));
} catch(e) {
  config = baseConfig;
}
config.port = Number(process.argv[2]) || process.env.PORT || config.port;
if (!config.port) {
  console.error("Usage: node index.js <PORT>");
  process.exit(1);
}

require('./lib/server')(config);
