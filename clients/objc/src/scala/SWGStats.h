#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGStats : SWGObject

@property(nonatomic) NSString* rootSymbol;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSNumber* volume24h;  

@property(nonatomic) NSNumber* turnover24h;  

@property(nonatomic) NSNumber* openInterest;  

@property(nonatomic) NSNumber* openValue;  

- (id) rootSymbol: (NSString*) rootSymbol
     currency: (NSString*) currency
     volume24h: (NSNumber*) volume24h
     turnover24h: (NSNumber*) turnover24h
     openInterest: (NSNumber*) openInterest
     openValue: (NSNumber*) openValue;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

