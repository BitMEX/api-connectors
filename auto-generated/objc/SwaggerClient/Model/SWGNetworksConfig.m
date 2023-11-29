#import "SWGNetworksConfig.h"

@implementation SWGNetworksConfig

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.network = @"eth";
    self.name = @"Ethereum";
    self.currency = @"Gwei";
    self.networkSymbol = @"ETH";
    self.transactionExplorer = @"https://etherscan.io/tx/";
    self.tokenExplorer = @"https://etherscan.io/token/";
    self.enabled = @(YES);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"network": @"network", @"name": @"name", @"currency": @"currency", @"networkSymbol": @"networkSymbol", @"transactionExplorer": @"transactionExplorer", @"tokenExplorer": @"tokenExplorer", @"depositConfirmations": @"depositConfirmations", @"enabled": @"enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"currency", @"networkSymbol", @"transactionExplorer", @"tokenExplorer", @"depositConfirmations", @"enabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
