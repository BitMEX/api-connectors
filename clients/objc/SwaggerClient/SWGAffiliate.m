#import "SWGAffiliate.h"

@implementation SWGAffiliate

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"account": @"account", @"currency": @"currency", @"prevPayout": @"prevPayout", @"prevTurnover": @"prevTurnover", @"prevComm": @"prevComm", @"prevTimestamp": @"prevTimestamp", @"execTurnover": @"execTurnover", @"execComm": @"execComm", @"totalReferrals": @"totalReferrals", @"totalTurnover": @"totalTurnover", @"totalComm": @"totalComm", @"payoutPcnt": @"payoutPcnt", @"pendingPayout": @"pendingPayout", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"prevPayout", @"prevTurnover", @"prevComm", @"prevTimestamp", @"execTurnover", @"execComm", @"totalReferrals", @"totalTurnover", @"totalComm", @"payoutPcnt", @"pendingPayout", @"timestamp"];

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
