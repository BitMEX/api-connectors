part of api;


@Entity()
class Insurance {
  
  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'walletBalance')
  Number walletBalance = null;
  
  Insurance();

  @override
  String toString()  {
    return 'Insurance[currency=$currency, timestamp=$timestamp, walletBalance=$walletBalance, ]';
  }

}

