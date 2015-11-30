#import "SWGOrder.h"

@implementation SWGOrder

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"orderID": @"orderID", @"clOrdID": @"clOrdID", @"account": @"account", @"symbol": @"symbol", @"side": @"side", @"simpleOrderQty": @"simpleOrderQty", @"orderQty": @"orderQty", @"price": @"price", @"minQty": @"minQty", @"stopPx": @"stopPx", @"currency": @"currency", @"settlCurrency": @"settlCurrency", @"ordType": @"ordType", @"timeInForce": @"timeInForce", @"exDestination": @"exDestination", @"ordStatus": @"ordStatus", @"workingIndicator": @"workingIndicator", @"ordRejReason": @"ordRejReason", @"simpleLeavesQty": @"simpleLeavesQty", @"leavesQty": @"leavesQty", @"simpleCumQty": @"simpleCumQty", @"cumQty": @"cumQty", @"avgPx": @"avgPx", @"multiLegReportingType": @"multiLegReportingType", @"text": @"text", @"transactTime": @"transactTime", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"clOrdID", @"account", @"symbol", @"side", @"simpleOrderQty", @"orderQty", @"price", @"minQty", @"stopPx", @"currency", @"settlCurrency", @"ordType", @"timeInForce", @"exDestination", @"ordStatus", @"workingIndicator", @"ordRejReason", @"simpleLeavesQty", @"leavesQty", @"simpleCumQty", @"cumQty", @"avgPx", @"multiLegReportingType", @"text", @"transactTime", @"timestamp"];

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
