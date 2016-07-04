part of api;


@Entity()
class Affiliate {
  
  @Property(name: 'account')
  Number account = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'prevPayout')
  Number prevPayout = null;
  

  @Property(name: 'prevTurnover')
  Number prevTurnover = null;
  

  @Property(name: 'prevComm')
  Number prevComm = null;
  

  @Property(name: 'prevTimestamp')
  DateTime prevTimestamp = null;
  

  @Property(name: 'execTurnover')
  Number execTurnover = null;
  

  @Property(name: 'execComm')
  Number execComm = null;
  

  @Property(name: 'totalReferrals')
  Number totalReferrals = null;
  

  @Property(name: 'totalTurnover')
  Number totalTurnover = null;
  

  @Property(name: 'totalComm')
  Number totalComm = null;
  

  @Property(name: 'payoutPcnt')
  double payoutPcnt = null;
  

  @Property(name: 'pendingPayout')
  Number pendingPayout = null;
  

  @Property(name: 'timestamp')
  DateTime timestamp = null;
  
  Affiliate();

  @override
  String toString()  {
    return 'Affiliate[account=$account, currency=$currency, prevPayout=$prevPayout, prevTurnover=$prevTurnover, prevComm=$prevComm, prevTimestamp=$prevTimestamp, execTurnover=$execTurnover, execComm=$execComm, totalReferrals=$totalReferrals, totalTurnover=$totalTurnover, totalComm=$totalComm, payoutPcnt=$payoutPcnt, pendingPayout=$pendingPayout, timestamp=$timestamp, ]';
  }

}

