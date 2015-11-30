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
    public interface ISchemaApi
    {
        
        /// <summary>
        /// Get model schemata for data objects returned by this API.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="model">Optional model filter. If omitted, will return all models.</param>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 SchemaFind (string model = null);
  
        /// <summary>
        /// Get model schemata for data objects returned by this API.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="model">Optional model filter. If omitted, will return all models.</param>
        /// <returns>InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> SchemaFindAsync (string model = null);
        
        /// <summary>
        /// Returns help text &amp; subject list for websocket usage.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>InlineResponse200</returns>
        InlineResponse200 SchemaWebsocketHelp ();
  
        /// <summary>
        /// Returns help text &amp; subject list for websocket usage.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>InlineResponse200</returns>
        System.Threading.Tasks.Task<InlineResponse200> SchemaWebsocketHelpAsync ();
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class SchemaApi : ISchemaApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SchemaApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public SchemaApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="SchemaApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SchemaApi(String basePath)
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
        /// Get model schemata for data objects returned by this API. 
        /// </summary>
        /// <param name="model">Optional model filter. If omitted, will return all models.</param> 
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 SchemaFind (string model = null)
        {
            
    
            var path_ = "/schema";
    
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
            
            if (model != null) queryParams.Add("model", ApiClient.ParameterToString(model)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaFind: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaFind: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
    
        /// <summary>
        /// Get model schemata for data objects returned by this API. 
        /// </summary>
        /// <param name="model">Optional model filter. If omitted, will return all models.</param>
        /// <returns>InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> SchemaFindAsync (string model = null)
        {
            
    
            var path_ = "/schema";
    
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
            
            if (model != null) queryParams.Add("model", ApiClient.ParameterToString(model)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaFind: " + response.Content, response.Content);

            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
        
        /// <summary>
        /// Returns help text &amp; subject list for websocket usage. 
        /// </summary>
        /// <returns>InlineResponse200</returns>            
        public InlineResponse200 SchemaWebsocketHelp ()
        {
            
    
            var path_ = "/schema/websocketHelp";
    
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
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaWebsocketHelp: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaWebsocketHelp: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
    
        /// <summary>
        /// Returns help text &amp; subject list for websocket usage. 
        /// </summary>
        /// <returns>InlineResponse200</returns>
        public async System.Threading.Tasks.Task<InlineResponse200> SchemaWebsocketHelpAsync ()
        {
            
    
            var path_ = "/schema/websocketHelp";
    
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
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling SchemaWebsocketHelp: " + response.Content, response.Content);

            return (InlineResponse200) ApiClient.Deserialize(response, typeof(InlineResponse200));
        }
        
    }
    
}
