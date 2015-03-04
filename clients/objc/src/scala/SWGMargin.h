#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGMargin : SWGObject

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* commission;  

@property(nonatomic) NSNumber* riskLimit;  

@property(nonatomic) NSString* state;  

@property(nonatomic) NSString* action;  

@property(nonatomic) NSNumber* amount;  

@property(nonatomic) NSNumber* pendingCredit;  

@property(nonatomic) NSNumber* pendingDebit;  

@property(nonatomic) NSNumber* prevRealisedPnl;  

@property(nonatomic) NSNumber* prevUnrealisedPnl;  

@property(nonatomic) NSNumber* grossComm;  

@property(nonatomic) NSNumber* grossOpenCost;  

@property(nonatomic) NSNumber* grossExecCost;  

@property(nonatomic) NSNumber* grossLastValue;  

@property(nonatomic) NSNumber* riskValue;  

@property(nonatomic) NSNumber* initMargin;  

@property(nonatomic) NSNumber* maintMargin;  

@property(nonatomic) NSNumber* sessionMargin;  

@property(nonatomic) NSNumber* targetExcessMargin;  

@property(nonatomic) NSNumber* varMargin;  

@property(nonatomic) NSNumber* realisedPnl;  

@property(nonatomic) NSNumber* unrealisedPnl;  

@property(nonatomic) NSNumber* walletBalance;  

@property(nonatomic) NSNumber* marginBalance;  

@property(nonatomic) NSNumber* marginBalancePcnt;  

@property(nonatomic) NSNumber* marginLeverage;  

@property(nonatomic) NSNumber* marginUsedPcnt;  

@property(nonatomic) NSNumber* excessMargin;  

@property(nonatomic) NSNumber* excessMarginPcnt;  

@property(nonatomic) NSNumber* availableMargin;  

@property(nonatomic) NSNumber* withdrawableMargin;  

@property(nonatomic) SWGDate* timestamp;  

- (id) account: (NSNumber*) account
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
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

