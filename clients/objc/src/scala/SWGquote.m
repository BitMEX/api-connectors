#import "SWGDate.h"
#import "SWGQuote.h"

@implementation SWGQuote

-(id)timestamp: (SWGDate*) timestamp
    symbol: (NSString*) symbol
    bidSize: (NSNumber*) bidSize
    bidPrice: (NSNumber*) bidPrice
    askPrice: (NSNumber*) askPrice
    askSize: (NSNumber*) askSize
    _id: (NSNumber*) _id
{
  _timestamp = timestamp;
  _symbol = symbol;
  _bidSize = bidSize;
  _bidPrice = bidPrice;
  _askPrice = askPrice;
  _askSize = askSize;
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
        _bidSize = dict[@"bidSize"]; 
        _bidPrice = dict[@"bidPrice"]; 
        _askPrice = dict[@"askPrice"]; 
        _askSize = dict[@"askSize"]; 
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
        if(_bidSize != nil) dict[@"bidSize"] = _bidSize ;
        if(_bidPrice != nil) dict[@"bidPrice"] = _bidPrice ;
        if(_askPrice != nil) dict[@"askPrice"] = _askPrice ;
        if(_askSize != nil) dict[@"askSize"] = _askSize ;
        if(__id != nil) dict[@"id"] = __id ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

