#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"
#import "SWGAnonymousModel_6.h"


@interface SWGUser : SWGObject

@property(nonatomic) NSString* firstname;  

@property(nonatomic) NSString* lastname;  

@property(nonatomic) NSString* username;  

@property(nonatomic) NSString* email;  

@property(nonatomic) NSNumber* emailVerified;  

@property(nonatomic) NSString* phone;  

@property(nonatomic) NSNumber* phoneVerified;  

@property(nonatomic) NSString* status;  

@property(nonatomic) SWGDate* created;  

@property(nonatomic) SWGDate* lastUpdated;  

@property(nonatomic) SWGAnonymousModel_6* preferences;  

@property(nonatomic) NSNumber* isEmployee;  

@property(nonatomic) NSNumber* _id;  

- (id) firstname: (NSString*) firstname
     lastname: (NSString*) lastname
     username: (NSString*) username
     email: (NSString*) email
     emailVerified: (NSNumber*) emailVerified
     phone: (NSString*) phone
     phoneVerified: (NSNumber*) phoneVerified
     status: (NSString*) status
     created: (SWGDate*) created
     lastUpdated: (SWGDate*) lastUpdated
     preferences: (SWGAnonymousModel_6*) preferences
     isEmployee: (NSNumber*) isEmployee
     _id: (NSNumber*) _id;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

