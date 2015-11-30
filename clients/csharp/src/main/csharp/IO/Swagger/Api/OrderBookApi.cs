using System;
using System.IO;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IOrderBookApi
    {
        
        /// <summary>
        /// Get current orderbook.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="depth">Orderbook depth.</param>
        /// <returns></returns>
        List<OrderBook> OrderBookGetOrderBook (string symbol, double? depth = null);
  
        /// <summary>
        /// Get current orderbook.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="depth">Orderbook depth.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<OrderBook>> OrderBookGetOrderBookAsync (string symbol, double? depth = null);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class OrderBookApi : IOrderBookApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBookApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public OrderBookApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderBookApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OrderBookApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        
        /// <summary>
        /// Get current orderbook. 
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param> 
        /// <param name="depth">Orderbook depth.</param> 
        /// <returns></returns>            
        public List<OrderBook> OrderBookGetOrderBook (string symbol, double? depth = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderBookGetOrderBook");
            
    
            var path_ = "/orderBook";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (depth != null) queryParams.Add("depth", ApiClient.ParameterToString(depth)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderBookGetOrderBook: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderBookGetOrderBook: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<OrderBook>) ApiClient.Deserialize(response, typeof(List<OrderBook>));
        }
    
        /// <summary>
        /// Get current orderbook. 
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="depth">Orderbook depth.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<OrderBook>> OrderBookGetOrderBookAsync (string symbol, double? depth = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderBookGetOrderBook");
            
    
            var path_ = "/orderBook";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (depth != null) queryParams.Add("depth", ApiClient.ParameterToString(depth)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderBookGetOrderBook: " + response.Content, response.Content);

            return (List<OrderBook>) ApiClient.Deserialize(response, typeof(List<OrderBook>));
        }
        
    }
    
}
