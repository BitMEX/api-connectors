#import "SWGDate.h"
#import "SWGTrade.h"

@implementation SWGTrade

-(id)timestamp: (SWGDate*) timestamp
    symbol: (NSString*) symbol
    side: (NSString*) side
    size: (NSNumber*) size
    price: (NSNumber*) price
    tickDirection: (NSString*) tickDirection
    trdMatchID: (NSString*) trdMatchID
    grossValue: (NSNumber*) grossValue
    homeNotional: (NSNumber*) homeNotional
    foreignNotional: (NSNumber*) foreignNotional
    _id: (NSNumber*) _id
{
  _timestamp = timestamp;
  _symbol = symbol;
  _side = side;
  _size = size;
  _price = price;
  _tickDirection = tickDirection;
  _trdMatchID = trdMatchID;
  _grossValue = grossValue;
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
        _side = dict[@"side"]; 
        _size = dict[@"size"]; 
        _price = dict[@"price"]; 
        _tickDirection = dict[@"tickDirection"]; 
        _trdMatchID = dict[@"trdMatchID"]; 
        _grossValue = dict[@"grossValue"]; 
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
        if(_side != nil) dict[@"side"] = _side ;
        if(_size != nil) dict[@"size"] = _size ;
        if(_price != nil) dict[@"price"] = _price ;
        if(_tickDirection != nil) dict[@"tickDirection"] = _tickDirection ;
        if(_trdMatchID != nil) dict[@"trdMatchID"] = _trdMatchID ;
        if(_grossValue != nil) dict[@"grossValue"] = _grossValue ;
        if(_homeNotional != nil) dict[@"homeNotional"] = _homeNotional ;
        if(_foreignNotional != nil) dict[@"foreignNotional"] = _foreignNotional ;
        if(__id != nil) dict[@"id"] = __id ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

