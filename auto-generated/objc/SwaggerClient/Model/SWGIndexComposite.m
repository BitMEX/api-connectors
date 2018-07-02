#import "SWGIndexComposite.h"

@implementation SWGIndexComposite

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"timestamp": @"timestamp", @"symbol": @"symbol", @"indexSymbol": @"indexSymbol", @"reference": @"reference", @"lastPrice": @"lastPrice", @"weight": @"weight", @"logged": @"logged" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"symbol", @"indexSymbol", @"reference", @"lastPrice", @"weight", @"logged"];
  return [optionalProperties containsObject:propertyName];
}

@end
