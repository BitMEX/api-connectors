#import "SWGWalletSummaryRecord.h"

@implementation SWGWalletSummaryRecord

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.currency = @"XBt";
    self.symbol = @"XBTUSD";
    self.amount = @0.0;
    self.pendingDebit = @0.0;
    self.realisedPnl = @0.0;
    self.walletBalance = @0.0;
    self.unrealisedPnl = @0.0;
    self.marginBalance = @0.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"currency": @"currency", @"transactType": @"transactType", @"symbol": @"symbol", @"amount": @"amount", @"pendingDebit": @"pendingDebit", @"realisedPnl": @"realisedPnl", @"walletBalance": @"walletBalance", @"unrealisedPnl": @"unrealisedPnl", @"marginBalance": @"marginBalance" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"currency", @"transactType", @"symbol", @"amount", @"pendingDebit", @"realisedPnl", @"walletBalance", @"unrealisedPnl", @"marginBalance"];
  return [optionalProperties containsObject:propertyName];
}

@end
