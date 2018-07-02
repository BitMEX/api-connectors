#import "SWGAffiliate.h"

@implementation SWGAffiliate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"currency": @"currency", @"prevPayout": @"prevPayout", @"prevTurnover": @"prevTurnover", @"prevComm": @"prevComm", @"prevTimestamp": @"prevTimestamp", @"execTurnover": @"execTurnover", @"execComm": @"execComm", @"totalReferrals": @"totalReferrals", @"totalTurnover": @"totalTurnover", @"totalComm": @"totalComm", @"payoutPcnt": @"payoutPcnt", @"pendingPayout": @"pendingPayout", @"timestamp": @"timestamp", @"referrerAccount": @"referrerAccount" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"prevPayout", @"prevTurnover", @"prevComm", @"prevTimestamp", @"execTurnover", @"execComm", @"totalReferrals", @"totalTurnover", @"totalComm", @"payoutPcnt", @"pendingPayout", @"timestamp", @"referrerAccount"];
  return [optionalProperties containsObject:propertyName];
}

@end
