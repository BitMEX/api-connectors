part of api;


@Entity()
class Wallet {
  
  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'prevDeposited')
  Number prevDeposited = null;
  

  @Property(name: 'prevWithdrawn')
  Number prevWithdrawn = null;
  

  @Property(name: 'prevAmount')
  Number prevAmount = null;
  

  @Property(name: 'prevTimestamp')
  DateTime prevTimestamp = null;
  

  @Property(name: 'deltaDeposited')
  Number deltaDeposited = null;
  

  @Property(name: 'deltaWithdrawn')
  Number deltaWithdrawn = null;
  

  @Property(name: 'deltaAmount')
  Number deltaAmount = null;
  

  @Property(name: 'deposited')
  Number deposited = null;
  

  @Property(name: 'withdrawn')
  Number withdrawn = null;
  

  @Property(name: 'amount')
  Number amount = null;
  

  @Property(name: 'pendingCredit')
  Number pendingCredit = null;
  

  @Property(name: 'pendingDebit')
  Number pendingDebit = null;
  

  @Property(name: 'confirmedDebit')
  Number confirmedDebit = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  

  @Property(name: 'addr')
  String addr = null;
  
  Wallet();

  @override
  String toString()  {
    return 'Wallet[account=$account, currency=$currency, prevDeposited=$prevDeposited, prevWithdrawn=$prevWithdrawn, prevAmount=$prevAmount, prevTimestamp=$prevTimestamp, deltaDeposited=$deltaDeposited, deltaWithdrawn=$deltaWithdrawn, deltaAmount=$deltaAmount, deposited=$deposited, withdrawn=$withdrawn, amount=$amount, pendingCredit=$pendingCredit, pendingDebit=$pendingDebit, confirmedDebit=$confirmedDebit, timestamp=$timestamp, addr=$addr, ]';
  }

}

