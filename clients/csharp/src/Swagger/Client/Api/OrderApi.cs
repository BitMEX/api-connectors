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
      /// Create a new order. 
      /// </summary>
      /// <param name="symbol">Instrument name.</param>
      /// <param name="quantity">Quantity. Use positive numbers to buy, negative to sell.</param>
      /// <param name="price">Price to buy.</param>
      /// <param name="ioc">Set to true to place an immediateOrCancel order.</param>
      /// <returns></returns>
      public order order_newOrder (string symbol, double? quantity, double? price, bool? ioc) {
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
        try {
          if (typeof(order) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as order;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (order) ApiInvoker.deserialize(response, typeof(order));
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
      /// Cancel an order. 
      /// </summary>
      /// <param name="orderID">Order ID.</param>
      /// <returns></returns>
      public order order_cancelOrder (string orderID) {
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
        try {
          if (typeof(order) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as order;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (order) ApiInvoker.deserialize(response, typeof(order));
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
      /// Get your recent orders. 
      /// </summary>
      /// <param name="filter">Table filter. Filter e.g. by symbol.</param>
      /// <param name="columns">Which columns to fetch.</param>
      /// <param name="count">Number of rows to fetch</param>
      /// <returns></returns>
      public List<order> order_myOrders (object filter, array<string> columns, double? count) {
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
          if (typeof(List<order>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<order>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<order>) ApiInvoker.deserialize(response, typeof(List<order>));
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
      /// <returns></returns>
      public List<order> order_myOpenOrders () {
        // create path and map variables
        var path = "/order/myOpenOrders".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(List<order>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<order>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<order>) ApiInvoker.deserialize(response, typeof(List<order>));
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
