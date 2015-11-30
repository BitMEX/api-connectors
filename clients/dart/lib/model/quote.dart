part of api;


@Entity()
class Quote {
  
  DateTime timestamp = null;
  
  
  String symbol = null;
  
  
  Number bidSize = null;
  
  
  num bidPrice = null;
  
  
  num askPrice = null;
  
  
  Number askSize = null;
  
  
  num id = null;
  
  
  Quote();

  @override
  String toString()  {
    return 'Quote[timestamp=$timestamp, symbol=$symbol, bidSize=$bidSize, bidPrice=$bidPrice, askPrice=$askPrice, askSize=$askSize, id=$id, ]';
  }

}

