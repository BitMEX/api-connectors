#import "SWGNotification.h"

@implementation SWGNotification

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.closable = @(YES);
    self.persist = @(YES);
    self.waitForVisibility = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"date": @"date", @"title": @"title", @"body": @"body", @"ttl": @"ttl", @"type": @"type", @"closable": @"closable", @"persist": @"persist", @"waitForVisibility": @"waitForVisibility", @"sound": @"sound" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"type", @"closable", @"persist", @"waitForVisibility", @"sound"];
  return [optionalProperties containsObject:propertyName];
}

@end
