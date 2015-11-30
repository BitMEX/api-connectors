part of api;


@Entity()
class ApiKey {
  
  String id = null;
  
  
  String secret = null;
  
  
  String name = null;
  
  
  Number nonce = null;
  
  
  String cidr = null;
  
  
  List<String> permissions = [];
  
  
  bool enabled = null;
  
  
  Number userId = null;
  
  
  DateTime created = null;
  
  
  ApiKey();

  @override
  String toString()  {
    return 'ApiKey[id=$id, secret=$secret, name=$name, nonce=$nonce, cidr=$cidr, permissions=$permissions, enabled=$enabled, userId=$userId, created=$created, ]';
  }

}

