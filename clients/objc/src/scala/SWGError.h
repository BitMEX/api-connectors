#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGError : SWGObject

@property(nonatomic) NSString* message;  

@property(nonatomic) NSNumber* code;  

- (id) message: (NSString*) message
     code: (NSNumber*) code;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

