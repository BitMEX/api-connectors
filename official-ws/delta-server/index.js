'use strict';

const _ = require('lodash');
const baseConfig = require('./config.example.js');
let config;
try {
  config = _.extend({}, baseConfig, require('./config'));
} catch(e) {
  if (!/cannot find module/i.test(e.message)) {
    console.error('Unable to load ./config.js.');
    throw e;
  } else {
    console.warn('No ./config.js found. Using base settings.');
  }
  config = baseConfig;
}
config.port = Number(process.argv[2]) || process.env.PORT || config.port;
if (!config.port) {
  console.error("Usage: node index.js <PORT>");
  process.exit(1);
}

require('./lib/server')(config);
