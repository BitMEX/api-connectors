#import "SWGExecution.h"

@implementation SWGExecution

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"execID": @"execID", @"orderID": @"orderID", @"clOrdID": @"clOrdID", @"account": @"account", @"symbol": @"symbol", @"side": @"side", @"lastQty": @"lastQty", @"lastPx": @"lastPx", @"underlyingLastPx": @"underlyingLastPx", @"lastMkt": @"lastMkt", @"lastLiquidityInd": @"lastLiquidityInd", @"simpleOrderQty": @"simpleOrderQty", @"orderQty": @"orderQty", @"price": @"price", @"minQty": @"minQty", @"stopPx": @"stopPx", @"currency": @"currency", @"settlCurrency": @"settlCurrency", @"execType": @"execType", @"ordType": @"ordType", @"timeInForce": @"timeInForce", @"exDestination": @"exDestination", @"ordStatus": @"ordStatus", @"workingIndicator": @"workingIndicator", @"ordRejReason": @"ordRejReason", @"simpleLeavesQty": @"simpleLeavesQty", @"leavesQty": @"leavesQty", @"simpleCumQty": @"simpleCumQty", @"cumQty": @"cumQty", @"avgPx": @"avgPx", @"commission": @"commission", @"commType": @"commType", @"tradePublishIndicator": @"tradePublishIndicator", @"multiLegReportingType": @"multiLegReportingType", @"text": @"text", @"trdMatchID": @"trdMatchID", @"execCost": @"execCost", @"execComm": @"execComm", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"transactTime": @"transactTime", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"orderID", @"clOrdID", @"account", @"symbol", @"side", @"lastQty", @"lastPx", @"underlyingLastPx", @"lastMkt", @"lastLiquidityInd", @"simpleOrderQty", @"orderQty", @"price", @"minQty", @"stopPx", @"currency", @"settlCurrency", @"execType", @"ordType", @"timeInForce", @"exDestination", @"ordStatus", @"workingIndicator", @"ordRejReason", @"simpleLeavesQty", @"leavesQty", @"simpleCumQty", @"cumQty", @"avgPx", @"commission", @"commType", @"tradePublishIndicator", @"multiLegReportingType", @"text", @"trdMatchID", @"execCost", @"execComm", @"homeNotional", @"foreignNotional", @"transactTime", @"timestamp"];

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
