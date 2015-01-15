#import "SWGDate.h"
#import "SWGAffiliate.h"

@implementation SWGAffiliate

-(id)account: (NSNumber*) account
    currency: (NSString*) currency
    prevPayout: (NSNumber*) prevPayout
    prevTurnover: (NSNumber*) prevTurnover
    prevComm: (NSNumber*) prevComm
    prevTimestamp: (SWGDate*) prevTimestamp
    execTurnover: (NSNumber*) execTurnover
    execComm: (NSNumber*) execComm
    totalReferrals: (NSNumber*) totalReferrals
    totalTurnover: (NSNumber*) totalTurnover
    totalComm: (NSNumber*) totalComm
    payoutPcnt: (NSNumber*) payoutPcnt
    pendingPayout: (NSNumber*) pendingPayout
    timestamp: (SWGDate*) timestamp
{
  _account = account;
  _currency = currency;
  _prevPayout = prevPayout;
  _prevTurnover = prevTurnover;
  _prevComm = prevComm;
  _prevTimestamp = prevTimestamp;
  _execTurnover = execTurnover;
  _execComm = execComm;
  _totalReferrals = totalReferrals;
  _totalTurnover = totalTurnover;
  _totalComm = totalComm;
  _payoutPcnt = payoutPcnt;
  _pendingPayout = pendingPayout;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _account = dict[@"account"]; 
        _currency = dict[@"currency"]; 
        _prevPayout = dict[@"prevPayout"]; 
        _prevTurnover = dict[@"prevTurnover"]; 
        _prevComm = dict[@"prevComm"]; 
        id prevTimestamp_dict = dict[@"prevTimestamp"];
        if(prevTimestamp_dict != nil)
            _prevTimestamp = [[SWGDate alloc]initWithValues:prevTimestamp_dict];
        _execTurnover = dict[@"execTurnover"]; 
        _execComm = dict[@"execComm"]; 
        _totalReferrals = dict[@"totalReferrals"]; 
        _totalTurnover = dict[@"totalTurnover"]; 
        _totalComm = dict[@"totalComm"]; 
        _payoutPcnt = dict[@"payoutPcnt"]; 
        _pendingPayout = dict[@"pendingPayout"]; 
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
        if(_prevPayout != nil) dict[@"prevPayout"] = _prevPayout ;
        if(_prevTurnover != nil) dict[@"prevTurnover"] = _prevTurnover ;
        if(_prevComm != nil) dict[@"prevComm"] = _prevComm ;
        if(_prevTimestamp != nil){
        if([_prevTimestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *prevTimestamp in (NSArray*)_prevTimestamp) {
                [array addObject:[(SWGObject*)prevTimestamp asDictionary]];
            }
            dict[@"prevTimestamp"] = array;
        }
        else if(_prevTimestamp && [_prevTimestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_prevTimestamp toString];
            if(dateString){
                dict[@"prevTimestamp"] = dateString;
            }
        }
        else {
        if(_prevTimestamp != nil) dict[@"prevTimestamp"] = [(SWGObject*)_prevTimestamp asDictionary];
        }
    }
    if(_execTurnover != nil) dict[@"execTurnover"] = _execTurnover ;
        if(_execComm != nil) dict[@"execComm"] = _execComm ;
        if(_totalReferrals != nil) dict[@"totalReferrals"] = _totalReferrals ;
        if(_totalTurnover != nil) dict[@"totalTurnover"] = _totalTurnover ;
        if(_totalComm != nil) dict[@"totalComm"] = _totalComm ;
        if(_payoutPcnt != nil) dict[@"payoutPcnt"] = _payoutPcnt ;
        if(_pendingPayout != nil) dict[@"pendingPayout"] = _pendingPayout ;
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

