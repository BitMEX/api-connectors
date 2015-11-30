part of api;


@Entity()
class StatsHistory {
  
  DateTime date = null;
  
  
  String rootSymbol = null;
  
  
  String currency = null;
  
  
  Number volume = null;
  
  
  Number turnover = null;
  
  
  StatsHistory();

  @override
  String toString()  {
    return 'StatsHistory[date=$date, rootSymbol=$rootSymbol, currency=$currency, volume=$volume, turnover=$turnover, ]';
  }

}

