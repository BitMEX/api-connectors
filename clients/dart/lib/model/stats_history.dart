part of api;


@Entity()
class StatsHistory {
  
  @Property(name: 'date')
  DateTime date = null;
  

  @Property(name: 'rootSymbol')
  String rootSymbol = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'volume')
  Number volume = null;
  

  @Property(name: 'turnover')
  Number turnover = null;
  
  StatsHistory();

  @override
  String toString()  {
    return 'StatsHistory[date=$date, rootSymbol=$rootSymbol, currency=$currency, volume=$volume, turnover=$turnover, ]';
  }

}

