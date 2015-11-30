part of api;


@Entity()
class Transaction {
  
  String transactID = null;
  
  
  Number account = null;
  
  
  String currency = null;
  
  
  String transactType = null;
  
  
  Number amount = null;
  
  
  Number fee = null;
  
  
  String transactStatus = null;
  
  
  String address = null;
  
  
  String tx = null;
  
  
  String text = null;
  
  
  DateTime transactTime = null;
  
  
  DateTime timestamp = null;
  
  
  Transaction();

  @override
  String toString()  {
    return 'Transaction[transactID=$transactID, account=$account, currency=$currency, transactType=$transactType, amount=$amount, fee=$fee, transactStatus=$transactStatus, address=$address, tx=$tx, text=$text, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

