#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGChat : SWGObject

@property(nonatomic) NSNumber* _id;  

@property(nonatomic) SWGDate* date;  

@property(nonatomic) NSString* user;  

@property(nonatomic) NSString* message;  

- (id) _id: (NSNumber*) _id
     date: (SWGDate*) date
     user: (NSString*) user
     message: (NSString*) message;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

