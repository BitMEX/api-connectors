#import "SWGDate.h"
#import "SWGLeaderboard.h"

@implementation SWGLeaderboard

-(id)username: (NSString*) username
    marginBalance: (NSNumber*) marginBalance
{
  _username = username;
  _marginBalance = marginBalance;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _username = dict[@"username"]; 
        _marginBalance = dict[@"marginBalance"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_username != nil) dict[@"username"] = _username ;
        if(_marginBalance != nil) dict[@"marginBalance"] = _marginBalance ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

