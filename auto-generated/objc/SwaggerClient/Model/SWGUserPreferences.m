#import "SWGUserPreferences.h"

@implementation SWGUserPreferences

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.hideFromLeaderboard = @(NO);
    self.hideNameFromLeaderboard = @(YES);
    self.locale = @"en-US";
    self.orderClearImmediate = @(NO);
    self.strictIPCheck = @(NO);
    self.strictTimeout = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alertOnLiquidations": @"alertOnLiquidations", @"animationsEnabled": @"animationsEnabled", @"announcementsLastSeen": @"announcementsLastSeen", @"chatChannelID": @"chatChannelID", @"colorTheme": @"colorTheme", @"currency": @"currency", @"debug": @"debug", @"disableEmails": @"disableEmails", @"hideConfirmDialogs": @"hideConfirmDialogs", @"hideConnectionModal": @"hideConnectionModal", @"hideFromLeaderboard": @"hideFromLeaderboard", @"hideNameFromLeaderboard": @"hideNameFromLeaderboard", @"hideNotifications": @"hideNotifications", @"locale": @"locale", @"msgsSeen": @"msgsSeen", @"orderBookBinning": @"orderBookBinning", @"orderBookType": @"orderBookType", @"orderClearImmediate": @"orderClearImmediate", @"orderControlsPlusMinus": @"orderControlsPlusMinus", @"sounds": @"sounds", @"strictIPCheck": @"strictIPCheck", @"strictTimeout": @"strictTimeout", @"tickerGroup": @"tickerGroup", @"tickerPinned": @"tickerPinned", @"tradeLayout": @"tradeLayout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alertOnLiquidations", @"animationsEnabled", @"announcementsLastSeen", @"chatChannelID", @"colorTheme", @"currency", @"debug", @"disableEmails", @"hideConfirmDialogs", @"hideConnectionModal", @"hideFromLeaderboard", @"hideNameFromLeaderboard", @"hideNotifications", @"locale", @"msgsSeen", @"orderBookBinning", @"orderBookType", @"orderClearImmediate", @"orderControlsPlusMinus", @"sounds", @"strictIPCheck", @"strictTimeout", @"tickerGroup", @"tickerPinned", @"tradeLayout"];
  return [optionalProperties containsObject:propertyName];
}

@end
