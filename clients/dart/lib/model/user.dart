part of api;


@Entity()
class User {
  
  Number id = null;
  
  
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
  
  
  String role = null;
  
  
  String tFAEnabled = null;
  
  
  String affiliateID = null;
  
  
  String pgpPubKey = null;
  
  
  String country = null;
  
  
  bool disabled = null;
  
  
  User();

  @override
  String toString()  {
    return 'User[id=$id, firstname=$firstname, lastname=$lastname, status=$status, username=$username, email=$email, phone=$phone, countryCode=$countryCode, created=$created, lastUpdated=$lastUpdated, preferences=$preferences, role=$role, tFAEnabled=$tFAEnabled, affiliateID=$affiliateID, pgpPubKey=$pgpPubKey, country=$country, disabled=$disabled, ]';
  }

}

