part of api;


@Entity()
class UserCommission {
  
  String makerFee = null;
  
  
  String takerFee = null;
  
  
  String insuranceFee = null;
  
  
  UserCommission();

  @override
  String toString()  {
    return 'UserCommission[makerFee=$makerFee, takerFee=$takerFee, insuranceFee=$insuranceFee, ]';
  }

}

