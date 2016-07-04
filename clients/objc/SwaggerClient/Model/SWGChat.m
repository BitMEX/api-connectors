#import "SWGChat.h"

@implementation SWGChat

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.fromBot = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"date": @"date", @"user": @"user", @"message": @"message", @"html": @"html", @"fromBot": @"fromBot" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"fromBot"];
  return [optionalProperties containsObject:propertyName];
}

@end
