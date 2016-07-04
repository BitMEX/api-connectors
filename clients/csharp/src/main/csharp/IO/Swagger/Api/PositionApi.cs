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
    public interface IPositionApi
    {
        
        /// <summary>
        /// Get your positions.
        /// </summary>
        /// <remarks>
        /// See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </remarks>
        /// <param name="filter">Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <param name="columns">Which columns to fetch. For example, send [\&quot;columnName\&quot;].</param>
        /// <param name="count">Number of rows to fetch.</param>
        /// <returns></returns>
        List<Position> PositionGet (string filter = null, string columns = null, double? count = null);
  
        /// <summary>
        /// Get your positions.
        /// </summary>
        /// <remarks>
        /// See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </remarks>
        /// <param name="filter">Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <param name="columns">Which columns to fetch. For example, send [\&quot;columnName\&quot;].</param>
        /// <param name="count">Number of rows to fetch.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Position>> PositionGetAsync (string filter = null, string columns = null, double? count = null);
        
        /// <summary>
        /// Enable isolated margin or cross margin per-position.
        /// </summary>
        /// <remarks>
        /// On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
        /// </remarks>
        /// <param name="symbol">Position symbol to isolate.</param>
        /// <param name="enabled">True for isolated margin, false for cross margin.</param>
        /// <returns>Position</returns>
        Position PositionIsolateMargin (string symbol, bool? enabled = null);
  
        /// <summary>
        /// Enable isolated margin or cross margin per-position.
        /// </summary>
        /// <remarks>
        /// On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
        /// </remarks>
        /// <param name="symbol">Position symbol to isolate.</param>
        /// <param name="enabled">True for isolated margin, false for cross margin.</param>
        /// <returns>Position</returns>
        System.Threading.Tasks.Task<Position> PositionIsolateMarginAsync (string symbol, bool? enabled = null);
        
        /// <summary>
        /// Choose leverage for a position.
        /// </summary>
        /// <remarks>
        /// On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
        /// </remarks>
        /// <param name="symbol">Symbol of position to adjust.</param>
        /// <param name="leverage">Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.</param>
        /// <returns>Position</returns>
        Position PositionUpdateLeverage (string symbol, double? leverage);
  
        /// <summary>
        /// Choose leverage for a position.
        /// </summary>
        /// <remarks>
        /// On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
        /// </remarks>
        /// <param name="symbol">Symbol of position to adjust.</param>
        /// <param name="leverage">Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.</param>
        /// <returns>Position</returns>
        System.Threading.Tasks.Task<Position> PositionUpdateLeverageAsync (string symbol, double? leverage);
        
        /// <summary>
        /// Transfer equity in or out of a position.
        /// </summary>
        /// <remarks>
        /// When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
        /// </remarks>
        /// <param name="symbol">Symbol of position to isolate.</param>
        /// <param name="amount">Amount to transfer, in Satoshis. May be negative.</param>
        /// <returns>Position</returns>
        Position PositionTransferIsolatedMargin (string symbol, double? amount);
  
        /// <summary>
        /// Transfer equity in or out of a position.
        /// </summary>
        /// <remarks>
        /// When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
        /// </remarks>
        /// <param name="symbol">Symbol of position to isolate.</param>
        /// <param name="amount">Amount to transfer, in Satoshis. May be negative.</param>
        /// <returns>Position</returns>
        System.Threading.Tasks.Task<Position> PositionTransferIsolatedMarginAsync (string symbol, double? amount);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class PositionApi : IPositionApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public PositionApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="PositionApi"/> class.
        /// </summary>
        /// <returns></returns>
        public PositionApi(String basePath)
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
        /// Get your positions. See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </summary>
        /// <param name="filter">Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param> 
        /// <param name="columns">Which columns to fetch. For example, send [\&quot;columnName\&quot;].</param> 
        /// <param name="count">Number of rows to fetch.</param> 
        /// <returns></returns>            
        public List<Position> PositionGet (string filter = null, string columns = null, double? count = null)
        {
            
    
            var path_ = "/position";
    
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
            
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Position>) ApiClient.Deserialize(response, typeof(List<Position>));
        }
    
        /// <summary>
        /// Get your positions. See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </summary>
        /// <param name="filter">Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <param name="columns">Which columns to fetch. For example, send [\&quot;columnName\&quot;].</param>
        /// <param name="count">Number of rows to fetch.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Position>> PositionGetAsync (string filter = null, string columns = null, double? count = null)
        {
            
    
            var path_ = "/position";
    
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
            
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionGet: " + response.Content, response.Content);

            return (List<Position>) ApiClient.Deserialize(response, typeof(List<Position>));
        }
        
        /// <summary>
        /// Enable isolated margin or cross margin per-position. On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
        /// </summary>
        /// <param name="symbol">Position symbol to isolate.</param> 
        /// <param name="enabled">True for isolated margin, false for cross margin.</param> 
        /// <returns>Position</returns>            
        public Position PositionIsolateMargin (string symbol, bool? enabled = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionIsolateMargin");
            
    
            var path_ = "/position/isolate";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (enabled != null) formParams.Add("enabled", ApiClient.ParameterToString(enabled)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionIsolateMargin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionIsolateMargin: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
    
        /// <summary>
        /// Enable isolated margin or cross margin per-position. On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
        /// </summary>
        /// <param name="symbol">Position symbol to isolate.</param>
        /// <param name="enabled">True for isolated margin, false for cross margin.</param>
        /// <returns>Position</returns>
        public async System.Threading.Tasks.Task<Position> PositionIsolateMarginAsync (string symbol, bool? enabled = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionIsolateMargin");
            
    
            var path_ = "/position/isolate";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (enabled != null) formParams.Add("enabled", ApiClient.ParameterToString(enabled)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionIsolateMargin: " + response.Content, response.Content);

            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
        
        /// <summary>
        /// Choose leverage for a position. On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
        /// </summary>
        /// <param name="symbol">Symbol of position to adjust.</param> 
        /// <param name="leverage">Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.</param> 
        /// <returns>Position</returns>            
        public Position PositionUpdateLeverage (string symbol, double? leverage)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionUpdateLeverage");
            
            // verify the required parameter 'leverage' is set
            if (leverage == null) throw new ApiException(400, "Missing required parameter 'leverage' when calling PositionUpdateLeverage");
            
    
            var path_ = "/position/leverage";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (leverage != null) formParams.Add("leverage", ApiClient.ParameterToString(leverage)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionUpdateLeverage: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionUpdateLeverage: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
    
        /// <summary>
        /// Choose leverage for a position. On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
        /// </summary>
        /// <param name="symbol">Symbol of position to adjust.</param>
        /// <param name="leverage">Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.</param>
        /// <returns>Position</returns>
        public async System.Threading.Tasks.Task<Position> PositionUpdateLeverageAsync (string symbol, double? leverage)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionUpdateLeverage");
            // verify the required parameter 'leverage' is set
            if (leverage == null) throw new ApiException(400, "Missing required parameter 'leverage' when calling PositionUpdateLeverage");
            
    
            var path_ = "/position/leverage";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (leverage != null) formParams.Add("leverage", ApiClient.ParameterToString(leverage)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionUpdateLeverage: " + response.Content, response.Content);

            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
        
        /// <summary>
        /// Transfer equity in or out of a position. When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
        /// </summary>
        /// <param name="symbol">Symbol of position to isolate.</param> 
        /// <param name="amount">Amount to transfer, in Satoshis. May be negative.</param> 
        /// <returns>Position</returns>            
        public Position PositionTransferIsolatedMargin (string symbol, double? amount)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionTransferIsolatedMargin");
            
            // verify the required parameter 'amount' is set
            if (amount == null) throw new ApiException(400, "Missing required parameter 'amount' when calling PositionTransferIsolatedMargin");
            
    
            var path_ = "/position/transferMargin";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (amount != null) formParams.Add("amount", ApiClient.ParameterToString(amount)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionTransferIsolatedMargin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionTransferIsolatedMargin: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
    
        /// <summary>
        /// Transfer equity in or out of a position. When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
        /// </summary>
        /// <param name="symbol">Symbol of position to isolate.</param>
        /// <param name="amount">Amount to transfer, in Satoshis. May be negative.</param>
        /// <returns>Position</returns>
        public async System.Threading.Tasks.Task<Position> PositionTransferIsolatedMarginAsync (string symbol, double? amount)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling PositionTransferIsolatedMargin");
            // verify the required parameter 'amount' is set
            if (amount == null) throw new ApiException(400, "Missing required parameter 'amount' when calling PositionTransferIsolatedMargin");
            
    
            var path_ = "/position/transferMargin";
    
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
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (amount != null) formParams.Add("amount", ApiClient.ParameterToString(amount)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling PositionTransferIsolatedMargin: " + response.Content, response.Content);

            return (Position) ApiClient.Deserialize(response, typeof(Position));
        }
        
    }
    
}
