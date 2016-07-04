part of api;


@Entity()
class AccessToken {
  
  @Property(name: 'id')
  String id = null;
  
/* time to live in seconds (2 weeks by default) */
  @Property(name: 'ttl')
  double ttl = 1209600.0;
  

  @Property(name: 'created')
  DateTime created = null;
  

  @Property(name: 'userId')
  double userId = null;
  
  AccessToken();

  @override
  String toString()  {
    return 'AccessToken[id=$id, ttl=$ttl, created=$created, userId=$userId, ]';
  }

}

