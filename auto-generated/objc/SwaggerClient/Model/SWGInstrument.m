#import "SWGInstrument.h"

@implementation SWGInstrument

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"symbol": @"symbol", @"rootSymbol": @"rootSymbol", @"state": @"state", @"typ": @"typ", @"listing": @"listing", @"front": @"front", @"expiry": @"expiry", @"settle": @"settle", @"listedSettle": @"listedSettle", @"positionCurrency": @"positionCurrency", @"underlying": @"underlying", @"quoteCurrency": @"quoteCurrency", @"underlyingSymbol": @"underlyingSymbol", @"reference": @"reference", @"referenceSymbol": @"referenceSymbol", @"calcInterval": @"calcInterval", @"publishInterval": @"publishInterval", @"publishTime": @"publishTime", @"maxOrderQty": @"maxOrderQty", @"maxPrice": @"maxPrice", @"lotSize": @"lotSize", @"tickSize": @"tickSize", @"multiplier": @"multiplier", @"settlCurrency": @"settlCurrency", @"underlyingToPositionMultiplier": @"underlyingToPositionMultiplier", @"underlyingToSettleMultiplier": @"underlyingToSettleMultiplier", @"quoteToSettleMultiplier": @"quoteToSettleMultiplier", @"isQuanto": @"isQuanto", @"isInverse": @"isInverse", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"riskLimit": @"riskLimit", @"riskStep": @"riskStep", @"limit": @"limit", @"taxed": @"taxed", @"deleverage": @"deleverage", @"makerFee": @"makerFee", @"takerFee": @"takerFee", @"settlementFee": @"settlementFee", @"fundingBaseSymbol": @"fundingBaseSymbol", @"fundingQuoteSymbol": @"fundingQuoteSymbol", @"fundingPremiumSymbol": @"fundingPremiumSymbol", @"fundingTimestamp": @"fundingTimestamp", @"fundingInterval": @"fundingInterval", @"fundingRate": @"fundingRate", @"indicativeFundingRate": @"indicativeFundingRate", @"rebalanceTimestamp": @"rebalanceTimestamp", @"rebalanceInterval": @"rebalanceInterval", @"prevClosePrice": @"prevClosePrice", @"limitDownPrice": @"limitDownPrice", @"limitUpPrice": @"limitUpPrice", @"totalVolume": @"totalVolume", @"volume": @"volume", @"volume24h": @"volume24h", @"prevTotalTurnover": @"prevTotalTurnover", @"totalTurnover": @"totalTurnover", @"turnover": @"turnover", @"turnover24h": @"turnover24h", @"homeNotional24h": @"homeNotional24h", @"foreignNotional24h": @"foreignNotional24h", @"prevPrice24h": @"prevPrice24h", @"vwap": @"vwap", @"highPrice": @"highPrice", @"lowPrice": @"lowPrice", @"lastPrice": @"lastPrice", @"lastPriceProtected": @"lastPriceProtected", @"lastTickDirection": @"lastTickDirection", @"lastChangePcnt": @"lastChangePcnt", @"bidPrice": @"bidPrice", @"midPrice": @"midPrice", @"askPrice": @"askPrice", @"impactBidPrice": @"impactBidPrice", @"impactMidPrice": @"impactMidPrice", @"impactAskPrice": @"impactAskPrice", @"hasLiquidity": @"hasLiquidity", @"openInterest": @"openInterest", @"openValue": @"openValue", @"fairMethod": @"fairMethod", @"fairBasisRate": @"fairBasisRate", @"fairBasis": @"fairBasis", @"fairPrice": @"fairPrice", @"markMethod": @"markMethod", @"markPrice": @"markPrice", @"indicativeSettlePrice": @"indicativeSettlePrice", @"settledPriceAdjustmentRate": @"settledPriceAdjustmentRate", @"settledPrice": @"settledPrice", @"instantPnl": @"instantPnl", @"minTick": @"minTick", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"rootSymbol", @"state", @"typ", @"listing", @"front", @"expiry", @"settle", @"listedSettle", @"positionCurrency", @"underlying", @"quoteCurrency", @"underlyingSymbol", @"reference", @"referenceSymbol", @"calcInterval", @"publishInterval", @"publishTime", @"maxOrderQty", @"maxPrice", @"lotSize", @"tickSize", @"multiplier", @"settlCurrency", @"underlyingToPositionMultiplier", @"underlyingToSettleMultiplier", @"quoteToSettleMultiplier", @"isQuanto", @"isInverse", @"initMargin", @"maintMargin", @"riskLimit", @"riskStep", @"limit", @"taxed", @"deleverage", @"makerFee", @"takerFee", @"settlementFee", @"fundingBaseSymbol", @"fundingQuoteSymbol", @"fundingPremiumSymbol", @"fundingTimestamp", @"fundingInterval", @"fundingRate", @"indicativeFundingRate", @"rebalanceTimestamp", @"rebalanceInterval", @"prevClosePrice", @"limitDownPrice", @"limitUpPrice", @"totalVolume", @"volume", @"volume24h", @"prevTotalTurnover", @"totalTurnover", @"turnover", @"turnover24h", @"homeNotional24h", @"foreignNotional24h", @"prevPrice24h", @"vwap", @"highPrice", @"lowPrice", @"lastPrice", @"lastPriceProtected", @"lastTickDirection", @"lastChangePcnt", @"bidPrice", @"midPrice", @"askPrice", @"impactBidPrice", @"impactMidPrice", @"impactAskPrice", @"hasLiquidity", @"openInterest", @"openValue", @"fairMethod", @"fairBasisRate", @"fairBasis", @"fairPrice", @"markMethod", @"markPrice", @"indicativeSettlePrice", @"settledPriceAdjustmentRate", @"settledPrice", @"instantPnl", @"minTick", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
