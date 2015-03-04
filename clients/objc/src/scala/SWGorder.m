#import "SWGDate.h"
#import "SWGOrder.h"

@implementation SWGOrder

-(id)orderID: (NSString*) orderID
    clOrdID: (NSString*) clOrdID
    account: (NSNumber*) account
    symbol: (NSString*) symbol
    side: (NSString*) side
    simpleOrderQty: (NSNumber*) simpleOrderQty
    orderQty: (NSNumber*) orderQty
    price: (NSNumber*) price
    minQty: (NSNumber*) minQty
    stopPx: (NSNumber*) stopPx
    currency: (NSString*) currency
    settlCurrency: (NSString*) settlCurrency
    ordType: (NSString*) ordType
    timeInForce: (NSString*) timeInForce
    exDestination: (NSString*) exDestination
    ordStatus: (NSString*) ordStatus
    workingIndicator: (NSNumber*) workingIndicator
    ordRejReason: (NSString*) ordRejReason
    simpleLeavesQty: (NSNumber*) simpleLeavesQty
    leavesQty: (NSNumber*) leavesQty
    simpleCumQty: (NSNumber*) simpleCumQty
    cumQty: (NSNumber*) cumQty
    avgPx: (NSNumber*) avgPx
    multiLegReportingType: (NSString*) multiLegReportingType
    text: (NSString*) text
    transactTime: (SWGDate*) transactTime
    timestamp: (SWGDate*) timestamp
{
  _orderID = orderID;
  _clOrdID = clOrdID;
  _account = account;
  _symbol = symbol;
  _side = side;
  _simpleOrderQty = simpleOrderQty;
  _orderQty = orderQty;
  _price = price;
  _minQty = minQty;
  _stopPx = stopPx;
  _currency = currency;
  _settlCurrency = settlCurrency;
  _ordType = ordType;
  _timeInForce = timeInForce;
  _exDestination = exDestination;
  _ordStatus = ordStatus;
  _workingIndicator = workingIndicator;
  _ordRejReason = ordRejReason;
  _simpleLeavesQty = simpleLeavesQty;
  _leavesQty = leavesQty;
  _simpleCumQty = simpleCumQty;
  _cumQty = cumQty;
  _avgPx = avgPx;
  _multiLegReportingType = multiLegReportingType;
  _text = text;
  _transactTime = transactTime;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _orderID = dict[@"orderID"]; 
        _clOrdID = dict[@"clOrdID"]; 
        _account = dict[@"account"]; 
        _symbol = dict[@"symbol"]; 
        _side = dict[@"side"]; 
        _simpleOrderQty = dict[@"simpleOrderQty"]; 
        _orderQty = dict[@"orderQty"]; 
        _price = dict[@"price"]; 
        _minQty = dict[@"minQty"]; 
        _stopPx = dict[@"stopPx"]; 
        _currency = dict[@"currency"]; 
        _settlCurrency = dict[@"settlCurrency"]; 
        _ordType = dict[@"ordType"]; 
        _timeInForce = dict[@"timeInForce"]; 
        _exDestination = dict[@"exDestination"]; 
        _ordStatus = dict[@"ordStatus"]; 
        _workingIndicator = dict[@"workingIndicator"]; 
        _ordRejReason = dict[@"ordRejReason"]; 
        _simpleLeavesQty = dict[@"simpleLeavesQty"]; 
        _leavesQty = dict[@"leavesQty"]; 
        _simpleCumQty = dict[@"simpleCumQty"]; 
        _cumQty = dict[@"cumQty"]; 
        _avgPx = dict[@"avgPx"]; 
        _multiLegReportingType = dict[@"multiLegReportingType"]; 
        _text = dict[@"text"]; 
        id transactTime_dict = dict[@"transactTime"];
        if(transactTime_dict != nil)
            _transactTime = [[SWGDate alloc]initWithValues:transactTime_dict];
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_orderID != nil) dict[@"orderID"] = _orderID ;
        if(_clOrdID != nil) dict[@"clOrdID"] = _clOrdID ;
        if(_account != nil) dict[@"account"] = _account ;
        if(_symbol != nil) dict[@"symbol"] = _symbol ;
        if(_side != nil) dict[@"side"] = _side ;
        if(_simpleOrderQty != nil) dict[@"simpleOrderQty"] = _simpleOrderQty ;
        if(_orderQty != nil) dict[@"orderQty"] = _orderQty ;
        if(_price != nil) dict[@"price"] = _price ;
        if(_minQty != nil) dict[@"minQty"] = _minQty ;
        if(_stopPx != nil) dict[@"stopPx"] = _stopPx ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_settlCurrency != nil) dict[@"settlCurrency"] = _settlCurrency ;
        if(_ordType != nil) dict[@"ordType"] = _ordType ;
        if(_timeInForce != nil) dict[@"timeInForce"] = _timeInForce ;
        if(_exDestination != nil) dict[@"exDestination"] = _exDestination ;
        if(_ordStatus != nil) dict[@"ordStatus"] = _ordStatus ;
        if(_workingIndicator != nil) dict[@"workingIndicator"] = _workingIndicator ;
        if(_ordRejReason != nil) dict[@"ordRejReason"] = _ordRejReason ;
        if(_simpleLeavesQty != nil) dict[@"simpleLeavesQty"] = _simpleLeavesQty ;
        if(_leavesQty != nil) dict[@"leavesQty"] = _leavesQty ;
        if(_simpleCumQty != nil) dict[@"simpleCumQty"] = _simpleCumQty ;
        if(_cumQty != nil) dict[@"cumQty"] = _cumQty ;
        if(_avgPx != nil) dict[@"avgPx"] = _avgPx ;
        if(_multiLegReportingType != nil) dict[@"multiLegReportingType"] = _multiLegReportingType ;
        if(_text != nil) dict[@"text"] = _text ;
        if(_transactTime != nil){
        if([_transactTime isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *transactTime in (NSArray*)_transactTime) {
                [array addObject:[(SWGObject*)transactTime asDictionary]];
            }
            dict[@"transactTime"] = array;
        }
        else if(_transactTime && [_transactTime isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_transactTime toString];
            if(dateString){
                dict[@"transactTime"] = dateString;
            }
        }
        else {
        if(_transactTime != nil) dict[@"transactTime"] = [(SWGObject*)_transactTime asDictionary];
        }
    }
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

