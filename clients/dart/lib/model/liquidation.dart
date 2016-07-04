part of api;


@Entity()
class Liquidation {
  
  String orderID = null;
  
  
  String symbol = null;
  
  
  String side = null;
  
  
  num price = null;
  
  
  Number leavesQty = null;
  
  
  Liquidation();

  @override
  String toString()  {
    return 'Liquidation[orderID=$orderID, symbol=$symbol, side=$side, price=$price, leavesQty=$leavesQty, ]';
  }

}

