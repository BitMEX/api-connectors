#import "SWGPosition.h"

@implementation SWGPosition

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.commission = @0.0;
    self.initMarginReq = @0.0;
    self.maintMarginReq = @0.0;
    self.leverage = @0.0;
    self.deleveragePercentile = @0.0;
    self.prevClosePrice = @0.0;
    self.markPrice = @0.0;
    self.homeNotional = @0.0;
    self.foreignNotional = @0.0;
    self.indicativeTaxRate = @0.0;
    self.unrealisedPnlPcnt = @0.0;
    self.unrealisedRoePcnt = @0.0;
    self.simpleQty = @0.0;
    self.simpleCost = @0.0;
    self.simpleValue = @0.0;
    self.simplePnl = @0.0;
    self.simplePnlPcnt = @0.0;
    self.avgCostPrice = @0.0;
    self.avgEntryPrice = @0.0;
    self.breakEvenPrice = @0.0;
    self.marginCallPrice = @0.0;
    self.liquidationPrice = @0.0;
    self.bankruptPrice = @0.0;
    self.lastPrice = @0.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"symbol": @"symbol", @"currency": @"currency", @"underlying": @"underlying", @"quoteCurrency": @"quoteCurrency", @"commission": @"commission", @"initMarginReq": @"initMarginReq", @"maintMarginReq": @"maintMarginReq", @"riskLimit": @"riskLimit", @"leverage": @"leverage", @"crossMargin": @"crossMargin", @"deleveragePercentile": @"deleveragePercentile", @"rebalancedPnl": @"rebalancedPnl", @"prevRealisedPnl": @"prevRealisedPnl", @"prevUnrealisedPnl": @"prevUnrealisedPnl", @"prevClosePrice": @"prevClosePrice", @"openingTimestamp": @"openingTimestamp", @"openingQty": @"openingQty", @"openingCost": @"openingCost", @"openingComm": @"openingComm", @"openOrderBuyQty": @"openOrderBuyQty", @"openOrderBuyCost": @"openOrderBuyCost", @"openOrderBuyPremium": @"openOrderBuyPremium", @"openOrderSellQty": @"openOrderSellQty", @"openOrderSellCost": @"openOrderSellCost", @"openOrderSellPremium": @"openOrderSellPremium", @"execBuyQty": @"execBuyQty", @"execBuyCost": @"execBuyCost", @"execSellQty": @"execSellQty", @"execSellCost": @"execSellCost", @"execQty": @"execQty", @"execCost": @"execCost", @"execComm": @"execComm", @"currentTimestamp": @"currentTimestamp", @"currentQty": @"currentQty", @"currentCost": @"currentCost", @"currentComm": @"currentComm", @"realisedCost": @"realisedCost", @"unrealisedCost": @"unrealisedCost", @"grossOpenCost": @"grossOpenCost", @"grossOpenPremium": @"grossOpenPremium", @"grossExecCost": @"grossExecCost", @"isOpen": @"isOpen", @"markPrice": @"markPrice", @"markValue": @"markValue", @"riskValue": @"riskValue", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"posState": @"posState", @"posCost": @"posCost", @"posCost2": @"posCost2", @"posCross": @"posCross", @"posInit": @"posInit", @"posComm": @"posComm", @"posLoss": @"posLoss", @"posMargin": @"posMargin", @"posMaint": @"posMaint", @"posAllowance": @"posAllowance", @"taxableMargin": @"taxableMargin", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"sessionMargin": @"sessionMargin", @"targetExcessMargin": @"targetExcessMargin", @"varMargin": @"varMargin", @"realisedGrossPnl": @"realisedGrossPnl", @"realisedTax": @"realisedTax", @"realisedPnl": @"realisedPnl", @"unrealisedGrossPnl": @"unrealisedGrossPnl", @"longBankrupt": @"longBankrupt", @"shortBankrupt": @"shortBankrupt", @"taxBase": @"taxBase", @"indicativeTaxRate": @"indicativeTaxRate", @"indicativeTax": @"indicativeTax", @"unrealisedTax": @"unrealisedTax", @"unrealisedPnl": @"unrealisedPnl", @"unrealisedPnlPcnt": @"unrealisedPnlPcnt", @"unrealisedRoePcnt": @"unrealisedRoePcnt", @"simpleQty": @"simpleQty", @"simpleCost": @"simpleCost", @"simpleValue": @"simpleValue", @"simplePnl": @"simplePnl", @"simplePnlPcnt": @"simplePnlPcnt", @"avgCostPrice": @"avgCostPrice", @"avgEntryPrice": @"avgEntryPrice", @"breakEvenPrice": @"breakEvenPrice", @"marginCallPrice": @"marginCallPrice", @"liquidationPrice": @"liquidationPrice", @"bankruptPrice": @"bankruptPrice", @"timestamp": @"timestamp", @"lastPrice": @"lastPrice", @"lastValue": @"lastValue" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"underlying", @"quoteCurrency", @"commission", @"initMarginReq", @"maintMarginReq", @"riskLimit", @"leverage", @"crossMargin", @"deleveragePercentile", @"rebalancedPnl", @"prevRealisedPnl", @"prevUnrealisedPnl", @"prevClosePrice", @"openingTimestamp", @"openingQty", @"openingCost", @"openingComm", @"openOrderBuyQty", @"openOrderBuyCost", @"openOrderBuyPremium", @"openOrderSellQty", @"openOrderSellCost", @"openOrderSellPremium", @"execBuyQty", @"execBuyCost", @"execSellQty", @"execSellCost", @"execQty", @"execCost", @"execComm", @"currentTimestamp", @"currentQty", @"currentCost", @"currentComm", @"realisedCost", @"unrealisedCost", @"grossOpenCost", @"grossOpenPremium", @"grossExecCost", @"isOpen", @"markPrice", @"markValue", @"riskValue", @"homeNotional", @"foreignNotional", @"posState", @"posCost", @"posCost2", @"posCross", @"posInit", @"posComm", @"posLoss", @"posMargin", @"posMaint", @"posAllowance", @"taxableMargin", @"initMargin", @"maintMargin", @"sessionMargin", @"targetExcessMargin", @"varMargin", @"realisedGrossPnl", @"realisedTax", @"realisedPnl", @"unrealisedGrossPnl", @"longBankrupt", @"shortBankrupt", @"taxBase", @"indicativeTaxRate", @"indicativeTax", @"unrealisedTax", @"unrealisedPnl", @"unrealisedPnlPcnt", @"unrealisedRoePcnt", @"simpleQty", @"simpleCost", @"simpleValue", @"simplePnl", @"simplePnlPcnt", @"avgCostPrice", @"avgEntryPrice", @"breakEvenPrice", @"marginCallPrice", @"liquidationPrice", @"bankruptPrice", @"timestamp", @"lastPrice", @"lastValue"];
  return [optionalProperties containsObject:propertyName];
}

@end
