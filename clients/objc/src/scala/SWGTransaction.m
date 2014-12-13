#import "SWGDate.h"
#import "SWGTransaction.h"

@implementation SWGTransaction

-(id)transactID: (NSString*) transactID
    account: (NSNumber*) account
    currency: (NSString*) currency
    transactType: (NSString*) transactType
    amount: (NSNumber*) amount
    transactStatus: (NSString*) transactStatus
    address: (NSString*) address
    tx: (NSString*) tx
    text: (NSString*) text
    transactTime: (SWGDate*) transactTime
    timestamp: (SWGDate*) timestamp
{
  _transactID = transactID;
  _account = account;
  _currency = currency;
  _transactType = transactType;
  _amount = amount;
  _transactStatus = transactStatus;
  _address = address;
  _tx = tx;
  _text = text;
  _transactTime = transactTime;
  _timestamp = timestamp;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _transactID = dict[@"transactID"]; 
        _account = dict[@"account"]; 
        _currency = dict[@"currency"]; 
        _transactType = dict[@"transactType"]; 
        _amount = dict[@"amount"]; 
        _transactStatus = dict[@"transactStatus"]; 
        _address = dict[@"address"]; 
        _tx = dict[@"tx"]; 
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
    if(_transactID != nil) dict[@"transactID"] = _transactID ;
        if(_account != nil) dict[@"account"] = _account ;
        if(_currency != nil) dict[@"currency"] = _currency ;
        if(_transactType != nil) dict[@"transactType"] = _transactType ;
        if(_amount != nil) dict[@"amount"] = _amount ;
        if(_transactStatus != nil) dict[@"transactStatus"] = _transactStatus ;
        if(_address != nil) dict[@"address"] = _address ;
        if(_tx != nil) dict[@"tx"] = _tx ;
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

