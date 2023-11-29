#import "SWGAssetsConfig.h"

@implementation SWGAssetsConfig

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.asset = @"XBT";
    self.currency = @"XBt";
    self.majorCurrency = @"XBT";
    self.name = @"Bitcoin";
    self.currencyType = @"Crypto";
    self.scale = @8.0;
    self.enabled = @(YES);
    self.isMarginCurrency = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"asset": @"asset", @"currency": @"currency", @"majorCurrency": @"majorCurrency", @"name": @"name", @"currencyType": @"currencyType", @"scale": @"scale", @"enabled": @"enabled", @"isMarginCurrency": @"isMarginCurrency", @"networks": @"networks" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"currency", @"majorCurrency", @"name", @"currencyType", @"scale", @"enabled", @"isMarginCurrency", @"networks"];
  return [optionalProperties containsObject:propertyName];
}

@end
