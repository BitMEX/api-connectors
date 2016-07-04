#import "SWGUserPreferences.h"

@implementation SWGUserPreferences

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"announcementsLastSeen": @"announcementsLastSeen", @"colorTheme": @"colorTheme", @"currency": @"currency", @"debug": @"debug", @"disableEmails": @"disableEmails", @"hideConfirmDialogs": @"hideConfirmDialogs", @"hideConnectionModal": @"hideConnectionModal", @"hideFromLeaderboard": @"hideFromLeaderboard", @"hideNameFromLeaderboard": @"hideNameFromLeaderboard", @"hideNotifications": @"hideNotifications", @"hidePhoneConfirm": @"hidePhoneConfirm", @"locale": @"locale", @"msgsSeen": @"msgsSeen", @"orderBookBinning": @"orderBookBinning", @"orderBookType": @"orderBookType", @"orderControlsPlusMinus": @"orderControlsPlusMinus", @"sounds": @"sounds", @"strictIPCheck": @"strictIPCheck", @"strictTimeout": @"strictTimeout", @"tickerGroup": @"tickerGroup", @"tickerPinned": @"tickerPinned", @"tradeLayout": @"tradeLayout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"announcementsLastSeen", @"colorTheme", @"currency", @"debug", @"disableEmails", @"hideConfirmDialogs", @"hideConnectionModal", @"hideFromLeaderboard", @"hideNameFromLeaderboard", @"hideNotifications", @"hidePhoneConfirm", @"locale", @"msgsSeen", @"orderBookBinning", @"orderBookType", @"orderControlsPlusMinus", @"sounds", @"strictIPCheck", @"strictTimeout", @"tickerGroup", @"tickerPinned", @"tradeLayout"];

  if ([optionalProperties containsObject:propertyName]) {
    return YES;
  }
  else {
    return NO;
  }
}

/**
 * Gets the string presentation of the object.
 * This method will be called when logging model object using `NSLog`.
 */
- (NSString *)description {
    return [[self toDictionary] description];
}

@end
