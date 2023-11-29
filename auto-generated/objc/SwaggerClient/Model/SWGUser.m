#import "SWGUser.h"

@implementation SWGUser

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.isUser = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"firstname": @"firstname", @"lastname": @"lastname", @"username": @"username", @"accountName": @"accountName", @"isUser": @"isUser", @"email": @"email", @"dateOfBirth": @"dateOfBirth", @"phone": @"phone", @"created": @"created", @"lastUpdated": @"lastUpdated", @"preferences": @"preferences", @"tFAEnabled": @"TFAEnabled", @"affiliateID": @"affiliateID", @"country": @"country", @"geoipCountry": @"geoipCountry", @"geoipRegion": @"geoipRegion", @"firstTradeTimestamp": @"firstTradeTimestamp", @"typ": @"typ" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"firstname", @"lastname", @"accountName", @"email", @"dateOfBirth", @"phone", @"created", @"lastUpdated", @"preferences", @"tFAEnabled", @"affiliateID", @"country", @"geoipCountry", @"geoipRegion", @"firstTradeTimestamp", @"typ"];
  return [optionalProperties containsObject:propertyName];
}

@end
