#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"


@interface SWGChat : SWGObject

@property(nonatomic) SWGDate* date;  

@property(nonatomic) NSString* user;  

@property(nonatomic) NSString* message;  

@property(nonatomic) NSString* html;  

@property(nonatomic) NSNumber* fromBot;  

@property(nonatomic) NSNumber* _id;  

- (id) date: (SWGDate*) date
     user: (NSString*) user
     message: (NSString*) message
     html: (NSString*) html
     fromBot: (NSNumber*) fromBot
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

