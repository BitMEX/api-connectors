/**
 * BitMEX API
 * REST API for the BitMEX.com trading platform.<br><br><a href=\"/app/restAPI\">REST Documentation</a><br><a href=\"/app/wsAPI\">Websocket Documentation</a>
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BitMexApi);
  }
}(this, function(expect, BitMexApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BitMexApi.Trade();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Trade', function() {
    it('should create an instance of Trade', function() {
      // uncomment below and update the code to test Trade
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be.a(BitMexApi.Trade);
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property symbol (base name: "symbol")', function() {
      // uncomment below and update the code to test the property symbol
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property side (base name: "side")', function() {
      // uncomment below and update the code to test the property side
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property size (base name: "size")', function() {
      // uncomment below and update the code to test the property size
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property tickDirection (base name: "tickDirection")', function() {
      // uncomment below and update the code to test the property tickDirection
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property trdMatchID (base name: "trdMatchID")', function() {
      // uncomment below and update the code to test the property trdMatchID
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property grossValue (base name: "grossValue")', function() {
      // uncomment below and update the code to test the property grossValue
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property homeNotional (base name: "homeNotional")', function() {
      // uncomment below and update the code to test the property homeNotional
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property foreignNotional (base name: "foreignNotional")', function() {
      // uncomment below and update the code to test the property foreignNotional
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new BitMexApi.Trade();
      //expect(instance).to.be();
    });

  });

}));