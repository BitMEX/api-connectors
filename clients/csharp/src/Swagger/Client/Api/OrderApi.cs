  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class OrderApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public OrderApi(String basePath = "https://www.bitmex.com/api/v1")
      {
        this.basePath = basePath;
      }

      public ApiInvoker getInvoker() {
        return apiInvoker;
      }

      // Sets the endpoint base url for the services being accessed
      public void setBasePath(string basePath) {
        this.basePath = basePath;
      }

      // Gets the endpoint base url for the services being accessed
      public String getBasePath() {
        return basePath;
      }

      /// <summary>
      /// Get your orders. To get open orders only, send {&quot;open&quot;: true} in the filter param.
      /// </summary>
      /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
      /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.</param>
      /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
      /// <param name="start">Starting point for results.</param>
      /// <param name="reverse">If true, will sort results newest first.</param>
      /// <param name="startTime">Starting date filter for results.</param>
      /// <param name="endTime">Ending date filter for results.</param>
      /// <param name="count">Number of results to fetch.</param>
      /// <returns></returns>
      public List<Order> getOrders (string symbol, object filter, List<string> columns, double? start, bool? reverse, DateTime? startTime, DateTime? endTime, double? count) {
        // create path and map variables
        var path = "/order".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (symbol != null){
          string paramStr = (symbol is DateTime) ? ((DateTime)(object)symbol).ToString("u") : Convert.ToString(symbol);
          queryParams.Add("symbol", paramStr);
		}
        if (filter != null){
          string paramStr = (filter is DateTime) ? ((DateTime)(object)filter).ToString("u") : Convert.ToString(filter);
          queryParams.Add("filter", paramStr);
		}
        if (columns != null){
          string paramStr = (columns is DateTime) ? ((DateTime)(object)columns).ToString("u") : Convert.ToString(columns);
          queryParams.Add("columns", paramStr);
		}
        if (count != null){
          string paramStr = (count is DateTime) ? ((DateTime)(object)count).ToString("u") : Convert.ToString(count);
          queryParams.Add("count", paramStr);
		}
        if (start != null){
          string paramStr = (start is DateTime) ? ((DateTime)(object)start).ToString("u") : Convert.ToString(start);
          queryParams.Add("start", paramStr);
		}
        if (reverse != null){
          string paramStr = (reverse is DateTime) ? ((DateTime)(object)reverse).ToString("u") : Convert.ToString(reverse);
          queryParams.Add("reverse", paramStr);
		}
        if (startTime != null){
          string paramStr = (startTime is DateTime) ? ((DateTime)(object)startTime).ToString("u") : Convert.ToString(startTime);
          queryParams.Add("startTime", paramStr);
		}
        if (endTime != null){
          string paramStr = (endTime is DateTime) ? ((DateTime)(object)endTime).ToString("u") : Convert.ToString(endTime);
          queryParams.Add("endTime", paramStr);
		}
        try {
          if (typeof(List<Order>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<Order>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<Order>) ApiInvoker.deserialize(response, typeof(List<Order>));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Create a new order. If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.

To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.

See the BitMEX &lt;a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
      /// </summary>
      /// <param name="symbol">Instrument symbol.</param>
      /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
      /// <param name="price">Price to buy.</param>
      /// <param name="ioc">Set to true to place an immediateOrCancel order.</param>
      /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
      /// <returns></returns>
      public Order newOrder (string symbol, double? quantity, double? price, bool? ioc, string clOrdID) {
        // create path and map variables
        var path = "/order".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (symbol == null || quantity == null || price == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (symbol != null){
          if(symbol is byte[]) {
            formParams.Add("symbol", symbol);
          } else {
            string paramStr = (symbol is DateTime) ? ((DateTime)(object)symbol).ToString("u") : Convert.ToString(symbol);
            formParams.Add("symbol", paramStr);
          }
		}
        if (quantity != null){
          if(quantity is byte[]) {
            formParams.Add("quantity", quantity);
          } else {
            string paramStr = (quantity is DateTime) ? ((DateTime)(object)quantity).ToString("u") : Convert.ToString(quantity);
            formParams.Add("quantity", paramStr);
          }
		}
        if (price != null){
          if(price is byte[]) {
            formParams.Add("price", price);
          } else {
            string paramStr = (price is DateTime) ? ((DateTime)(object)price).ToString("u") : Convert.ToString(price);
            formParams.Add("price", paramStr);
          }
		}
        if (ioc != null){
          if(ioc is byte[]) {
            formParams.Add("ioc", ioc);
          } else {
            string paramStr = (ioc is DateTime) ? ((DateTime)(object)ioc).ToString("u") : Convert.ToString(ioc);
            formParams.Add("ioc", paramStr);
          }
		}
        if (clOrdID != null){
          if(clOrdID is byte[]) {
            formParams.Add("clOrdID", clOrdID);
          } else {
            string paramStr = (clOrdID is DateTime) ? ((DateTime)(object)clOrdID).ToString("u") : Convert.ToString(clOrdID);
            formParams.Add("clOrdID", paramStr);
          }
		}
        try {
          if (typeof(Order) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as Order;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (Order) ApiInvoker.deserialize(response, typeof(Order));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Cancel order(s). Send multiple order IDs to cancel in bulk. Either an orderID or a clOrdID must be provided.
      /// </summary>
      /// <param name="orderID">Order ID(s).</param>
      /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
      /// <param name="text">Optional cancellation annotation. e.g. 'Spread Exceeded'</param>
      /// <returns></returns>
      public List<Order> cancelOrder (string orderID, string clOrdID, string text) {
        // create path and map variables
        var path = "/order".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (orderID != null){
          if(orderID is byte[]) {
            formParams.Add("orderID", orderID);
          } else {
            string paramStr = (orderID is DateTime) ? ((DateTime)(object)orderID).ToString("u") : Convert.ToString(orderID);
            formParams.Add("orderID", paramStr);
          }
		}
        if (clOrdID != null){
          if(clOrdID is byte[]) {
            formParams.Add("clOrdID", clOrdID);
          } else {
            string paramStr = (clOrdID is DateTime) ? ((DateTime)(object)clOrdID).ToString("u") : Convert.ToString(clOrdID);
            formParams.Add("clOrdID", paramStr);
          }
		}
        if (text != null){
          if(text is byte[]) {
            formParams.Add("text", text);
          } else {
            string paramStr = (text is DateTime) ? ((DateTime)(object)text).ToString("u") : Convert.ToString(text);
            formParams.Add("text", paramStr);
          }
		}
        try {
          if (typeof(List<Order>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<Order>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<Order>) ApiInvoker.deserialize(response, typeof(List<Order>));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Cancels all of your orders. 
      /// </summary>
      /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
      /// <param name="text">Optional cancellation annotation. e.g. 'Spread Exceeded'</param>
      /// <returns></returns>
      public object cancelAll (string symbol, string text) {
        // create path and map variables
        var path = "/order/all".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (symbol != null){
          if(symbol is byte[]) {
            formParams.Add("symbol", symbol);
          } else {
            string paramStr = (symbol is DateTime) ? ((DateTime)(object)symbol).ToString("u") : Convert.ToString(symbol);
            formParams.Add("symbol", paramStr);
          }
		}
        if (text != null){
          if(text is byte[]) {
            formParams.Add("text", text);
          } else {
            string paramStr = (text is DateTime) ? ((DateTime)(object)text).ToString("u") : Convert.ToString(text);
            formParams.Add("text", paramStr);
          }
		}
        try {
          if (typeof(object) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as object;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, formParams);
            if(response != null){
               return (object) ApiInvoker.deserialize(response, typeof(object));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Automatically cancel all your orders after a specified timeout. Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-&quot;&gt;WebSocket&lt;/a&gt;.
      /// </summary>
      /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer. </param>
      /// <returns></returns>
      public object cancelAllAfter (double? timeout) {
        // create path and map variables
        var path = "/order/cancelAllAfter".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (timeout == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (timeout != null){
          if(timeout is byte[]) {
            formParams.Add("timeout", timeout);
          } else {
            string paramStr = (timeout is DateTime) ? ((DateTime)(object)timeout).ToString("u") : Convert.ToString(timeout);
            formParams.Add("timeout", paramStr);
          }
		}
        try {
          if (typeof(object) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as object;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (object) ApiInvoker.deserialize(response, typeof(object));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      }
    }
