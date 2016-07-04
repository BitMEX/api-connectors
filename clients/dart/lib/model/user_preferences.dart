part of api;


@Entity()
class UserPreferences {
  
  DateTime announcementsLastSeen = null;
  
  
  String colorTheme = null;
  
  
  String currency = null;
  
  
  bool debug = null;
  
  
  List<String> disableEmails = [];
  
  
  List<String> hideConfirmDialogs = [];
  
  
  bool hideConnectionModal = null;
  
  
  bool hideFromLeaderboard = null;
  
  
  bool hideNameFromLeaderboard = null;
  
  
  List<String> hideNotifications = [];
  
  
  bool hidePhoneConfirm = null;
  
  
  String locale = null;
  
  
  List<String> msgsSeen = [];
  
  
  Number orderBookBinning = null;
  
  
  String orderBookType = null;
  
  
  bool orderControlsPlusMinus = null;
  
  
  List<String> sounds = [];
  
  
  bool strictIPCheck = null;
  
  
  bool strictTimeout = null;
  
  
  String tickerGroup = null;
  
  
  bool tickerPinned = null;
  
  
  String tradeLayout = null;
  
  
  UserPreferences();

  @override
  String toString()  {
    return 'UserPreferences[announcementsLastSeen=$announcementsLastSeen, colorTheme=$colorTheme, currency=$currency, debug=$debug, disableEmails=$disableEmails, hideConfirmDialogs=$hideConfirmDialogs, hideConnectionModal=$hideConnectionModal, hideFromLeaderboard=$hideFromLeaderboard, hideNameFromLeaderboard=$hideNameFromLeaderboard, hideNotifications=$hideNotifications, hidePhoneConfirm=$hidePhoneConfirm, locale=$locale, msgsSeen=$msgsSeen, orderBookBinning=$orderBookBinning, orderBookType=$orderBookType, orderControlsPlusMinus=$orderControlsPlusMinus, sounds=$sounds, strictIPCheck=$strictIPCheck, strictTimeout=$strictTimeout, tickerGroup=$tickerGroup, tickerPinned=$tickerPinned, tradeLayout=$tradeLayout, ]';
  }

}

