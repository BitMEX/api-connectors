part of api;


@Entity()
class Chat {
  
  Number id = null;
  
  
  DateTime date = null;
  
  
  String user = null;
  
  
  String message = null;
  
  
  String html = null;
  
  
  bool fromBot = null;
  
  
  Chat();

  @override
  String toString()  {
    return 'Chat[id=$id, date=$date, user=$user, message=$message, html=$html, fromBot=$fromBot, ]';
  }

}

