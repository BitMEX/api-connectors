#import "SWGAffiliate.h"

@implementation SWGAffiliate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"referrerAccount": @"referrerAccount", @"referralDiscount": @"referralDiscount", @"affiliatePayout": @"affiliatePayout", @"_id": @"id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"referrerAccount", @"referralDiscount", @"affiliatePayout", @"_id"];
  return [optionalProperties containsObject:propertyName];
}

@end
