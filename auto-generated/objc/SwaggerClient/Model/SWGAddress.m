#import "SWGAddress.h"

@implementation SWGAddress

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"currency": @"currency", @"created": @"created", @"userId": @"userId", @"address": @"address", @"name": @"name", @"note": @"note", @"skipConfirm": @"skipConfirm", @"skipConfirmVerified": @"skipConfirmVerified", @"skip2FA": @"skip2FA", @"skip2FAVerified": @"skip2FAVerified", @"network": @"network", @"memo": @"memo" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"currency", @"created", @"userId", @"note", @"skipConfirm", @"skipConfirmVerified", @"skip2FA", @"skip2FAVerified", @"memo"];
  return [optionalProperties containsObject:propertyName];
}

@end
