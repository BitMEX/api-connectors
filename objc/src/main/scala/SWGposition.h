#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGPosition : SWGObject

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* prevPnl;  

@property(nonatomic) NSNumber* prevClosePrice;  

@property(nonatomic) SWGDate* openingTimestamp;  

@property(nonatomic) NSNumber* openingBuyQty;  

@property(nonatomic) NSNumber* openingBuyCost;  

@property(nonatomic) NSNumber* openingSellQty;  

@property(nonatomic) NSNumber* openingSellCost;  

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

@property(nonatomic) NSNumber* currentBuyQty;  

@property(nonatomic) NSNumber* currentBuyCost;  

@property(nonatomic) NSNumber* currentSellQty;  

@property(nonatomic) NSNumber* currentSellCost;  

@property(nonatomic) NSNumber* currentQty;  

@property(nonatomic) NSNumber* currentCost;  

@property(nonatomic) NSNumber* currentComm;  

@property(nonatomic) NSNumber* grossOpenCost;  

@property(nonatomic) NSNumber* grossExecCost;  

@property(nonatomic) NSNumber* lastPrice;  

@property(nonatomic) NSNumber* lastValue;  

@property(nonatomic) NSNumber* initMargin;  

@property(nonatomic) NSNumber* maintMargin;  

@property(nonatomic) NSNumber* sessionMargin;  

@property(nonatomic) NSNumber* targetExcessMargin;  

@property(nonatomic) NSNumber* varMargin;  

@property(nonatomic) NSNumber* pnl;  

@property(nonatomic) NSNumber* pnlPcnt;  

@property(nonatomic) NSNumber* avgBuyPrice;  

@property(nonatomic) NSNumber* avgSellPrice;  

@property(nonatomic) NSNumber* avgEntryPrice;  

@property(nonatomic) NSNumber* breakEvenPrice;  

@property(nonatomic) NSNumber* marginCallPrice;  

@property(nonatomic) NSNumber* liquidationPrice;  

@property(nonatomic) NSNumber* bankruptPrice;  

@property(nonatomic) SWGDate* timestamp;  

- (id) account: (NSNumber*) account
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
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

