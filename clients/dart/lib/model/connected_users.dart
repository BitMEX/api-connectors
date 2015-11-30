part of api;


@Entity()
class ConnectedUsers {
  
  Number users = null;
  
  
  Number bots = null;
  
  
  ConnectedUsers();

  @override
  String toString()  {
    return 'ConnectedUsers[users=$users, bots=$bots, ]';
  }

}

