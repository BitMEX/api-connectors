//
// UserAffiliatesAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class UserAffiliatesAPI {
    /**
     Get user's affiliates to a given depth
     
     - parameter depth: (query) the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates (optional)
     - parameter targetAccountId: (query) AccountId of Sub-Affiliate Account (optional)
     - parameter selectUserId: (query) User id of result array to keep (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func userAffiliatesGet(depth: Double? = nil, targetAccountId: Double? = nil, selectUserId: Double? = nil, completion: @escaping ((_ data: [XAny]?,_ error: Error?) -> Void)) {
        userAffiliatesGetWithRequestBuilder(depth: depth, targetAccountId: targetAccountId, selectUserId: selectUserId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get user's affiliates to a given depth
     - GET /userAffiliates
     - API Key:
       - type: apiKey api-expires 
       - name: apiExpires
     - API Key:
       - type: apiKey api-key 
       - name: apiKey
     - API Key:
       - type: apiKey api-signature 
       - name: apiSignature
     - examples: [{contentType=application/json, example={}}]
     
     - parameter depth: (query) the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates (optional)
     - parameter targetAccountId: (query) AccountId of Sub-Affiliate Account (optional)
     - parameter selectUserId: (query) User id of result array to keep (optional)

     - returns: RequestBuilder<[XAny]> 
     */
    open class func userAffiliatesGetWithRequestBuilder(depth: Double? = nil, targetAccountId: Double? = nil, selectUserId: Double? = nil) -> RequestBuilder<[XAny]> {
        let path = "/userAffiliates"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
            "depth": depth, 
            "targetAccountId": targetAccountId, 
            "selectUserId": selectUserId
        ])

        let requestBuilder: RequestBuilder<[XAny]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
