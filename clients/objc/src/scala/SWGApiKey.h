#import <Foundation/Foundation.h>
#import "SWGObject.h"


@interface SWGApiKey : SWGObject

@property(nonatomic) NSString* _id;  

@property(nonatomic) NSString* secret;  

@property(nonatomic) NSString* name;  

@property(nonatomic) NSNumber* nonce;  

@property(nonatomic) NSString* cidr;  

@property(nonatomic) NSObject* constriants;  

@property(nonatomic) NSNumber* enabled;  

@property(nonatomic) NSNumber* userId;  

- (id) _id: (NSString*) _id
     secret: (NSString*) secret
     name: (NSString*) name
     nonce: (NSNumber*) nonce
     cidr: (NSString*) cidr
     constriants: (NSObject*) constriants
     enabled: (NSNumber*) enabled
     userId: (NSNumber*) userId;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

