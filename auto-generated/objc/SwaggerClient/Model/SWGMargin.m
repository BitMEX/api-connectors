#import "SWGMargin.h"

@implementation SWGMargin

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.marginLeverage = @0.0;
    self.marginUsedPcnt = @0.0;
    self.makerFeeDiscount = @0.0;
    self.takerFeeDiscount = @0.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"currency": @"currency", @"riskLimit": @"riskLimit", @"state": @"state", @"amount": @"amount", @"prevRealisedPnl": @"prevRealisedPnl", @"grossComm": @"grossComm", @"grossOpenCost": @"grossOpenCost", @"grossOpenPremium": @"grossOpenPremium", @"grossExecCost": @"grossExecCost", @"grossMarkValue": @"grossMarkValue", @"riskValue": @"riskValue", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"targetExcessMargin": @"targetExcessMargin", @"realisedPnl": @"realisedPnl", @"unrealisedPnl": @"unrealisedPnl", @"walletBalance": @"walletBalance", @"marginBalance": @"marginBalance", @"marginLeverage": @"marginLeverage", @"marginUsedPcnt": @"marginUsedPcnt", @"excessMargin": @"excessMargin", @"availableMargin": @"availableMargin", @"withdrawableMargin": @"withdrawableMargin", @"makerFeeDiscount": @"makerFeeDiscount", @"takerFeeDiscount": @"takerFeeDiscount", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"riskLimit", @"state", @"amount", @"prevRealisedPnl", @"grossComm", @"grossOpenCost", @"grossOpenPremium", @"grossExecCost", @"grossMarkValue", @"riskValue", @"initMargin", @"maintMargin", @"targetExcessMargin", @"realisedPnl", @"unrealisedPnl", @"walletBalance", @"marginBalance", @"marginLeverage", @"marginUsedPcnt", @"excessMargin", @"availableMargin", @"withdrawableMargin", @"makerFeeDiscount", @"takerFeeDiscount", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
