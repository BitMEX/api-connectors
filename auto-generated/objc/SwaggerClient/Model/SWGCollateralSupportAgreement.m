#import "SWGCollateralSupportAgreement.h"

@implementation SWGCollateralSupportAgreement

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"csaID": @"csaID", @"account": @"account", @"currency": @"currency", @"amount": @"amount", @"minAmount": @"minAmount", @"threshold": @"threshold", @"mmRatioMarginCall": @"mmRatioMarginCall", @"mmRatioLiquidation": @"mmRatioLiquidation", @"startTime": @"startTime", @"maturityTime": @"maturityTime", @"maturityInstruction": @"maturityInstruction", @"csaStatus": @"csaStatus", @"requester": @"requester", @"clientDetails": @"clientDetails", @"text": @"text", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"account", @"currency", @"amount", @"minAmount", @"threshold", @"mmRatioMarginCall", @"mmRatioLiquidation", @"startTime", @"maturityTime", @"maturityInstruction", @"csaStatus", @"requester", @"clientDetails", @"text", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
