part of api;


@Entity()
class APIKey {
  
  @Property(name: 'id')
  String id = null;
  

  @Property(name: 'secret')
  String secret = null;
  

  @Property(name: 'name')
  String name = null;
  

  @Property(name: 'nonce')
  Number nonce = null;
  

  @Property(name: 'cidr')
  String cidr = null;
  

  @Property(name: 'permissions')
  List<X-any> permissions = [];
  

  @Property(name: 'enabled')
  bool enabled = null;
  

  @Property(name: 'userId')
  Number userId = null;
  

  @Property(name: 'created')
  DateTime created = null;
  
  APIKey();

  @override
  String toString()  {
    return 'APIKey[id=$id, secret=$secret, name=$name, nonce=$nonce, cidr=$cidr, permissions=$permissions, enabled=$enabled, userId=$userId, created=$created, ]';
  }

}

