#import "SWGUser.h"

@implementation SWGUser

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"firstname": @"firstname", @"lastname": @"lastname", @"status": @"status", @"username": @"username", @"email": @"email", @"phone": @"phone", @"countryCode": @"countryCode", @"created": @"created", @"lastUpdated": @"lastUpdated", @"preferences": @"preferences", @"role": @"role", @"TFAEnabled": @"tFAEnabled", @"affiliateID": @"affiliateID", @"pgpPubKey": @"pgpPubKey", @"country": @"country", @"disabled": @"disabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"_id", @"firstname", @"lastname", @"status", @"phone", @"countryCode", @"created", @"lastUpdated", @"preferences", @"role", @"tFAEnabled", @"affiliateID", @"pgpPubKey", @"country", @"disabled"];

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
