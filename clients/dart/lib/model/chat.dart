part of api;


@Entity()
class Chat {
  
  @Property(name: 'id')
  Number id = null;
  

  @Property(name: 'date')
  DateTime date = null;
  

  @Property(name: 'user')
  String user = null;
  

  @Property(name: 'message')
  String message = null;
  

  @Property(name: 'html')
  String html = null;
  

  @Property(name: 'fromBot')
  bool fromBot = null;
  
  Chat();

  @override
  String toString()  {
    return 'Chat[id=$id, date=$date, user=$user, message=$message, html=$html, fromBot=$fromBot, ]';
  }

}

