#import "SWGDate.h"
#import "SWGUser.h"

@implementation SWGUser

-(id)firstname: (NSString*) firstname
    lastname: (NSString*) lastname
    username: (NSString*) username
    email: (NSString*) email
    emailVerified: (NSNumber*) emailVerified
    phone: (NSString*) phone
    phoneVerified: (NSNumber*) phoneVerified
    status: (NSString*) status
    created: (SWGDate*) created
    lastUpdated: (SWGDate*) lastUpdated
    preferences: (SWGAnonymousModel_6*) preferences
    isEmployee: (NSNumber*) isEmployee
    _id: (NSNumber*) _id
{
  _firstname = firstname;
  _lastname = lastname;
  _username = username;
  _email = email;
  _emailVerified = emailVerified;
  _phone = phone;
  _phoneVerified = phoneVerified;
  _status = status;
  _created = created;
  _lastUpdated = lastUpdated;
  _preferences = preferences;
  _isEmployee = isEmployee;
  __id = _id;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _firstname = dict[@"firstname"]; 
        _lastname = dict[@"lastname"]; 
        _username = dict[@"username"]; 
        _email = dict[@"email"]; 
        _emailVerified = dict[@"emailVerified"]; 
        _phone = dict[@"phone"]; 
        _phoneVerified = dict[@"phoneVerified"]; 
        _status = dict[@"status"]; 
        id created_dict = dict[@"created"];
        if(created_dict != nil)
            _created = [[SWGDate alloc]initWithValues:created_dict];
        id lastUpdated_dict = dict[@"lastUpdated"];
        if(lastUpdated_dict != nil)
            _lastUpdated = [[SWGDate alloc]initWithValues:lastUpdated_dict];
        id preferences_dict = dict[@"preferences"];
        if(preferences_dict != nil)
            _preferences = [[SWGAnonymousModel_6 alloc]initWithValues:preferences_dict];
        _isEmployee = dict[@"isEmployee"]; 
        __id = dict[@"id"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_firstname != nil) dict[@"firstname"] = _firstname ;
        if(_lastname != nil) dict[@"lastname"] = _lastname ;
        if(_username != nil) dict[@"username"] = _username ;
        if(_email != nil) dict[@"email"] = _email ;
        if(_emailVerified != nil) dict[@"emailVerified"] = _emailVerified ;
        if(_phone != nil) dict[@"phone"] = _phone ;
        if(_phoneVerified != nil) dict[@"phoneVerified"] = _phoneVerified ;
        if(_status != nil) dict[@"status"] = _status ;
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
    if(_preferences != nil){
        if([_preferences isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGAnonymousModel_6 *preferences in (NSArray*)_preferences) {
                [array addObject:[(SWGObject*)preferences asDictionary]];
            }
            dict[@"preferences"] = array;
        }
        else if(_preferences && [_preferences isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_preferences toString];
            if(dateString){
                dict[@"preferences"] = dateString;
            }
        }
        else {
        if(_preferences != nil) dict[@"preferences"] = [(SWGObject*)_preferences asDictionary];
        }
    }
    if(_isEmployee != nil) dict[@"isEmployee"] = _isEmployee ;
        if(__id != nil) dict[@"id"] = __id ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

