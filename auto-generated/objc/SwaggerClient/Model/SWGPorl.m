#import "SWGPorl.h"

@implementation SWGPorl

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"nonce": @"nonce", @"accountNonce": @"accountNonce", @"total": @"total", @"balance": @"balance", @"filename": @"filename", @"height": @"height", @"created": @"created" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"nonce", @"filename", ];
  return [optionalProperties containsObject:propertyName];
}

@end
