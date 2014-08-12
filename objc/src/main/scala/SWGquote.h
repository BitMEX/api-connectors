#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGQuote : SWGObject

@property(nonatomic) SWGDate* timestamp;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSNumber* bidSize;  

@property(nonatomic) NSNumber* bidPrice;  

@property(nonatomic) NSNumber* askPrice;  

@property(nonatomic) NSNumber* askSize;  

@property(nonatomic) NSNumber* _id;  

- (id) timestamp: (SWGDate*) timestamp
     symbol: (NSString*) symbol
     bidSize: (NSNumber*) bidSize
     bidPrice: (NSNumber*) bidPrice
     askPrice: (NSNumber*) askPrice
     askSize: (NSNumber*) askSize
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

