part of api;


@Entity()
class Trade {
  
  DateTime timestamp = null;
  
  
  String symbol = null;
  
  
  String side = null;
  
  
  Number size = null;
  
  
  num price = null;
  
  
  String tickDirection = null;
  
  
  String trdMatchID = null;
  
  
  Number grossValue = null;
  
  
  num homeNotional = null;
  
  
  num foreignNotional = null;
  
  
  num id = null;
  
  
  Trade();

  @override
  String toString()  {
    return 'Trade[timestamp=$timestamp, symbol=$symbol, side=$side, size=$size, price=$price, tickDirection=$tickDirection, trdMatchID=$trdMatchID, grossValue=$grossValue, homeNotional=$homeNotional, foreignNotional=$foreignNotional, id=$id, ]';
  }

}

