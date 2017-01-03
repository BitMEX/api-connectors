part of api;


@Entity()
class UserPreferences {
  
  @Property(name: 'announcementsLastSeen')
  DateTime announcementsLastSeen = null;
  

  @Property(name: 'chatChannelID')
  double chatChannelID = null;
  

  @Property(name: 'colorTheme')
  String colorTheme = null;
  

  @Property(name: 'currency')
  String currency = null;
  

  @Property(name: 'debug')
  bool debug = null;
  

  @Property(name: 'disableEmails')
  List<String> disableEmails = [];
  

  @Property(name: 'hideConfirmDialogs')
  List<String> hideConfirmDialogs = [];
  

  @Property(name: 'hideConnectionModal')
  bool hideConnectionModal = null;
  

  @Property(name: 'hideFromLeaderboard')
  bool hideFromLeaderboard = null;
  

  @Property(name: 'hideNameFromLeaderboard')
  bool hideNameFromLeaderboard = null;
  

  @Property(name: 'hideNotifications')
  List<String> hideNotifications = [];
  

  @Property(name: 'locale')
  String locale = null;
  

  @Property(name: 'msgsSeen')
  List<String> msgsSeen = [];
  

  @Property(name: 'orderBookBinning')
  X-any orderBookBinning = null;
  

  @Property(name: 'orderBookType')
  String orderBookType = null;
  

  @Property(name: 'orderControlsPlusMinus')
  bool orderControlsPlusMinus = null;
  

  @Property(name: 'sounds')
  List<String> sounds = [];
  

  @Property(name: 'strictIPCheck')
  bool strictIPCheck = null;
  

  @Property(name: 'strictTimeout')
  bool strictTimeout = null;
  

  @Property(name: 'tickerGroup')
  String tickerGroup = null;
  

  @Property(name: 'tickerPinned')
  bool tickerPinned = null;
  

  @Property(name: 'tradeLayout')
  String tradeLayout = null;
  
  UserPreferences();

  @override
  String toString()  {
    return 'UserPreferences[announcementsLastSeen=$announcementsLastSeen, chatChannelID=$chatChannelID, colorTheme=$colorTheme, currency=$currency, debug=$debug, disableEmails=$disableEmails, hideConfirmDialogs=$hideConfirmDialogs, hideConnectionModal=$hideConnectionModal, hideFromLeaderboard=$hideFromLeaderboard, hideNameFromLeaderboard=$hideNameFromLeaderboard, hideNotifications=$hideNotifications, locale=$locale, msgsSeen=$msgsSeen, orderBookBinning=$orderBookBinning, orderBookType=$orderBookType, orderControlsPlusMinus=$orderControlsPlusMinus, sounds=$sounds, strictIPCheck=$strictIPCheck, strictTimeout=$strictTimeout, tickerGroup=$tickerGroup, tickerPinned=$tickerPinned, tradeLayout=$tradeLayout, ]';
  }

}

