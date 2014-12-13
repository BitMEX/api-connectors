#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGTransaction : SWGObject

@property(nonatomic) NSString* transactID;  

@property(nonatomic) NSNumber* account;  

@property(nonatomic) NSString* currency;  

@property(nonatomic) NSString* transactType;  

@property(nonatomic) NSNumber* amount;  

@property(nonatomic) NSString* transactStatus;  

@property(nonatomic) NSString* address;  

@property(nonatomic) NSString* tx;  

@property(nonatomic) NSString* text;  

@property(nonatomic) SWGDate* transactTime;  

@property(nonatomic) SWGDate* timestamp;  

- (id) transactID: (NSString*) transactID
     account: (NSNumber*) account
     currency: (NSString*) currency
     transactType: (NSString*) transactType
     amount: (NSNumber*) amount
     transactStatus: (NSString*) transactStatus
     address: (NSString*) address
     tx: (NSString*) tx
     text: (NSString*) text
     transactTime: (SWGDate*) transactTime
     timestamp: (SWGDate*) timestamp;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

