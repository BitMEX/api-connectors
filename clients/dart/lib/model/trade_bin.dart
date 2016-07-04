part of api;


@Entity()
class TradeBin {
  
  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'open')
  double open = null;
  

  @Property(name: 'high')
  double high = null;
  

  @Property(name: 'low')
  double low = null;
  

  @Property(name: 'close')
  double close = null;
  

  @Property(name: 'trades')
  Number trades = null;
  

  @Property(name: 'volume')
  Number volume = null;
  

  @Property(name: 'vwap')
  double vwap = null;
  

  @Property(name: 'lastSize')
  Number lastSize = null;
  

  @Property(name: 'turnover')
  Number turnover = null;
  

  @Property(name: 'homeNotional')
  double homeNotional = null;
  

  @Property(name: 'foreignNotional')
  double foreignNotional = null;
  

  @Property(name: 'id')
  double id = null;
  
  TradeBin();

  @override
  String toString()  {
    return 'TradeBin[timestamp=$timestamp, symbol=$symbol, open=$open, high=$high, low=$low, close=$close, trades=$trades, volume=$volume, vwap=$vwap, lastSize=$lastSize, turnover=$turnover, homeNotional=$homeNotional, foreignNotional=$foreignNotional, id=$id, ]';
  }

}

