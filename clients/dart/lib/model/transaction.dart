part of api;


@Entity()
class Transaction {
  
  @Property(name: 'transactID')
  String transactID = null;
  

  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'transactType')
  String transactType = null;
  

  @Property(name: 'amount')
  Number amount = null;
  

  @Property(name: 'fee')
  Number fee = null;
  

  @Property(name: 'transactStatus')
  String transactStatus = null;
  

  @Property(name: 'address')
  String address = null;
  

  @Property(name: 'tx')
  String tx = null;
  

  @Property(name: 'text')
  String text = null;
  

  @Property(name: 'transactTime')
  DateTime transactTime = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  
  Transaction();

  @override
  String toString()  {
    return 'Transaction[transactID=$transactID, account=$account, currency=$currency, transactType=$transactType, amount=$amount, fee=$fee, transactStatus=$transactStatus, address=$address, tx=$tx, text=$text, transactTime=$transactTime, timestamp=$timestamp, ]';
  }

}

