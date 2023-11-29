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
    self.markPrice = @0.0;
    self.homeNotional = @0.0;
    self.foreignNotional = @0.0;
    self.unrealisedPnlPcnt = @0.0;
    self.unrealisedRoePcnt = @0.0;
    self.avgCostPrice = @0.0;
    self.avgEntryPrice = @0.0;
    self.breakEvenPrice = @0.0;
    self.marginCallPrice = @0.0;
    self.liquidationPrice = @0.0;
    self.bankruptPrice = @0.0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"account": @"account", @"symbol": @"symbol", @"currency": @"currency", @"underlying": @"underlying", @"quoteCurrency": @"quoteCurrency", @"commission": @"commission", @"initMarginReq": @"initMarginReq", @"maintMarginReq": @"maintMarginReq", @"riskLimit": @"riskLimit", @"leverage": @"leverage", @"crossMargin": @"crossMargin", @"deleveragePercentile": @"deleveragePercentile", @"rebalancedPnl": @"rebalancedPnl", @"prevRealisedPnl": @"prevRealisedPnl", @"prevUnrealisedPnl": @"prevUnrealisedPnl", @"openingQty": @"openingQty", @"openOrderBuyQty": @"openOrderBuyQty", @"openOrderBuyCost": @"openOrderBuyCost", @"openOrderBuyPremium": @"openOrderBuyPremium", @"openOrderSellQty": @"openOrderSellQty", @"openOrderSellCost": @"openOrderSellCost", @"openOrderSellPremium": @"openOrderSellPremium", @"currentQty": @"currentQty", @"currentCost": @"currentCost", @"currentComm": @"currentComm", @"realisedCost": @"realisedCost", @"unrealisedCost": @"unrealisedCost", @"grossOpenPremium": @"grossOpenPremium", @"isOpen": @"isOpen", @"markPrice": @"markPrice", @"markValue": @"markValue", @"riskValue": @"riskValue", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"posState": @"posState", @"posCost": @"posCost", @"posCross": @"posCross", @"posComm": @"posComm", @"posLoss": @"posLoss", @"posMargin": @"posMargin", @"posMaint": @"posMaint", @"initMargin": @"initMargin", @"maintMargin": @"maintMargin", @"realisedPnl": @"realisedPnl", @"unrealisedPnl": @"unrealisedPnl", @"unrealisedPnlPcnt": @"unrealisedPnlPcnt", @"unrealisedRoePcnt": @"unrealisedRoePcnt", @"avgCostPrice": @"avgCostPrice", @"avgEntryPrice": @"avgEntryPrice", @"breakEvenPrice": @"breakEvenPrice", @"marginCallPrice": @"marginCallPrice", @"liquidationPrice": @"liquidationPrice", @"bankruptPrice": @"bankruptPrice", @"timestamp": @"timestamp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"currency", @"underlying", @"quoteCurrency", @"commission", @"initMarginReq", @"maintMarginReq", @"riskLimit", @"leverage", @"crossMargin", @"deleveragePercentile", @"rebalancedPnl", @"prevRealisedPnl", @"prevUnrealisedPnl", @"openingQty", @"openOrderBuyQty", @"openOrderBuyCost", @"openOrderBuyPremium", @"openOrderSellQty", @"openOrderSellCost", @"openOrderSellPremium", @"currentQty", @"currentCost", @"currentComm", @"realisedCost", @"unrealisedCost", @"grossOpenPremium", @"isOpen", @"markPrice", @"markValue", @"riskValue", @"homeNotional", @"foreignNotional", @"posState", @"posCost", @"posCross", @"posComm", @"posLoss", @"posMargin", @"posMaint", @"initMargin", @"maintMargin", @"realisedPnl", @"unrealisedPnl", @"unrealisedPnlPcnt", @"unrealisedRoePcnt", @"avgCostPrice", @"avgEntryPrice", @"breakEvenPrice", @"marginCallPrice", @"liquidationPrice", @"bankruptPrice", @"timestamp"];
  return [optionalProperties containsObject:propertyName];
}

@end
