#import "SWGSettlement.h"

@implementation SWGSettlement

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"timestamp": @"timestamp", @"symbol": @"symbol", @"settlementType": @"settlementType", @"settledPrice": @"settledPrice", @"optionStrikePrice": @"optionStrikePrice", @"optionUnderlyingPrice": @"optionUnderlyingPrice", @"bankrupt": @"bankrupt", @"taxBase": @"taxBase", @"taxRate": @"taxRate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"settlementType", @"settledPrice", @"optionStrikePrice", @"optionUnderlyingPrice", @"bankrupt", @"taxBase", @"taxRate"];
  return [optionalProperties containsObject:propertyName];
}

@end
