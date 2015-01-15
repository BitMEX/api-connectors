#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGAffiliate : SWGObject

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* prevPayout;  

@property(nonatomic) NSNumber* prevTurnover;  

@property(nonatomic) NSNumber* prevComm;  

@property(nonatomic) SWGDate* prevTimestamp;  

@property(nonatomic) NSNumber* execTurnover;  

@property(nonatomic) NSNumber* execComm;  

@property(nonatomic) NSNumber* totalReferrals;  

@property(nonatomic) NSNumber* totalTurnover;  

@property(nonatomic) NSNumber* totalComm;  

@property(nonatomic) NSNumber* payoutPcnt;  

@property(nonatomic) NSNumber* pendingPayout;  

@property(nonatomic) SWGDate* timestamp;  

- (id) account: (NSNumber*) account
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
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

