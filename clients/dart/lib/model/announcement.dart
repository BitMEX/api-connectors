part of api;


@Entity()
class Announcement {
  
  Number id = null;
  
  
  String link = null;
  
  
  String title = null;
  
  
  String content = null;
  
  
  DateTime date = null;
  
  
  Announcement();

  @override
  String toString()  {
    return 'Announcement[id=$id, link=$link, title=$title, content=$content, date=$date, ]';
  }

}

