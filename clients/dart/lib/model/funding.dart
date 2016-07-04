part of api;


@Entity()
class Funding {
  
  DateTime timestamp = null;
  
  
  String symbol = null;
  
  
  DateTime fundingInterval = null;
  
  
  num fundingRate = null;
  
  
  num fundingRateDaily = null;
  
  
  Funding();

  @override
  String toString()  {
    return 'Funding[timestamp=$timestamp, symbol=$symbol, fundingInterval=$fundingInterval, fundingRate=$fundingRate, fundingRateDaily=$fundingRateDaily, ]';
  }

}

