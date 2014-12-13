#import "SWGDate.h"
#import "SWGUser.h"

@implementation SWGUser

-(id)firstname: (NSString*) firstname
    lastname: (NSString*) lastname
    status: (NSString*) status
    username: (NSString*) username
    email: (NSString*) email
    phone: (NSString*) phone
    countryCode: (NSNumber*) countryCode
    created: (SWGDate*) created
    lastUpdated: (SWGDate*) lastUpdated
    preferences: (NSObject*) preferences
    role: (NSString*) role
    TFAEnabled: (NSString*) TFAEnabled
    _id: (NSNumber*) _id
{
  _firstname = firstname;
  _lastname = lastname;
  _status = status;
  _username = username;
  _email = email;
  _phone = phone;
  _countryCode = countryCode;
  _created = created;
  _lastUpdated = lastUpdated;
  _preferences = preferences;
  _role = role;
  _TFAEnabled = TFAEnabled;
  __id = _id;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _firstname = dict[@"firstname"]; 
        _lastname = dict[@"lastname"]; 
        _status = dict[@"status"]; 
        _username = dict[@"username"]; 
        _email = dict[@"email"]; 
        _phone = dict[@"phone"]; 
        _countryCode = dict[@"countryCode"]; 
        id created_dict = dict[@"created"];
        if(created_dict != nil)
            _created = [[SWGDate alloc]initWithValues:created_dict];
        id lastUpdated_dict = dict[@"lastUpdated"];
        if(lastUpdated_dict != nil)
            _lastUpdated = [[SWGDate alloc]initWithValues:lastUpdated_dict];
        _preferences = dict[@"preferences"]; 
        _role = dict[@"role"]; 
        _TFAEnabled = dict[@"TFAEnabled"]; 
        __id = dict[@"id"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_firstname != nil) dict[@"firstname"] = _firstname ;
        if(_lastname != nil) dict[@"lastname"] = _lastname ;
        if(_status != nil) dict[@"status"] = _status ;
        if(_username != nil) dict[@"username"] = _username ;
        if(_email != nil) dict[@"email"] = _email ;
        if(_phone != nil) dict[@"phone"] = _phone ;
        if(_countryCode != nil) dict[@"countryCode"] = _countryCode ;
        if(_created != nil){
        if([_created isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *created in (NSArray*)_created) {
                [array addObject:[(SWGObject*)created asDictionary]];
            }
            dict[@"created"] = array;
        }
        else if(_created && [_created isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_created toString];
            if(dateString){
                dict[@"created"] = dateString;
            }
        }
        else {
        if(_created != nil) dict[@"created"] = [(SWGObject*)_created asDictionary];
        }
    }
    if(_lastUpdated != nil){
        if([_lastUpdated isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *lastUpdated in (NSArray*)_lastUpdated) {
                [array addObject:[(SWGObject*)lastUpdated asDictionary]];
            }
            dict[@"lastUpdated"] = array;
        }
        else if(_lastUpdated && [_lastUpdated isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_lastUpdated toString];
            if(dateString){
                dict[@"lastUpdated"] = dateString;
            }
        }
        else {
        if(_lastUpdated != nil) dict[@"lastUpdated"] = [(SWGObject*)_lastUpdated asDictionary];
        }
    }
    if(_preferences != nil) dict[@"preferences"] = _preferences ;
        if(_role != nil) dict[@"role"] = _role ;
        if(_TFAEnabled != nil) dict[@"TFAEnabled"] = _TFAEnabled ;
        if(__id != nil) dict[@"id"] = __id ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

