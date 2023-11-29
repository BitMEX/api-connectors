//
// WalletAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class WalletAPI {
    /**
     Get Assets Config
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func walletGetAssetsConfig(completion: @escaping ((_ data: [AssetsConfig]?,_ error: Error?) -> Void)) {
        walletGetAssetsConfigWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Assets Config
     - GET /wallet/assets
     - examples: [{contentType=application/json, example={}}]

     - returns: RequestBuilder<[AssetsConfig]> 
     */
    open class func walletGetAssetsConfigWithRequestBuilder() -> RequestBuilder<[AssetsConfig]> {
        let path = "/wallet/assets"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[AssetsConfig]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get Networks Config
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func walletGetNetworksConfig(completion: @escaping ((_ data: [NetworksConfig]?,_ error: Error?) -> Void)) {
        walletGetNetworksConfigWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get Networks Config
     - GET /wallet/networks
     - examples: [{contentType=application/json, example={}}]

     - returns: RequestBuilder<[NetworksConfig]> 
     */
    open class func walletGetNetworksConfigWithRequestBuilder() -> RequestBuilder<[NetworksConfig]> {
        let path = "/wallet/networks"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[NetworksConfig]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
