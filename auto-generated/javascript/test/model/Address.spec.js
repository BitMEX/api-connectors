/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.42-SNAPSHOT
 *
 * Do not edit the class manually.
 *
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

  describe('(package)', function() {
    describe('Address', function() {
      beforeEach(function() {
        instance = new BitMexApi.Address();
      });

      it('should create an instance of Address', function() {
        // TODO: update the code to test Address
        expect(instance).to.be.a(BitMexApi.Address);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property currency (base name: "currency")', function() {
        // TODO: update the code to test the property currency
        expect(instance).to.have.property('currency');
        // expect(instance.currency).to.be(expectedValueLiteral);
      });

      it('should have the property created (base name: "created")', function() {
        // TODO: update the code to test the property created
        expect(instance).to.have.property('created');
        // expect(instance.created).to.be(expectedValueLiteral);
      });

      it('should have the property userId (base name: "userId")', function() {
        // TODO: update the code to test the property userId
        expect(instance).to.have.property('userId');
        // expect(instance.userId).to.be(expectedValueLiteral);
      });

      it('should have the property address (base name: "address")', function() {
        // TODO: update the code to test the property address
        expect(instance).to.have.property('address');
        // expect(instance.address).to.be(expectedValueLiteral);
      });

      it('should have the property name (base name: "name")', function() {
        // TODO: update the code to test the property name
        expect(instance).to.have.property('name');
        // expect(instance.name).to.be(expectedValueLiteral);
      });

      it('should have the property note (base name: "note")', function() {
        // TODO: update the code to test the property note
        expect(instance).to.have.property('note');
        // expect(instance.note).to.be(expectedValueLiteral);
      });

      it('should have the property skipConfirm (base name: "skipConfirm")', function() {
        // TODO: update the code to test the property skipConfirm
        expect(instance).to.have.property('skipConfirm');
        // expect(instance.skipConfirm).to.be(expectedValueLiteral);
      });

      it('should have the property skipConfirmVerified (base name: "skipConfirmVerified")', function() {
        // TODO: update the code to test the property skipConfirmVerified
        expect(instance).to.have.property('skipConfirmVerified');
        // expect(instance.skipConfirmVerified).to.be(expectedValueLiteral);
      });

      it('should have the property skip2FA (base name: "skip2FA")', function() {
        // TODO: update the code to test the property skip2FA
        expect(instance).to.have.property('skip2FA');
        // expect(instance.skip2FA).to.be(expectedValueLiteral);
      });

      it('should have the property skip2FAVerified (base name: "skip2FAVerified")', function() {
        // TODO: update the code to test the property skip2FAVerified
        expect(instance).to.have.property('skip2FAVerified');
        // expect(instance.skip2FAVerified).to.be(expectedValueLiteral);
      });

      it('should have the property network (base name: "network")', function() {
        // TODO: update the code to test the property network
        expect(instance).to.have.property('network');
        // expect(instance.network).to.be(expectedValueLiteral);
      });

      it('should have the property memo (base name: "memo")', function() {
        // TODO: update the code to test the property memo
        expect(instance).to.have.property('memo');
        // expect(instance.memo).to.be(expectedValueLiteral);
      });

    });
  });

}));
