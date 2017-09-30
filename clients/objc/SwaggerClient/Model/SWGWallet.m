#import "SWGWallet.h"

@implementation SWGWallet

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"currency": @"currency", @"prevDeposited": @"prevDeposited", @"prevWithdrawn": @"prevWithdrawn", @"prevTransferIn": @"prevTransferIn", @"prevTransferOut": @"prevTransferOut", @"prevAmount": @"prevAmount", @"prevTimestamp": @"prevTimestamp", @"deltaDeposited": @"deltaDeposited", @"deltaWithdrawn": @"deltaWithdrawn", @"deltaTransferIn": @"deltaTransferIn", @"deltaTransferOut": @"deltaTransferOut", @"deltaAmount": @"deltaAmount", @"deposited": @"deposited", @"withdrawn": @"withdrawn", @"transferIn": @"transferIn", @"transferOut": @"transferOut", @"amount": @"amount", @"pendingCredit": @"pendingCredit", @"pendingDebit": @"pendingDebit", @"confirmedDebit": @"confirmedDebit", @"timestamp": @"timestamp", @"addr": @"addr", @"script": @"script", @"withdrawalLock": @"withdrawalLock" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"prevDeposited", @"prevWithdrawn", @"prevTransferIn", @"prevTransferOut", @"prevAmount", @"prevTimestamp", @"deltaDeposited", @"deltaWithdrawn", @"deltaTransferIn", @"deltaTransferOut", @"deltaAmount", @"deposited", @"withdrawn", @"transferIn", @"transferOut", @"amount", @"pendingCredit", @"pendingDebit", @"confirmedDebit", @"timestamp", @"addr", @"script", @"withdrawalLock"];
  return [optionalProperties containsObject:propertyName];
}

@end
