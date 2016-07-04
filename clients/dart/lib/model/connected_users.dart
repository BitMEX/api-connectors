part of api;


@Entity()
class ConnectedUsers {
  
  @Property(name: 'users')
  Number users = null;
  

  @Property(name: 'bots')
  Number bots = null;
  
  ConnectedUsers();

  @override
  String toString()  {
    return 'ConnectedUsers[users=$users, bots=$bots, ]';
  }

}

