#import "SWGDate.h"
#import "SWGInstrument.h"

@implementation SWGInstrument

-(id)symbol: (NSString*) symbol
    rootSymbol: (NSString*) rootSymbol
    state: (NSString*) state
    typ: (NSString*) typ
    listing: (SWGDate*) listing
    front: (SWGDate*) front
    expiry: (SWGDate*) expiry
    relistInterval: (SWGDate*) relistInterval
    inverseLeg: (NSString*) inverseLeg
    sellLeg: (NSString*) sellLeg
    buyLeg: (NSString*) buyLeg
    underlying: (NSString*) underlying
    quoteCurrency: (NSString*) quoteCurrency
    underlyingSymbol: (NSString*) underlyingSymbol
    reference: (NSString*) reference
    referenceSymbol: (NSString*) referenceSymbol
    tickSize: (NSNumber*) tickSize
    multiplier: (NSNumber*) multiplier
    settlCurrency: (NSString*) settlCurrency
    underlyingToSettleMultiplier: (NSNumber*) underlyingToSettleMultiplier
    quoteToSettleMultiplier: (NSNumber*) quoteToSettleMultiplier
    isQuanto: (NSNumber*) isQuanto
    isInverse: (NSNumber*) isInverse
    initMargin: (NSNumber*) initMargin
    maintMargin: (NSNumber*) maintMargin
    limit: (NSNumber*) limit
    makerFee: (NSNumber*) makerFee
    takerFee: (NSNumber*) takerFee
    insuranceFee: (NSNumber*) insuranceFee
    hedgerMakerFee: (NSNumber*) hedgerMakerFee
    hedgerTakerFee: (NSNumber*) hedgerTakerFee
    hedgerInsuranceFee: (NSNumber*) hedgerInsuranceFee
    openingTimestamp: (SWGDate*) openingTimestamp
    closingTimestamp: (SWGDate*) closingTimestamp
    sessionInterval: (SWGDate*) sessionInterval
    prevClosePrice: (NSNumber*) prevClosePrice
    limitDownPrice: (NSNumber*) limitDownPrice
    limitUpPrice: (NSNumber*) limitUpPrice
    prevTotalVolume: (NSNumber*) prevTotalVolume
    totalVolume: (NSNumber*) totalVolume
    volume: (NSNumber*) volume
    volume24h: (NSNumber*) volume24h
    prevTotalTurnover: (NSNumber*) prevTotalTurnover
    totalTurnover: (NSNumber*) totalTurnover
    turnover: (NSNumber*) turnover
    turnover24h: (NSNumber*) turnover24h
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
    openValue: (NSNumber*) openValue
    settledPrice: (NSNumber*) settledPrice
    timestamp: (SWGDate*) timestamp
{
  _symbol = symbol;
  _rootSymbol = rootSymbol;
  _state = state;
  _typ = typ;
  _listing = listing;
  _front = front;
  _expiry = expiry;
  _relistInterval = relistInterval;
  _inverseLeg = inverseLeg;
  _sellLeg = sellLeg;
  _buyLeg = buyLeg;
  _underlying = underlying;
  _quoteCurrency = quoteCurrency;
  _underlyingSymbol = underlyingSymbol;
  _reference = reference;
  _referenceSymbol = referenceSymbol;
  _tickSize = tickSize;
  _multiplier = multiplier;
  _settlCurrency = settlCurrency;
  _underlyingToSettleMultiplier = underlyingToSettleMultiplier;
  _quoteToSettleMultiplier = quoteToSettleMultiplier;
  _isQuanto = isQuanto;
  _isInverse = isInverse;
  _initMargin = initMargin;
  _maintMargin = maintMargin;
  _limit = limit;
  _makerFee = makerFee;
  _takerFee = takerFee;
  _insuranceFee = insuranceFee;
  _hedgerMakerFee = hedgerMakerFee;
  _hedgerTakerFee = hedgerTakerFee;
  _hedgerInsuranceFee = hedgerInsuranceFee;
  _openingTimestamp = openingTimestamp;
  _closingTimestamp = closingTimestamp;
  _sessionInterval = sessionInterval;
  _prevClosePrice = prevClosePrice;
  _limitDownPrice = limitDownPrice;
  _limitUpPrice = limitUpPrice;
  _prevTotalVolume = prevTotalVolume;
  _totalVolume = totalVolume;
  _volume = volume;
  _volume24h = volume24h;
  _prevTotalTurnover = prevTotalTurnover;
  _totalTurnover = totalTurnover;
  _turnover = turnover;
  _turnover24h = turnover24h;
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
  _openValue = openValue;
  _settledPrice = settledPrice;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _symbol = dict[@"symbol"]; 
        _rootSymbol = dict[@"rootSymbol"]; 
        _state = dict[@"state"]; 
        _typ = dict[@"typ"]; 
        id listing_dict = dict[@"listing"];
        if(listing_dict != nil)
            _listing = [[SWGDate alloc]initWithValues:listing_dict];
        id front_dict = dict[@"front"];
        if(front_dict != nil)
            _front = [[SWGDate alloc]initWithValues:front_dict];
        id expiry_dict = dict[@"expiry"];
        if(expiry_dict != nil)
            _expiry = [[SWGDate alloc]initWithValues:expiry_dict];
        id relistInterval_dict = dict[@"relistInterval"];
        if(relistInterval_dict != nil)
            _relistInterval = [[SWGDate alloc]initWithValues:relistInterval_dict];
        _inverseLeg = dict[@"inverseLeg"]; 
        _sellLeg = dict[@"sellLeg"]; 
        _buyLeg = dict[@"buyLeg"]; 
        _underlying = dict[@"underlying"]; 
        _quoteCurrency = dict[@"quoteCurrency"]; 
        _underlyingSymbol = dict[@"underlyingSymbol"]; 
        _reference = dict[@"reference"]; 
        _referenceSymbol = dict[@"referenceSymbol"]; 
        _tickSize = dict[@"tickSize"]; 
        _multiplier = dict[@"multiplier"]; 
        _settlCurrency = dict[@"settlCurrency"]; 
        _underlyingToSettleMultiplier = dict[@"underlyingToSettleMultiplier"]; 
        _quoteToSettleMultiplier = dict[@"quoteToSettleMultiplier"]; 
        _isQuanto = dict[@"isQuanto"]; 
        _isInverse = dict[@"isInverse"]; 
        _initMargin = dict[@"initMargin"]; 
        _maintMargin = dict[@"maintMargin"]; 
        _limit = dict[@"limit"]; 
        _makerFee = dict[@"makerFee"]; 
        _takerFee = dict[@"takerFee"]; 
        _insuranceFee = dict[@"insuranceFee"]; 
        _hedgerMakerFee = dict[@"hedgerMakerFee"]; 
        _hedgerTakerFee = dict[@"hedgerTakerFee"]; 
        _hedgerInsuranceFee = dict[@"hedgerInsuranceFee"]; 
        id openingTimestamp_dict = dict[@"openingTimestamp"];
        if(openingTimestamp_dict != nil)
            _openingTimestamp = [[SWGDate alloc]initWithValues:openingTimestamp_dict];
        id closingTimestamp_dict = dict[@"closingTimestamp"];
        if(closingTimestamp_dict != nil)
            _closingTimestamp = [[SWGDate alloc]initWithValues:closingTimestamp_dict];
        id sessionInterval_dict = dict[@"sessionInterval"];
        if(sessionInterval_dict != nil)
            _sessionInterval = [[SWGDate alloc]initWithValues:sessionInterval_dict];
        _prevClosePrice = dict[@"prevClosePrice"]; 
        _limitDownPrice = dict[@"limitDownPrice"]; 
        _limitUpPrice = dict[@"limitUpPrice"]; 
        _prevTotalVolume = dict[@"prevTotalVolume"]; 
        _totalVolume = dict[@"totalVolume"]; 
        _volume = dict[@"volume"]; 
        _volume24h = dict[@"volume24h"]; 
        _prevTotalTurnover = dict[@"prevTotalTurnover"]; 
        _totalTurnover = dict[@"totalTurnover"]; 
        _turnover = dict[@"turnover"]; 
        _turnover24h = dict[@"turnover24h"]; 
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
        _openValue = dict[@"openValue"]; 
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
        if(_rootSymbol != nil) dict[@"rootSymbol"] = _rootSymbol ;
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
    if(_front != nil){
        if([_front isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *front in (NSArray*)_front) {
                [array addObject:[(SWGObject*)front asDictionary]];
            }
            dict[@"front"] = array;
        }
        else if(_front && [_front isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_front toString];
            if(dateString){
                dict[@"front"] = dateString;
            }
        }
        else {
        if(_front != nil) dict[@"front"] = [(SWGObject*)_front asDictionary];
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
    if(_relistInterval != nil){
        if([_relistInterval isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *relistInterval in (NSArray*)_relistInterval) {
                [array addObject:[(SWGObject*)relistInterval asDictionary]];
            }
            dict[@"relistInterval"] = array;
        }
        else if(_relistInterval && [_relistInterval isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_relistInterval toString];
            if(dateString){
                dict[@"relistInterval"] = dateString;
            }
        }
        else {
        if(_relistInterval != nil) dict[@"relistInterval"] = [(SWGObject*)_relistInterval asDictionary];
        }
    }
    if(_inverseLeg != nil) dict[@"inverseLeg"] = _inverseLeg ;
        if(_sellLeg != nil) dict[@"sellLeg"] = _sellLeg ;
        if(_buyLeg != nil) dict[@"buyLeg"] = _buyLeg ;
        if(_underlying != nil) dict[@"underlying"] = _underlying ;
        if(_quoteCurrency != nil) dict[@"quoteCurrency"] = _quoteCurrency ;
        if(_underlyingSymbol != nil) dict[@"underlyingSymbol"] = _underlyingSymbol ;
        if(_reference != nil) dict[@"reference"] = _reference ;
        if(_referenceSymbol != nil) dict[@"referenceSymbol"] = _referenceSymbol ;
        if(_tickSize != nil) dict[@"tickSize"] = _tickSize ;
        if(_multiplier != nil) dict[@"multiplier"] = _multiplier ;
        if(_settlCurrency != nil) dict[@"settlCurrency"] = _settlCurrency ;
        if(_underlyingToSettleMultiplier != nil) dict[@"underlyingToSettleMultiplier"] = _underlyingToSettleMultiplier ;
        if(_quoteToSettleMultiplier != nil) dict[@"quoteToSettleMultiplier"] = _quoteToSettleMultiplier ;
        if(_isQuanto != nil) dict[@"isQuanto"] = _isQuanto ;
        if(_isInverse != nil) dict[@"isInverse"] = _isInverse ;
        if(_initMargin != nil) dict[@"initMargin"] = _initMargin ;
        if(_maintMargin != nil) dict[@"maintMargin"] = _maintMargin ;
        if(_limit != nil) dict[@"limit"] = _limit ;
        if(_makerFee != nil) dict[@"makerFee"] = _makerFee ;
        if(_takerFee != nil) dict[@"takerFee"] = _takerFee ;
        if(_insuranceFee != nil) dict[@"insuranceFee"] = _insuranceFee ;
        if(_hedgerMakerFee != nil) dict[@"hedgerMakerFee"] = _hedgerMakerFee ;
        if(_hedgerTakerFee != nil) dict[@"hedgerTakerFee"] = _hedgerTakerFee ;
        if(_hedgerInsuranceFee != nil) dict[@"hedgerInsuranceFee"] = _hedgerInsuranceFee ;
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
    if(_sessionInterval != nil){
        if([_sessionInterval isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *sessionInterval in (NSArray*)_sessionInterval) {
                [array addObject:[(SWGObject*)sessionInterval asDictionary]];
            }
            dict[@"sessionInterval"] = array;
        }
        else if(_sessionInterval && [_sessionInterval isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_sessionInterval toString];
            if(dateString){
                dict[@"sessionInterval"] = dateString;
            }
        }
        else {
        if(_sessionInterval != nil) dict[@"sessionInterval"] = [(SWGObject*)_sessionInterval asDictionary];
        }
    }
    if(_prevClosePrice != nil) dict[@"prevClosePrice"] = _prevClosePrice ;
        if(_limitDownPrice != nil) dict[@"limitDownPrice"] = _limitDownPrice ;
        if(_limitUpPrice != nil) dict[@"limitUpPrice"] = _limitUpPrice ;
        if(_prevTotalVolume != nil) dict[@"prevTotalVolume"] = _prevTotalVolume ;
        if(_totalVolume != nil) dict[@"totalVolume"] = _totalVolume ;
        if(_volume != nil) dict[@"volume"] = _volume ;
        if(_volume24h != nil) dict[@"volume24h"] = _volume24h ;
        if(_prevTotalTurnover != nil) dict[@"prevTotalTurnover"] = _prevTotalTurnover ;
        if(_totalTurnover != nil) dict[@"totalTurnover"] = _totalTurnover ;
        if(_turnover != nil) dict[@"turnover"] = _turnover ;
        if(_turnover24h != nil) dict[@"turnover24h"] = _turnover24h ;
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
        if(_openValue != nil) dict[@"openValue"] = _openValue ;
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

