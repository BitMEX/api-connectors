#import "SWGAPIKey.h"

@implementation SWGAPIKey

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.enabled = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"secret": @"secret", @"name": @"name", @"nonce": @"nonce", @"cidr": @"cidr", @"permissions": @"permissions", @"enabled": @"enabled", @"userId": @"userId", @"created": @"created" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cidr", @"permissions", @"enabled", @"created"];
  return [optionalProperties containsObject:propertyName];
}

@end
