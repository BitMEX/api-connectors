part of api;


@Entity()
class Margin {
  
  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'riskLimit')
  Number riskLimit = null;
  

  @Property(name: 'prevState')
  String prevState = null;
  

  @Property(name: 'state')
  String state = null;
  

  @Property(name: 'action')
  String action = null;
  

  @Property(name: 'amount')
  Number amount = null;
  

  @Property(name: 'pendingCredit')
  Number pendingCredit = null;
  

  @Property(name: 'pendingDebit')
  Number pendingDebit = null;
  

  @Property(name: 'confirmedDebit')
  Number confirmedDebit = null;
  

  @Property(name: 'prevRealisedPnl')
  Number prevRealisedPnl = null;
  

  @Property(name: 'prevUnrealisedPnl')
  Number prevUnrealisedPnl = null;
  

  @Property(name: 'grossComm')
  Number grossComm = null;
  

  @Property(name: 'grossOpenCost')
  Number grossOpenCost = null;
  

  @Property(name: 'grossOpenPremium')
  Number grossOpenPremium = null;
  

  @Property(name: 'grossExecCost')
  Number grossExecCost = null;
  

  @Property(name: 'grossMarkValue')
  Number grossMarkValue = null;
  

  @Property(name: 'riskValue')
  Number riskValue = null;
  

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
  

  @Property(name: 'realisedPnl')
  Number realisedPnl = null;
  

  @Property(name: 'unrealisedPnl')
  Number unrealisedPnl = null;
  

  @Property(name: 'indicativeTax')
  Number indicativeTax = null;
  

  @Property(name: 'unrealisedProfit')
  Number unrealisedProfit = null;
  

  @Property(name: 'syntheticMargin')
  Number syntheticMargin = null;
  

  @Property(name: 'walletBalance')
  Number walletBalance = null;
  

  @Property(name: 'marginBalance')
  Number marginBalance = null;
  

  @Property(name: 'marginBalancePcnt')
  double marginBalancePcnt = 0.0;
  

  @Property(name: 'marginLeverage')
  double marginLeverage = 0.0;
  

  @Property(name: 'marginUsedPcnt')
  double marginUsedPcnt = 0.0;
  

  @Property(name: 'excessMargin')
  Number excessMargin = null;
  

  @Property(name: 'excessMarginPcnt')
  double excessMarginPcnt = 0.0;
  

  @Property(name: 'availableMargin')
  Number availableMargin = null;
  

  @Property(name: 'withdrawableMargin')
  Number withdrawableMargin = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'grossLastValue')
  Number grossLastValue = null;
  

  @Property(name: 'commission')
  double commission = 0.0;
  
  Margin();

  @override
  String toString()  {
    return 'Margin[account=$account, currency=$currency, riskLimit=$riskLimit, prevState=$prevState, state=$state, action=$action, amount=$amount, pendingCredit=$pendingCredit, pendingDebit=$pendingDebit, confirmedDebit=$confirmedDebit, prevRealisedPnl=$prevRealisedPnl, prevUnrealisedPnl=$prevUnrealisedPnl, grossComm=$grossComm, grossOpenCost=$grossOpenCost, grossOpenPremium=$grossOpenPremium, grossExecCost=$grossExecCost, grossMarkValue=$grossMarkValue, riskValue=$riskValue, taxableMargin=$taxableMargin, initMargin=$initMargin, maintMargin=$maintMargin, sessionMargin=$sessionMargin, targetExcessMargin=$targetExcessMargin, varMargin=$varMargin, realisedPnl=$realisedPnl, unrealisedPnl=$unrealisedPnl, indicativeTax=$indicativeTax, unrealisedProfit=$unrealisedProfit, syntheticMargin=$syntheticMargin, walletBalance=$walletBalance, marginBalance=$marginBalance, marginBalancePcnt=$marginBalancePcnt, marginLeverage=$marginLeverage, marginUsedPcnt=$marginUsedPcnt, excessMargin=$excessMargin, excessMarginPcnt=$excessMarginPcnt, availableMargin=$availableMargin, withdrawableMargin=$withdrawableMargin, timestamp=$timestamp, grossLastValue=$grossLastValue, commission=$commission, ]';
  }

}

