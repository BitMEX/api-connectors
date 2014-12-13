#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGAccessToken : SWGObject

@property(nonatomic) NSString* _id;  

@property(nonatomic) NSNumber* ttl;  /* time to live in seconds (2 weeks by default) [optional]*/

@property(nonatomic) SWGDate* created;  

@property(nonatomic) NSNumber* userId;  

- (id) _id: (NSString*) _id
     ttl: (NSNumber*) ttl
     created: (SWGDate*) created
     userId: (NSNumber*) userId;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

