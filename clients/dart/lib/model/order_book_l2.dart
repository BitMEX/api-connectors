part of api;


@Entity()
class OrderBookL2 {
  
  String symbol = null;
  
  
  Number id = null;
  
  
  String side = null;
  
  
  Number size = null;
  
  
  num price = null;
  
  
  OrderBookL2();

  @override
  String toString()  {
    return 'OrderBookL2[symbol=$symbol, id=$id, side=$side, size=$size, price=$price, ]';
  }

}

