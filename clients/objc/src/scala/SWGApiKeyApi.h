#import <Foundation/Foundation.h>
#import "SWGApiKey.h"



@interface SWGApiKeyApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGApiKeyApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Create a new API Key.
 API Keys can also be created via<a href="https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py">this Python script</a>.
 @param name Key name. This name is for reference only.
 @param cidr CIDR block to restrict this key to. To restrict to a single address, append &quot;/32&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=&quot;http://software77.net/cidr-101.html&quot;&gt;More on CIDR blocks&lt;/a&gt;
 @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
 */
-(NSNumber*) createKeyWithCompletionBlock :(NSString*) name 
        cidr:(NSString*) cidr 
        enabled:(NSNumber*) enabled 
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;

/**

 Get your API Keys.
 
 */
-(NSNumber*) getKeysWithCompletionBlock :(void (^)(NSArray* output, NSError* error))completionBlock;

/**

 Remove an API Key.
 
 @param accessKey Access Key (public component).
 */
-(NSNumber*) removeWithCompletionBlock :(NSString*) accessKey 
        completionHandler: (void (^)(NSNumber* output, NSError* error))completionBlock;

/**

 Disable an API Key.
 
 @param accessKey Access Key (public component).
 */
-(NSNumber*) disableWithCompletionBlock :(NSString*) accessKey 
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;

/**

 Enable an API Key.
 
 @param accessKey Access Key (public component).
 */
-(NSNumber*) enableWithCompletionBlock :(NSString*) accessKey 
        completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;

@end
