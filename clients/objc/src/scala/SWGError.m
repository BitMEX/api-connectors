#import "SWGDate.h"
#import "SWGError.h"

@implementation SWGError

-(id)message: (NSString*) message
    code: (NSNumber*) code
{
  _message = message;
  _code = code;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _message = dict[@"message"]; 
        _code = dict[@"code"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_message != nil) dict[@"message"] = _message ;
        if(_code != nil) dict[@"code"] = _code ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

