part of api;


@Entity()
class OrderBook {
  
  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'level')
  Number level = null;
  

  @Property(name: 'bidSize')
  Number bidSize = null;
  

  @Property(name: 'bidPrice')
  double bidPrice = null;
  

  @Property(name: 'askPrice')
  double askPrice = null;
  

  @Property(name: 'askSize')
  Number askSize = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  
  OrderBook();

  @override
  String toString()  {
    return 'OrderBook[symbol=$symbol, level=$level, bidSize=$bidSize, bidPrice=$bidPrice, askPrice=$askPrice, askSize=$askSize, timestamp=$timestamp, ]';
  }

}

