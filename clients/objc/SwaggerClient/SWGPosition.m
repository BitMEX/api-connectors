#import "SWGPosition.h"

@implementation SWGPosition

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"account": @"account", @"symbol": @"symbol", @"underlying": @"underlying", @"quoteCurrency": @"quoteCurrency", @"currency": @"currency", @"commission": @"commission", @"crossMargin": @"crossMargin", @"rebalancedPnl": @"rebalancedPnl", @"prevRealisedPnl": @"prevRealisedPnl", @"prevUnrealisedPnl": @"prevUnrealisedPnl", @"prevClosePrice": @"prevClosePrice", @"openingTimestamp": @"openingTimestamp", @"openingQty": @"openingQty", @"openingCost": @"openingCost", @"openingComm": @"openingComm", @"openOrderBuyQty": @"openOrderBuyQty", @"openOrderBuyCost": @"openOrderBuyCost", @"openOrderBuyPremium": @"openOrderBuyPremium", @"openOrderSellQty": @"openOrderSellQty", @"openOrderSellCost": @"openOrderSellCost", @"openOrderSellPremium": @"openOrderSellPremium", @"execBuyQty": @"execBuyQty", @"execBuyCost": @"execBuyCost", @"execSellQty": @"execSellQty", @"execSellCost": @"execSellCost", @"execQty": @"execQty", @"execCost": @"execCost", @"execComm": @"execComm", @"currentTimestamp": @"currentTimestamp", @"currentQty": @"currentQty", @"currentCost": @"currentCost", @"currentComm": @"currentComm", @"realisedCost": @"realisedCost", @"unrealisedCost": @"unrealisedCost", @"grossOpenCost": @"grossOpenCost", @"grossOpenPremium": @"grossOpenPremium", @"grossExecCost": @"grossExecCost", @"isOpen": @"isOpen", @"markPrice": @"markPrice", @"markValue": @"markValue", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"posState": @"posState", @"posCost": @"posCost", @"posCost2": @"posCost2", @"posCross": @"posCross", @"posInit": @"posInit", @"posComm": @"posComm", @"posLoss": @"posLoss", @"posMargin": @"posMargin", @"posMaint": @"posMaint", @"posAllowance": @"posAllowance", @"taxableMargin": @"taxableMargin", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"sessionMargin": @"sessionMargin", @"targetExcessMargin": @"targetExcessMargin", @"varMargin": @"varMargin", @"realisedGrossPnl": @"realisedGrossPnl", @"realisedTax": @"realisedTax", @"realisedPnl": @"realisedPnl", @"unrealisedGrossPnl": @"unrealisedGrossPnl", @"longBankrupt": @"longBankrupt", @"shortBankrupt": @"shortBankrupt", @"taxBase": @"taxBase", @"indicativeTaxRate": @"indicativeTaxRate", @"indicativeTax": @"indicativeTax", @"unrealisedTax": @"unrealisedTax", @"unrealisedPnl": @"unrealisedPnl", @"unrealisedPnlPcnt": @"unrealisedPnlPcnt", @"unrealisedRoePcnt": @"unrealisedRoePcnt", @"simpleQty": @"simpleQty", @"simpleCost": @"simpleCost", @"simpleValue": @"simpleValue", @"simplePnl": @"simplePnl", @"simplePnlPcnt": @"simplePnlPcnt", @"avgCostPrice": @"avgCostPrice", @"avgEntryPrice": @"avgEntryPrice", @"breakEvenPrice": @"breakEvenPrice", @"marginCallPrice": @"marginCallPrice", @"liquidationPrice": @"liquidationPrice", @"bankruptPrice": @"bankruptPrice", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"underlying", @"quoteCurrency", @"currency", @"commission", @"crossMargin", @"rebalancedPnl", @"prevRealisedPnl", @"prevUnrealisedPnl", @"prevClosePrice", @"openingTimestamp", @"openingQty", @"openingCost", @"openingComm", @"openOrderBuyQty", @"openOrderBuyCost", @"openOrderBuyPremium", @"openOrderSellQty", @"openOrderSellCost", @"openOrderSellPremium", @"execBuyQty", @"execBuyCost", @"execSellQty", @"execSellCost", @"execQty", @"execCost", @"execComm", @"currentTimestamp", @"currentQty", @"currentCost", @"currentComm", @"realisedCost", @"unrealisedCost", @"grossOpenCost", @"grossOpenPremium", @"grossExecCost", @"isOpen", @"markPrice", @"markValue", @"homeNotional", @"foreignNotional", @"posState", @"posCost", @"posCost2", @"posCross", @"posInit", @"posComm", @"posLoss", @"posMargin", @"posMaint", @"posAllowance", @"taxableMargin", @"initMargin", @"maintMargin", @"sessionMargin", @"targetExcessMargin", @"varMargin", @"realisedGrossPnl", @"realisedTax", @"realisedPnl", @"unrealisedGrossPnl", @"longBankrupt", @"shortBankrupt", @"taxBase", @"indicativeTaxRate", @"indicativeTax", @"unrealisedTax", @"unrealisedPnl", @"unrealisedPnlPcnt", @"unrealisedRoePcnt", @"simpleQty", @"simpleCost", @"simpleValue", @"simplePnl", @"simplePnlPcnt", @"avgCostPrice", @"avgEntryPrice", @"breakEvenPrice", @"marginCallPrice", @"liquidationPrice", @"bankruptPrice", @"timestamp"];

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
