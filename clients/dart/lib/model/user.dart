part of api;


@Entity()
class User {
  
  @Property(name: 'id')
  Number id = null;
  

  @Property(name: 'ownerId')
  Number ownerId = null;
  

  @Property(name: 'firstname')
  String firstname = null;
  

  @Property(name: 'lastname')
  String lastname = null;
  

  @Property(name: 'status')
  String status = null;
  

  @Property(name: 'username')
  String username = null;
  

  @Property(name: 'email')
  String email = null;
  

  @Property(name: 'phone')
  String phone = null;
  

  @Property(name: 'countryCode')
  Number countryCode = null;
  

  @Property(name: 'created')
  DateTime created = null;
  

  @Property(name: 'lastUpdated')
  DateTime lastUpdated = null;
  

  @Property(name: 'preferences')
  UserPreferences preferences = null;
  

  @Property(name: 'TFAEnabled')
  String tFAEnabled = null;
  

  @Property(name: 'affiliateID')
  String affiliateID = null;
  

  @Property(name: 'pgpPubKey')
  String pgpPubKey = null;
  

  @Property(name: 'country')
  String country = null;
  

  @Property(name: 'disabled')
  bool disabled = null;
  
  User();

  @override
  String toString()  {
    return 'User[id=$id, ownerId=$ownerId, firstname=$firstname, lastname=$lastname, status=$status, username=$username, email=$email, phone=$phone, countryCode=$countryCode, created=$created, lastUpdated=$lastUpdated, preferences=$preferences, tFAEnabled=$tFAEnabled, affiliateID=$affiliateID, pgpPubKey=$pgpPubKey, country=$country, disabled=$disabled, ]';
  }

}

