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
    public interface ITradeApi
    {
        
        /// <summary>
        /// Get Trades.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        List<Trade> TradeGet (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
  
        /// <summary>
        /// Get Trades.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Trade>> TradeGetAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
        
        /// <summary>
        /// Get previous trades in time buckets.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="binSize">Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].</param>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        List<TradeBin> TradeGetBucketed (string binSize = null, string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
  
        /// <summary>
        /// Get previous trades in time buckets.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="binSize">Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].</param>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<TradeBin>> TradeGetBucketedAsync (string binSize = null, string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
        
        /// <summary>
        /// Get trades between two dates. [Deprecated, use GET /trades]
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="startTime">Start date.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="endTime">End Date.</param>
        /// <returns></returns>
        List<Trade> TradeGetByDate (DateTime? startTime, string symbol = null, DateTime? endTime = null);
  
        /// <summary>
        /// Get trades between two dates. [Deprecated, use GET /trades]
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="startTime">Start date.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="endTime">End Date.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Trade>> TradeGetByDateAsync (DateTime? startTime, string symbol = null, DateTime? endTime = null);
        
        /// <summary>
        /// Get recent trades. [Deprecated, use GET /trades]
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="count">Number of trades to fetch.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <returns></returns>
        List<Trade> TradeGetRecent (double? count, string symbol = null);
  
        /// <summary>
        /// Get recent trades. [Deprecated, use GET /trades]
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="count">Number of trades to fetch.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Trade>> TradeGetRecentAsync (double? count, string symbol = null);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class TradeApi : ITradeApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TradeApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public TradeApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="TradeApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TradeApi(String basePath)
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
        /// Get Trades. 
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param> 
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param> 
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param> 
        /// <param name="count">Number of results to fetch.</param> 
        /// <param name="start">Starting point for results.</param> 
        /// <param name="reverse">If true, will sort results newest first.</param> 
        /// <param name="startTime">Starting date filter for results.</param> 
        /// <param name="endTime">Ending date filter for results.</param> 
        /// <returns></returns>            
        public List<Trade> TradeGet (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/trade";
    
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
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
    
        /// <summary>
        /// Get Trades. 
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Trade>> TradeGetAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/trade";
    
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
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGet: " + response.Content, response.Content);

            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
        
        /// <summary>
        /// Get previous trades in time buckets. 
        /// </summary>
        /// <param name="binSize">Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].</param> 
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param> 
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param> 
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param> 
        /// <param name="count">Number of results to fetch.</param> 
        /// <param name="start">Starting point for results.</param> 
        /// <param name="reverse">If true, will sort results newest first.</param> 
        /// <param name="startTime">Starting date filter for results.</param> 
        /// <param name="endTime">Ending date filter for results.</param> 
        /// <returns></returns>            
        public List<TradeBin> TradeGetBucketed (string binSize = null, string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/trade/bucketed";
    
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
            
            if (binSize != null) queryParams.Add("binSize", ApiClient.ParameterToString(binSize)); // query parameter
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetBucketed: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetBucketed: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<TradeBin>) ApiClient.Deserialize(response, typeof(List<TradeBin>));
        }
    
        /// <summary>
        /// Get previous trades in time buckets. 
        /// </summary>
        /// <param name="binSize">Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].</param>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<TradeBin>> TradeGetBucketedAsync (string binSize = null, string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/trade/bucketed";
    
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
            
            if (binSize != null) queryParams.Add("binSize", ApiClient.ParameterToString(binSize)); // query parameter
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetBucketed: " + response.Content, response.Content);

            return (List<TradeBin>) ApiClient.Deserialize(response, typeof(List<TradeBin>));
        }
        
        /// <summary>
        /// Get trades between two dates. [Deprecated, use GET /trades] 
        /// </summary>
        /// <param name="startTime">Start date.</param> 
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param> 
        /// <param name="endTime">End Date.</param> 
        /// <returns></returns>            
        public List<Trade> TradeGetByDate (DateTime? startTime, string symbol = null, DateTime? endTime = null)
        {
            
            // verify the required parameter 'startTime' is set
            if (startTime == null) throw new ApiException(400, "Missing required parameter 'startTime' when calling TradeGetByDate");
            
    
            var path_ = "/trade/byDate";
    
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
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetByDate: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetByDate: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
    
        /// <summary>
        /// Get trades between two dates. [Deprecated, use GET /trades] 
        /// </summary>
        /// <param name="startTime">Start date.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <param name="endTime">End Date.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Trade>> TradeGetByDateAsync (DateTime? startTime, string symbol = null, DateTime? endTime = null)
        {
            // verify the required parameter 'startTime' is set
            if (startTime == null) throw new ApiException(400, "Missing required parameter 'startTime' when calling TradeGetByDate");
            
    
            var path_ = "/trade/byDate";
    
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
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetByDate: " + response.Content, response.Content);

            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
        
        /// <summary>
        /// Get recent trades. [Deprecated, use GET /trades] 
        /// </summary>
        /// <param name="count">Number of trades to fetch.</param> 
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param> 
        /// <returns></returns>            
        public List<Trade> TradeGetRecent (double? count, string symbol = null)
        {
            
            // verify the required parameter 'count' is set
            if (count == null) throw new ApiException(400, "Missing required parameter 'count' when calling TradeGetRecent");
            
    
            var path_ = "/trade/recent";
    
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
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetRecent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetRecent: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
    
        /// <summary>
        /// Get recent trades. [Deprecated, use GET /trades] 
        /// </summary>
        /// <param name="count">Number of trades to fetch.</param>
        /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Trade>> TradeGetRecentAsync (double? count, string symbol = null)
        {
            // verify the required parameter 'count' is set
            if (count == null) throw new ApiException(400, "Missing required parameter 'count' when calling TradeGetRecent");
            
    
            var path_ = "/trade/recent";
    
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
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling TradeGetRecent: " + response.Content, response.Content);

            return (List<Trade>) ApiClient.Deserialize(response, typeof(List<Trade>));
        }
        
    }
    
}
