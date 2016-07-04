part of api;


@Entity()
class Position {
  
  Number account = null;
  
  
  String symbol = null;
  
  
  String currency = null;
  
  
  String underlying = null;
  
  
  String quoteCurrency = null;
  
  
  num commission = null;
  
  
  num leverage = null;
  
  
  bool crossMargin = null;
  
  
  Number rebalancedPnl = null;
  
  
  Number prevRealisedPnl = null;
  
  
  Number prevUnrealisedPnl = null;
  
  
  num prevClosePrice = null;
  
  
  DateTime openingTimestamp = null;
  
  
  Number openingQty = null;
  
  
  Number openingCost = null;
  
  
  Number openingComm = null;
  
  
  Number openOrderBuyQty = null;
  
  
  Number openOrderBuyCost = null;
  
  
  Number openOrderBuyPremium = null;
  
  
  Number openOrderSellQty = null;
  
  
  Number openOrderSellCost = null;
  
  
  Number openOrderSellPremium = null;
  
  
  Number execBuyQty = null;
  
  
  Number execBuyCost = null;
  
  
  Number execSellQty = null;
  
  
  Number execSellCost = null;
  
  
  Number execQty = null;
  
  
  Number execCost = null;
  
  
  Number execComm = null;
  
  
  DateTime currentTimestamp = null;
  
  
  Number currentQty = null;
  
  
  Number currentCost = null;
  
  
  Number currentComm = null;
  
  
  Number realisedCost = null;
  
  
  Number unrealisedCost = null;
  
  
  Number grossOpenCost = null;
  
  
  Number grossOpenPremium = null;
  
  
  Number grossExecCost = null;
  
  
  bool isOpen = null;
  
  
  num markPrice = null;
  
  
  Number markValue = null;
  
  
  num homeNotional = null;
  
  
  num foreignNotional = null;
  
  
  String posState = null;
  
  
  Number posCost = null;
  
  
  Number posCost2 = null;
  
  
  Number posCross = null;
  
  
  Number posInit = null;
  
  
  Number posComm = null;
  
  
  Number posLoss = null;
  
  
  Number posMargin = null;
  
  
  Number posMaint = null;
  
  
  Number posAllowance = null;
  
  
  Number taxableMargin = null;
  
  
  Number initMargin = null;
  
  
  Number maintMargin = null;
  
  
  Number sessionMargin = null;
  
  
  Number targetExcessMargin = null;
  
  
  Number varMargin = null;
  
  
  Number realisedGrossPnl = null;
  
  
  Number realisedTax = null;
  
  
  Number realisedPnl = null;
  
  
  Number unrealisedGrossPnl = null;
  
  
  Number longBankrupt = null;
  
  
  Number shortBankrupt = null;
  
  
  Number taxBase = null;
  
  
  num indicativeTaxRate = null;
  
  
  Number indicativeTax = null;
  
  
  Number unrealisedTax = null;
  
  
  Number unrealisedPnl = null;
  
  
  num unrealisedPnlPcnt = null;
  
  
  num unrealisedRoePcnt = null;
  
  
  num simpleQty = null;
  
  
  num simpleCost = null;
  
  
  num simpleValue = null;
  
  
  num simplePnl = null;
  
  
  num simplePnlPcnt = null;
  
  
  num avgCostPrice = null;
  
  
  num avgEntryPrice = null;
  
  
  num breakEvenPrice = null;
  
  
  num marginCallPrice = null;
  
  
  num liquidationPrice = null;
  
  
  num bankruptPrice = null;
  
  
  DateTime timestamp = null;
  
  
  num lastPrice = null;
  
  
  Number lastValue = null;
  
  
  Position();

  @override
  String toString()  {
    return 'Position[account=$account, symbol=$symbol, currency=$currency, underlying=$underlying, quoteCurrency=$quoteCurrency, commission=$commission, leverage=$leverage, crossMargin=$crossMargin, rebalancedPnl=$rebalancedPnl, prevRealisedPnl=$prevRealisedPnl, prevUnrealisedPnl=$prevUnrealisedPnl, prevClosePrice=$prevClosePrice, openingTimestamp=$openingTimestamp, openingQty=$openingQty, openingCost=$openingCost, openingComm=$openingComm, openOrderBuyQty=$openOrderBuyQty, openOrderBuyCost=$openOrderBuyCost, openOrderBuyPremium=$openOrderBuyPremium, openOrderSellQty=$openOrderSellQty, openOrderSellCost=$openOrderSellCost, openOrderSellPremium=$openOrderSellPremium, execBuyQty=$execBuyQty, execBuyCost=$execBuyCost, execSellQty=$execSellQty, execSellCost=$execSellCost, execQty=$execQty, execCost=$execCost, execComm=$execComm, currentTimestamp=$currentTimestamp, currentQty=$currentQty, currentCost=$currentCost, currentComm=$currentComm, realisedCost=$realisedCost, unrealisedCost=$unrealisedCost, grossOpenCost=$grossOpenCost, grossOpenPremium=$grossOpenPremium, grossExecCost=$grossExecCost, isOpen=$isOpen, markPrice=$markPrice, markValue=$markValue, homeNotional=$homeNotional, foreignNotional=$foreignNotional, posState=$posState, posCost=$posCost, posCost2=$posCost2, posCross=$posCross, posInit=$posInit, posComm=$posComm, posLoss=$posLoss, posMargin=$posMargin, posMaint=$posMaint, posAllowance=$posAllowance, taxableMargin=$taxableMargin, initMargin=$initMargin, maintMargin=$maintMargin, sessionMargin=$sessionMargin, targetExcessMargin=$targetExcessMargin, varMargin=$varMargin, realisedGrossPnl=$realisedGrossPnl, realisedTax=$realisedTax, realisedPnl=$realisedPnl, unrealisedGrossPnl=$unrealisedGrossPnl, longBankrupt=$longBankrupt, shortBankrupt=$shortBankrupt, taxBase=$taxBase, indicativeTaxRate=$indicativeTaxRate, indicativeTax=$indicativeTax, unrealisedTax=$unrealisedTax, unrealisedPnl=$unrealisedPnl, unrealisedPnlPcnt=$unrealisedPnlPcnt, unrealisedRoePcnt=$unrealisedRoePcnt, simpleQty=$simpleQty, simpleCost=$simpleCost, simpleValue=$simpleValue, simplePnl=$simplePnl, simplePnlPcnt=$simplePnlPcnt, avgCostPrice=$avgCostPrice, avgEntryPrice=$avgEntryPrice, breakEvenPrice=$breakEvenPrice, marginCallPrice=$marginCallPrice, liquidationPrice=$liquidationPrice, bankruptPrice=$bankruptPrice, timestamp=$timestamp, lastPrice=$lastPrice, lastValue=$lastValue, ]';
  }

}

