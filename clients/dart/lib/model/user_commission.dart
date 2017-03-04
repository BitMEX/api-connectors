part of api;


@Entity()
class UserCommission {
  
  @Property(name: 'makerFee')
  double makerFee = null;
  

  @Property(name: 'takerFee')
  double takerFee = null;
  

  @Property(name: 'settlementFee')
  double settlementFee = null;
  

  @Property(name: 'maxFee')
  double maxFee = null;
  
  UserCommission();

  @override
  String toString()  {
    return 'UserCommission[makerFee=$makerFee, takerFee=$takerFee, settlementFee=$settlementFee, maxFee=$maxFee, ]';
  }

}

