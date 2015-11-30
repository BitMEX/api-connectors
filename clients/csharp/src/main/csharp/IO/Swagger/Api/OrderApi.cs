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
    public interface IOrderApi
    {
        
        /// <summary>
        /// Get your orders.
        /// </summary>
        /// <remarks>
        /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
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
        List<Order> OrderGetOrders (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
  
        /// <summary>
        /// Get your orders.
        /// </summary>
        /// <remarks>
        /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
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
        System.Threading.Tasks.Task<List<Order>> OrderGetOrdersAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
        
        /// <summary>
        /// Create a new order.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
        /// </remarks>
        /// <param name="symbol">Instrument symbol.</param>
        /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
        /// <param name="price">Order price.</param>
        /// <param name="timeInForce">Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).</param>
        /// <param name="type">Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;</param>
        /// <param name="stopPrice">If order type is &#39;StopLimit&#39;, this is the trigger/stop price.</param>
        /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
        /// <returns>Order</returns>
        Order OrderNewOrder (string symbol, double? quantity, double? price, string timeInForce = null, string type = null, double? stopPrice = null, string clOrdID = null);
  
        /// <summary>
        /// Create a new order.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
        /// </remarks>
        /// <param name="symbol">Instrument symbol.</param>
        /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
        /// <param name="price">Order price.</param>
        /// <param name="timeInForce">Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).</param>
        /// <param name="type">Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;</param>
        /// <param name="stopPrice">If order type is &#39;StopLimit&#39;, this is the trigger/stop price.</param>
        /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
        /// <returns>Order</returns>
        System.Threading.Tasks.Task<Order> OrderNewOrderAsync (string symbol, double? quantity, double? price, string timeInForce = null, string type = null, double? stopPrice = null, string clOrdID = null);
        
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk.
        /// </summary>
        /// <remarks>
        /// Either an orderID or a clOrdID must be provided.
        /// </remarks>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns></returns>
        List<Order> OrderCancelOrder (string orderID = null, string clOrdID = null, string text = null);
  
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk.
        /// </summary>
        /// <remarks>
        /// Either an orderID or a clOrdID must be provided.
        /// </remarks>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Order>> OrderCancelOrderAsync (string orderID = null, string clOrdID = null, string text = null);
        
        /// <summary>
        /// Cancels all of your orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 OrderCancelAll (string symbol = null, string filter = null, string text = null);
  
        /// <summary>
        /// Cancels all of your orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> OrderCancelAllAsync (string symbol = null, string filter = null, string text = null);
        
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout.
        /// </summary>
        /// <remarks>
        /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
        /// </remarks>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 OrderCancelAllAfter (double? timeout);
  
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout.
        /// </summary>
        /// <remarks>
        /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
        /// </remarks>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> OrderCancelAllAfterAsync (double? timeout);
        
        /// <summary>
        /// Close a position with a market order.
        /// </summary>
        /// <remarks>
        /// If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
        /// </remarks>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        Order OrderClosePosition (string symbol, double? price = null);
  
        /// <summary>
        /// Close a position with a market order.
        /// </summary>
        /// <remarks>
        /// If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
        /// </remarks>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        System.Threading.Tasks.Task<Order> OrderClosePositionAsync (string symbol, double? price = null);
        
        /// <summary>
        /// Get open liquidation orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="filter">Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <returns></returns>
        List<LiquidationOrder> OrderGetCloseOutOrders (string filter = null);
  
        /// <summary>
        /// Get open liquidation orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="filter">Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<LiquidationOrder>> OrderGetCloseOutOrdersAsync (string filter = null);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class OrderApi : IOrderApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public OrderApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OrderApi(String basePath)
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
        /// Get your orders. To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
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
        public List<Order> OrderGetOrders (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/order";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Get your orders. To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
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
        public async System.Threading.Tasks.Task<List<Order>> OrderGetOrdersAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/order";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Create a new order. This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
        /// </summary>
        /// <param name="symbol">Instrument symbol.</param> 
        /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param> 
        /// <param name="price">Order price.</param> 
        /// <param name="timeInForce">Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).</param> 
        /// <param name="type">Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;</param> 
        /// <param name="stopPrice">If order type is &#39;StopLimit&#39;, this is the trigger/stop price.</param> 
        /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param> 
        /// <returns>Order</returns>            
        public Order OrderNewOrder (string symbol, double? quantity, double? price, string timeInForce = null, string type = null, double? stopPrice = null, string clOrdID = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderNewOrder");
            
            // verify the required parameter 'quantity' is set
            if (quantity == null) throw new ApiException(400, "Missing required parameter 'quantity' when calling OrderNewOrder");
            
            // verify the required parameter 'price' is set
            if (price == null) throw new ApiException(400, "Missing required parameter 'price' when calling OrderNewOrder");
            
    
            var path_ = "/order";
    
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
            if (quantity != null) formParams.Add("quantity", ApiClient.ParameterToString(quantity)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (timeInForce != null) formParams.Add("timeInForce", ApiClient.ParameterToString(timeInForce)); // form parameter
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (stopPrice != null) formParams.Add("stopPrice", ApiClient.ParameterToString(stopPrice)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewOrder: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewOrder: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
    
        /// <summary>
        /// Create a new order. This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
        /// </summary>
        /// <param name="symbol">Instrument symbol.</param>
        /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
        /// <param name="price">Order price.</param>
        /// <param name="timeInForce">Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).</param>
        /// <param name="type">Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;</param>
        /// <param name="stopPrice">If order type is &#39;StopLimit&#39;, this is the trigger/stop price.</param>
        /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
        /// <returns>Order</returns>
        public async System.Threading.Tasks.Task<Order> OrderNewOrderAsync (string symbol, double? quantity, double? price, string timeInForce = null, string type = null, double? stopPrice = null, string clOrdID = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderNewOrder");
            // verify the required parameter 'quantity' is set
            if (quantity == null) throw new ApiException(400, "Missing required parameter 'quantity' when calling OrderNewOrder");
            // verify the required parameter 'price' is set
            if (price == null) throw new ApiException(400, "Missing required parameter 'price' when calling OrderNewOrder");
            
    
            var path_ = "/order";
    
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
            if (quantity != null) formParams.Add("quantity", ApiClient.ParameterToString(quantity)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (timeInForce != null) formParams.Add("timeInForce", ApiClient.ParameterToString(timeInForce)); // form parameter
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (stopPrice != null) formParams.Add("stopPrice", ApiClient.ParameterToString(stopPrice)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewOrder: " + response.Content, response.Content);

            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
        
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk. Either an orderID or a clOrdID must be provided.
        /// </summary>
        /// <param name="orderID">Order ID(s).</param> 
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param> 
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param> 
        /// <returns></returns>            
        public List<Order> OrderCancelOrder (string orderID = null, string clOrdID = null, string text = null)
        {
            
    
            var path_ = "/order";
    
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
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelOrder: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelOrder: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk. Either an orderID or a clOrdID must be provided.
        /// </summary>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Order>> OrderCancelOrderAsync (string orderID = null, string clOrdID = null, string text = null)
        {
            
    
            var path_ = "/order";
    
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
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelOrder: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Cancels all of your orders. 
        /// </summary>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param> 
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param> 
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 OrderCancelAll (string symbol = null, string filter = null, string text = null)
        {
            
    
            var path_ = "/order/all";
    
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
            if (filter != null) formParams.Add("filter", ApiClient.ParameterToString(filter)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
    
        /// <summary>
        /// Cancels all of your orders. 
        /// </summary>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> OrderCancelAllAsync (string symbol = null, string filter = null, string text = null)
        {
            
    
            var path_ = "/order/all";
    
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
            if (filter != null) formParams.Add("filter", ApiClient.ParameterToString(filter)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.Content, response.Content);

            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
        
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout. Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
        /// </summary>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 OrderCancelAllAfter (double? timeout)
        {
            
            // verify the required parameter 'timeout' is set
            if (timeout == null) throw new ApiException(400, "Missing required parameter 'timeout' when calling OrderCancelAllAfter");
            
    
            var path_ = "/order/cancelAllAfter";
    
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
            
            
            
            if (timeout != null) formParams.Add("timeout", ApiClient.ParameterToString(timeout)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
    
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout. Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
        /// </summary>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> OrderCancelAllAfterAsync (double? timeout)
        {
            // verify the required parameter 'timeout' is set
            if (timeout == null) throw new ApiException(400, "Missing required parameter 'timeout' when calling OrderCancelAllAfter");
            
    
            var path_ = "/order/cancelAllAfter";
    
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
            
            
            
            if (timeout != null) formParams.Add("timeout", ApiClient.ParameterToString(timeout)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.Content, response.Content);

            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
        
        /// <summary>
        /// Close a position with a market order. If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
        /// </summary>
        /// <param name="symbol">Symbol of position to close.</param> 
        /// <param name="price">Optional limit price.</param> 
        /// <returns>Order</returns>            
        public Order OrderClosePosition (string symbol, double? price = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderClosePosition");
            
    
            var path_ = "/order/closePosition";
    
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
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
    
        /// <summary>
        /// Close a position with a market order. If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
        /// </summary>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        public async System.Threading.Tasks.Task<Order> OrderClosePositionAsync (string symbol, double? price = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderClosePosition");
            
    
            var path_ = "/order/closePosition";
    
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
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.Content, response.Content);

            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
        
        /// <summary>
        /// Get open liquidation orders. 
        /// </summary>
        /// <param name="filter">Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param> 
        /// <returns></returns>            
        public List<LiquidationOrder> OrderGetCloseOutOrders (string filter = null)
        {
            
    
            var path_ = "/order/liquidations";
    
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
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetCloseOutOrders: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetCloseOutOrders: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<LiquidationOrder>) ApiClient.Deserialize(response, typeof(List<LiquidationOrder>));
        }
    
        /// <summary>
        /// Get open liquidation orders. 
        /// </summary>
        /// <param name="filter">Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<LiquidationOrder>> OrderGetCloseOutOrdersAsync (string filter = null)
        {
            
    
            var path_ = "/order/liquidations";
    
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
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetCloseOutOrders: " + response.Content, response.Content);

            return (List<LiquidationOrder>) ApiClient.Deserialize(response, typeof(List<LiquidationOrder>));
        }
        
    }
    
}
