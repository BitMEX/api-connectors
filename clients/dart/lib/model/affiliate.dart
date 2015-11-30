part of api;


@Entity()
class Affiliate {
  
  Number account = null;
  
  
  String currency = null;
  
  
  Number prevPayout = null;
  
  
  Number prevTurnover = null;
  
  
  Number prevComm = null;
  
  
  DateTime prevTimestamp = null;
  
  
  Number execTurnover = null;
  
  
  Number execComm = null;
  
  
  Number totalReferrals = null;
  
  
  Number totalTurnover = null;
  
  
  Number totalComm = null;
  
  
  num payoutPcnt = null;
  
  
  Number pendingPayout = null;
  
  
  DateTime timestamp = null;
  
  
  Affiliate();

  @override
  String toString()  {
    return 'Affiliate[account=$account, currency=$currency, prevPayout=$prevPayout, prevTurnover=$prevTurnover, prevComm=$prevComm, prevTimestamp=$prevTimestamp, execTurnover=$execTurnover, execComm=$execComm, totalReferrals=$totalReferrals, totalTurnover=$totalTurnover, totalComm=$totalComm, payoutPcnt=$payoutPcnt, pendingPayout=$pendingPayout, timestamp=$timestamp, ]';
  }

}

