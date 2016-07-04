part of api;


@Entity()
class Liquidation {
  
  @Property(name: 'orderID')
  String orderID = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'side')
  String side = null;
  

  @Property(name: 'price')
  double price = null;
  

  @Property(name: 'leavesQty')
  Number leavesQty = null;
  
  Liquidation();

  @override
  String toString()  {
    return 'Liquidation[orderID=$orderID, symbol=$symbol, side=$side, price=$price, leavesQty=$leavesQty, ]';
  }

}

