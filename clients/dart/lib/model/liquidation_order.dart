part of api;


@Entity()
class LiquidationOrder {
  
  String symbol = null;
  
  
  String side = null;
  
  
  Number qty = null;
  
  
  num price = null;
  
  
  LiquidationOrder();

  @override
  String toString()  {
    return 'LiquidationOrder[symbol=$symbol, side=$side, qty=$qty, price=$price, ]';
  }

}

