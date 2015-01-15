  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class OrderBookApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public OrderBookApi(String basePath = "https://www.bitmex.com/api/v1")
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
      /// Get current orderbook. 
      /// </summary>
      /// <param name="symbol">Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.</param>
      /// <param name="depth">Orderbook depth.</param>
      /// <returns></returns>
      public List<OrderBook> getOrderBook (string symbol, double? depth) {
        // create path and map variables
        var path = "/orderBook".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (symbol == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (symbol != null){
          string paramStr = (symbol is DateTime) ? ((DateTime)(object)symbol).ToString("u") : Convert.ToString(symbol);
          queryParams.Add("symbol", paramStr);
		}
        if (depth != null){
          string paramStr = (depth is DateTime) ? ((DateTime)(object)depth).ToString("u") : Convert.ToString(depth);
          queryParams.Add("depth", paramStr);
		}
        try {
          if (typeof(List<OrderBook>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<OrderBook>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<OrderBook>) ApiInvoker.deserialize(response, typeof(List<OrderBook>));
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
