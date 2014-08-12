  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class InstrumentApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public InstrumentApi(String basePath = "https://www.bitmex.com/api/v1")
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
      /// Get all listed instruments. 
      /// </summary>
      /// <param name="filter">Filter defining fields, where, orderBy, offset, and limit</param>
      /// <returns></returns>
      public List<instrument> instrument_find (object filter) {
        // create path and map variables
        var path = "/instrument".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (filter != null){
          string paramStr = (filter is DateTime) ? ((DateTime)(object)filter).ToString("u") : Convert.ToString(filter);
          queryParams.Add("filter", paramStr);
		}
        try {
          if (typeof(List<instrument>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<instrument>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<instrument>) ApiInvoker.deserialize(response, typeof(List<instrument>));
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
