part of api;


@Entity()
class UserPreferences {
  
  DateTime announcementsLastSeen = null;
  
  
  String colorTheme = null;
  
  
  String currency = null;
  
  
  bool debug = null;
  
  
  List<String> disableEmails = [];
  
  
  List<String> hideConfirmDialogs = [];
  
  
  List<String> hideNotifications = [];
  
  
  bool hidePhoneConfirm = null;
  
  
  List<String> msgsSeen = [];
  
  
  Number orderBookBinning = null;
  
  
  bool orderControlsPlusMinus = null;
  
  
  List<String> sounds = [];
  
  
  bool strictIPCheck = null;
  
  
  String tickerGroup = null;
  
  
  bool tickerPinned = null;
  
  
  String tradeLayout = null;
  
  
  UserPreferences();

  @override
  String toString()  {
    return 'UserPreferences[announcementsLastSeen=$announcementsLastSeen, colorTheme=$colorTheme, currency=$currency, debug=$debug, disableEmails=$disableEmails, hideConfirmDialogs=$hideConfirmDialogs, hideNotifications=$hideNotifications, hidePhoneConfirm=$hidePhoneConfirm, msgsSeen=$msgsSeen, orderBookBinning=$orderBookBinning, orderControlsPlusMinus=$orderControlsPlusMinus, sounds=$sounds, strictIPCheck=$strictIPCheck, tickerGroup=$tickerGroup, tickerPinned=$tickerPinned, tradeLayout=$tradeLayout, ]';
  }

}

