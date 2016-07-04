part of api;


@Entity()
class Order {
  
  String orderID = null;
  
  
  String clOrdID = null;
  
  
  String clOrdLinkID = null;
  
  
  Number account = null;
  
  
  String symbol = null;
  
  
  String side = null;
  
  
  num simpleOrderQty = null;
  
  
  Number orderQty = null;
  
  
  num price = null;
  
  
  Number displayQty = null;
  
  
  num stopPx = null;
  
  
  num pegOffsetValue = null;
  
  
  String pegPriceType = null;
  
  
  String currency = null;
  
  
  String settlCurrency = null;
  
  
  String ordType = null;
  
  
  String timeInForce = null;
  
  
  String execInst = null;
  
  
  String contingencyType = null;
  
  
  String exDestination = null;
  
  
  String ordStatus = null;
  
  
  String triggered = null;
  
  
  bool workingIndicator = null;
  
  
  String ordRejReason = null;
  
  
  num simpleLeavesQty = null;
  
  
  Number leavesQty = null;
  
  
  num simpleCumQty = null;
  
  
  Number cumQty = null;
  
  
  num avgPx = null;
  
  
  String multiLegReportingType = null;
  
  
  String text = null;
  
  
  DateTime transactTime = null;
  
  
  DateTime timestamp = null;
  
  
  Order();

  @override
  String toString()  {
    return 'Order[orderID=$orderID, clOrdID=$clOrdID, clOrdLinkID=$clOrdLinkID, account=$account, symbol=$symbol, side=$side, simpleOrderQty=$simpleOrderQty, orderQty=$orderQty, price=$price, displayQty=$displayQty, stopPx=$stopPx, pegOffsetValue=$pegOffsetValue, pegPriceType=$pegPriceType, currency=$currency, settlCurrency=$settlCurrency, ordType=$ordType, timeInForce=$timeInForce, execInst=$execInst, contingencyType=$contingencyType, exDestination=$exDestination, ordStatus=$ordStatus, triggered=$triggered, workingIndicator=$workingIndicator, ordRejReason=$ordRejReason, simpleLeavesQty=$simpleLeavesQty, leavesQty=$leavesQty, simpleCumQty=$simpleCumQty, cumQty=$cumQty, avgPx=$avgPx, multiLegReportingType=$multiLegReportingType, text=$text, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

