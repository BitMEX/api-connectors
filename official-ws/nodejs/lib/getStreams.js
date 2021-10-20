const superagent = require('superagent');
const debug = require('debug')('BitMEX:realtime-api:getStreams');

module.exports = function(httpEndpoint, callback) {
  superagent
  .get(httpEndpoint + '/schema/websocketHelp')
  .end(function(err, res) {
    if (err) return callback(err);
    const streams = res.body.subscriptionSubjects;
    debug('Got streams from server: %j', streams);
    callback(null, {
      public: streams.public,
      private: streams.authenticationRequired,
      all: streams.public.concat(streams.authenticationRequired)
    });
  });
};

