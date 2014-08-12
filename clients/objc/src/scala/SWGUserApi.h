#import <Foundation/Foundation.h>
#import "Object.h"
#import "SWGUser.h"



@interface SWGUserApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGUserApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Log in to BitMEX.
 
 @param body 
 */
-(NSNumber*) user_loginWithCompletionBlock :(NSObject*) body 
        completionHandler: (void (^)(NSObject* output, NSError* error))completionBlock;

/**

 Log out of BitMEX.
 
 */
-(NSNumber*) user_logoutWithCompletionBlock :(void (^)(NSError* error))completionBlock;

/**

 Register a new user.
 
 @param body Model instance data
 */
-(NSNumber*) user_createWithCompletionBlock :(SWGUser*) body 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Get your user model.
 
 */
-(NSNumber*) user_getMeWithCompletionBlock :(void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Update your password, name, and other attributes.
 
 @param firstname 
 @param lastname 
 @param phone 
 @param oldPassword 
 @param _newPassword 
 @param _newPasswordConfirm 
 */
-(NSNumber*) user_updateMeWithCompletionBlock :(NSString*) firstname 
        lastname:(NSString*) lastname 
        phone:(NSString*) phone 
        oldPassword:(NSString*) oldPassword 
        _newPassword:(NSString*) _newPassword 
        _newPasswordConfirm:(NSString*) _newPasswordConfirm 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Save application preferences.
 
 @param prefs 
 */
-(NSNumber*) user_savePreferencesWithCompletionBlock :(NSObject*) prefs 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Request an SMS verification token.
 
 */
-(NSNumber*) user_verifyPhoneWithCompletionBlock :(void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Confirm your phone number by entering your SMS verification token.
 
 @param token 
 */
-(NSNumber*) user_confirmPhoneWithCompletionBlock :(NSString*) token 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

@end
