#import <Foundation/Foundation.h>
#import "SWGUser.h"
#import "SWGTransaction.h"
#import "SWGAffiliate.h"
#import "SWGAccessToken.h"
#import "SWGAny.h"



@interface SWGUserApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGUserApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get a deposit address.
 
 @param currency 
 */
-(NSNumber*) getDepositAddressWithCompletionBlock :(NSString*) currency 
        completionHandler: (void (^)(NSString* output, NSError* error))completionBlock;

/**

 Get a history of all of your wallet transactions (deposits and withdrawals).
 
 */
-(NSNumber*) getWalletHistoryWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Request a withdrawal to an external wallet.
 
 @param otpToken 2FA token. Required if 2FA is enabled on your account.
 @param amount Amount of withdrawal currency. Note that for Bitcoin withdrawals, a standard 0.0001 XBT fee is charged by the Bitcoin network.
 @param address Destination Address.
 @param currency Currency you're withdrawing. Options: [&quot;XBt&quot;]
 */
-(NSNumber*) requestWithdrawalWithCompletionBlock :(NSString*) otpToken 
        amount:(NSNumber*) amount 
        address:(NSString*) address 
        currency:(NSString*) currency 
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock;

/**

 Cancel a withdrawal.
 
 @param token 
 */
-(NSNumber*) cancelWithdrawalWithCompletionBlock :(NSString*) token 
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock;

/**

 Confirm a withdrawal.
 
 @param token 
 */
-(NSNumber*) confirmWithdrawalWithCompletionBlock :(NSString*) token 
        completionHandler: (void (^)(SWGTransaction* output, NSError* error))completionBlock;

/**

 Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled.
 
 @param type Two-factor auth type. Supported types: 'GA' (Google Authenticator)
 */
-(NSNumber*) requestEnableTFAWithCompletionBlock :(NSString*) type 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Confirm two-factor auth for this account.
 
 @param token Token from your selected TFA type.
 @param type Two-factor auth type. Supported types: 'GA' (Google Authenticator)
 */
-(NSNumber*) confirmEnableTFAWithCompletionBlock :(NSString*) token 
        type:(NSString*) type 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Re-send verification email.
 
 @param email 
 */
-(NSNumber*) sendVerificationEmailWithCompletionBlock :(NSString*) email 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Confirm your email address with a token.
 
 @param token 
 */
-(NSNumber*) confirmEmailWithCompletionBlock :(NSString*) token 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Request a password reset.
 
 @param email 
 */
-(NSNumber*) requestPasswordResetWithCompletionBlock :(NSString*) email 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Confirm a password reset.
 
 @param email 
 @param token 
 @param _newPassword 
 */
-(NSNumber*) confirmPasswordResetWithCompletionBlock :(NSString*) email 
        token:(NSString*) token 
        _newPassword:(NSString*) _newPassword 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Get your current affiliate/referral status.
 
 */
-(NSNumber*) getAffiliateStatusWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Register a new user.
 
 @param email Your email address.
 @param password Your password.
 @param username Desired username.
 @param firstname First name.
 @param lastname Last name.
 @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).
 @param referrerID Optional Referrer ID.
 @param accountType Account type. Options: ['Trader', 'Hedger']. See the &lt;a href=&quot;/app/fees&quot;&gt;fees page&lt;/a&gt; for more details.
 */
-(NSNumber*) newUserWithCompletionBlock :(NSString*) email 
        password:(NSString*) password 
        username:(NSString*) username 
        firstname:(NSString*) firstname 
        lastname:(NSString*) lastname 
        acceptsTOS:(NSString*) acceptsTOS 
        referrerID:(NSString*) referrerID 
        accountType:(NSString*) accountType 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Get your user model.
 
 */
-(NSNumber*) getMeWithCompletionBlock :(void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Update your password, name, and other attributes.
 
 @param firstname 
 @param lastname 
 @param oldPassword 
 @param _newPassword 
 @param _newPasswordConfirm 
 @param accountType Account fee schedule. Options: ['Trader', 'Hedger']. See the &lt;a href=&quot;/app/fees&quot;&gt;fees page&lt;/a&gt; for more details.
 */
-(NSNumber*) updateMeWithCompletionBlock :(NSString*) firstname 
        lastname:(NSString*) lastname 
        oldPassword:(NSString*) oldPassword 
        _newPassword:(NSString*) _newPassword 
        _newPasswordConfirm:(NSString*) _newPasswordConfirm 
        accountType:(NSString*) accountType 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Log in to BitMEX.
 
 @param email Your email address.
 @param password Your password.
 @param token OTP Token (YubiKey, Google Authenticator)
 */
-(NSNumber*) loginWithCompletionBlock :(NSString*) email 
        password:(NSString*) password 
        token:(NSString*) token 
        completionHandler: (void (^)(SWGAccessToken* output, NSError* error))completionBlock;

/**

 Log out of BitMEX.
 
 */
-(NSNumber*) logoutWithCompletionBlock :(void (^)(NSError* error))completionBlock;

/**

 Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
 
 */
-(NSNumber*) logoutAllWithCompletionBlock :(void (^)(NSError* error))completionBlock;

/**

 Save application preferences.
 
 @param prefs 
 */
-(NSNumber*) savePreferencesWithCompletionBlock :(NSObject*) prefs 
        completionHandler: (void (^)(SWGUser* output, NSError* error))completionBlock;

/**

 Get your account's commission status.
 
 */
-(NSNumber*) getCommissionWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

@end
