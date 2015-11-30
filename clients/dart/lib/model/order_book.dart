part of api;


@Entity()
class OrderBook {
  
  String symbol = null;
  
  
  Number level = null;
  
  
  Number bidSize = null;
  
  
  num bidPrice = null;
  
  
  num askPrice = null;
  
  
  Number askSize = null;
  
  
  DateTime timestamp = null;
  
  
  OrderBook();

  @override
  String toString()  {
    return 'OrderBook[symbol=$symbol, level=$level, bidSize=$bidSize, bidPrice=$bidPrice, askPrice=$askPrice, askSize=$askSize, timestamp=$timestamp, ]';
  }

}

