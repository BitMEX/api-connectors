#import "SWGUserEvent.h"

@implementation SWGUserEvent

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"type": @"type", @"status": @"status", @"userId": @"userId", @"createdById": @"createdById", @"ip": @"ip", @"geoipCountry": @"geoipCountry", @"geoipRegion": @"geoipRegion", @"geoipSubRegion": @"geoipSubRegion", @"eventMeta": @"eventMeta", @"created": @"created" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"ip", @"geoipCountry", @"geoipRegion", @"geoipSubRegion", @"eventMeta", ];
  return [optionalProperties containsObject:propertyName];
}

@end
