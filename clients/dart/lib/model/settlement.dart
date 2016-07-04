part of api;


@Entity()
class Settlement {
  
  DateTime timestamp = null;
  
  
  String symbol = null;
  
  
  String settlementType = null;
  
  
  num settledPrice = null;
  
  
  Number bankrupt = null;
  
  
  Number taxBase = null;
  
  
  num taxRate = null;
  
  
  Settlement();

  @override
  String toString()  {
    return 'Settlement[timestamp=$timestamp, symbol=$symbol, settlementType=$settlementType, settledPrice=$settledPrice, bankrupt=$bankrupt, taxBase=$taxBase, taxRate=$taxRate, ]';
  }

}

