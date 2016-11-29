'use strict';
var superagent = require('superagent');
var url = require('url');
var debug = require('debug')('BitMEX:realtime-api:getStreams');

module.exports = function(wsEndpoint, callback) {
  var parsed = url.parse(wsEndpoint);
  var httpEndpoint = url.format({
    protocol: parsed.protocol === 'wss:' ? 'https:' : 'http',
    host: parsed.host
  });

  superagent
  .get(httpEndpoint + '/api/v1/schema/websocketHelp')
  .end(function(err, res) {
    if (err) return callback(err);
    var streams = res.body.subscriptionSubjects;
    debug('Got streams from server: %j', streams);
    callback(null, {
      public: streams.public,
      private: streams.authenticationRequired,
      all: streams.public.concat(streams.authenticationRequired)
    });
  });
};

