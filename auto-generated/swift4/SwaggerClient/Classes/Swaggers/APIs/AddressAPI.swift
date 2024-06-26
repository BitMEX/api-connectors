//
// AddressAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class AddressAPI {
    /**
     Get your addresses.
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func addressGet(completion: @escaping ((_ data: [Address]?,_ error: Error?) -> Void)) {
        addressGetWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get your addresses.
     - GET /address
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

     - returns: RequestBuilder<[Address]> 
     */
    open class func addressGetWithRequestBuilder() -> RequestBuilder<[Address]> {
        let path = "/address"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[Address]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Creates a new saved address.
     
     - parameter currency: (form) Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; 
     - parameter network: (form) Selected network. 
     - parameter address: (form) Destination Address. 
     - parameter name: (form) Name of the entry, eg. &#39;Hardware wallet&#39;. 
     - parameter note: (form) Optional annotation. (optional)
     - parameter skipConfirm: (form) Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     - parameter skip2FA: (form) Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     - parameter memo: (form) Destination Memo. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func addressNew(currency: String, network: String, address: String, name: String, note: String? = nil, skipConfirm: Bool? = nil, skip2FA: Bool? = nil, memo: String? = nil, completion: @escaping ((_ data: Address?,_ error: Error?) -> Void)) {
        addressNewWithRequestBuilder(currency: currency, network: network, address: address, name: name, note: note, skipConfirm: skipConfirm, skip2FA: skip2FA, memo: memo).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Creates a new saved address.
     - POST /address
     - API Key:
       - type: apiKey api-expires 
       - name: apiExpires
     - API Key:
       - type: apiKey api-key 
       - name: apiKey
     - API Key:
       - type: apiKey api-signature 
       - name: apiSignature
     - examples: [{contentType=application/json, example={"empty": false}}]
     
     - parameter currency: (form) Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; 
     - parameter network: (form) Selected network. 
     - parameter address: (form) Destination Address. 
     - parameter name: (form) Name of the entry, eg. &#39;Hardware wallet&#39;. 
     - parameter note: (form) Optional annotation. (optional)
     - parameter skipConfirm: (form) Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     - parameter skip2FA: (form) Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     - parameter memo: (form) Destination Memo. (optional)

     - returns: RequestBuilder<Address> 
     */
    open class func addressNewWithRequestBuilder(currency: String, network: String, address: String, name: String, note: String? = nil, skipConfirm: Bool? = nil, skip2FA: Bool? = nil, memo: String? = nil) -> RequestBuilder<Address> {
        let path = "/address"
        let URLString = SwaggerClientAPI.basePath + path
        let formParams: [String:Any?] = [
            "currency": currency,
            "network": network,
            "address": address,
            "name": name,
            "note": note,
            "skipConfirm": skipConfirm,
            "skip2FA": skip2FA,
            "memo": memo
        ]

        let nonNullParameters = APIHelper.rejectNil(formParams)
        let parameters = APIHelper.convertBoolToString(nonNullParameters)
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<Address>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
