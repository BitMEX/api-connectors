part of api;


@Entity()
class Quote {
  
  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'bidSize')
  Number bidSize = null;
  

  @Property(name: 'bidPrice')
  double bidPrice = null;
  

  @Property(name: 'askPrice')
  double askPrice = null;
  

  @Property(name: 'askSize')
  Number askSize = null;
  
  Quote();

  @override
  String toString()  {
    return 'Quote[timestamp=$timestamp, symbol=$symbol, bidSize=$bidSize, bidPrice=$bidPrice, askPrice=$askPrice, askSize=$askSize, ]';
  }

}

