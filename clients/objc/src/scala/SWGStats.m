#import "SWGDate.h"
#import "SWGStats.h"

@implementation SWGStats

-(id)rootSymbol: (NSString*) rootSymbol
    currency: (NSString*) currency
    volume24h: (NSNumber*) volume24h
    turnover24h: (NSNumber*) turnover24h
    openInterest: (NSNumber*) openInterest
    openValue: (NSNumber*) openValue
{
  _rootSymbol = rootSymbol;
  _currency = currency;
  _volume24h = volume24h;
  _turnover24h = turnover24h;
  _openInterest = openInterest;
  _openValue = openValue;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _rootSymbol = dict[@"rootSymbol"]; 
        _currency = dict[@"currency"]; 
        _volume24h = dict[@"volume24h"]; 
        _turnover24h = dict[@"turnover24h"]; 
        _openInterest = dict[@"openInterest"]; 
        _openValue = dict[@"openValue"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_rootSymbol != nil) dict[@"rootSymbol"] = _rootSymbol ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_volume24h != nil) dict[@"volume24h"] = _volume24h ;
        if(_turnover24h != nil) dict[@"turnover24h"] = _turnover24h ;
        if(_openInterest != nil) dict[@"openInterest"] = _openInterest ;
        if(_openValue != nil) dict[@"openValue"] = _openValue ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

