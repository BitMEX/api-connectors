#import "SWGDate.h"
#import "SWGTradeBin.h"

@implementation SWGTradeBin

-(id)timestamp: (SWGDate*) timestamp
    symbol: (NSString*) symbol
    open: (NSNumber*) open
    high: (NSNumber*) high
    low: (NSNumber*) low
    close: (NSNumber*) close
    trades: (NSNumber*) trades
    volume: (NSNumber*) volume
    vwap: (NSNumber*) vwap
    lastSize: (NSNumber*) lastSize
    turnover: (NSNumber*) turnover
    homeNotional: (NSNumber*) homeNotional
    foreignNotional: (NSNumber*) foreignNotional
    _id: (NSNumber*) _id
{
  _timestamp = timestamp;
  _symbol = symbol;
  _open = open;
  _high = high;
  _low = low;
  _close = close;
  _trades = trades;
  _volume = volume;
  _vwap = vwap;
  _lastSize = lastSize;
  _turnover = turnover;
  _homeNotional = homeNotional;
  _foreignNotional = foreignNotional;
  __id = _id;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        _symbol = dict[@"symbol"]; 
        _open = dict[@"open"]; 
        _high = dict[@"high"]; 
        _low = dict[@"low"]; 
        _close = dict[@"close"]; 
        _trades = dict[@"trades"]; 
        _volume = dict[@"volume"]; 
        _vwap = dict[@"vwap"]; 
        _lastSize = dict[@"lastSize"]; 
        _turnover = dict[@"turnover"]; 
        _homeNotional = dict[@"homeNotional"]; 
        _foreignNotional = dict[@"foreignNotional"]; 
        __id = dict[@"id"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_timestamp != nil){
        if([_timestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *timestamp in (NSArray*)_timestamp) {
                [array addObject:[(SWGObject*)timestamp asDictionary]];
            }
            dict[@"timestamp"] = array;
        }
        else if(_timestamp && [_timestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_timestamp toString];
            if(dateString){
                dict[@"timestamp"] = dateString;
            }
        }
        else {
        if(_timestamp != nil) dict[@"timestamp"] = [(SWGObject*)_timestamp asDictionary];
        }
    }
    if(_symbol != nil) dict[@"symbol"] = _symbol ;
        if(_open != nil) dict[@"open"] = _open ;
        if(_high != nil) dict[@"high"] = _high ;
        if(_low != nil) dict[@"low"] = _low ;
        if(_close != nil) dict[@"close"] = _close ;
        if(_trades != nil) dict[@"trades"] = _trades ;
        if(_volume != nil) dict[@"volume"] = _volume ;
        if(_vwap != nil) dict[@"vwap"] = _vwap ;
        if(_lastSize != nil) dict[@"lastSize"] = _lastSize ;
        if(_turnover != nil) dict[@"turnover"] = _turnover ;
        if(_homeNotional != nil) dict[@"homeNotional"] = _homeNotional ;
        if(_foreignNotional != nil) dict[@"foreignNotional"] = _foreignNotional ;
        if(__id != nil) dict[@"id"] = __id ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

