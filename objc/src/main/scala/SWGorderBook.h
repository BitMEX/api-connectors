#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGOrderBook : SWGObject

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSNumber* level;  

@property(nonatomic) NSNumber* bidSize;  

@property(nonatomic) NSNumber* bidPrice;  

@property(nonatomic) NSNumber* askPrice;  

@property(nonatomic) NSNumber* askSize;  

@property(nonatomic) SWGDate* timestamp;  

- (id) symbol: (NSString*) symbol
     level: (NSNumber*) level
     bidSize: (NSNumber*) bidSize
     bidPrice: (NSNumber*) bidPrice
     askPrice: (NSNumber*) askPrice
     askSize: (NSNumber*) askSize
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

