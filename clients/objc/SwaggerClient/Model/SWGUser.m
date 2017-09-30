#import "SWGUser.h"

@implementation SWGUser

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"ownerId": @"ownerId", @"firstname": @"firstname", @"lastname": @"lastname", @"username": @"username", @"email": @"email", @"phone": @"phone", @"created": @"created", @"lastUpdated": @"lastUpdated", @"preferences": @"preferences", @"tFAEnabled": @"TFAEnabled", @"affiliateID": @"affiliateID", @"pgpPubKey": @"pgpPubKey", @"country": @"country" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"ownerId", @"firstname", @"lastname", @"phone", @"created", @"lastUpdated", @"preferences", @"tFAEnabled", @"affiliateID", @"pgpPubKey", @"country"];
  return [optionalProperties containsObject:propertyName];
}

@end
