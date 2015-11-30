part of api;


@Entity()
class Execution {
  
  String execID = null;
  
  
  String orderID = null;
  
  
  String clOrdID = null;
  
  
  Number account = null;
  
  
  String symbol = null;
  
  
  String side = null;
  
  
  Number lastQty = null;
  
  
  num lastPx = null;
  
  
  num underlyingLastPx = null;
  
  
  String lastMkt = null;
  
  
  String lastLiquidityInd = null;
  
  
  num simpleOrderQty = null;
  
  
  Number orderQty = null;
  
  
  num price = null;
  
  
  Number minQty = null;
  
  
  num stopPx = null;
  
  
  String currency = null;
  
  
  String settlCurrency = null;
  
  
  String execType = null;
  
  
  String ordType = null;
  
  
  String timeInForce = null;
  
  
  String exDestination = null;
  
  
  String ordStatus = null;
  
  
  bool workingIndicator = null;
  
  
  String ordRejReason = null;
  
  
  num simpleLeavesQty = null;
  
  
  Number leavesQty = null;
  
  
  num simpleCumQty = null;
  
  
  Number cumQty = null;
  
  
  num avgPx = null;
  
  
  num commission = null;
  
  
  String commType = null;
  
  
  String tradePublishIndicator = null;
  
  
  String multiLegReportingType = null;
  
  
  String text = null;
  
  
  String trdMatchID = null;
  
  
  Number execCost = null;
  
  
  Number execComm = null;
  
  
  num homeNotional = null;
  
  
  num foreignNotional = null;
  
  
  DateTime transactTime = null;
  
  
  DateTime timestamp = null;
  
  
  Execution();

  @override
  String toString()  {
    return 'Execution[execID=$execID, orderID=$orderID, clOrdID=$clOrdID, account=$account, symbol=$symbol, side=$side, lastQty=$lastQty, lastPx=$lastPx, underlyingLastPx=$underlyingLastPx, lastMkt=$lastMkt, lastLiquidityInd=$lastLiquidityInd, simpleOrderQty=$simpleOrderQty, orderQty=$orderQty, price=$price, minQty=$minQty, stopPx=$stopPx, currency=$currency, settlCurrency=$settlCurrency, execType=$execType, ordType=$ordType, timeInForce=$timeInForce, exDestination=$exDestination, ordStatus=$ordStatus, workingIndicator=$workingIndicator, ordRejReason=$ordRejReason, simpleLeavesQty=$simpleLeavesQty, leavesQty=$leavesQty, simpleCumQty=$simpleCumQty, cumQty=$cumQty, avgPx=$avgPx, commission=$commission, commType=$commType, tradePublishIndicator=$tradePublishIndicator, multiLegReportingType=$multiLegReportingType, text=$text, trdMatchID=$trdMatchID, execCost=$execCost, execComm=$execComm, homeNotional=$homeNotional, foreignNotional=$foreignNotional, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

