part of api;


@Entity()
class Trade {
  
  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'side')
  String side = null;
  

  @Property(name: 'size')
  Number size = null;
  

  @Property(name: 'price')
  double price = null;
  

  @Property(name: 'tickDirection')
  String tickDirection = null;
  

  @Property(name: 'trdMatchID')
  String trdMatchID = null;
  

  @Property(name: 'grossValue')
  Number grossValue = null;
  

  @Property(name: 'homeNotional')
  double homeNotional = null;
  

  @Property(name: 'foreignNotional')
  double foreignNotional = null;
  

  @Property(name: 'id')
  double id = null;
  
  Trade();

  @override
  String toString()  {
    return 'Trade[timestamp=$timestamp, symbol=$symbol, side=$side, size=$size, price=$price, tickDirection=$tickDirection, trdMatchID=$trdMatchID, grossValue=$grossValue, homeNotional=$homeNotional, foreignNotional=$foreignNotional, id=$id, ]';
  }

}

