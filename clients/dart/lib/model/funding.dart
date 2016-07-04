part of api;


@Entity()
class Funding {
  
  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'symbol')
  String symbol = null;
  

  @Property(name: 'fundingInterval')
  DateTime fundingInterval = null;
  

  @Property(name: 'fundingRate')
  double fundingRate = null;
  

  @Property(name: 'fundingRateDaily')
  double fundingRateDaily = null;
  
  Funding();

  @override
  String toString()  {
    return 'Funding[timestamp=$timestamp, symbol=$symbol, fundingInterval=$fundingInterval, fundingRate=$fundingRate, fundingRateDaily=$fundingRateDaily, ]';
  }

}

