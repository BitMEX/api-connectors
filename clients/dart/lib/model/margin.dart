part of api;


@Entity()
class Margin {
  
  Number account = null;
  
  
  String currency = null;
  
  
  Number riskLimit = null;
  
  
  String prevState = null;
  
  
  String state = null;
  
  
  String action = null;
  
  
  Number amount = null;
  
  
  Number pendingCredit = null;
  
  
  Number pendingDebit = null;
  
  
  Number prevRealisedPnl = null;
  
  
  Number prevUnrealisedPnl = null;
  
  
  Number grossComm = null;
  
  
  Number grossOpenCost = null;
  
  
  Number grossOpenPremium = null;
  
  
  Number grossExecCost = null;
  
  
  Number grossMarkValue = null;
  
  
  Number riskValue = null;
  
  
  Number taxableMargin = null;
  
  
  Number initMargin = null;
  
  
  Number maintMargin = null;
  
  
  Number sessionMargin = null;
  
  
  Number targetExcessMargin = null;
  
  
  Number varMargin = null;
  
  
  Number realisedPnl = null;
  
  
  Number unrealisedPnl = null;
  
  
  Number indicativeTax = null;
  
  
  Number unrealisedProfit = null;
  
  
  Number walletBalance = null;
  
  
  Number marginBalance = null;
  
  
  num marginBalancePcnt = 0.0;
  
  
  num marginLeverage = 0.0;
  
  
  num marginUsedPcnt = 0.0;
  
  
  Number excessMargin = null;
  
  
  num excessMarginPcnt = 0.0;
  
  
  Number availableMargin = null;
  
  
  Number withdrawableMargin = null;
  
  
  DateTime timestamp = null;
  
  
  Margin();

  @override
  String toString()  {
    return 'Margin[account=$account, currency=$currency, riskLimit=$riskLimit, prevState=$prevState, state=$state, action=$action, amount=$amount, pendingCredit=$pendingCredit, pendingDebit=$pendingDebit, prevRealisedPnl=$prevRealisedPnl, prevUnrealisedPnl=$prevUnrealisedPnl, grossComm=$grossComm, grossOpenCost=$grossOpenCost, grossOpenPremium=$grossOpenPremium, grossExecCost=$grossExecCost, grossMarkValue=$grossMarkValue, riskValue=$riskValue, taxableMargin=$taxableMargin, initMargin=$initMargin, maintMargin=$maintMargin, sessionMargin=$sessionMargin, targetExcessMargin=$targetExcessMargin, varMargin=$varMargin, realisedPnl=$realisedPnl, unrealisedPnl=$unrealisedPnl, indicativeTax=$indicativeTax, unrealisedProfit=$unrealisedProfit, walletBalance=$walletBalance, marginBalance=$marginBalance, marginBalancePcnt=$marginBalancePcnt, marginLeverage=$marginLeverage, marginUsedPcnt=$marginUsedPcnt, excessMargin=$excessMargin, excessMarginPcnt=$excessMarginPcnt, availableMargin=$availableMargin, withdrawableMargin=$withdrawableMargin, timestamp=$timestamp, ]';
  }

}

