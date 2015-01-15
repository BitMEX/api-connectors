#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGTrade : SWGObject

@property(nonatomic) SWGDate* timestamp;  

@property(nonatomic) NSString* symbol;  

@property(nonatomic) NSString* side;  

@property(nonatomic) NSNumber* size;  

@property(nonatomic) NSNumber* price;  

@property(nonatomic) NSString* tickDirection;  

@property(nonatomic) NSString* trdMatchID;  

@property(nonatomic) NSNumber* grossValue;  

@property(nonatomic) NSNumber* homeNotional;  

@property(nonatomic) NSNumber* foreignNotional;  

@property(nonatomic) NSNumber* _id;  

- (id) timestamp: (SWGDate*) timestamp
     symbol: (NSString*) symbol
     side: (NSString*) side
     size: (NSNumber*) size
     price: (NSNumber*) price
     tickDirection: (NSString*) tickDirection
     trdMatchID: (NSString*) trdMatchID
     grossValue: (NSNumber*) grossValue
     homeNotional: (NSNumber*) homeNotional
     foreignNotional: (NSNumber*) foreignNotional
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

