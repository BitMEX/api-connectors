#import "SWGMargin.h"

@implementation SWGMargin

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"account": @"account", @"currency": @"currency", @"riskLimit": @"riskLimit", @"prevState": @"prevState", @"state": @"state", @"action": @"action", @"amount": @"amount", @"pendingCredit": @"pendingCredit", @"pendingDebit": @"pendingDebit", @"confirmedDebit": @"confirmedDebit", @"prevRealisedPnl": @"prevRealisedPnl", @"prevUnrealisedPnl": @"prevUnrealisedPnl", @"grossComm": @"grossComm", @"grossOpenCost": @"grossOpenCost", @"grossOpenPremium": @"grossOpenPremium", @"grossExecCost": @"grossExecCost", @"grossMarkValue": @"grossMarkValue", @"riskValue": @"riskValue", @"taxableMargin": @"taxableMargin", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"sessionMargin": @"sessionMargin", @"targetExcessMargin": @"targetExcessMargin", @"varMargin": @"varMargin", @"realisedPnl": @"realisedPnl", @"unrealisedPnl": @"unrealisedPnl", @"indicativeTax": @"indicativeTax", @"unrealisedProfit": @"unrealisedProfit", @"syntheticMargin": @"syntheticMargin", @"walletBalance": @"walletBalance", @"marginBalance": @"marginBalance", @"marginBalancePcnt": @"marginBalancePcnt", @"marginLeverage": @"marginLeverage", @"marginUsedPcnt": @"marginUsedPcnt", @"excessMargin": @"excessMargin", @"excessMarginPcnt": @"excessMarginPcnt", @"availableMargin": @"availableMargin", @"withdrawableMargin": @"withdrawableMargin", @"timestamp": @"timestamp", @"grossLastValue": @"grossLastValue", @"commission": @"commission" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"riskLimit", @"prevState", @"state", @"action", @"amount", @"pendingCredit", @"pendingDebit", @"confirmedDebit", @"prevRealisedPnl", @"prevUnrealisedPnl", @"grossComm", @"grossOpenCost", @"grossOpenPremium", @"grossExecCost", @"grossMarkValue", @"riskValue", @"taxableMargin", @"initMargin", @"maintMargin", @"sessionMargin", @"targetExcessMargin", @"varMargin", @"realisedPnl", @"unrealisedPnl", @"indicativeTax", @"unrealisedProfit", @"syntheticMargin", @"walletBalance", @"marginBalance", @"marginBalancePcnt", @"marginLeverage", @"marginUsedPcnt", @"excessMargin", @"excessMarginPcnt", @"availableMargin", @"withdrawableMargin", @"timestamp", @"grossLastValue", @"commission"];

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
