#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGLeaderboard : SWGObject

@property(nonatomic) NSString* username;  

@property(nonatomic) NSNumber* marginBalance;  

- (id) username: (NSString*) username
     marginBalance: (NSNumber*) marginBalance;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

