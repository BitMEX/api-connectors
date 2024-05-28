#import "SWGMargin.h"

@implementation SWGMargin

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.account = @0;
    self.riskLimit = @0;
    self.amount = @0;
    self.prevRealisedPnl = @0;
    self.grossComm = @0;
    self.grossOpenCost = @0;
    self.grossOpenPremium = @0;
    self.grossExecCost = @0;
    self.grossMarkValue = @0;
    self.riskValue = @0;
    self.initMargin = @0;
    self.maintMargin = @0;
    self.targetExcessMargin = @0;
    self.realisedPnl = @0;
    self.unrealisedPnl = @0;
    self.walletBalance = @0;
    self.marginBalance = @0;
    self.marginLeverage = @0.0;
    self.marginUsedPcnt = @0.0;
    self.excessMargin = @0;
    self.availableMargin = @0;
    self.withdrawableMargin = @0;
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
