part of api;


@Entity()
class User {
  
  Number id = null;
  
  
  Number ownerId = null;
  
  
  String firstname = null;
  
  
  String lastname = null;
  
  
  String status = null;
  
  
  String username = null;
  
  
  String email = null;
  
  
  String phone = null;
  
  
  Number countryCode = null;
  
  
  DateTime created = null;
  
  
  DateTime lastUpdated = null;
  
  
  UserPreferences preferences = null;
  
  
  String tFAEnabled = null;
  
  
  String affiliateID = null;
  
  
  String pgpPubKey = null;
  
  
  String country = null;
  
  
  bool disabled = null;
  
  
  User();

  @override
  String toString()  {
    return 'User[id=$id, ownerId=$ownerId, firstname=$firstname, lastname=$lastname, status=$status, username=$username, email=$email, phone=$phone, countryCode=$countryCode, created=$created, lastUpdated=$lastUpdated, preferences=$preferences, tFAEnabled=$tFAEnabled, affiliateID=$affiliateID, pgpPubKey=$pgpPubKey, country=$country, disabled=$disabled, ]';
  }

}

