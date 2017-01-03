part of api;


@Entity()
class ChatChannel {
  
  @Property(name: 'id')
  Number id = null;
  

  @Property(name: 'name')
  String name = null;
  
  ChatChannel();

  @override
  String toString()  {
    return 'ChatChannel[id=$id, name=$name, ]';
  }

}

