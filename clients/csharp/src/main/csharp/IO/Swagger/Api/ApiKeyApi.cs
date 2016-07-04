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
    public interface IApiKeyApi
    {
        
        /// <summary>
        /// Get your API Keys.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        List<ApiKey> ApiKeyGet (bool? reverse = null);
  
        /// <summary>
        /// Get your API Keys.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<ApiKey>> ApiKeyGetAsync (bool? reverse = null);
        
        /// <summary>
        /// Create a new API Key.
        /// </summary>
        /// <remarks>
        /// API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
        /// </remarks>
        /// <param name="name">Key name. This name is for reference only.</param>
        /// <param name="cidr">CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;</param>
        /// <param name="permissions">Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].</param>
        /// <param name="enabled">Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>ApiKey</returns>
        ApiKey ApiKeyNew (string name = null, string cidr = null, string permissions = null, bool? enabled = null, string token = null);
  
        /// <summary>
        /// Create a new API Key.
        /// </summary>
        /// <remarks>
        /// API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
        /// </remarks>
        /// <param name="name">Key name. This name is for reference only.</param>
        /// <param name="cidr">CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;</param>
        /// <param name="permissions">Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].</param>
        /// <param name="enabled">Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>ApiKey</returns>
        System.Threading.Tasks.Task<ApiKey> ApiKeyNewAsync (string name = null, string cidr = null, string permissions = null, bool? enabled = null, string token = null);
        
        /// <summary>
        /// Remove an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 ApiKeyRemove (string apiKeyID);
  
        /// <summary>
        /// Remove an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> ApiKeyRemoveAsync (string apiKeyID);
        
        /// <summary>
        /// Disable an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        ApiKey ApiKeyDisable (string apiKeyID);
  
        /// <summary>
        /// Disable an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        System.Threading.Tasks.Task<ApiKey> ApiKeyDisableAsync (string apiKeyID);
        
        /// <summary>
        /// Enable an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        ApiKey ApiKeyEnable (string apiKeyID);
  
        /// <summary>
        /// Enable an API Key.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        System.Threading.Tasks.Task<ApiKey> ApiKeyEnableAsync (string apiKeyID);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ApiKeyApi : IApiKeyApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiKeyApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ApiKeyApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ApiKeyApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ApiKeyApi(String basePath)
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
        /// Get your API Keys. 
        /// </summary>
        /// <param name="reverse">If true, will sort results newest first.</param> 
        /// <returns></returns>            
        public List<ApiKey> ApiKeyGet (bool? reverse = null)
        {
            
    
            var path_ = "/apiKey";
    
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
            
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<ApiKey>) ApiClient.Deserialize(response, typeof(List<ApiKey>));
        }
    
        /// <summary>
        /// Get your API Keys. 
        /// </summary>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<ApiKey>> ApiKeyGetAsync (bool? reverse = null)
        {
            
    
            var path_ = "/apiKey";
    
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
            
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyGet: " + response.Content, response.Content);

            return (List<ApiKey>) ApiClient.Deserialize(response, typeof(List<ApiKey>));
        }
        
        /// <summary>
        /// Create a new API Key. API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
        /// </summary>
        /// <param name="name">Key name. This name is for reference only.</param> 
        /// <param name="cidr">CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;</param> 
        /// <param name="permissions">Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].</param> 
        /// <param name="enabled">Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.</param> 
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param> 
        /// <returns>ApiKey</returns>            
        public ApiKey ApiKeyNew (string name = null, string cidr = null, string permissions = null, bool? enabled = null, string token = null)
        {
            
    
            var path_ = "/apiKey";
    
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
            
            
            
            if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
            if (cidr != null) formParams.Add("cidr", ApiClient.ParameterToString(cidr)); // form parameter
            if (permissions != null) formParams.Add("permissions", ApiClient.ParameterToString(permissions)); // form parameter
            if (enabled != null) formParams.Add("enabled", ApiClient.ParameterToString(enabled)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyNew: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyNew: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
    
        /// <summary>
        /// Create a new API Key. API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
        /// </summary>
        /// <param name="name">Key name. This name is for reference only.</param>
        /// <param name="cidr">CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;</param>
        /// <param name="permissions">Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].</param>
        /// <param name="enabled">Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>ApiKey</returns>
        public async System.Threading.Tasks.Task<ApiKey> ApiKeyNewAsync (string name = null, string cidr = null, string permissions = null, bool? enabled = null, string token = null)
        {
            
    
            var path_ = "/apiKey";
    
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
            
            
            
            if (name != null) formParams.Add("name", ApiClient.ParameterToString(name)); // form parameter
            if (cidr != null) formParams.Add("cidr", ApiClient.ParameterToString(cidr)); // form parameter
            if (permissions != null) formParams.Add("permissions", ApiClient.ParameterToString(permissions)); // form parameter
            if (enabled != null) formParams.Add("enabled", ApiClient.ParameterToString(enabled)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyNew: " + response.Content, response.Content);

            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
        
        /// <summary>
        /// Remove an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 ApiKeyRemove (string apiKeyID)
        {
            
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyRemove");
            
    
            var path_ = "/apiKey";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyRemove: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyRemove: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
    
        /// <summary>
        /// Remove an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> ApiKeyRemoveAsync (string apiKeyID)
        {
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyRemove");
            
    
            var path_ = "/apiKey";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyRemove: " + response.Content, response.Content);

            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
        
        /// <summary>
        /// Disable an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param> 
        /// <returns>ApiKey</returns>            
        public ApiKey ApiKeyDisable (string apiKeyID)
        {
            
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyDisable");
            
    
            var path_ = "/apiKey/disable";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyDisable: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyDisable: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
    
        /// <summary>
        /// Disable an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        public async System.Threading.Tasks.Task<ApiKey> ApiKeyDisableAsync (string apiKeyID)
        {
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyDisable");
            
    
            var path_ = "/apiKey/disable";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyDisable: " + response.Content, response.Content);

            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
        
        /// <summary>
        /// Enable an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param> 
        /// <returns>ApiKey</returns>            
        public ApiKey ApiKeyEnable (string apiKeyID)
        {
            
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyEnable");
            
    
            var path_ = "/apiKey/enable";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyEnable: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyEnable: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
    
        /// <summary>
        /// Enable an API Key. 
        /// </summary>
        /// <param name="apiKeyID">API Key ID (public component).</param>
        /// <returns>ApiKey</returns>
        public async System.Threading.Tasks.Task<ApiKey> ApiKeyEnableAsync (string apiKeyID)
        {
            // verify the required parameter 'apiKeyID' is set
            if (apiKeyID == null) throw new ApiException(400, "Missing required parameter 'apiKeyID' when calling ApiKeyEnable");
            
    
            var path_ = "/apiKey/enable";
    
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
            
            
            
            if (apiKeyID != null) formParams.Add("apiKeyID", ApiClient.ParameterToString(apiKeyID)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ApiKeyEnable: " + response.Content, response.Content);

            return (ApiKey) ApiClient.Deserialize(response, typeof(ApiKey));
        }
        
    }
    
}
