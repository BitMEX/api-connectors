  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class QuoteApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public QuoteApi(String basePath = "https://www.bitmex.com/api/v1")
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
      /// Get previous quotes bucketed by seconds. 
      /// </summary>
      /// <param name="symbol">Instrument name.</param>
      /// <param name="startTime">Start date.</param>
      /// <param name="endTime">End Date.</param>
      /// <param name="count">Number of buckets to fetch</param>
      /// <param name="binSize">Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].</param>
      /// <returns></returns>
      public List<quote> quote_getBucketed (string symbol, DateTime? startTime, DateTime? endTime, double? count, string binSize) {
        // create path and map variables
        var path = "/quote/getBucketed".Replace("{format}","json");

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
        if (binSize != null){
          string paramStr = (binSize is DateTime) ? ((DateTime)(object)binSize).ToString("u") : Convert.ToString(binSize);
          queryParams.Add("binSize", paramStr);
		}
        if (startTime != null){
          string paramStr = (startTime is DateTime) ? ((DateTime)(object)startTime).ToString("u") : Convert.ToString(startTime);
          queryParams.Add("startTime", paramStr);
		}
        if (endTime != null){
          string paramStr = (endTime is DateTime) ? ((DateTime)(object)endTime).ToString("u") : Convert.ToString(endTime);
          queryParams.Add("endTime", paramStr);
		}
        if (count != null){
          string paramStr = (count is DateTime) ? ((DateTime)(object)count).ToString("u") : Convert.ToString(count);
          queryParams.Add("count", paramStr);
		}
        try {
          if (typeof(List<quote>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<quote>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<quote>) ApiInvoker.deserialize(response, typeof(List<quote>));
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
