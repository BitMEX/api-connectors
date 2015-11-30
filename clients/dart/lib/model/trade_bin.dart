part of api;


@Entity()
class TradeBin {
  
  DateTime timestamp = null;
  
  
  String symbol = null;
  
  
  num open = null;
  
  
  num high = null;
  
  
  num low = null;
  
  
  num close = null;
  
  
  Number trades = null;
  
  
  Number volume = null;
  
  
  num vwap = null;
  
  
  Number lastSize = null;
  
  
  Number turnover = null;
  
  
  num homeNotional = null;
  
  
  num foreignNotional = null;
  
  
  num id = null;
  
  
  TradeBin();

  @override
  String toString()  {
    return 'TradeBin[timestamp=$timestamp, symbol=$symbol, open=$open, high=$high, low=$low, close=$close, trades=$trades, volume=$volume, vwap=$vwap, lastSize=$lastSize, turnover=$turnover, homeNotional=$homeNotional, foreignNotional=$foreignNotional, id=$id, ]';
  }

}

