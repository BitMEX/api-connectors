part of api;


@Entity()
class Order {
  
  String orderID = null;
  
  
  String clOrdID = null;
  
  
  Number account = null;
  
  
  String symbol = null;
  
  
  String side = null;
  
  
  num simpleOrderQty = null;
  
  
  Number orderQty = null;
  
  
  num price = null;
  
  
  Number minQty = null;
  
  
  num stopPx = null;
  
  
  String currency = null;
  
  
  String settlCurrency = null;
  
  
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
  
  
  String multiLegReportingType = null;
  
  
  String text = null;
  
  
  DateTime transactTime = null;
  
  
  DateTime timestamp = null;
  
  
  Order();

  @override
  String toString()  {
    return 'Order[orderID=$orderID, clOrdID=$clOrdID, account=$account, symbol=$symbol, side=$side, simpleOrderQty=$simpleOrderQty, orderQty=$orderQty, price=$price, minQty=$minQty, stopPx=$stopPx, currency=$currency, settlCurrency=$settlCurrency, ordType=$ordType, timeInForce=$timeInForce, exDestination=$exDestination, ordStatus=$ordStatus, workingIndicator=$workingIndicator, ordRejReason=$ordRejReason, simpleLeavesQty=$simpleLeavesQty, leavesQty=$leavesQty, simpleCumQty=$simpleCumQty, cumQty=$cumQty, avgPx=$avgPx, multiLegReportingType=$multiLegReportingType, text=$text, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

