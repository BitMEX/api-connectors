#import "SWGQuoteFillRatio.h"

@implementation SWGQuoteFillRatio

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"date": @"date", @"account": @"account", @"quoteCount": @"quoteCount", @"dealtCount": @"dealtCount", @"quotesMavg7": @"quotesMavg7", @"dealtMavg7": @"dealtMavg7", @"quoteFillRatioMavg7": @"quoteFillRatioMavg7" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"account", @"quoteCount", @"dealtCount", @"quotesMavg7", @"dealtMavg7", @"quoteFillRatioMavg7"];
  return [optionalProperties containsObject:propertyName];
}

@end
