#import "SWGAccessToken.h"

@implementation SWGAccessToken

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.ttl = @1209600.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"ttl": @"ttl", @"created": @"created", @"userId": @"userId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ttl", @"created", @"userId"];
  return [optionalProperties containsObject:propertyName];
}

@end
