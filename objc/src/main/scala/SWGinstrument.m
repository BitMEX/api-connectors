#import "SWGDate.h"
#import "SWGInstrument.h"

@implementation SWGInstrument

-(id)symbol: (NSString*) symbol
    state: (NSString*) state
    typ: (NSString*) typ
    listing: (SWGDate*) listing
    expiry: (SWGDate*) expiry
    underlying: (NSString*) underlying
    buyLeg: (NSString*) buyLeg
    sellLeg: (NSString*) sellLeg
    quoteCurrency: (NSString*) quoteCurrency
    reference: (NSString*) reference
    referenceSymbol: (NSString*) referenceSymbol
    tickSize: (NSNumber*) tickSize
    multiplier: (NSNumber*) multiplier
    settlCurrency: (NSString*) settlCurrency
    initMargin: (NSNumber*) initMargin
    maintMargin: (NSNumber*) maintMargin
    limit: (NSNumber*) limit
    openingTimestamp: (SWGDate*) openingTimestamp
    closingTimestamp: (SWGDate*) closingTimestamp
    prevClosePrice: (NSNumber*) prevClosePrice
    limitDownPrice: (NSNumber*) limitDownPrice
    limitUpPrice: (NSNumber*) limitUpPrice
    volume: (NSNumber*) volume
    vwap: (NSNumber*) vwap
    highPrice: (NSNumber*) highPrice
    lowPrice: (NSNumber*) lowPrice
    lastPrice: (NSNumber*) lastPrice
    lastTickDirection: (NSString*) lastTickDirection
    lastChangePcnt: (NSNumber*) lastChangePcnt
    bidPrice: (NSNumber*) bidPrice
    midPrice: (NSNumber*) midPrice
    askPrice: (NSNumber*) askPrice
    openInterest: (NSNumber*) openInterest
    settledPrice: (NSNumber*) settledPrice
    timestamp: (SWGDate*) timestamp
{
  _symbol = symbol;
  _state = state;
  _typ = typ;
  _listing = listing;
  _expiry = expiry;
  _underlying = underlying;
  _buyLeg = buyLeg;
  _sellLeg = sellLeg;
  _quoteCurrency = quoteCurrency;
  _reference = reference;
  _referenceSymbol = referenceSymbol;
  _tickSize = tickSize;
  _multiplier = multiplier;
  _settlCurrency = settlCurrency;
  _initMargin = initMargin;
  _maintMargin = maintMargin;
  _limit = limit;
  _openingTimestamp = openingTimestamp;
  _closingTimestamp = closingTimestamp;
  _prevClosePrice = prevClosePrice;
  _limitDownPrice = limitDownPrice;
  _limitUpPrice = limitUpPrice;
  _volume = volume;
  _vwap = vwap;
  _highPrice = highPrice;
  _lowPrice = lowPrice;
  _lastPrice = lastPrice;
  _lastTickDirection = lastTickDirection;
  _lastChangePcnt = lastChangePcnt;
  _bidPrice = bidPrice;
  _midPrice = midPrice;
  _askPrice = askPrice;
  _openInterest = openInterest;
  _settledPrice = settledPrice;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _symbol = dict[@"symbol"]; 
        _state = dict[@"state"]; 
        _typ = dict[@"typ"]; 
        id listing_dict = dict[@"listing"];
        if(listing_dict != nil)
            _listing = [[SWGDate alloc]initWithValues:listing_dict];
        id expiry_dict = dict[@"expiry"];
        if(expiry_dict != nil)
            _expiry = [[SWGDate alloc]initWithValues:expiry_dict];
        _underlying = dict[@"underlying"]; 
        _buyLeg = dict[@"buyLeg"]; 
        _sellLeg = dict[@"sellLeg"]; 
        _quoteCurrency = dict[@"quoteCurrency"]; 
        _reference = dict[@"reference"]; 
        _referenceSymbol = dict[@"referenceSymbol"]; 
        _tickSize = dict[@"tickSize"]; 
        _multiplier = dict[@"multiplier"]; 
        _settlCurrency = dict[@"settlCurrency"]; 
        _initMargin = dict[@"initMargin"]; 
        _maintMargin = dict[@"maintMargin"]; 
        _limit = dict[@"limit"]; 
        id openingTimestamp_dict = dict[@"openingTimestamp"];
        if(openingTimestamp_dict != nil)
            _openingTimestamp = [[SWGDate alloc]initWithValues:openingTimestamp_dict];
        id closingTimestamp_dict = dict[@"closingTimestamp"];
        if(closingTimestamp_dict != nil)
            _closingTimestamp = [[SWGDate alloc]initWithValues:closingTimestamp_dict];
        _prevClosePrice = dict[@"prevClosePrice"]; 
        _limitDownPrice = dict[@"limitDownPrice"]; 
        _limitUpPrice = dict[@"limitUpPrice"]; 
        _volume = dict[@"volume"]; 
        _vwap = dict[@"vwap"]; 
        _highPrice = dict[@"highPrice"]; 
        _lowPrice = dict[@"lowPrice"]; 
        _lastPrice = dict[@"lastPrice"]; 
        _lastTickDirection = dict[@"lastTickDirection"]; 
        _lastChangePcnt = dict[@"lastChangePcnt"]; 
        _bidPrice = dict[@"bidPrice"]; 
        _midPrice = dict[@"midPrice"]; 
        _askPrice = dict[@"askPrice"]; 
        _openInterest = dict[@"openInterest"]; 
        _settledPrice = dict[@"settledPrice"]; 
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_symbol != nil) dict[@"symbol"] = _symbol ;
        if(_state != nil) dict[@"state"] = _state ;
        if(_typ != nil) dict[@"typ"] = _typ ;
        if(_listing != nil){
        if([_listing isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *listing in (NSArray*)_listing) {
                [array addObject:[(SWGObject*)listing asDictionary]];
            }
            dict[@"listing"] = array;
        }
        else if(_listing && [_listing isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_listing toString];
            if(dateString){
                dict[@"listing"] = dateString;
            }
        }
        else {
        if(_listing != nil) dict[@"listing"] = [(SWGObject*)_listing asDictionary];
        }
    }
    if(_expiry != nil){
        if([_expiry isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *expiry in (NSArray*)_expiry) {
                [array addObject:[(SWGObject*)expiry asDictionary]];
            }
            dict[@"expiry"] = array;
        }
        else if(_expiry && [_expiry isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_expiry toString];
            if(dateString){
                dict[@"expiry"] = dateString;
            }
        }
        else {
        if(_expiry != nil) dict[@"expiry"] = [(SWGObject*)_expiry asDictionary];
        }
    }
    if(_underlying != nil) dict[@"underlying"] = _underlying ;
        if(_buyLeg != nil) dict[@"buyLeg"] = _buyLeg ;
        if(_sellLeg != nil) dict[@"sellLeg"] = _sellLeg ;
        if(_quoteCurrency != nil) dict[@"quoteCurrency"] = _quoteCurrency ;
        if(_reference != nil) dict[@"reference"] = _reference ;
        if(_referenceSymbol != nil) dict[@"referenceSymbol"] = _referenceSymbol ;
        if(_tickSize != nil) dict[@"tickSize"] = _tickSize ;
        if(_multiplier != nil) dict[@"multiplier"] = _multiplier ;
        if(_settlCurrency != nil) dict[@"settlCurrency"] = _settlCurrency ;
        if(_initMargin != nil) dict[@"initMargin"] = _initMargin ;
        if(_maintMargin != nil) dict[@"maintMargin"] = _maintMargin ;
        if(_limit != nil) dict[@"limit"] = _limit ;
        if(_openingTimestamp != nil){
        if([_openingTimestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *openingTimestamp in (NSArray*)_openingTimestamp) {
                [array addObject:[(SWGObject*)openingTimestamp asDictionary]];
            }
            dict[@"openingTimestamp"] = array;
        }
        else if(_openingTimestamp && [_openingTimestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_openingTimestamp toString];
            if(dateString){
                dict[@"openingTimestamp"] = dateString;
            }
        }
        else {
        if(_openingTimestamp != nil) dict[@"openingTimestamp"] = [(SWGObject*)_openingTimestamp asDictionary];
        }
    }
    if(_closingTimestamp != nil){
        if([_closingTimestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *closingTimestamp in (NSArray*)_closingTimestamp) {
                [array addObject:[(SWGObject*)closingTimestamp asDictionary]];
            }
            dict[@"closingTimestamp"] = array;
        }
        else if(_closingTimestamp && [_closingTimestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_closingTimestamp toString];
            if(dateString){
                dict[@"closingTimestamp"] = dateString;
            }
        }
        else {
        if(_closingTimestamp != nil) dict[@"closingTimestamp"] = [(SWGObject*)_closingTimestamp asDictionary];
        }
    }
    if(_prevClosePrice != nil) dict[@"prevClosePrice"] = _prevClosePrice ;
        if(_limitDownPrice != nil) dict[@"limitDownPrice"] = _limitDownPrice ;
        if(_limitUpPrice != nil) dict[@"limitUpPrice"] = _limitUpPrice ;
        if(_volume != nil) dict[@"volume"] = _volume ;
        if(_vwap != nil) dict[@"vwap"] = _vwap ;
        if(_highPrice != nil) dict[@"highPrice"] = _highPrice ;
        if(_lowPrice != nil) dict[@"lowPrice"] = _lowPrice ;
        if(_lastPrice != nil) dict[@"lastPrice"] = _lastPrice ;
        if(_lastTickDirection != nil) dict[@"lastTickDirection"] = _lastTickDirection ;
        if(_lastChangePcnt != nil) dict[@"lastChangePcnt"] = _lastChangePcnt ;
        if(_bidPrice != nil) dict[@"bidPrice"] = _bidPrice ;
        if(_midPrice != nil) dict[@"midPrice"] = _midPrice ;
        if(_askPrice != nil) dict[@"askPrice"] = _askPrice ;
        if(_openInterest != nil) dict[@"openInterest"] = _openInterest ;
        if(_settledPrice != nil) dict[@"settledPrice"] = _settledPrice ;
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

