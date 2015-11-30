part of api;


@Entity()
class InstrumentInterval {
  
  List<String> intervals = [];
  
  
  List<String> symbols = [];
  
  
  InstrumentInterval();

  @override
  String toString()  {
    return 'InstrumentInterval[intervals=$intervals, symbols=$symbols, ]';
  }

}

