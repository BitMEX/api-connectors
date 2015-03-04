#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGStatsHistory : SWGObject

@property(nonatomic) SWGDate* date;  

@property(nonatomic) NSString* rootSymbol;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* volume;  

@property(nonatomic) NSNumber* turnover;  

- (id) date: (SWGDate*) date
     rootSymbol: (NSString*) rootSymbol
     currency: (NSString*) currency
     volume: (NSNumber*) volume
     turnover: (NSNumber*) turnover;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

