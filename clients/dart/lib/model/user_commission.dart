part of api;


@Entity()
class UserCommission {
  
  @Property(name: 'makerFee')
  String makerFee = null;
  

  @Property(name: 'takerFee')
  String takerFee = null;
  

  @Property(name: 'insuranceFee')
  String insuranceFee = null;
  
  UserCommission();

  @override
  String toString()  {
    return 'UserCommission[makerFee=$makerFee, takerFee=$takerFee, insuranceFee=$insuranceFee, ]';
  }

}

