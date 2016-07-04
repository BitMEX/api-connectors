#import "SWGTradeBin.h"

@implementation SWGTradeBin

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"timestamp": @"timestamp", @"symbol": @"symbol", @"open": @"open", @"high": @"high", @"low": @"low", @"close": @"close", @"trades": @"trades", @"volume": @"volume", @"vwap": @"vwap", @"lastSize": @"lastSize", @"turnover": @"turnover", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"id": @"_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"timestamp", @"symbol", @"open", @"high", @"low", @"close", @"trades", @"volume", @"vwap", @"lastSize", @"turnover", @"homeNotional", @"foreignNotional", @"_id"];
  return [optionalProperties containsObject:propertyName];
}

@end
