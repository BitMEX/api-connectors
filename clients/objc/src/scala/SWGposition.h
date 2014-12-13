#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGPosition : SWGObject

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* commission;  

@property(nonatomic) NSNumber* prevRealisedPnl;  

@property(nonatomic) NSNumber* prevUnrealisedPnl;  

@property(nonatomic) NSNumber* prevClosePrice;  

@property(nonatomic) NSNumber* realisedCost;  

@property(nonatomic) NSNumber* realisedPnl;  

@property(nonatomic) SWGDate* openingTimestamp;  

@property(nonatomic) NSNumber* openingQty;  

@property(nonatomic) NSNumber* openingCost;  

@property(nonatomic) NSNumber* openingComm;  

@property(nonatomic) NSNumber* openOrderBuyQty;  

@property(nonatomic) NSNumber* openOrderBuyCost;  

@property(nonatomic) NSNumber* openOrderSellQty;  

@property(nonatomic) NSNumber* openOrderSellCost;  

@property(nonatomic) NSNumber* execBuyQty;  

@property(nonatomic) NSNumber* execBuyCost;  

@property(nonatomic) NSNumber* execSellQty;  

@property(nonatomic) NSNumber* execSellCost;  

@property(nonatomic) NSNumber* execQty;  

@property(nonatomic) NSNumber* execCost;  

@property(nonatomic) NSNumber* execComm;  

@property(nonatomic) SWGDate* currentTimestamp;  

@property(nonatomic) NSNumber* currentQty;  

@property(nonatomic) NSNumber* currentCost;  

@property(nonatomic) NSNumber* currentComm;  

@property(nonatomic) NSNumber* unrealisedCost;  

@property(nonatomic) NSNumber* grossOpenCost;  

@property(nonatomic) NSNumber* grossExecCost;  

@property(nonatomic) NSNumber* lastPrice;  

@property(nonatomic) NSNumber* lastValue;  

@property(nonatomic) NSString* notionalCurrency1;  

@property(nonatomic) NSNumber* notionalValue1;  

@property(nonatomic) NSString* notionalCurrency2;  

@property(nonatomic) NSNumber* notionalValue2;  

@property(nonatomic) NSNumber* initMargin;  

@property(nonatomic) NSNumber* maintMargin;  

@property(nonatomic) NSNumber* sessionMargin;  

@property(nonatomic) NSNumber* targetExcessMargin;  

@property(nonatomic) NSNumber* varMargin;  

@property(nonatomic) NSNumber* unrealisedPnl;  

@property(nonatomic) NSNumber* unrealisedPnlPcnt;  

@property(nonatomic) NSNumber* avgEntryPrice;  

@property(nonatomic) NSNumber* breakEvenPrice;  

@property(nonatomic) NSNumber* marginCallPrice;  

@property(nonatomic) NSNumber* liquidationPrice;  

@property(nonatomic) NSNumber* bankruptPrice;  

@property(nonatomic) SWGDate* timestamp;  

- (id) account: (NSNumber*) account
     symbol: (NSString*) symbol
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
     notionalCurrency1: (NSString*) notionalCurrency1
     notionalValue1: (NSNumber*) notionalValue1
     notionalCurrency2: (NSString*) notionalCurrency2
     notionalValue2: (NSNumber*) notionalValue2
     initMargin: (NSNumber*) initMargin
     maintMargin: (NSNumber*) maintMargin
     sessionMargin: (NSNumber*) sessionMargin
     targetExcessMargin: (NSNumber*) targetExcessMargin
     varMargin: (NSNumber*) varMargin
     unrealisedPnl: (NSNumber*) unrealisedPnl
     unrealisedPnlPcnt: (NSNumber*) unrealisedPnlPcnt
     avgEntryPrice: (NSNumber*) avgEntryPrice
     breakEvenPrice: (NSNumber*) breakEvenPrice
     marginCallPrice: (NSNumber*) marginCallPrice
     liquidationPrice: (NSNumber*) liquidationPrice
     bankruptPrice: (NSNumber*) bankruptPrice
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

