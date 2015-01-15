  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class ExecutionApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public ExecutionApi(String basePath = "https://www.bitmex.com/api/v1")
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
      /// Get all raw executions for your account. This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {&quot;execType&quot;: [&quot;Settlement&quot;, &quot;Trade&quot;]} to filter on multiple values.
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
      public List<Execution> get (string symbol, object filter, List<string> columns, double? start, bool? reverse, DateTime? startTime, DateTime? endTime, double? count) {
        // create path and map variables
        var path = "/execution".Replace("{format}","json");

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
          if (typeof(List<Execution>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<Execution>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<Execution>) ApiInvoker.deserialize(response, typeof(List<Execution>));
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
      /// Get all balance-affecting executions. This includes each trade, insurance charge, and settlement. 
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
      public List<Execution> getTradeHistory (string symbol, object filter, List<string> columns, double? start, bool? reverse, DateTime? startTime, DateTime? endTime, double? count) {
        // create path and map variables
        var path = "/execution/tradeHistory".Replace("{format}","json");

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
          if (typeof(List<Execution>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<Execution>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<Execution>) ApiInvoker.deserialize(response, typeof(List<Execution>));
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
