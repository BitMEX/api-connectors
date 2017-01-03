part of api;


@Entity()
class Position {
  
  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'underlying')
  String underlying = null;
  

  @Property(name: 'quoteCurrency')
  String quoteCurrency = null;
  

  @Property(name: 'commission')
  double commission = null;
  

  @Property(name: 'initMarginReq')
  double initMarginReq = null;
  

  @Property(name: 'maintMarginReq')
  double maintMarginReq = null;
  

  @Property(name: 'riskLimit')
  Number riskLimit = null;
  

  @Property(name: 'leverage')
  double leverage = null;
  

  @Property(name: 'crossMargin')
  bool crossMargin = null;
  

  @Property(name: 'deleveragePercentile')
  double deleveragePercentile = null;
  

  @Property(name: 'rebalancedPnl')
  Number rebalancedPnl = null;
  

  @Property(name: 'prevRealisedPnl')
  Number prevRealisedPnl = null;
  

  @Property(name: 'prevUnrealisedPnl')
  Number prevUnrealisedPnl = null;
  

  @Property(name: 'prevClosePrice')
  double prevClosePrice = null;
  

  @Property(name: 'openingTimestamp')
  DateTime openingTimestamp = null;
  

  @Property(name: 'openingQty')
  Number openingQty = null;
  

  @Property(name: 'openingCost')
  Number openingCost = null;
  

  @Property(name: 'openingComm')
  Number openingComm = null;
  

  @Property(name: 'openOrderBuyQty')
  Number openOrderBuyQty = null;
  

  @Property(name: 'openOrderBuyCost')
  Number openOrderBuyCost = null;
  

  @Property(name: 'openOrderBuyPremium')
  Number openOrderBuyPremium = null;
  

  @Property(name: 'openOrderSellQty')
  Number openOrderSellQty = null;
  

  @Property(name: 'openOrderSellCost')
  Number openOrderSellCost = null;
  

  @Property(name: 'openOrderSellPremium')
  Number openOrderSellPremium = null;
  

  @Property(name: 'execBuyQty')
  Number execBuyQty = null;
  

  @Property(name: 'execBuyCost')
  Number execBuyCost = null;
  

  @Property(name: 'execSellQty')
  Number execSellQty = null;
  

  @Property(name: 'execSellCost')
  Number execSellCost = null;
  

  @Property(name: 'execQty')
  Number execQty = null;
  

  @Property(name: 'execCost')
  Number execCost = null;
  

  @Property(name: 'execComm')
  Number execComm = null;
  

  @Property(name: 'currentTimestamp')
  DateTime currentTimestamp = null;
  

  @Property(name: 'currentQty')
  Number currentQty = null;
  

  @Property(name: 'currentCost')
  Number currentCost = null;
  

  @Property(name: 'currentComm')
  Number currentComm = null;
  

  @Property(name: 'realisedCost')
  Number realisedCost = null;
  

  @Property(name: 'unrealisedCost')
  Number unrealisedCost = null;
  

  @Property(name: 'grossOpenCost')
  Number grossOpenCost = null;
  

  @Property(name: 'grossOpenPremium')
  Number grossOpenPremium = null;
  

  @Property(name: 'grossExecCost')
  Number grossExecCost = null;
  

  @Property(name: 'isOpen')
  bool isOpen = null;
  

  @Property(name: 'markPrice')
  double markPrice = null;
  

  @Property(name: 'markValue')
  Number markValue = null;
  

  @Property(name: 'riskValue')
  Number riskValue = null;
  

  @Property(name: 'homeNotional')
  double homeNotional = null;
  

  @Property(name: 'foreignNotional')
  double foreignNotional = null;
  

  @Property(name: 'posState')
  String posState = null;
  

  @Property(name: 'posCost')
  Number posCost = null;
  

  @Property(name: 'posCost2')
  Number posCost2 = null;
  

  @Property(name: 'posCross')
  Number posCross = null;
  

  @Property(name: 'posInit')
  Number posInit = null;
  

  @Property(name: 'posComm')
  Number posComm = null;
  

  @Property(name: 'posLoss')
  Number posLoss = null;
  

  @Property(name: 'posMargin')
  Number posMargin = null;
  

  @Property(name: 'posMaint')
  Number posMaint = null;
  

  @Property(name: 'posAllowance')
  Number posAllowance = null;
  

  @Property(name: 'taxableMargin')
  Number taxableMargin = null;
  

  @Property(name: 'initMargin')
  Number initMargin = null;
  

  @Property(name: 'maintMargin')
  Number maintMargin = null;
  

  @Property(name: 'sessionMargin')
  Number sessionMargin = null;
  

  @Property(name: 'targetExcessMargin')
  Number targetExcessMargin = null;
  

  @Property(name: 'varMargin')
  Number varMargin = null;
  

  @Property(name: 'realisedGrossPnl')
  Number realisedGrossPnl = null;
  

  @Property(name: 'realisedTax')
  Number realisedTax = null;
  

  @Property(name: 'realisedPnl')
  Number realisedPnl = null;
  

  @Property(name: 'unrealisedGrossPnl')
  Number unrealisedGrossPnl = null;
  

  @Property(name: 'longBankrupt')
  Number longBankrupt = null;
  

  @Property(name: 'shortBankrupt')
  Number shortBankrupt = null;
  

  @Property(name: 'taxBase')
  Number taxBase = null;
  

  @Property(name: 'indicativeTaxRate')
  double indicativeTaxRate = null;
  

  @Property(name: 'indicativeTax')
  Number indicativeTax = null;
  

  @Property(name: 'unrealisedTax')
  Number unrealisedTax = null;
  

  @Property(name: 'unrealisedPnl')
  Number unrealisedPnl = null;
  

  @Property(name: 'unrealisedPnlPcnt')
  double unrealisedPnlPcnt = null;
  

  @Property(name: 'unrealisedRoePcnt')
  double unrealisedRoePcnt = null;
  

  @Property(name: 'simpleQty')
  double simpleQty = null;
  

  @Property(name: 'simpleCost')
  double simpleCost = null;
  

  @Property(name: 'simpleValue')
  double simpleValue = null;
  

  @Property(name: 'simplePnl')
  double simplePnl = null;
  

  @Property(name: 'simplePnlPcnt')
  double simplePnlPcnt = null;
  

  @Property(name: 'avgCostPrice')
  double avgCostPrice = null;
  

  @Property(name: 'avgEntryPrice')
  double avgEntryPrice = null;
  

  @Property(name: 'breakEvenPrice')
  double breakEvenPrice = null;
  

  @Property(name: 'marginCallPrice')
  double marginCallPrice = null;
  

  @Property(name: 'liquidationPrice')
  double liquidationPrice = null;
  

  @Property(name: 'bankruptPrice')
  double bankruptPrice = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'lastPrice')
  double lastPrice = null;
  

  @Property(name: 'lastValue')
  Number lastValue = null;
  
  Position();

  @override
  String toString()  {
    return 'Position[account=$account, symbol=$symbol, currency=$currency, underlying=$underlying, quoteCurrency=$quoteCurrency, commission=$commission, initMarginReq=$initMarginReq, maintMarginReq=$maintMarginReq, riskLimit=$riskLimit, leverage=$leverage, crossMargin=$crossMargin, deleveragePercentile=$deleveragePercentile, rebalancedPnl=$rebalancedPnl, prevRealisedPnl=$prevRealisedPnl, prevUnrealisedPnl=$prevUnrealisedPnl, prevClosePrice=$prevClosePrice, openingTimestamp=$openingTimestamp, openingQty=$openingQty, openingCost=$openingCost, openingComm=$openingComm, openOrderBuyQty=$openOrderBuyQty, openOrderBuyCost=$openOrderBuyCost, openOrderBuyPremium=$openOrderBuyPremium, openOrderSellQty=$openOrderSellQty, openOrderSellCost=$openOrderSellCost, openOrderSellPremium=$openOrderSellPremium, execBuyQty=$execBuyQty, execBuyCost=$execBuyCost, execSellQty=$execSellQty, execSellCost=$execSellCost, execQty=$execQty, execCost=$execCost, execComm=$execComm, currentTimestamp=$currentTimestamp, currentQty=$currentQty, currentCost=$currentCost, currentComm=$currentComm, realisedCost=$realisedCost, unrealisedCost=$unrealisedCost, grossOpenCost=$grossOpenCost, grossOpenPremium=$grossOpenPremium, grossExecCost=$grossExecCost, isOpen=$isOpen, markPrice=$markPrice, markValue=$markValue, riskValue=$riskValue, homeNotional=$homeNotional, foreignNotional=$foreignNotional, posState=$posState, posCost=$posCost, posCost2=$posCost2, posCross=$posCross, posInit=$posInit, posComm=$posComm, posLoss=$posLoss, posMargin=$posMargin, posMaint=$posMaint, posAllowance=$posAllowance, taxableMargin=$taxableMargin, initMargin=$initMargin, maintMargin=$maintMargin, sessionMargin=$sessionMargin, targetExcessMargin=$targetExcessMargin, varMargin=$varMargin, realisedGrossPnl=$realisedGrossPnl, realisedTax=$realisedTax, realisedPnl=$realisedPnl, unrealisedGrossPnl=$unrealisedGrossPnl, longBankrupt=$longBankrupt, shortBankrupt=$shortBankrupt, taxBase=$taxBase, indicativeTaxRate=$indicativeTaxRate, indicativeTax=$indicativeTax, unrealisedTax=$unrealisedTax, unrealisedPnl=$unrealisedPnl, unrealisedPnlPcnt=$unrealisedPnlPcnt, unrealisedRoePcnt=$unrealisedRoePcnt, simpleQty=$simpleQty, simpleCost=$simpleCost, simpleValue=$simpleValue, simplePnl=$simplePnl, simplePnlPcnt=$simplePnlPcnt, avgCostPrice=$avgCostPrice, avgEntryPrice=$avgEntryPrice, breakEvenPrice=$breakEvenPrice, marginCallPrice=$marginCallPrice, liquidationPrice=$liquidationPrice, bankruptPrice=$bankruptPrice, timestamp=$timestamp, lastPrice=$lastPrice, lastValue=$lastValue, ]';
  }

}

