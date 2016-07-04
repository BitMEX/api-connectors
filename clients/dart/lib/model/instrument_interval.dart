part of api;


@Entity()
class InstrumentInterval {
  
  @Property(name: 'intervals')
  List<String> intervals = [];
  

  @Property(name: 'symbols')
  List<String> symbols = [];
  
  InstrumentInterval();

  @override
  String toString()  {
    return 'InstrumentInterval[intervals=$intervals, symbols=$symbols, ]';
  }

}

