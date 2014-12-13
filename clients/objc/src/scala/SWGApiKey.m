#import "SWGDate.h"
#import "SWGApiKey.h"

@implementation SWGApiKey

-(id)_id: (NSString*) _id
    secret: (NSString*) secret
    name: (NSString*) name
    nonce: (NSNumber*) nonce
    cidr: (NSString*) cidr
    constriants: (NSObject*) constriants
    enabled: (NSNumber*) enabled
    userId: (NSNumber*) userId
{
  __id = _id;
  _secret = secret;
  _name = name;
  _nonce = nonce;
  _cidr = cidr;
  _constriants = constriants;
  _enabled = enabled;
  _userId = userId;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        __id = dict[@"id"]; 
        _secret = dict[@"secret"]; 
        _name = dict[@"name"]; 
        _nonce = dict[@"nonce"]; 
        _cidr = dict[@"cidr"]; 
        _constriants = dict[@"constriants"]; 
        _enabled = dict[@"enabled"]; 
        _userId = dict[@"userId"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(__id != nil) dict[@"id"] = __id ;
        if(_secret != nil) dict[@"secret"] = _secret ;
        if(_name != nil) dict[@"name"] = _name ;
        if(_nonce != nil) dict[@"nonce"] = _nonce ;
        if(_cidr != nil) dict[@"cidr"] = _cidr ;
        if(_constriants != nil) dict[@"constriants"] = _constriants ;
        if(_enabled != nil) dict[@"enabled"] = _enabled ;
        if(_userId != nil) dict[@"userId"] = _userId ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

