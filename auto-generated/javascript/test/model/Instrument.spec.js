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
 * Swagger Codegen version: 2.4.38-SNAPSHOT
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
    describe('Instrument', function() {
      beforeEach(function() {
        instance = new BitMexApi.Instrument();
      });

      it('should create an instance of Instrument', function() {
        // TODO: update the code to test Instrument
        expect(instance).to.be.a(BitMexApi.Instrument);
      });

      it('should have the property symbol (base name: "symbol")', function() {
        // TODO: update the code to test the property symbol
        expect(instance).to.have.property('symbol');
        // expect(instance.symbol).to.be(expectedValueLiteral);
      });

      it('should have the property rootSymbol (base name: "rootSymbol")', function() {
        // TODO: update the code to test the property rootSymbol
        expect(instance).to.have.property('rootSymbol');
        // expect(instance.rootSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property state (base name: "state")', function() {
        // TODO: update the code to test the property state
        expect(instance).to.have.property('state');
        // expect(instance.state).to.be(expectedValueLiteral);
      });

      it('should have the property typ (base name: "typ")', function() {
        // TODO: update the code to test the property typ
        expect(instance).to.have.property('typ');
        // expect(instance.typ).to.be(expectedValueLiteral);
      });

      it('should have the property listing (base name: "listing")', function() {
        // TODO: update the code to test the property listing
        expect(instance).to.have.property('listing');
        // expect(instance.listing).to.be(expectedValueLiteral);
      });

      it('should have the property front (base name: "front")', function() {
        // TODO: update the code to test the property front
        expect(instance).to.have.property('front');
        // expect(instance.front).to.be(expectedValueLiteral);
      });

      it('should have the property expiry (base name: "expiry")', function() {
        // TODO: update the code to test the property expiry
        expect(instance).to.have.property('expiry');
        // expect(instance.expiry).to.be(expectedValueLiteral);
      });

      it('should have the property settle (base name: "settle")', function() {
        // TODO: update the code to test the property settle
        expect(instance).to.have.property('settle');
        // expect(instance.settle).to.be(expectedValueLiteral);
      });

      it('should have the property listedSettle (base name: "listedSettle")', function() {
        // TODO: update the code to test the property listedSettle
        expect(instance).to.have.property('listedSettle');
        // expect(instance.listedSettle).to.be(expectedValueLiteral);
      });

      it('should have the property positionCurrency (base name: "positionCurrency")', function() {
        // TODO: update the code to test the property positionCurrency
        expect(instance).to.have.property('positionCurrency');
        // expect(instance.positionCurrency).to.be(expectedValueLiteral);
      });

      it('should have the property underlying (base name: "underlying")', function() {
        // TODO: update the code to test the property underlying
        expect(instance).to.have.property('underlying');
        // expect(instance.underlying).to.be(expectedValueLiteral);
      });

      it('should have the property quoteCurrency (base name: "quoteCurrency")', function() {
        // TODO: update the code to test the property quoteCurrency
        expect(instance).to.have.property('quoteCurrency');
        // expect(instance.quoteCurrency).to.be(expectedValueLiteral);
      });

      it('should have the property underlyingSymbol (base name: "underlyingSymbol")', function() {
        // TODO: update the code to test the property underlyingSymbol
        expect(instance).to.have.property('underlyingSymbol');
        // expect(instance.underlyingSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property reference (base name: "reference")', function() {
        // TODO: update the code to test the property reference
        expect(instance).to.have.property('reference');
        // expect(instance.reference).to.be(expectedValueLiteral);
      });

      it('should have the property referenceSymbol (base name: "referenceSymbol")', function() {
        // TODO: update the code to test the property referenceSymbol
        expect(instance).to.have.property('referenceSymbol');
        // expect(instance.referenceSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property calcInterval (base name: "calcInterval")', function() {
        // TODO: update the code to test the property calcInterval
        expect(instance).to.have.property('calcInterval');
        // expect(instance.calcInterval).to.be(expectedValueLiteral);
      });

      it('should have the property publishInterval (base name: "publishInterval")', function() {
        // TODO: update the code to test the property publishInterval
        expect(instance).to.have.property('publishInterval');
        // expect(instance.publishInterval).to.be(expectedValueLiteral);
      });

      it('should have the property publishTime (base name: "publishTime")', function() {
        // TODO: update the code to test the property publishTime
        expect(instance).to.have.property('publishTime');
        // expect(instance.publishTime).to.be(expectedValueLiteral);
      });

      it('should have the property maxOrderQty (base name: "maxOrderQty")', function() {
        // TODO: update the code to test the property maxOrderQty
        expect(instance).to.have.property('maxOrderQty');
        // expect(instance.maxOrderQty).to.be(expectedValueLiteral);
      });

      it('should have the property maxPrice (base name: "maxPrice")', function() {
        // TODO: update the code to test the property maxPrice
        expect(instance).to.have.property('maxPrice');
        // expect(instance.maxPrice).to.be(expectedValueLiteral);
      });

      it('should have the property lotSize (base name: "lotSize")', function() {
        // TODO: update the code to test the property lotSize
        expect(instance).to.have.property('lotSize');
        // expect(instance.lotSize).to.be(expectedValueLiteral);
      });

      it('should have the property tickSize (base name: "tickSize")', function() {
        // TODO: update the code to test the property tickSize
        expect(instance).to.have.property('tickSize');
        // expect(instance.tickSize).to.be(expectedValueLiteral);
      });

      it('should have the property multiplier (base name: "multiplier")', function() {
        // TODO: update the code to test the property multiplier
        expect(instance).to.have.property('multiplier');
        // expect(instance.multiplier).to.be(expectedValueLiteral);
      });

      it('should have the property settlCurrency (base name: "settlCurrency")', function() {
        // TODO: update the code to test the property settlCurrency
        expect(instance).to.have.property('settlCurrency');
        // expect(instance.settlCurrency).to.be(expectedValueLiteral);
      });

      it('should have the property underlyingToPositionMultiplier (base name: "underlyingToPositionMultiplier")', function() {
        // TODO: update the code to test the property underlyingToPositionMultiplier
        expect(instance).to.have.property('underlyingToPositionMultiplier');
        // expect(instance.underlyingToPositionMultiplier).to.be(expectedValueLiteral);
      });

      it('should have the property underlyingToSettleMultiplier (base name: "underlyingToSettleMultiplier")', function() {
        // TODO: update the code to test the property underlyingToSettleMultiplier
        expect(instance).to.have.property('underlyingToSettleMultiplier');
        // expect(instance.underlyingToSettleMultiplier).to.be(expectedValueLiteral);
      });

      it('should have the property quoteToSettleMultiplier (base name: "quoteToSettleMultiplier")', function() {
        // TODO: update the code to test the property quoteToSettleMultiplier
        expect(instance).to.have.property('quoteToSettleMultiplier');
        // expect(instance.quoteToSettleMultiplier).to.be(expectedValueLiteral);
      });

      it('should have the property isQuanto (base name: "isQuanto")', function() {
        // TODO: update the code to test the property isQuanto
        expect(instance).to.have.property('isQuanto');
        // expect(instance.isQuanto).to.be(expectedValueLiteral);
      });

      it('should have the property isInverse (base name: "isInverse")', function() {
        // TODO: update the code to test the property isInverse
        expect(instance).to.have.property('isInverse');
        // expect(instance.isInverse).to.be(expectedValueLiteral);
      });

      it('should have the property initMargin (base name: "initMargin")', function() {
        // TODO: update the code to test the property initMargin
        expect(instance).to.have.property('initMargin');
        // expect(instance.initMargin).to.be(expectedValueLiteral);
      });

      it('should have the property maintMargin (base name: "maintMargin")', function() {
        // TODO: update the code to test the property maintMargin
        expect(instance).to.have.property('maintMargin');
        // expect(instance.maintMargin).to.be(expectedValueLiteral);
      });

      it('should have the property riskLimit (base name: "riskLimit")', function() {
        // TODO: update the code to test the property riskLimit
        expect(instance).to.have.property('riskLimit');
        // expect(instance.riskLimit).to.be(expectedValueLiteral);
      });

      it('should have the property riskStep (base name: "riskStep")', function() {
        // TODO: update the code to test the property riskStep
        expect(instance).to.have.property('riskStep');
        // expect(instance.riskStep).to.be(expectedValueLiteral);
      });

      it('should have the property limit (base name: "limit")', function() {
        // TODO: update the code to test the property limit
        expect(instance).to.have.property('limit');
        // expect(instance.limit).to.be(expectedValueLiteral);
      });

      it('should have the property taxed (base name: "taxed")', function() {
        // TODO: update the code to test the property taxed
        expect(instance).to.have.property('taxed');
        // expect(instance.taxed).to.be(expectedValueLiteral);
      });

      it('should have the property deleverage (base name: "deleverage")', function() {
        // TODO: update the code to test the property deleverage
        expect(instance).to.have.property('deleverage');
        // expect(instance.deleverage).to.be(expectedValueLiteral);
      });

      it('should have the property makerFee (base name: "makerFee")', function() {
        // TODO: update the code to test the property makerFee
        expect(instance).to.have.property('makerFee');
        // expect(instance.makerFee).to.be(expectedValueLiteral);
      });

      it('should have the property takerFee (base name: "takerFee")', function() {
        // TODO: update the code to test the property takerFee
        expect(instance).to.have.property('takerFee');
        // expect(instance.takerFee).to.be(expectedValueLiteral);
      });

      it('should have the property settlementFee (base name: "settlementFee")', function() {
        // TODO: update the code to test the property settlementFee
        expect(instance).to.have.property('settlementFee');
        // expect(instance.settlementFee).to.be(expectedValueLiteral);
      });

      it('should have the property fundingBaseSymbol (base name: "fundingBaseSymbol")', function() {
        // TODO: update the code to test the property fundingBaseSymbol
        expect(instance).to.have.property('fundingBaseSymbol');
        // expect(instance.fundingBaseSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property fundingQuoteSymbol (base name: "fundingQuoteSymbol")', function() {
        // TODO: update the code to test the property fundingQuoteSymbol
        expect(instance).to.have.property('fundingQuoteSymbol');
        // expect(instance.fundingQuoteSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property fundingPremiumSymbol (base name: "fundingPremiumSymbol")', function() {
        // TODO: update the code to test the property fundingPremiumSymbol
        expect(instance).to.have.property('fundingPremiumSymbol');
        // expect(instance.fundingPremiumSymbol).to.be(expectedValueLiteral);
      });

      it('should have the property fundingTimestamp (base name: "fundingTimestamp")', function() {
        // TODO: update the code to test the property fundingTimestamp
        expect(instance).to.have.property('fundingTimestamp');
        // expect(instance.fundingTimestamp).to.be(expectedValueLiteral);
      });

      it('should have the property fundingInterval (base name: "fundingInterval")', function() {
        // TODO: update the code to test the property fundingInterval
        expect(instance).to.have.property('fundingInterval');
        // expect(instance.fundingInterval).to.be(expectedValueLiteral);
      });

      it('should have the property fundingRate (base name: "fundingRate")', function() {
        // TODO: update the code to test the property fundingRate
        expect(instance).to.have.property('fundingRate');
        // expect(instance.fundingRate).to.be(expectedValueLiteral);
      });

      it('should have the property indicativeFundingRate (base name: "indicativeFundingRate")', function() {
        // TODO: update the code to test the property indicativeFundingRate
        expect(instance).to.have.property('indicativeFundingRate');
        // expect(instance.indicativeFundingRate).to.be(expectedValueLiteral);
      });

      it('should have the property rebalanceTimestamp (base name: "rebalanceTimestamp")', function() {
        // TODO: update the code to test the property rebalanceTimestamp
        expect(instance).to.have.property('rebalanceTimestamp');
        // expect(instance.rebalanceTimestamp).to.be(expectedValueLiteral);
      });

      it('should have the property rebalanceInterval (base name: "rebalanceInterval")', function() {
        // TODO: update the code to test the property rebalanceInterval
        expect(instance).to.have.property('rebalanceInterval');
        // expect(instance.rebalanceInterval).to.be(expectedValueLiteral);
      });

      it('should have the property prevClosePrice (base name: "prevClosePrice")', function() {
        // TODO: update the code to test the property prevClosePrice
        expect(instance).to.have.property('prevClosePrice');
        // expect(instance.prevClosePrice).to.be(expectedValueLiteral);
      });

      it('should have the property limitDownPrice (base name: "limitDownPrice")', function() {
        // TODO: update the code to test the property limitDownPrice
        expect(instance).to.have.property('limitDownPrice');
        // expect(instance.limitDownPrice).to.be(expectedValueLiteral);
      });

      it('should have the property limitUpPrice (base name: "limitUpPrice")', function() {
        // TODO: update the code to test the property limitUpPrice
        expect(instance).to.have.property('limitUpPrice');
        // expect(instance.limitUpPrice).to.be(expectedValueLiteral);
      });

      it('should have the property totalVolume (base name: "totalVolume")', function() {
        // TODO: update the code to test the property totalVolume
        expect(instance).to.have.property('totalVolume');
        // expect(instance.totalVolume).to.be(expectedValueLiteral);
      });

      it('should have the property volume (base name: "volume")', function() {
        // TODO: update the code to test the property volume
        expect(instance).to.have.property('volume');
        // expect(instance.volume).to.be(expectedValueLiteral);
      });

      it('should have the property volume24h (base name: "volume24h")', function() {
        // TODO: update the code to test the property volume24h
        expect(instance).to.have.property('volume24h');
        // expect(instance.volume24h).to.be(expectedValueLiteral);
      });

      it('should have the property prevTotalTurnover (base name: "prevTotalTurnover")', function() {
        // TODO: update the code to test the property prevTotalTurnover
        expect(instance).to.have.property('prevTotalTurnover');
        // expect(instance.prevTotalTurnover).to.be(expectedValueLiteral);
      });

      it('should have the property totalTurnover (base name: "totalTurnover")', function() {
        // TODO: update the code to test the property totalTurnover
        expect(instance).to.have.property('totalTurnover');
        // expect(instance.totalTurnover).to.be(expectedValueLiteral);
      });

      it('should have the property turnover (base name: "turnover")', function() {
        // TODO: update the code to test the property turnover
        expect(instance).to.have.property('turnover');
        // expect(instance.turnover).to.be(expectedValueLiteral);
      });

      it('should have the property turnover24h (base name: "turnover24h")', function() {
        // TODO: update the code to test the property turnover24h
        expect(instance).to.have.property('turnover24h');
        // expect(instance.turnover24h).to.be(expectedValueLiteral);
      });

      it('should have the property homeNotional24h (base name: "homeNotional24h")', function() {
        // TODO: update the code to test the property homeNotional24h
        expect(instance).to.have.property('homeNotional24h');
        // expect(instance.homeNotional24h).to.be(expectedValueLiteral);
      });

      it('should have the property foreignNotional24h (base name: "foreignNotional24h")', function() {
        // TODO: update the code to test the property foreignNotional24h
        expect(instance).to.have.property('foreignNotional24h');
        // expect(instance.foreignNotional24h).to.be(expectedValueLiteral);
      });

      it('should have the property prevPrice24h (base name: "prevPrice24h")', function() {
        // TODO: update the code to test the property prevPrice24h
        expect(instance).to.have.property('prevPrice24h');
        // expect(instance.prevPrice24h).to.be(expectedValueLiteral);
      });

      it('should have the property vwap (base name: "vwap")', function() {
        // TODO: update the code to test the property vwap
        expect(instance).to.have.property('vwap');
        // expect(instance.vwap).to.be(expectedValueLiteral);
      });

      it('should have the property highPrice (base name: "highPrice")', function() {
        // TODO: update the code to test the property highPrice
        expect(instance).to.have.property('highPrice');
        // expect(instance.highPrice).to.be(expectedValueLiteral);
      });

      it('should have the property lowPrice (base name: "lowPrice")', function() {
        // TODO: update the code to test the property lowPrice
        expect(instance).to.have.property('lowPrice');
        // expect(instance.lowPrice).to.be(expectedValueLiteral);
      });

      it('should have the property lastPrice (base name: "lastPrice")', function() {
        // TODO: update the code to test the property lastPrice
        expect(instance).to.have.property('lastPrice');
        // expect(instance.lastPrice).to.be(expectedValueLiteral);
      });

      it('should have the property lastPriceProtected (base name: "lastPriceProtected")', function() {
        // TODO: update the code to test the property lastPriceProtected
        expect(instance).to.have.property('lastPriceProtected');
        // expect(instance.lastPriceProtected).to.be(expectedValueLiteral);
      });

      it('should have the property lastTickDirection (base name: "lastTickDirection")', function() {
        // TODO: update the code to test the property lastTickDirection
        expect(instance).to.have.property('lastTickDirection');
        // expect(instance.lastTickDirection).to.be(expectedValueLiteral);
      });

      it('should have the property lastChangePcnt (base name: "lastChangePcnt")', function() {
        // TODO: update the code to test the property lastChangePcnt
        expect(instance).to.have.property('lastChangePcnt');
        // expect(instance.lastChangePcnt).to.be(expectedValueLiteral);
      });

      it('should have the property bidPrice (base name: "bidPrice")', function() {
        // TODO: update the code to test the property bidPrice
        expect(instance).to.have.property('bidPrice');
        // expect(instance.bidPrice).to.be(expectedValueLiteral);
      });

      it('should have the property midPrice (base name: "midPrice")', function() {
        // TODO: update the code to test the property midPrice
        expect(instance).to.have.property('midPrice');
        // expect(instance.midPrice).to.be(expectedValueLiteral);
      });

      it('should have the property askPrice (base name: "askPrice")', function() {
        // TODO: update the code to test the property askPrice
        expect(instance).to.have.property('askPrice');
        // expect(instance.askPrice).to.be(expectedValueLiteral);
      });

      it('should have the property impactBidPrice (base name: "impactBidPrice")', function() {
        // TODO: update the code to test the property impactBidPrice
        expect(instance).to.have.property('impactBidPrice');
        // expect(instance.impactBidPrice).to.be(expectedValueLiteral);
      });

      it('should have the property impactMidPrice (base name: "impactMidPrice")', function() {
        // TODO: update the code to test the property impactMidPrice
        expect(instance).to.have.property('impactMidPrice');
        // expect(instance.impactMidPrice).to.be(expectedValueLiteral);
      });

      it('should have the property impactAskPrice (base name: "impactAskPrice")', function() {
        // TODO: update the code to test the property impactAskPrice
        expect(instance).to.have.property('impactAskPrice');
        // expect(instance.impactAskPrice).to.be(expectedValueLiteral);
      });

      it('should have the property hasLiquidity (base name: "hasLiquidity")', function() {
        // TODO: update the code to test the property hasLiquidity
        expect(instance).to.have.property('hasLiquidity');
        // expect(instance.hasLiquidity).to.be(expectedValueLiteral);
      });

      it('should have the property openInterest (base name: "openInterest")', function() {
        // TODO: update the code to test the property openInterest
        expect(instance).to.have.property('openInterest');
        // expect(instance.openInterest).to.be(expectedValueLiteral);
      });

      it('should have the property openValue (base name: "openValue")', function() {
        // TODO: update the code to test the property openValue
        expect(instance).to.have.property('openValue');
        // expect(instance.openValue).to.be(expectedValueLiteral);
      });

      it('should have the property fairMethod (base name: "fairMethod")', function() {
        // TODO: update the code to test the property fairMethod
        expect(instance).to.have.property('fairMethod');
        // expect(instance.fairMethod).to.be(expectedValueLiteral);
      });

      it('should have the property fairBasisRate (base name: "fairBasisRate")', function() {
        // TODO: update the code to test the property fairBasisRate
        expect(instance).to.have.property('fairBasisRate');
        // expect(instance.fairBasisRate).to.be(expectedValueLiteral);
      });

      it('should have the property fairBasis (base name: "fairBasis")', function() {
        // TODO: update the code to test the property fairBasis
        expect(instance).to.have.property('fairBasis');
        // expect(instance.fairBasis).to.be(expectedValueLiteral);
      });

      it('should have the property fairPrice (base name: "fairPrice")', function() {
        // TODO: update the code to test the property fairPrice
        expect(instance).to.have.property('fairPrice');
        // expect(instance.fairPrice).to.be(expectedValueLiteral);
      });

      it('should have the property markMethod (base name: "markMethod")', function() {
        // TODO: update the code to test the property markMethod
        expect(instance).to.have.property('markMethod');
        // expect(instance.markMethod).to.be(expectedValueLiteral);
      });

      it('should have the property markPrice (base name: "markPrice")', function() {
        // TODO: update the code to test the property markPrice
        expect(instance).to.have.property('markPrice');
        // expect(instance.markPrice).to.be(expectedValueLiteral);
      });

      it('should have the property indicativeSettlePrice (base name: "indicativeSettlePrice")', function() {
        // TODO: update the code to test the property indicativeSettlePrice
        expect(instance).to.have.property('indicativeSettlePrice');
        // expect(instance.indicativeSettlePrice).to.be(expectedValueLiteral);
      });

      it('should have the property settledPriceAdjustmentRate (base name: "settledPriceAdjustmentRate")', function() {
        // TODO: update the code to test the property settledPriceAdjustmentRate
        expect(instance).to.have.property('settledPriceAdjustmentRate');
        // expect(instance.settledPriceAdjustmentRate).to.be(expectedValueLiteral);
      });

      it('should have the property settledPrice (base name: "settledPrice")', function() {
        // TODO: update the code to test the property settledPrice
        expect(instance).to.have.property('settledPrice');
        // expect(instance.settledPrice).to.be(expectedValueLiteral);
      });

      it('should have the property instantPnl (base name: "instantPnl")', function() {
        // TODO: update the code to test the property instantPnl
        expect(instance).to.have.property('instantPnl');
        // expect(instance.instantPnl).to.be(expectedValueLiteral);
      });

      it('should have the property timestamp (base name: "timestamp")', function() {
        // TODO: update the code to test the property timestamp
        expect(instance).to.have.property('timestamp');
        // expect(instance.timestamp).to.be(expectedValueLiteral);
      });

    });
  });

}));
