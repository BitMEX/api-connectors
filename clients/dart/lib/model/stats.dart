part of api;


@Entity()
class Stats {
  
  @Property(name: 'rootSymbol')
  String rootSymbol = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'volume24h')
  Number volume24h = null;
  

  @Property(name: 'turnover24h')
  Number turnover24h = null;
  

  @Property(name: 'openInterest')
  Number openInterest = null;
  

  @Property(name: 'openValue')
  Number openValue = null;
  
  Stats();

  @override
  String toString()  {
    return 'Stats[rootSymbol=$rootSymbol, currency=$currency, volume24h=$volume24h, turnover24h=$turnover24h, openInterest=$openInterest, openValue=$openValue, ]';
  }

}

