#import <Foundation/Foundation.h>
#import "SWGInstrument.h"



@interface SWGInstrumentApi: NSObject

-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGInstrumentApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(void) setBasePath:(NSString*)basePath;
+(NSString*) getBasePath;
/**

 Get all listed instruments.
 
 @param filter Filter defining fields, where, orderBy, offset, and limit
 */
-(NSNumber*) instrument_findWithCompletionBlock :(NSObject*) filter 
        completionHandler: (void (^)(NSArray* output, NSError* error))completionBlock;

@end
