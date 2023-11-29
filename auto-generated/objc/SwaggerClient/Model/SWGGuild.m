#import "SWGGuild.h"

@implementation SWGGuild

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"created": @"created", @"updated": @"updated", @"archived": @"archived", @"name": @"name", @"imgUrl": @"imgUrl", @"mobileHeroImgUrl": @"mobileHeroImgUrl", @"emoji": @"emoji", @"logoUrl": @"logoUrl", @"_description": @"description", @"chatChannelId": @"chatChannelId", @"isPrivate": @"isPrivate", @"affiliateId": @"affiliateId", @"potDistributionPreferences": @"potDistributionPreferences", @"socials": @"socials", @"deleted": @"deleted" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"archived", @"imgUrl", @"mobileHeroImgUrl", @"emoji", @"logoUrl", @"_description", @"affiliateId", @"potDistributionPreferences", @"socials", @"deleted"];
  return [optionalProperties containsObject:propertyName];
}

@end
