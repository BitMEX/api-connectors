#import "SWGDate.h"
#import "SWGOrderBook.h"

@implementation SWGOrderBook

-(id)symbol: (NSString*) symbol
    level: (NSNumber*) level
    bidSize: (NSNumber*) bidSize
    bidPrice: (NSNumber*) bidPrice
    askPrice: (NSNumber*) askPrice
    askSize: (NSNumber*) askSize
    timestamp: (SWGDate*) timestamp
{
  _symbol = symbol;
  _level = level;
  _bidSize = bidSize;
  _bidPrice = bidPrice;
  _askPrice = askPrice;
  _askSize = askSize;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _symbol = dict[@"symbol"]; 
        _level = dict[@"level"]; 
        _bidSize = dict[@"bidSize"]; 
        _bidPrice = dict[@"bidPrice"]; 
        _askPrice = dict[@"askPrice"]; 
        _askSize = dict[@"askSize"]; 
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_symbol != nil) dict[@"symbol"] = _symbol ;
        if(_level != nil) dict[@"level"] = _level ;
        if(_bidSize != nil) dict[@"bidSize"] = _bidSize ;
        if(_bidPrice != nil) dict[@"bidPrice"] = _bidPrice ;
        if(_askPrice != nil) dict[@"askPrice"] = _askPrice ;
        if(_askSize != nil) dict[@"askSize"] = _askSize ;
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
    NSDictionary* output = [dict copy];
    return output;
}

@end

