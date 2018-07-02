#import "SWGTransaction.h"

@implementation SWGTransaction

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"transactID": @"transactID", @"account": @"account", @"currency": @"currency", @"transactType": @"transactType", @"amount": @"amount", @"fee": @"fee", @"transactStatus": @"transactStatus", @"address": @"address", @"tx": @"tx", @"text": @"text", @"transactTime": @"transactTime", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"account", @"currency", @"transactType", @"amount", @"fee", @"transactStatus", @"address", @"tx", @"text", @"transactTime", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
