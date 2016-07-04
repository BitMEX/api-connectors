part of api;


@Entity()
class Leaderboard {
  
  @Property(name: 'name')
  String name = null;
  

  @Property(name: 'isRealName')
  bool isRealName = null;
  

  @Property(name: 'isMe')
  bool isMe = null;
  

  @Property(name: 'profit')
  double profit = null;
  
  Leaderboard();

  @override
  String toString()  {
    return 'Leaderboard[name=$name, isRealName=$isRealName, isMe=$isMe, profit=$profit, ]';
  }

}

