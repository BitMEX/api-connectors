#import "SWGDate.h"
#import "SWGStatsHistory.h"

@implementation SWGStatsHistory

-(id)date: (SWGDate*) date
    rootSymbol: (NSString*) rootSymbol
    currency: (NSString*) currency
    volume: (NSNumber*) volume
    turnover: (NSNumber*) turnover
{
  _date = date;
  _rootSymbol = rootSymbol;
  _currency = currency;
  _volume = volume;
  _turnover = turnover;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id date_dict = dict[@"date"];
        if(date_dict != nil)
            _date = [[SWGDate alloc]initWithValues:date_dict];
        _rootSymbol = dict[@"rootSymbol"]; 
        _currency = dict[@"currency"]; 
        _volume = dict[@"volume"]; 
        _turnover = dict[@"turnover"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_date != nil){
        if([_date isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *date in (NSArray*)_date) {
                [array addObject:[(SWGObject*)date asDictionary]];
            }
            dict[@"date"] = array;
        }
        else if(_date && [_date isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_date toString];
            if(dateString){
                dict[@"date"] = dateString;
            }
        }
        else {
        if(_date != nil) dict[@"date"] = [(SWGObject*)_date asDictionary];
        }
    }
    if(_rootSymbol != nil) dict[@"rootSymbol"] = _rootSymbol ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_volume != nil) dict[@"volume"] = _volume ;
        if(_turnover != nil) dict[@"turnover"] = _turnover ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

