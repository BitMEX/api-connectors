#import "SWGDate.h"
#import "SWGPosition.h"

@implementation SWGPosition

-(id)account: (NSNumber*) account
    symbol: (NSString*) symbol
    currency: (NSString*) currency
    prevPnl: (NSNumber*) prevPnl
    prevClosePrice: (NSNumber*) prevClosePrice
    openingTimestamp: (SWGDate*) openingTimestamp
    openingBuyQty: (NSNumber*) openingBuyQty
    openingBuyCost: (NSNumber*) openingBuyCost
    openingSellQty: (NSNumber*) openingSellQty
    openingSellCost: (NSNumber*) openingSellCost
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
    currentBuyQty: (NSNumber*) currentBuyQty
    currentBuyCost: (NSNumber*) currentBuyCost
    currentSellQty: (NSNumber*) currentSellQty
    currentSellCost: (NSNumber*) currentSellCost
    currentQty: (NSNumber*) currentQty
    currentCost: (NSNumber*) currentCost
    currentComm: (NSNumber*) currentComm
    grossOpenCost: (NSNumber*) grossOpenCost
    grossExecCost: (NSNumber*) grossExecCost
    lastPrice: (NSNumber*) lastPrice
    lastValue: (NSNumber*) lastValue
    initMargin: (NSNumber*) initMargin
    maintMargin: (NSNumber*) maintMargin
    sessionMargin: (NSNumber*) sessionMargin
    targetExcessMargin: (NSNumber*) targetExcessMargin
    varMargin: (NSNumber*) varMargin
    pnl: (NSNumber*) pnl
    pnlPcnt: (NSNumber*) pnlPcnt
    avgBuyPrice: (NSNumber*) avgBuyPrice
    avgSellPrice: (NSNumber*) avgSellPrice
    avgEntryPrice: (NSNumber*) avgEntryPrice
    breakEvenPrice: (NSNumber*) breakEvenPrice
    marginCallPrice: (NSNumber*) marginCallPrice
    liquidationPrice: (NSNumber*) liquidationPrice
    bankruptPrice: (NSNumber*) bankruptPrice
    timestamp: (SWGDate*) timestamp
{
  _account = account;
  _symbol = symbol;
  _currency = currency;
  _prevPnl = prevPnl;
  _prevClosePrice = prevClosePrice;
  _openingTimestamp = openingTimestamp;
  _openingBuyQty = openingBuyQty;
  _openingBuyCost = openingBuyCost;
  _openingSellQty = openingSellQty;
  _openingSellCost = openingSellCost;
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
  _currentBuyQty = currentBuyQty;
  _currentBuyCost = currentBuyCost;
  _currentSellQty = currentSellQty;
  _currentSellCost = currentSellCost;
  _currentQty = currentQty;
  _currentCost = currentCost;
  _currentComm = currentComm;
  _grossOpenCost = grossOpenCost;
  _grossExecCost = grossExecCost;
  _lastPrice = lastPrice;
  _lastValue = lastValue;
  _initMargin = initMargin;
  _maintMargin = maintMargin;
  _sessionMargin = sessionMargin;
  _targetExcessMargin = targetExcessMargin;
  _varMargin = varMargin;
  _pnl = pnl;
  _pnlPcnt = pnlPcnt;
  _avgBuyPrice = avgBuyPrice;
  _avgSellPrice = avgSellPrice;
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
        _currency = dict[@"currency"]; 
        _prevPnl = dict[@"prevPnl"]; 
        _prevClosePrice = dict[@"prevClosePrice"]; 
        id openingTimestamp_dict = dict[@"openingTimestamp"];
        if(openingTimestamp_dict != nil)
            _openingTimestamp = [[SWGDate alloc]initWithValues:openingTimestamp_dict];
        _openingBuyQty = dict[@"openingBuyQty"]; 
        _openingBuyCost = dict[@"openingBuyCost"]; 
        _openingSellQty = dict[@"openingSellQty"]; 
        _openingSellCost = dict[@"openingSellCost"]; 
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
        _currentBuyQty = dict[@"currentBuyQty"]; 
        _currentBuyCost = dict[@"currentBuyCost"]; 
        _currentSellQty = dict[@"currentSellQty"]; 
        _currentSellCost = dict[@"currentSellCost"]; 
        _currentQty = dict[@"currentQty"]; 
        _currentCost = dict[@"currentCost"]; 
        _currentComm = dict[@"currentComm"]; 
        _grossOpenCost = dict[@"grossOpenCost"]; 
        _grossExecCost = dict[@"grossExecCost"]; 
        _lastPrice = dict[@"lastPrice"]; 
        _lastValue = dict[@"lastValue"]; 
        _initMargin = dict[@"initMargin"]; 
        _maintMargin = dict[@"maintMargin"]; 
        _sessionMargin = dict[@"sessionMargin"]; 
        _targetExcessMargin = dict[@"targetExcessMargin"]; 
        _varMargin = dict[@"varMargin"]; 
        _pnl = dict[@"pnl"]; 
        _pnlPcnt = dict[@"pnlPcnt"]; 
        _avgBuyPrice = dict[@"avgBuyPrice"]; 
        _avgSellPrice = dict[@"avgSellPrice"]; 
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
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_prevPnl != nil) dict[@"prevPnl"] = _prevPnl ;
        if(_prevClosePrice != nil) dict[@"prevClosePrice"] = _prevClosePrice ;
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
    if(_openingBuyQty != nil) dict[@"openingBuyQty"] = _openingBuyQty ;
        if(_openingBuyCost != nil) dict[@"openingBuyCost"] = _openingBuyCost ;
        if(_openingSellQty != nil) dict[@"openingSellQty"] = _openingSellQty ;
        if(_openingSellCost != nil) dict[@"openingSellCost"] = _openingSellCost ;
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
    if(_currentBuyQty != nil) dict[@"currentBuyQty"] = _currentBuyQty ;
        if(_currentBuyCost != nil) dict[@"currentBuyCost"] = _currentBuyCost ;
        if(_currentSellQty != nil) dict[@"currentSellQty"] = _currentSellQty ;
        if(_currentSellCost != nil) dict[@"currentSellCost"] = _currentSellCost ;
        if(_currentQty != nil) dict[@"currentQty"] = _currentQty ;
        if(_currentCost != nil) dict[@"currentCost"] = _currentCost ;
        if(_currentComm != nil) dict[@"currentComm"] = _currentComm ;
        if(_grossOpenCost != nil) dict[@"grossOpenCost"] = _grossOpenCost ;
        if(_grossExecCost != nil) dict[@"grossExecCost"] = _grossExecCost ;
        if(_lastPrice != nil) dict[@"lastPrice"] = _lastPrice ;
        if(_lastValue != nil) dict[@"lastValue"] = _lastValue ;
        if(_initMargin != nil) dict[@"initMargin"] = _initMargin ;
        if(_maintMargin != nil) dict[@"maintMargin"] = _maintMargin ;
        if(_sessionMargin != nil) dict[@"sessionMargin"] = _sessionMargin ;
        if(_targetExcessMargin != nil) dict[@"targetExcessMargin"] = _targetExcessMargin ;
        if(_varMargin != nil) dict[@"varMargin"] = _varMargin ;
        if(_pnl != nil) dict[@"pnl"] = _pnl ;
        if(_pnlPcnt != nil) dict[@"pnlPcnt"] = _pnlPcnt ;
        if(_avgBuyPrice != nil) dict[@"avgBuyPrice"] = _avgBuyPrice ;
        if(_avgSellPrice != nil) dict[@"avgSellPrice"] = _avgSellPrice ;
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

