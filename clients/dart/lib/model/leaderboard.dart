part of api;


@Entity()
class Leaderboard {
  
  String name = null;
  
  
  bool isRealName = null;
  
  
  bool isMe = null;
  
  
  num profit = null;
  
  
  Leaderboard();

  @override
  String toString()  {
    return 'Leaderboard[name=$name, isRealName=$isRealName, isMe=$isMe, profit=$profit, ]';
  }

}

