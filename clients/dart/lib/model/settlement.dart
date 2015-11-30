part of api;


@Entity()
class Settlement {
  
  String symbol = null;
  
  
  DateTime timestamp = null;
  
  
  String settlementType = null;
  
  
  num settledPrice = null;
  
  
  Number bankrupt = null;
  
  
  Number taxBase = null;
  
  
  num taxRate = null;
  
  
  Settlement();

  @override
  String toString()  {
    return 'Settlement[symbol=$symbol, timestamp=$timestamp, settlementType=$settlementType, settledPrice=$settledPrice, bankrupt=$bankrupt, taxBase=$taxBase, taxRate=$taxRate, ]';
  }

}

