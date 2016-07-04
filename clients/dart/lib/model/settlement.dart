part of api;


@Entity()
class Settlement {
  
  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'settlementType')
  String settlementType = null;
  

  @Property(name: 'settledPrice')
  double settledPrice = null;
  

  @Property(name: 'bankrupt')
  Number bankrupt = null;
  

  @Property(name: 'taxBase')
  Number taxBase = null;
  

  @Property(name: 'taxRate')
  double taxRate = null;
  
  Settlement();

  @override
  String toString()  {
    return 'Settlement[timestamp=$timestamp, symbol=$symbol, settlementType=$settlementType, settledPrice=$settledPrice, bankrupt=$bankrupt, taxBase=$taxBase, taxRate=$taxRate, ]';
  }

}

