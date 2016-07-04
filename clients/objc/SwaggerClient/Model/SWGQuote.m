#import "SWGQuote.h"

@implementation SWGQuote

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"timestamp": @"timestamp", @"symbol": @"symbol", @"bidSize": @"bidSize", @"bidPrice": @"bidPrice", @"askPrice": @"askPrice", @"askSize": @"askSize", @"id": @"_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"timestamp", @"symbol", @"bidSize", @"bidPrice", @"askPrice", @"askSize", @"_id"];
  return [optionalProperties containsObject:propertyName];
}

@end
