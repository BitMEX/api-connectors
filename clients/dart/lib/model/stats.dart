part of api;


@Entity()
class Stats {
  
  String rootSymbol = null;
  
  
  String currency = null;
  
  
  Number volume24h = null;
  
  
  Number turnover24h = null;
  
  
  Number openInterest = null;
  
  
  Number openValue = null;
  
  
  Stats();

  @override
  String toString()  {
    return 'Stats[rootSymbol=$rootSymbol, currency=$currency, volume24h=$volume24h, turnover24h=$turnover24h, openInterest=$openInterest, openValue=$openValue, ]';
  }

}

