  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class ApiKeyApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public ApiKeyApi(String basePath = "https://www.bitmex.com/api/v1")
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
      /// Create a new API Key. API Keys can also be created via&lt;a href=&quot;https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py&quot;&gt;this Python script&lt;/a&gt;.
      /// </summary>
      /// <param name="name">Key name. This name is for reference only.</param>
      /// <param name="cidr">CIDR block to restrict this key to. To restrict to a single address, append &quot;/32&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=&quot;http://software77.net/cidr-101.html&quot;&gt;More on CIDR blocks&lt;/a&gt;</param>
      /// <param name="enabled">Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.</param>
      /// <returns></returns>
      public ApiKey createKey (string name, string cidr, bool? enabled) {
        // create path and map variables
        var path = "/apiKey".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (name != null){
          if(name is byte[]) {
            formParams.Add("name", name);
          } else {
            string paramStr = (name is DateTime) ? ((DateTime)(object)name).ToString("u") : Convert.ToString(name);
            formParams.Add("name", paramStr);
          }
		}
        if (cidr != null){
          if(cidr is byte[]) {
            formParams.Add("cidr", cidr);
          } else {
            string paramStr = (cidr is DateTime) ? ((DateTime)(object)cidr).ToString("u") : Convert.ToString(cidr);
            formParams.Add("cidr", paramStr);
          }
		}
        if (enabled != null){
          if(enabled is byte[]) {
            formParams.Add("enabled", enabled);
          } else {
            string paramStr = (enabled is DateTime) ? ((DateTime)(object)enabled).ToString("u") : Convert.ToString(enabled);
            formParams.Add("enabled", paramStr);
          }
		}
        try {
          if (typeof(ApiKey) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as ApiKey;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (ApiKey) ApiInvoker.deserialize(response, typeof(ApiKey));
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
      /// Get your API Keys. 
      /// </summary>
      /// <returns></returns>
      public List<ApiKey> getKeys () {
        // create path and map variables
        var path = "/apiKey".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(List<ApiKey>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<ApiKey>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<ApiKey>) ApiInvoker.deserialize(response, typeof(List<ApiKey>));
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
      /// Remove an API Key. 
      /// </summary>
      /// <param name="accessKey">Access Key (public component).</param>
      /// <returns></returns>
      public bool? remove (string accessKey) {
        // create path and map variables
        var path = "/apiKey".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (accessKey != null){
          if(accessKey is byte[]) {
            formParams.Add("accessKey", accessKey);
          } else {
            string paramStr = (accessKey is DateTime) ? ((DateTime)(object)accessKey).ToString("u") : Convert.ToString(accessKey);
            formParams.Add("accessKey", paramStr);
          }
		}
        try {
          if (typeof(bool?) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as bool?;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, formParams);
            if(response != null){
               return (bool?) ApiInvoker.deserialize(response, typeof(bool?));
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
      /// Disable an API Key. 
      /// </summary>
      /// <param name="accessKey">Access Key (public component).</param>
      /// <returns></returns>
      public ApiKey disable (string accessKey) {
        // create path and map variables
        var path = "/apiKey/disable".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (accessKey != null){
          if(accessKey is byte[]) {
            formParams.Add("accessKey", accessKey);
          } else {
            string paramStr = (accessKey is DateTime) ? ((DateTime)(object)accessKey).ToString("u") : Convert.ToString(accessKey);
            formParams.Add("accessKey", paramStr);
          }
		}
        try {
          if (typeof(ApiKey) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as ApiKey;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (ApiKey) ApiInvoker.deserialize(response, typeof(ApiKey));
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
      /// Enable an API Key. 
      /// </summary>
      /// <param name="accessKey">Access Key (public component).</param>
      /// <returns></returns>
      public ApiKey enable (string accessKey) {
        // create path and map variables
        var path = "/apiKey/enable".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (accessKey != null){
          if(accessKey is byte[]) {
            formParams.Add("accessKey", accessKey);
          } else {
            string paramStr = (accessKey is DateTime) ? ((DateTime)(object)accessKey).ToString("u") : Convert.ToString(accessKey);
            formParams.Add("accessKey", paramStr);
          }
		}
        try {
          if (typeof(ApiKey) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as ApiKey;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (ApiKey) ApiInvoker.deserialize(response, typeof(ApiKey));
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
