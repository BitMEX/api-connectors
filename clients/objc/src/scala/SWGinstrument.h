#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGInstrument : SWGObject

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSString* rootSymbol;  

@property(nonatomic) NSString* state;  

@property(nonatomic) NSString* typ;  

@property(nonatomic) SWGDate* listing;  

@property(nonatomic) SWGDate* front;  

@property(nonatomic) SWGDate* expiry;  

@property(nonatomic) SWGDate* relistInterval;  

@property(nonatomic) NSString* inverseLeg;  

@property(nonatomic) NSString* sellLeg;  

@property(nonatomic) NSString* buyLeg;  

@property(nonatomic) NSString* underlying;  

@property(nonatomic) NSString* quoteCurrency;  

@property(nonatomic) NSString* underlyingSymbol;  

@property(nonatomic) NSString* reference;  

@property(nonatomic) NSString* referenceSymbol;  

@property(nonatomic) NSNumber* tickSize;  

@property(nonatomic) NSNumber* multiplier;  

@property(nonatomic) NSString* settlCurrency;  

@property(nonatomic) NSNumber* underlyingToSettleMultiplier;  

@property(nonatomic) NSNumber* quoteToSettleMultiplier;  

@property(nonatomic) NSNumber* isQuanto;  

@property(nonatomic) NSNumber* isInverse;  

@property(nonatomic) NSNumber* initMargin;  

@property(nonatomic) NSNumber* maintMargin;  

@property(nonatomic) NSNumber* limit;  

@property(nonatomic) NSNumber* makerFee;  

@property(nonatomic) NSNumber* takerFee;  

@property(nonatomic) NSNumber* insuranceFee;  

@property(nonatomic) NSNumber* hedgerMakerFee;  

@property(nonatomic) NSNumber* hedgerTakerFee;  

@property(nonatomic) NSNumber* hedgerInsuranceFee;  

@property(nonatomic) SWGDate* openingTimestamp;  

@property(nonatomic) SWGDate* closingTimestamp;  

@property(nonatomic) SWGDate* sessionInterval;  

@property(nonatomic) NSNumber* prevClosePrice;  

@property(nonatomic) NSNumber* limitDownPrice;  

@property(nonatomic) NSNumber* limitUpPrice;  

@property(nonatomic) NSNumber* prevTotalVolume;  

@property(nonatomic) NSNumber* totalVolume;  

@property(nonatomic) NSNumber* volume;  

@property(nonatomic) NSNumber* volume24h;  

@property(nonatomic) NSNumber* prevTotalTurnover;  

@property(nonatomic) NSNumber* totalTurnover;  

@property(nonatomic) NSNumber* turnover;  

@property(nonatomic) NSNumber* turnover24h;  

@property(nonatomic) NSNumber* vwap;  

@property(nonatomic) NSNumber* highPrice;  

@property(nonatomic) NSNumber* lowPrice;  

@property(nonatomic) NSNumber* lastPrice;  

@property(nonatomic) NSString* lastTickDirection;  

@property(nonatomic) NSNumber* lastChangePcnt;  

@property(nonatomic) NSNumber* bidPrice;  

@property(nonatomic) NSNumber* midPrice;  

@property(nonatomic) NSNumber* askPrice;  

@property(nonatomic) NSNumber* openInterest;  

@property(nonatomic) NSNumber* openValue;  

@property(nonatomic) NSNumber* settledPrice;  

@property(nonatomic) SWGDate* timestamp;  

- (id) symbol: (NSString*) symbol
     rootSymbol: (NSString*) rootSymbol
     state: (NSString*) state
     typ: (NSString*) typ
     listing: (SWGDate*) listing
     front: (SWGDate*) front
     expiry: (SWGDate*) expiry
     relistInterval: (SWGDate*) relistInterval
     inverseLeg: (NSString*) inverseLeg
     sellLeg: (NSString*) sellLeg
     buyLeg: (NSString*) buyLeg
     underlying: (NSString*) underlying
     quoteCurrency: (NSString*) quoteCurrency
     underlyingSymbol: (NSString*) underlyingSymbol
     reference: (NSString*) reference
     referenceSymbol: (NSString*) referenceSymbol
     tickSize: (NSNumber*) tickSize
     multiplier: (NSNumber*) multiplier
     settlCurrency: (NSString*) settlCurrency
     underlyingToSettleMultiplier: (NSNumber*) underlyingToSettleMultiplier
     quoteToSettleMultiplier: (NSNumber*) quoteToSettleMultiplier
     isQuanto: (NSNumber*) isQuanto
     isInverse: (NSNumber*) isInverse
     initMargin: (NSNumber*) initMargin
     maintMargin: (NSNumber*) maintMargin
     limit: (NSNumber*) limit
     makerFee: (NSNumber*) makerFee
     takerFee: (NSNumber*) takerFee
     insuranceFee: (NSNumber*) insuranceFee
     hedgerMakerFee: (NSNumber*) hedgerMakerFee
     hedgerTakerFee: (NSNumber*) hedgerTakerFee
     hedgerInsuranceFee: (NSNumber*) hedgerInsuranceFee
     openingTimestamp: (SWGDate*) openingTimestamp
     closingTimestamp: (SWGDate*) closingTimestamp
     sessionInterval: (SWGDate*) sessionInterval
     prevClosePrice: (NSNumber*) prevClosePrice
     limitDownPrice: (NSNumber*) limitDownPrice
     limitUpPrice: (NSNumber*) limitUpPrice
     prevTotalVolume: (NSNumber*) prevTotalVolume
     totalVolume: (NSNumber*) totalVolume
     volume: (NSNumber*) volume
     volume24h: (NSNumber*) volume24h
     prevTotalTurnover: (NSNumber*) prevTotalTurnover
     totalTurnover: (NSNumber*) totalTurnover
     turnover: (NSNumber*) turnover
     turnover24h: (NSNumber*) turnover24h
     vwap: (NSNumber*) vwap
     highPrice: (NSNumber*) highPrice
     lowPrice: (NSNumber*) lowPrice
     lastPrice: (NSNumber*) lastPrice
     lastTickDirection: (NSString*) lastTickDirection
     lastChangePcnt: (NSNumber*) lastChangePcnt
     bidPrice: (NSNumber*) bidPrice
     midPrice: (NSNumber*) midPrice
     askPrice: (NSNumber*) askPrice
     openInterest: (NSNumber*) openInterest
     openValue: (NSNumber*) openValue
     settledPrice: (NSNumber*) settledPrice
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

