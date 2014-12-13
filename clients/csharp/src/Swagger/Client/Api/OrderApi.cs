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
      /// Create a new order. [Deprecated] 
      /// </summary>
      /// <param name="symbol">Instrument name.</param>
      /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
      /// <param name="price">Price to buy.</param>
      /// <param name="ioc">Set to true to place an immediateOrCancel order.</param>
      /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
      /// <returns></returns>
      public Order newOrder (string symbol, double? quantity, double? price, bool? ioc, string clOrdID) {
        // create path and map variables
        var path = "/order/new".Replace("{format}","json");

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
      /// Create a new order. If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions executions (including on the WebSocket), and can be used to cancel the order.
      /// </summary>
      /// <param name="symbol">Instrument name.</param>
      /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
      /// <param name="price">Price to buy.</param>
      /// <param name="ioc">Set to true to place an immediateOrCancel order.</param>
      /// <param name="clOrdID">Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.</param>
      /// <returns></returns>
      public Order newOrder_OrderApi_0 (string symbol, double? quantity, double? price, bool? ioc, string clOrdID) {
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
      /// Get your orders. 
      /// </summary>
      /// <param name="filter">Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.</param>
      /// <param name="columns">Which columns to fetch. For example, send [&quot;columnName&quot;].</param>
      /// <param name="count">Number of rows to fetch.</param>
      /// <returns></returns>
      public List<Order> getOrders (object filter, List<any> columns, double? count) {
        // create path and map variables
        var path = "/order".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

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
      /// Cancel order(s). Send multiple order IDs to cancel in bulk. [Deprecated] 
      /// </summary>
      /// <param name="orderID">Order ID(s).</param>
      /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
      /// <param name="text">Optional cancellation annotation. e.g. 'Spread Exceeded'</param>
      /// <returns></returns>
      public List<Order> cancelOrder_OrderApi_0 (string orderID, string clOrdID, string text) {
        // create path and map variables
        var path = "/order/cancel".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (orderID == null ) {
           throw new ApiException(400, "missing required params");
        }
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
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
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
      /// Get your orders. [Deprecated, use GET /order] 
      /// </summary>
      /// <param name="filter">Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.</param>
      /// <param name="columns">Which columns to fetch. For example, send [&quot;columnName&quot;].</param>
      /// <param name="count">Number of rows to fetch.</param>
      /// <returns></returns>
      public List<Order> getOrders_OrderApi_0 (object filter, List<any> columns, double? count) {
        // create path and map variables
        var path = "/order/myOrders".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

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
      /// Get your open orders. 
      /// </summary>
      /// <param name="filter">Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.</param>
      /// <param name="columns">Which columns to fetch. For example, send [&quot;columnName&quot;].</param>
      /// <param name="count">Number of rows to fetch.</param>
      /// <returns></returns>
      public List<Order> getOrders_OrderApi_1 (object filter, List<any> columns, double? count) {
        // create path and map variables
        var path = "/order/myOpenOrders".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

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
