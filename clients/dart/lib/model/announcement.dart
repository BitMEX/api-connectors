part of api;


@Entity()
class Announcement {
  
  @Property(name: 'id')
  Number id = null;
  

  @Property(name: 'link')
  String link = null;
  

  @Property(name: 'title')
  String title = null;
  

  @Property(name: 'content')
  String content = null;
  

  @Property(name: 'date')
  DateTime date = null;
  
  Announcement();

  @override
  String toString()  {
    return 'Announcement[id=$id, link=$link, title=$title, content=$content, date=$date, ]';
  }

}

