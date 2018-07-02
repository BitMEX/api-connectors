#import "SWGExecution.h"

@implementation SWGExecution

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"execID": @"execID", @"orderID": @"orderID", @"clOrdID": @"clOrdID", @"clOrdLinkID": @"clOrdLinkID", @"account": @"account", @"symbol": @"symbol", @"side": @"side", @"lastQty": @"lastQty", @"lastPx": @"lastPx", @"underlyingLastPx": @"underlyingLastPx", @"lastMkt": @"lastMkt", @"lastLiquidityInd": @"lastLiquidityInd", @"simpleOrderQty": @"simpleOrderQty", @"orderQty": @"orderQty", @"price": @"price", @"displayQty": @"displayQty", @"stopPx": @"stopPx", @"pegOffsetValue": @"pegOffsetValue", @"pegPriceType": @"pegPriceType", @"currency": @"currency", @"settlCurrency": @"settlCurrency", @"execType": @"execType", @"ordType": @"ordType", @"timeInForce": @"timeInForce", @"execInst": @"execInst", @"contingencyType": @"contingencyType", @"exDestination": @"exDestination", @"ordStatus": @"ordStatus", @"triggered": @"triggered", @"workingIndicator": @"workingIndicator", @"ordRejReason": @"ordRejReason", @"simpleLeavesQty": @"simpleLeavesQty", @"leavesQty": @"leavesQty", @"simpleCumQty": @"simpleCumQty", @"cumQty": @"cumQty", @"avgPx": @"avgPx", @"commission": @"commission", @"tradePublishIndicator": @"tradePublishIndicator", @"multiLegReportingType": @"multiLegReportingType", @"text": @"text", @"trdMatchID": @"trdMatchID", @"execCost": @"execCost", @"execComm": @"execComm", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"transactTime": @"transactTime", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orderID", @"clOrdID", @"clOrdLinkID", @"account", @"symbol", @"side", @"lastQty", @"lastPx", @"underlyingLastPx", @"lastMkt", @"lastLiquidityInd", @"simpleOrderQty", @"orderQty", @"price", @"displayQty", @"stopPx", @"pegOffsetValue", @"pegPriceType", @"currency", @"settlCurrency", @"execType", @"ordType", @"timeInForce", @"execInst", @"contingencyType", @"exDestination", @"ordStatus", @"triggered", @"workingIndicator", @"ordRejReason", @"simpleLeavesQty", @"leavesQty", @"simpleCumQty", @"cumQty", @"avgPx", @"commission", @"tradePublishIndicator", @"multiLegReportingType", @"text", @"trdMatchID", @"execCost", @"execComm", @"homeNotional", @"foreignNotional", @"transactTime", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
