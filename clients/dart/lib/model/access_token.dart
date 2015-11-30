part of api;


@Entity()
class AccessToken {
  
  String id = null;
  
  /* time to live in seconds (2 weeks by default) */
  num ttl = 1209600.0;
  
  
  DateTime created = null;
  
  
  num userId = null;
  
  
  AccessToken();

  @override
  String toString()  {
    return 'AccessToken[id=$id, ttl=$ttl, created=$created, userId=$userId, ]';
  }

}

