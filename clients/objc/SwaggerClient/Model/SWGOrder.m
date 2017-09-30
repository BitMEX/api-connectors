#import "SWGOrder.h"

@implementation SWGOrder

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orderID": @"orderID", @"clOrdID": @"clOrdID", @"clOrdLinkID": @"clOrdLinkID", @"account": @"account", @"symbol": @"symbol", @"side": @"side", @"simpleOrderQty": @"simpleOrderQty", @"orderQty": @"orderQty", @"price": @"price", @"displayQty": @"displayQty", @"stopPx": @"stopPx", @"pegOffsetValue": @"pegOffsetValue", @"pegPriceType": @"pegPriceType", @"currency": @"currency", @"settlCurrency": @"settlCurrency", @"ordType": @"ordType", @"timeInForce": @"timeInForce", @"execInst": @"execInst", @"contingencyType": @"contingencyType", @"exDestination": @"exDestination", @"ordStatus": @"ordStatus", @"triggered": @"triggered", @"workingIndicator": @"workingIndicator", @"ordRejReason": @"ordRejReason", @"simpleLeavesQty": @"simpleLeavesQty", @"leavesQty": @"leavesQty", @"simpleCumQty": @"simpleCumQty", @"cumQty": @"cumQty", @"avgPx": @"avgPx", @"multiLegReportingType": @"multiLegReportingType", @"text": @"text", @"transactTime": @"transactTime", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"clOrdID", @"clOrdLinkID", @"account", @"symbol", @"side", @"simpleOrderQty", @"orderQty", @"price", @"displayQty", @"stopPx", @"pegOffsetValue", @"pegPriceType", @"currency", @"settlCurrency", @"ordType", @"timeInForce", @"execInst", @"contingencyType", @"exDestination", @"ordStatus", @"triggered", @"workingIndicator", @"ordRejReason", @"simpleLeavesQty", @"leavesQty", @"simpleCumQty", @"cumQty", @"avgPx", @"multiLegReportingType", @"text", @"transactTime", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
