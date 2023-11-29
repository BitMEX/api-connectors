#import "SWGQuoteValueRatio.h"

@implementation SWGQuoteValueRatio

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"timestamp": @"timestamp", @"account": @"account", @"symbol": @"symbol", @"quoteCount": @"quoteCount", @"volumeXBT": @"volumeXBT", @"qVR": @"QVR", @"_id": @"id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"timestamp", @"account", @"symbol", @"quoteCount", @"volumeXBT", @"qVR", @"_id"];
  return [optionalProperties containsObject:propertyName];
}

@end
