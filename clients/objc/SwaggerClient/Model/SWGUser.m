#import "SWGUser.h"

@implementation SWGUser

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.disabled = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"ownerId": @"ownerId", @"firstname": @"firstname", @"lastname": @"lastname", @"status": @"status", @"username": @"username", @"email": @"email", @"phone": @"phone", @"countryCode": @"countryCode", @"created": @"created", @"lastUpdated": @"lastUpdated", @"preferences": @"preferences", @"TFAEnabled": @"tFAEnabled", @"affiliateID": @"affiliateID", @"pgpPubKey": @"pgpPubKey", @"country": @"country", @"disabled": @"disabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"ownerId", @"firstname", @"lastname", @"status", @"phone", @"countryCode", @"created", @"lastUpdated", @"preferences", @"tFAEnabled", @"affiliateID", @"pgpPubKey", @"country", @"disabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
