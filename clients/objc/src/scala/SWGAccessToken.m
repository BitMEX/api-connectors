#import "SWGDate.h"
#import "SWGAccessToken.h"

@implementation SWGAccessToken

-(id)_id: (NSString*) _id
    ttl: (NSNumber*) ttl
    created: (SWGDate*) created
    userId: (NSNumber*) userId
{
  __id = _id;
  _ttl = ttl;
  _created = created;
  _userId = userId;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        __id = dict[@"id"]; 
        _ttl = dict[@"ttl"]; 
        id created_dict = dict[@"created"];
        if(created_dict != nil)
            _created = [[SWGDate alloc]initWithValues:created_dict];
        _userId = dict[@"userId"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(__id != nil) dict[@"id"] = __id ;
        if(_ttl != nil) dict[@"ttl"] = _ttl ;
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
    if(_userId != nil) dict[@"userId"] = _userId ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

