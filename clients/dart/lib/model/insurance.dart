part of api;


@Entity()
class Insurance {
  
  String currency = null;
  
  
  DateTime timestamp = null;
  
  
  Number walletBalance = null;
  
  
  Insurance();

  @override
  String toString()  {
    return 'Insurance[currency=$currency, timestamp=$timestamp, walletBalance=$walletBalance, ]';
  }

}

