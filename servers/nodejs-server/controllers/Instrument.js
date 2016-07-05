'use strict';

var url = require('url');


var Instrument = require('./InstrumentService');


module.exports.instrument.get = function instrument.get (req, res, next) {
  Instrument.instrument.get(req.swagger.params, res, next);
};

module.exports.instrument.getActive = function instrument.getActive (req, res, next) {
  Instrument.instrument.getActive(req.swagger.params, res, next);
};

module.exports.instrument.getActiveAndIndices = function instrument.getActiveAndIndices (req, res, next) {
  Instrument.instrument.getActiveAndIndices(req.swagger.params, res, next);
};

module.exports.instrument.getActiveIntervals = function instrument.getActiveIntervals (req, res, next) {
  Instrument.instrument.getActiveIntervals(req.swagger.params, res, next);
};

module.exports.instrument.getIndices = function instrument.getIndices (req, res, next) {
  Instrument.instrument.getIndices(req.swagger.params, res, next);
};
