part of api;


@Entity()
class UserCommission {
  
  @Property(name: 'makerFee')
  double makerFee = null;
  

  @Property(name: 'takerFee')
  double takerFee = null;
  

  @Property(name: 'settlementFee')
  double settlementFee = null;
  
  UserCommission();

  @override
  String toString()  {
    return 'UserCommission[makerFee=$makerFee, takerFee=$takerFee, settlementFee=$settlementFee, ]';
  }

}

