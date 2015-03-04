#import "SWGDate.h"
#import "SWGPosition.h"

@implementation SWGPosition

-(id)account: (NSNumber*) account
    symbol: (NSString*) symbol
    underlying: (NSString*) underlying
    quoteCurrency: (NSString*) quoteCurrency
    currency: (NSString*) currency
    commission: (NSNumber*) commission
    prevRealisedPnl: (NSNumber*) prevRealisedPnl
    prevUnrealisedPnl: (NSNumber*) prevUnrealisedPnl
    prevClosePrice: (NSNumber*) prevClosePrice
    realisedCost: (NSNumber*) realisedCost
    realisedPnl: (NSNumber*) realisedPnl
    openingTimestamp: (SWGDate*) openingTimestamp
    openingQty: (NSNumber*) openingQty
    openingCost: (NSNumber*) openingCost
    openingComm: (NSNumber*) openingComm
    openOrderBuyQty: (NSNumber*) openOrderBuyQty
    openOrderBuyCost: (NSNumber*) openOrderBuyCost
    openOrderSellQty: (NSNumber*) openOrderSellQty
    openOrderSellCost: (NSNumber*) openOrderSellCost
    execBuyQty: (NSNumber*) execBuyQty
    execBuyCost: (NSNumber*) execBuyCost
    execSellQty: (NSNumber*) execSellQty
    execSellCost: (NSNumber*) execSellCost
    execQty: (NSNumber*) execQty
    execCost: (NSNumber*) execCost
    execComm: (NSNumber*) execComm
    currentTimestamp: (SWGDate*) currentTimestamp
    currentQty: (NSNumber*) currentQty
    currentCost: (NSNumber*) currentCost
    currentComm: (NSNumber*) currentComm
    unrealisedCost: (NSNumber*) unrealisedCost
    grossOpenCost: (NSNumber*) grossOpenCost
    grossExecCost: (NSNumber*) grossExecCost
    lastPrice: (NSNumber*) lastPrice
    lastValue: (NSNumber*) lastValue
    homeNotional: (NSNumber*) homeNotional
    foreignNotional: (NSNumber*) foreignNotional
    initMargin: (NSNumber*) initMargin
    maintMargin: (NSNumber*) maintMargin
    sessionMargin: (NSNumber*) sessionMargin
    targetExcessMargin: (NSNumber*) targetExcessMargin
    varMargin: (NSNumber*) varMargin
    unrealisedPnl: (NSNumber*) unrealisedPnl
    unrealisedPnlPcnt: (NSNumber*) unrealisedPnlPcnt
    simpleQty: (NSNumber*) simpleQty
    simpleCost: (NSNumber*) simpleCost
    simpleValue: (NSNumber*) simpleValue
    simplePnl: (NSNumber*) simplePnl
    simplePnlPcnt: (NSNumber*) simplePnlPcnt
    avgEntryPrice: (NSNumber*) avgEntryPrice
    breakEvenPrice: (NSNumber*) breakEvenPrice
    marginCallPrice: (NSNumber*) marginCallPrice
    liquidationPrice: (NSNumber*) liquidationPrice
    bankruptPrice: (NSNumber*) bankruptPrice
    timestamp: (SWGDate*) timestamp
{
  _account = account;
  _symbol = symbol;
  _underlying = underlying;
  _quoteCurrency = quoteCurrency;
  _currency = currency;
  _commission = commission;
  _prevRealisedPnl = prevRealisedPnl;
  _prevUnrealisedPnl = prevUnrealisedPnl;
  _prevClosePrice = prevClosePrice;
  _realisedCost = realisedCost;
  _realisedPnl = realisedPnl;
  _openingTimestamp = openingTimestamp;
  _openingQty = openingQty;
  _openingCost = openingCost;
  _openingComm = openingComm;
  _openOrderBuyQty = openOrderBuyQty;
  _openOrderBuyCost = openOrderBuyCost;
  _openOrderSellQty = openOrderSellQty;
  _openOrderSellCost = openOrderSellCost;
  _execBuyQty = execBuyQty;
  _execBuyCost = execBuyCost;
  _execSellQty = execSellQty;
  _execSellCost = execSellCost;
  _execQty = execQty;
  _execCost = execCost;
  _execComm = execComm;
  _currentTimestamp = currentTimestamp;
  _currentQty = currentQty;
  _currentCost = currentCost;
  _currentComm = currentComm;
  _unrealisedCost = unrealisedCost;
  _grossOpenCost = grossOpenCost;
  _grossExecCost = grossExecCost;
  _lastPrice = lastPrice;
  _lastValue = lastValue;
  _homeNotional = homeNotional;
  _foreignNotional = foreignNotional;
  _initMargin = initMargin;
  _maintMargin = maintMargin;
  _sessionMargin = sessionMargin;
  _targetExcessMargin = targetExcessMargin;
  _varMargin = varMargin;
  _unrealisedPnl = unrealisedPnl;
  _unrealisedPnlPcnt = unrealisedPnlPcnt;
  _simpleQty = simpleQty;
  _simpleCost = simpleCost;
  _simpleValue = simpleValue;
  _simplePnl = simplePnl;
  _simplePnlPcnt = simplePnlPcnt;
  _avgEntryPrice = avgEntryPrice;
  _breakEvenPrice = breakEvenPrice;
  _marginCallPrice = marginCallPrice;
  _liquidationPrice = liquidationPrice;
  _bankruptPrice = bankruptPrice;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _account = dict[@"account"]; 
        _symbol = dict[@"symbol"]; 
        _underlying = dict[@"underlying"]; 
        _quoteCurrency = dict[@"quoteCurrency"]; 
        _currency = dict[@"currency"]; 
        _commission = dict[@"commission"]; 
        _prevRealisedPnl = dict[@"prevRealisedPnl"]; 
        _prevUnrealisedPnl = dict[@"prevUnrealisedPnl"]; 
        _prevClosePrice = dict[@"prevClosePrice"]; 
        _realisedCost = dict[@"realisedCost"]; 
        _realisedPnl = dict[@"realisedPnl"]; 
        id openingTimestamp_dict = dict[@"openingTimestamp"];
        if(openingTimestamp_dict != nil)
            _openingTimestamp = [[SWGDate alloc]initWithValues:openingTimestamp_dict];
        _openingQty = dict[@"openingQty"]; 
        _openingCost = dict[@"openingCost"]; 
        _openingComm = dict[@"openingComm"]; 
        _openOrderBuyQty = dict[@"openOrderBuyQty"]; 
        _openOrderBuyCost = dict[@"openOrderBuyCost"]; 
        _openOrderSellQty = dict[@"openOrderSellQty"]; 
        _openOrderSellCost = dict[@"openOrderSellCost"]; 
        _execBuyQty = dict[@"execBuyQty"]; 
        _execBuyCost = dict[@"execBuyCost"]; 
        _execSellQty = dict[@"execSellQty"]; 
        _execSellCost = dict[@"execSellCost"]; 
        _execQty = dict[@"execQty"]; 
        _execCost = dict[@"execCost"]; 
        _execComm = dict[@"execComm"]; 
        id currentTimestamp_dict = dict[@"currentTimestamp"];
        if(currentTimestamp_dict != nil)
            _currentTimestamp = [[SWGDate alloc]initWithValues:currentTimestamp_dict];
        _currentQty = dict[@"currentQty"]; 
        _currentCost = dict[@"currentCost"]; 
        _currentComm = dict[@"currentComm"]; 
        _unrealisedCost = dict[@"unrealisedCost"]; 
        _grossOpenCost = dict[@"grossOpenCost"]; 
        _grossExecCost = dict[@"grossExecCost"]; 
        _lastPrice = dict[@"lastPrice"]; 
        _lastValue = dict[@"lastValue"]; 
        _homeNotional = dict[@"homeNotional"]; 
        _foreignNotional = dict[@"foreignNotional"]; 
        _initMargin = dict[@"initMargin"]; 
        _maintMargin = dict[@"maintMargin"]; 
        _sessionMargin = dict[@"sessionMargin"]; 
        _targetExcessMargin = dict[@"targetExcessMargin"]; 
        _varMargin = dict[@"varMargin"]; 
        _unrealisedPnl = dict[@"unrealisedPnl"]; 
        _unrealisedPnlPcnt = dict[@"unrealisedPnlPcnt"]; 
        _simpleQty = dict[@"simpleQty"]; 
        _simpleCost = dict[@"simpleCost"]; 
        _simpleValue = dict[@"simpleValue"]; 
        _simplePnl = dict[@"simplePnl"]; 
        _simplePnlPcnt = dict[@"simplePnlPcnt"]; 
        _avgEntryPrice = dict[@"avgEntryPrice"]; 
        _breakEvenPrice = dict[@"breakEvenPrice"]; 
        _marginCallPrice = dict[@"marginCallPrice"]; 
        _liquidationPrice = dict[@"liquidationPrice"]; 
        _bankruptPrice = dict[@"bankruptPrice"]; 
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_account != nil) dict[@"account"] = _account ;
        if(_symbol != nil) dict[@"symbol"] = _symbol ;
        if(_underlying != nil) dict[@"underlying"] = _underlying ;
        if(_quoteCurrency != nil) dict[@"quoteCurrency"] = _quoteCurrency ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_commission != nil) dict[@"commission"] = _commission ;
        if(_prevRealisedPnl != nil) dict[@"prevRealisedPnl"] = _prevRealisedPnl ;
        if(_prevUnrealisedPnl != nil) dict[@"prevUnrealisedPnl"] = _prevUnrealisedPnl ;
        if(_prevClosePrice != nil) dict[@"prevClosePrice"] = _prevClosePrice ;
        if(_realisedCost != nil) dict[@"realisedCost"] = _realisedCost ;
        if(_realisedPnl != nil) dict[@"realisedPnl"] = _realisedPnl ;
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
    if(_openingQty != nil) dict[@"openingQty"] = _openingQty ;
        if(_openingCost != nil) dict[@"openingCost"] = _openingCost ;
        if(_openingComm != nil) dict[@"openingComm"] = _openingComm ;
        if(_openOrderBuyQty != nil) dict[@"openOrderBuyQty"] = _openOrderBuyQty ;
        if(_openOrderBuyCost != nil) dict[@"openOrderBuyCost"] = _openOrderBuyCost ;
        if(_openOrderSellQty != nil) dict[@"openOrderSellQty"] = _openOrderSellQty ;
        if(_openOrderSellCost != nil) dict[@"openOrderSellCost"] = _openOrderSellCost ;
        if(_execBuyQty != nil) dict[@"execBuyQty"] = _execBuyQty ;
        if(_execBuyCost != nil) dict[@"execBuyCost"] = _execBuyCost ;
        if(_execSellQty != nil) dict[@"execSellQty"] = _execSellQty ;
        if(_execSellCost != nil) dict[@"execSellCost"] = _execSellCost ;
        if(_execQty != nil) dict[@"execQty"] = _execQty ;
        if(_execCost != nil) dict[@"execCost"] = _execCost ;
        if(_execComm != nil) dict[@"execComm"] = _execComm ;
        if(_currentTimestamp != nil){
        if([_currentTimestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *currentTimestamp in (NSArray*)_currentTimestamp) {
                [array addObject:[(SWGObject*)currentTimestamp asDictionary]];
            }
            dict[@"currentTimestamp"] = array;
        }
        else if(_currentTimestamp && [_currentTimestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_currentTimestamp toString];
            if(dateString){
                dict[@"currentTimestamp"] = dateString;
            }
        }
        else {
        if(_currentTimestamp != nil) dict[@"currentTimestamp"] = [(SWGObject*)_currentTimestamp asDictionary];
        }
    }
    if(_currentQty != nil) dict[@"currentQty"] = _currentQty ;
        if(_currentCost != nil) dict[@"currentCost"] = _currentCost ;
        if(_currentComm != nil) dict[@"currentComm"] = _currentComm ;
        if(_unrealisedCost != nil) dict[@"unrealisedCost"] = _unrealisedCost ;
        if(_grossOpenCost != nil) dict[@"grossOpenCost"] = _grossOpenCost ;
        if(_grossExecCost != nil) dict[@"grossExecCost"] = _grossExecCost ;
        if(_lastPrice != nil) dict[@"lastPrice"] = _lastPrice ;
        if(_lastValue != nil) dict[@"lastValue"] = _lastValue ;
        if(_homeNotional != nil) dict[@"homeNotional"] = _homeNotional ;
        if(_foreignNotional != nil) dict[@"foreignNotional"] = _foreignNotional ;
        if(_initMargin != nil) dict[@"initMargin"] = _initMargin ;
        if(_maintMargin != nil) dict[@"maintMargin"] = _maintMargin ;
        if(_sessionMargin != nil) dict[@"sessionMargin"] = _sessionMargin ;
        if(_targetExcessMargin != nil) dict[@"targetExcessMargin"] = _targetExcessMargin ;
        if(_varMargin != nil) dict[@"varMargin"] = _varMargin ;
        if(_unrealisedPnl != nil) dict[@"unrealisedPnl"] = _unrealisedPnl ;
        if(_unrealisedPnlPcnt != nil) dict[@"unrealisedPnlPcnt"] = _unrealisedPnlPcnt ;
        if(_simpleQty != nil) dict[@"simpleQty"] = _simpleQty ;
        if(_simpleCost != nil) dict[@"simpleCost"] = _simpleCost ;
        if(_simpleValue != nil) dict[@"simpleValue"] = _simpleValue ;
        if(_simplePnl != nil) dict[@"simplePnl"] = _simplePnl ;
        if(_simplePnlPcnt != nil) dict[@"simplePnlPcnt"] = _simplePnlPcnt ;
        if(_avgEntryPrice != nil) dict[@"avgEntryPrice"] = _avgEntryPrice ;
        if(_breakEvenPrice != nil) dict[@"breakEvenPrice"] = _breakEvenPrice ;
        if(_marginCallPrice != nil) dict[@"marginCallPrice"] = _marginCallPrice ;
        if(_liquidationPrice != nil) dict[@"liquidationPrice"] = _liquidationPrice ;
        if(_bankruptPrice != nil) dict[@"bankruptPrice"] = _bankruptPrice ;
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

