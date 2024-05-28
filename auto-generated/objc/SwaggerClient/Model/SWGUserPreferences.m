#import "SWGUserPreferences.h"

@implementation SWGUserPreferences

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.hideFromLeaderboard = @(NO);
    self.hideNameFromLeaderboard = @(YES);
    self.hidePnlInGuilds = @(NO);
    self.hideRoiInGuilds = @(NO);
    self.hidePhoneConfirm = @(NO);
    self.locale = @"en-US";
    self.orderClearImmediate = @(NO);
    self.showLocaleNumbers = @(YES);
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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alertOnLiquidations": @"alertOnLiquidations", @"animationsEnabled": @"animationsEnabled", @"announcementsLastSeen": @"announcementsLastSeen", @"chatChannelID": @"chatChannelID", @"colorTheme": @"colorTheme", @"currency": @"currency", @"debug": @"debug", @"disableEmails": @"disableEmails", @"disablePush": @"disablePush", @"displayCorpEnrollUpsell": @"displayCorpEnrollUpsell", @"equivalentCurrency": @"equivalentCurrency", @"features": @"features", @"favourites": @"favourites", @"favouritesAssets": @"favouritesAssets", @"favouritesOrdered": @"favouritesOrdered", @"favouriteBots": @"favouriteBots", @"hasSetTradingCurrencies": @"hasSetTradingCurrencies", @"hideConfirmDialogs": @"hideConfirmDialogs", @"hideConnectionModal": @"hideConnectionModal", @"hideFromLeaderboard": @"hideFromLeaderboard", @"hideNameFromLeaderboard": @"hideNameFromLeaderboard", @"hidePnlInGuilds": @"hidePnlInGuilds", @"hideRoiInGuilds": @"hideRoiInGuilds", @"hideNotifications": @"hideNotifications", @"hidePhoneConfirm": @"hidePhoneConfirm", @"isSensitiveInfoVisible": @"isSensitiveInfoVisible", @"isWalletZeroBalanceHidden": @"isWalletZeroBalanceHidden", @"locale": @"locale", @"localeSetTime": @"localeSetTime", @"marginPnlRow": @"marginPnlRow", @"marginPnlRowKind": @"marginPnlRowKind", @"mobileLocale": @"mobileLocale", @"msgsSeen": @"msgsSeen", @"notifications": @"notifications", @"optionsBeta": @"optionsBeta", @"orderBookBinning": @"orderBookBinning", @"orderBookType": @"orderBookType", @"orderClearImmediate": @"orderClearImmediate", @"orderControlsPlusMinus": @"orderControlsPlusMinus", @"platformLayout": @"platformLayout", @"selectedFiatCurrency": @"selectedFiatCurrency", @"showChartBottomToolbar": @"showChartBottomToolbar", @"showLocaleNumbers": @"showLocaleNumbers", @"sounds": @"sounds", @"spacingPreference": @"spacingPreference", @"strictIPCheck": @"strictIPCheck", @"strictTimeout": @"strictTimeout", @"tickerGroup": @"tickerGroup", @"tickerPinned": @"tickerPinned", @"tradeLayout": @"tradeLayout", @"userColor": @"userColor" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alertOnLiquidations", @"animationsEnabled", @"announcementsLastSeen", @"chatChannelID", @"colorTheme", @"currency", @"debug", @"disableEmails", @"disablePush", @"displayCorpEnrollUpsell", @"equivalentCurrency", @"features", @"favourites", @"favouritesAssets", @"favouritesOrdered", @"favouriteBots", @"hasSetTradingCurrencies", @"hideConfirmDialogs", @"hideConnectionModal", @"hideFromLeaderboard", @"hideNameFromLeaderboard", @"hidePnlInGuilds", @"hideRoiInGuilds", @"hideNotifications", @"hidePhoneConfirm", @"isSensitiveInfoVisible", @"isWalletZeroBalanceHidden", @"locale", @"localeSetTime", @"marginPnlRow", @"marginPnlRowKind", @"mobileLocale", @"msgsSeen", @"notifications", @"optionsBeta", @"orderBookBinning", @"orderBookType", @"orderClearImmediate", @"orderControlsPlusMinus", @"platformLayout", @"selectedFiatCurrency", @"showChartBottomToolbar", @"showLocaleNumbers", @"sounds", @"spacingPreference", @"strictIPCheck", @"strictTimeout", @"tickerGroup", @"tickerPinned", @"tradeLayout", @"userColor"];
  return [optionalProperties containsObject:propertyName];
}

@end
