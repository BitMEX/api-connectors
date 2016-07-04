part of api;


@Entity()
class OrderBookL2 {
  
  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'id')
  Number id = null;
  

  @Property(name: 'side')
  String side = null;
  

  @Property(name: 'size')
  Number size = null;
  

  @Property(name: 'price')
  double price = null;
  
  OrderBookL2();

  @override
  String toString()  {
    return 'OrderBookL2[symbol=$symbol, id=$id, side=$side, size=$size, price=$price, ]';
  }

}

