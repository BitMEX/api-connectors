#import "SWGDate.h"
#import "SWGMargin.h"

@implementation SWGMargin

-(id)account: (NSNumber*) account
    currency: (NSString*) currency
    commission: (NSNumber*) commission
    riskLimit: (NSNumber*) riskLimit
    state: (NSString*) state
    action: (NSString*) action
    amount: (NSNumber*) amount
    pendingCredit: (NSNumber*) pendingCredit
    pendingDebit: (NSNumber*) pendingDebit
    prevRealisedPnl: (NSNumber*) prevRealisedPnl
    prevUnrealisedPnl: (NSNumber*) prevUnrealisedPnl
    grossComm: (NSNumber*) grossComm
    grossOpenCost: (NSNumber*) grossOpenCost
    grossExecCost: (NSNumber*) grossExecCost
    grossLastValue: (NSNumber*) grossLastValue
    riskValue: (NSNumber*) riskValue
    initMargin: (NSNumber*) initMargin
    maintMargin: (NSNumber*) maintMargin
    sessionMargin: (NSNumber*) sessionMargin
    targetExcessMargin: (NSNumber*) targetExcessMargin
    varMargin: (NSNumber*) varMargin
    realisedPnl: (NSNumber*) realisedPnl
    unrealisedPnl: (NSNumber*) unrealisedPnl
    walletBalance: (NSNumber*) walletBalance
    marginBalance: (NSNumber*) marginBalance
    marginBalancePcnt: (NSNumber*) marginBalancePcnt
    marginLeverage: (NSNumber*) marginLeverage
    marginUsedPcnt: (NSNumber*) marginUsedPcnt
    excessMargin: (NSNumber*) excessMargin
    excessMarginPcnt: (NSNumber*) excessMarginPcnt
    availableMargin: (NSNumber*) availableMargin
    withdrawableMargin: (NSNumber*) withdrawableMargin
    timestamp: (SWGDate*) timestamp
{
  _account = account;
  _currency = currency;
  _commission = commission;
  _riskLimit = riskLimit;
  _state = state;
  _action = action;
  _amount = amount;
  _pendingCredit = pendingCredit;
  _pendingDebit = pendingDebit;
  _prevRealisedPnl = prevRealisedPnl;
  _prevUnrealisedPnl = prevUnrealisedPnl;
  _grossComm = grossComm;
  _grossOpenCost = grossOpenCost;
  _grossExecCost = grossExecCost;
  _grossLastValue = grossLastValue;
  _riskValue = riskValue;
  _initMargin = initMargin;
  _maintMargin = maintMargin;
  _sessionMargin = sessionMargin;
  _targetExcessMargin = targetExcessMargin;
  _varMargin = varMargin;
  _realisedPnl = realisedPnl;
  _unrealisedPnl = unrealisedPnl;
  _walletBalance = walletBalance;
  _marginBalance = marginBalance;
  _marginBalancePcnt = marginBalancePcnt;
  _marginLeverage = marginLeverage;
  _marginUsedPcnt = marginUsedPcnt;
  _excessMargin = excessMargin;
  _excessMarginPcnt = excessMarginPcnt;
  _availableMargin = availableMargin;
  _withdrawableMargin = withdrawableMargin;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _account = dict[@"account"]; 
        _currency = dict[@"currency"]; 
        _commission = dict[@"commission"]; 
        _riskLimit = dict[@"riskLimit"]; 
        _state = dict[@"state"]; 
        _action = dict[@"action"]; 
        _amount = dict[@"amount"]; 
        _pendingCredit = dict[@"pendingCredit"]; 
        _pendingDebit = dict[@"pendingDebit"]; 
        _prevRealisedPnl = dict[@"prevRealisedPnl"]; 
        _prevUnrealisedPnl = dict[@"prevUnrealisedPnl"]; 
        _grossComm = dict[@"grossComm"]; 
        _grossOpenCost = dict[@"grossOpenCost"]; 
        _grossExecCost = dict[@"grossExecCost"]; 
        _grossLastValue = dict[@"grossLastValue"]; 
        _riskValue = dict[@"riskValue"]; 
        _initMargin = dict[@"initMargin"]; 
        _maintMargin = dict[@"maintMargin"]; 
        _sessionMargin = dict[@"sessionMargin"]; 
        _targetExcessMargin = dict[@"targetExcessMargin"]; 
        _varMargin = dict[@"varMargin"]; 
        _realisedPnl = dict[@"realisedPnl"]; 
        _unrealisedPnl = dict[@"unrealisedPnl"]; 
        _walletBalance = dict[@"walletBalance"]; 
        _marginBalance = dict[@"marginBalance"]; 
        _marginBalancePcnt = dict[@"marginBalancePcnt"]; 
        _marginLeverage = dict[@"marginLeverage"]; 
        _marginUsedPcnt = dict[@"marginUsedPcnt"]; 
        _excessMargin = dict[@"excessMargin"]; 
        _excessMarginPcnt = dict[@"excessMarginPcnt"]; 
        _availableMargin = dict[@"availableMargin"]; 
        _withdrawableMargin = dict[@"withdrawableMargin"]; 
        id timestamp_dict = dict[@"timestamp"];
        if(timestamp_dict != nil)
            _timestamp = [[SWGDate alloc]initWithValues:timestamp_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_account != nil) dict[@"account"] = _account ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_commission != nil) dict[@"commission"] = _commission ;
        if(_riskLimit != nil) dict[@"riskLimit"] = _riskLimit ;
        if(_state != nil) dict[@"state"] = _state ;
        if(_action != nil) dict[@"action"] = _action ;
        if(_amount != nil) dict[@"amount"] = _amount ;
        if(_pendingCredit != nil) dict[@"pendingCredit"] = _pendingCredit ;
        if(_pendingDebit != nil) dict[@"pendingDebit"] = _pendingDebit ;
        if(_prevRealisedPnl != nil) dict[@"prevRealisedPnl"] = _prevRealisedPnl ;
        if(_prevUnrealisedPnl != nil) dict[@"prevUnrealisedPnl"] = _prevUnrealisedPnl ;
        if(_grossComm != nil) dict[@"grossComm"] = _grossComm ;
        if(_grossOpenCost != nil) dict[@"grossOpenCost"] = _grossOpenCost ;
        if(_grossExecCost != nil) dict[@"grossExecCost"] = _grossExecCost ;
        if(_grossLastValue != nil) dict[@"grossLastValue"] = _grossLastValue ;
        if(_riskValue != nil) dict[@"riskValue"] = _riskValue ;
        if(_initMargin != nil) dict[@"initMargin"] = _initMargin ;
        if(_maintMargin != nil) dict[@"maintMargin"] = _maintMargin ;
        if(_sessionMargin != nil) dict[@"sessionMargin"] = _sessionMargin ;
        if(_targetExcessMargin != nil) dict[@"targetExcessMargin"] = _targetExcessMargin ;
        if(_varMargin != nil) dict[@"varMargin"] = _varMargin ;
        if(_realisedPnl != nil) dict[@"realisedPnl"] = _realisedPnl ;
        if(_unrealisedPnl != nil) dict[@"unrealisedPnl"] = _unrealisedPnl ;
        if(_walletBalance != nil) dict[@"walletBalance"] = _walletBalance ;
        if(_marginBalance != nil) dict[@"marginBalance"] = _marginBalance ;
        if(_marginBalancePcnt != nil) dict[@"marginBalancePcnt"] = _marginBalancePcnt ;
        if(_marginLeverage != nil) dict[@"marginLeverage"] = _marginLeverage ;
        if(_marginUsedPcnt != nil) dict[@"marginUsedPcnt"] = _marginUsedPcnt ;
        if(_excessMargin != nil) dict[@"excessMargin"] = _excessMargin ;
        if(_excessMarginPcnt != nil) dict[@"excessMarginPcnt"] = _excessMarginPcnt ;
        if(_availableMargin != nil) dict[@"availableMargin"] = _availableMargin ;
        if(_withdrawableMargin != nil) dict[@"withdrawableMargin"] = _withdrawableMargin ;
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

