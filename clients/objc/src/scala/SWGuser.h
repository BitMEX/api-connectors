#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"
#import "Object.h"


@interface SWGUser : SWGObject

@property(nonatomic) NSString* firstname;  

@property(nonatomic) NSString* lastname;  

@property(nonatomic) NSString* status;  

@property(nonatomic) NSString* username;  

@property(nonatomic) NSString* email;  

@property(nonatomic) NSString* phone;  

@property(nonatomic) NSNumber* countryCode;  

@property(nonatomic) SWGDate* created;  

@property(nonatomic) SWGDate* lastUpdated;  

@property(nonatomic) NSObject* preferences;  

@property(nonatomic) NSString* role;  

@property(nonatomic) NSString* TFAEnabled;  

@property(nonatomic) NSNumber* _id;  

- (id) firstname: (NSString*) firstname
     lastname: (NSString*) lastname
     status: (NSString*) status
     username: (NSString*) username
     email: (NSString*) email
     phone: (NSString*) phone
     countryCode: (NSNumber*) countryCode
     created: (SWGDate*) created
     lastUpdated: (SWGDate*) lastUpdated
     preferences: (NSObject*) preferences
     role: (NSString*) role
     TFAEnabled: (NSString*) TFAEnabled
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

