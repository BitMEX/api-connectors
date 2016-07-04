#import "SWGInstrument.h"

@implementation SWGInstrument

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"symbol": @"symbol", @"rootSymbol": @"rootSymbol", @"state": @"state", @"typ": @"typ", @"listing": @"listing", @"front": @"front", @"expiry": @"expiry", @"settle": @"settle", @"relistInterval": @"relistInterval", @"inverseLeg": @"inverseLeg", @"sellLeg": @"sellLeg", @"buyLeg": @"buyLeg", @"positionCurrency": @"positionCurrency", @"underlying": @"underlying", @"quoteCurrency": @"quoteCurrency", @"underlyingSymbol": @"underlyingSymbol", @"reference": @"reference", @"referenceSymbol": @"referenceSymbol", @"calcInterval": @"calcInterval", @"publishInterval": @"publishInterval", @"publishTime": @"publishTime", @"maxOrderQty": @"maxOrderQty", @"maxPrice": @"maxPrice", @"lotSize": @"lotSize", @"tickSize": @"tickSize", @"multiplier": @"multiplier", @"settlCurrency": @"settlCurrency", @"underlyingToPositionMultiplier": @"underlyingToPositionMultiplier", @"underlyingToSettleMultiplier": @"underlyingToSettleMultiplier", @"quoteToSettleMultiplier": @"quoteToSettleMultiplier", @"isQuanto": @"isQuanto", @"isInverse": @"isInverse", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"limit": @"limit", @"capped": @"capped", @"taxed": @"taxed", @"makerFee": @"makerFee", @"takerFee": @"takerFee", @"settlementFee": @"settlementFee", @"insuranceFee": @"insuranceFee", @"fundingBaseSymbol": @"fundingBaseSymbol", @"fundingQuoteSymbol": @"fundingQuoteSymbol", @"fundingPremiumSymbol": @"fundingPremiumSymbol", @"fundingTimestamp": @"fundingTimestamp", @"fundingInterval": @"fundingInterval", @"fundingRate": @"fundingRate", @"indicativeFundingRate": @"indicativeFundingRate", @"rebalanceTimestamp": @"rebalanceTimestamp", @"rebalanceInterval": @"rebalanceInterval", @"openingTimestamp": @"openingTimestamp", @"closingTimestamp": @"closingTimestamp", @"sessionInterval": @"sessionInterval", @"prevClosePrice": @"prevClosePrice", @"limitDownPrice": @"limitDownPrice", @"limitUpPrice": @"limitUpPrice", @"bankruptLimitDownPrice": @"bankruptLimitDownPrice", @"bankruptLimitUpPrice": @"bankruptLimitUpPrice", @"prevTotalVolume": @"prevTotalVolume", @"totalVolume": @"totalVolume", @"volume": @"volume", @"volume24h": @"volume24h", @"prevTotalTurnover": @"prevTotalTurnover", @"totalTurnover": @"totalTurnover", @"turnover": @"turnover", @"turnover24h": @"turnover24h", @"prevPrice24h": @"prevPrice24h", @"vwap": @"vwap", @"highPrice": @"highPrice", @"lowPrice": @"lowPrice", @"lastPrice": @"lastPrice", @"lastPriceProtected": @"lastPriceProtected", @"lastTickDirection": @"lastTickDirection", @"lastChangePcnt": @"lastChangePcnt", @"bidPrice": @"bidPrice", @"midPrice": @"midPrice", @"askPrice": @"askPrice", @"impactBidPrice": @"impactBidPrice", @"impactMidPrice": @"impactMidPrice", @"impactAskPrice": @"impactAskPrice", @"hasLiquidity": @"hasLiquidity", @"openInterest": @"openInterest", @"openValue": @"openValue", @"fairMethod": @"fairMethod", @"fairBasisRate": @"fairBasisRate", @"fairBasis": @"fairBasis", @"fairPrice": @"fairPrice", @"markMethod": @"markMethod", @"markPrice": @"markPrice", @"indicativeTaxRate": @"indicativeTaxRate", @"indicativeSettlePrice": @"indicativeSettlePrice", @"settledPrice": @"settledPrice", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"rootSymbol", @"state", @"typ", @"listing", @"front", @"expiry", @"settle", @"relistInterval", @"inverseLeg", @"sellLeg", @"buyLeg", @"positionCurrency", @"underlying", @"quoteCurrency", @"underlyingSymbol", @"reference", @"referenceSymbol", @"calcInterval", @"publishInterval", @"publishTime", @"maxOrderQty", @"maxPrice", @"lotSize", @"tickSize", @"multiplier", @"settlCurrency", @"underlyingToPositionMultiplier", @"underlyingToSettleMultiplier", @"quoteToSettleMultiplier", @"isQuanto", @"isInverse", @"initMargin", @"maintMargin", @"limit", @"capped", @"taxed", @"makerFee", @"takerFee", @"settlementFee", @"insuranceFee", @"fundingBaseSymbol", @"fundingQuoteSymbol", @"fundingPremiumSymbol", @"fundingTimestamp", @"fundingInterval", @"fundingRate", @"indicativeFundingRate", @"rebalanceTimestamp", @"rebalanceInterval", @"openingTimestamp", @"closingTimestamp", @"sessionInterval", @"prevClosePrice", @"limitDownPrice", @"limitUpPrice", @"bankruptLimitDownPrice", @"bankruptLimitUpPrice", @"prevTotalVolume", @"totalVolume", @"volume", @"volume24h", @"prevTotalTurnover", @"totalTurnover", @"turnover", @"turnover24h", @"prevPrice24h", @"vwap", @"highPrice", @"lowPrice", @"lastPrice", @"lastPriceProtected", @"lastTickDirection", @"lastChangePcnt", @"bidPrice", @"midPrice", @"askPrice", @"impactBidPrice", @"impactMidPrice", @"impactAskPrice", @"hasLiquidity", @"openInterest", @"openValue", @"fairMethod", @"fairBasisRate", @"fairBasis", @"fairPrice", @"markMethod", @"markPrice", @"indicativeTaxRate", @"indicativeSettlePrice", @"settledPrice", @"timestamp"];

  if ([optionalProperties containsObject:propertyName]) {
    return YES;
  }
  else {
    return NO;
  }
}

/**
 * Gets the string presentation of the object.
 * This method will be called when logging model object using `NSLog`.
 */
- (NSString *)description {
    return [[self toDictionary] description];
}

@end
