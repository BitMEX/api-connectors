#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGOrder : SWGObject

@property(nonatomic) NSString* orderID;  

@property(nonatomic) NSString* clOrdID;  

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSString* side;  

@property(nonatomic) NSNumber* simpleOrderQty;  

@property(nonatomic) NSNumber* orderQty;  

@property(nonatomic) NSNumber* price;  

@property(nonatomic) NSNumber* minQty;  

@property(nonatomic) NSNumber* stopPx;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSString* settlCurrency;  

@property(nonatomic) NSString* ordType;  

@property(nonatomic) NSString* timeInForce;  

@property(nonatomic) NSString* exDestination;  

@property(nonatomic) NSString* ordStatus;  

@property(nonatomic) NSNumber* workingIndicator;  

@property(nonatomic) NSString* ordRejReason;  

@property(nonatomic) NSNumber* simpleLeavesQty;  

@property(nonatomic) NSNumber* leavesQty;  

@property(nonatomic) NSNumber* simpleCumQty;  

@property(nonatomic) NSNumber* cumQty;  

@property(nonatomic) NSNumber* avgPx;  

@property(nonatomic) NSString* multiLegReportingType;  

@property(nonatomic) NSString* text;  

@property(nonatomic) SWGDate* transactTime;  

@property(nonatomic) SWGDate* timestamp;  

- (id) orderID: (NSString*) orderID
     clOrdID: (NSString*) clOrdID
     account: (NSNumber*) account
     symbol: (NSString*) symbol
     side: (NSString*) side
     simpleOrderQty: (NSNumber*) simpleOrderQty
     orderQty: (NSNumber*) orderQty
     price: (NSNumber*) price
     minQty: (NSNumber*) minQty
     stopPx: (NSNumber*) stopPx
     currency: (NSString*) currency
     settlCurrency: (NSString*) settlCurrency
     ordType: (NSString*) ordType
     timeInForce: (NSString*) timeInForce
     exDestination: (NSString*) exDestination
     ordStatus: (NSString*) ordStatus
     workingIndicator: (NSNumber*) workingIndicator
     ordRejReason: (NSString*) ordRejReason
     simpleLeavesQty: (NSNumber*) simpleLeavesQty
     leavesQty: (NSNumber*) leavesQty
     simpleCumQty: (NSNumber*) simpleCumQty
     cumQty: (NSNumber*) cumQty
     avgPx: (NSNumber*) avgPx
     multiLegReportingType: (NSString*) multiLegReportingType
     text: (NSString*) text
     transactTime: (SWGDate*) transactTime
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

