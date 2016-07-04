part of api;


@Entity()
class Order {
  
  @Property(name: 'orderID')
  String orderID = null;
  

  @Property(name: 'clOrdID')
  String clOrdID = null;
  

  @Property(name: 'clOrdLinkID')
  String clOrdLinkID = null;
  

  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'side')
  String side = null;
  

  @Property(name: 'simpleOrderQty')
  double simpleOrderQty = null;
  

  @Property(name: 'orderQty')
  Number orderQty = null;
  

  @Property(name: 'price')
  double price = null;
  

  @Property(name: 'displayQty')
  Number displayQty = null;
  

  @Property(name: 'stopPx')
  double stopPx = null;
  

  @Property(name: 'pegOffsetValue')
  double pegOffsetValue = null;
  

  @Property(name: 'pegPriceType')
  String pegPriceType = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'settlCurrency')
  String settlCurrency = null;
  

  @Property(name: 'ordType')
  String ordType = null;
  

  @Property(name: 'timeInForce')
  String timeInForce = null;
  

  @Property(name: 'execInst')
  String execInst = null;
  

  @Property(name: 'contingencyType')
  String contingencyType = null;
  

  @Property(name: 'exDestination')
  String exDestination = null;
  

  @Property(name: 'ordStatus')
  String ordStatus = null;
  

  @Property(name: 'triggered')
  String triggered = null;
  

  @Property(name: 'workingIndicator')
  bool workingIndicator = null;
  

  @Property(name: 'ordRejReason')
  String ordRejReason = null;
  

  @Property(name: 'simpleLeavesQty')
  double simpleLeavesQty = null;
  

  @Property(name: 'leavesQty')
  Number leavesQty = null;
  

  @Property(name: 'simpleCumQty')
  double simpleCumQty = null;
  

  @Property(name: 'cumQty')
  Number cumQty = null;
  

  @Property(name: 'avgPx')
  double avgPx = null;
  

  @Property(name: 'multiLegReportingType')
  String multiLegReportingType = null;
  

  @Property(name: 'text')
  String text = null;
  

  @Property(name: 'transactTime')
  DateTime transactTime = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  
  Order();

  @override
  String toString()  {
    return 'Order[orderID=$orderID, clOrdID=$clOrdID, clOrdLinkID=$clOrdLinkID, account=$account, symbol=$symbol, side=$side, simpleOrderQty=$simpleOrderQty, orderQty=$orderQty, price=$price, displayQty=$displayQty, stopPx=$stopPx, pegOffsetValue=$pegOffsetValue, pegPriceType=$pegPriceType, currency=$currency, settlCurrency=$settlCurrency, ordType=$ordType, timeInForce=$timeInForce, execInst=$execInst, contingencyType=$contingencyType, exDestination=$exDestination, ordStatus=$ordStatus, triggered=$triggered, workingIndicator=$workingIndicator, ordRejReason=$ordRejReason, simpleLeavesQty=$simpleLeavesQty, leavesQty=$leavesQty, simpleCumQty=$simpleCumQty, cumQty=$cumQty, avgPx=$avgPx, multiLegReportingType=$multiLegReportingType, text=$text, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

