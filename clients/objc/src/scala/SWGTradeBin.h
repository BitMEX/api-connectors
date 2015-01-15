#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGTradeBin : SWGObject

@property(nonatomic) SWGDate* timestamp;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSNumber* open;  

@property(nonatomic) NSNumber* high;  

@property(nonatomic) NSNumber* low;  

@property(nonatomic) NSNumber* close;  

@property(nonatomic) NSNumber* trades;  

@property(nonatomic) NSNumber* volume;  

@property(nonatomic) NSNumber* vwap;  

@property(nonatomic) NSNumber* lastSize;  

@property(nonatomic) NSNumber* turnover;  

@property(nonatomic) NSNumber* homeNotional;  

@property(nonatomic) NSNumber* foreignNotional;  

@property(nonatomic) NSNumber* _id;  

- (id) timestamp: (SWGDate*) timestamp
     symbol: (NSString*) symbol
     open: (NSNumber*) open
     high: (NSNumber*) high
     low: (NSNumber*) low
     close: (NSNumber*) close
     trades: (NSNumber*) trades
     volume: (NSNumber*) volume
     vwap: (NSNumber*) vwap
     lastSize: (NSNumber*) lastSize
     turnover: (NSNumber*) turnover
     homeNotional: (NSNumber*) homeNotional
     foreignNotional: (NSNumber*) foreignNotional
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

