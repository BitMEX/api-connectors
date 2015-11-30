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
    public interface IChatApi
    {
        
        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        List<Chat> ChatGet (double? count = null, double? start = null, bool? reverse = null);
  
        /// <summary>
        /// Get chat messages.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Chat>> ChatGetAsync (double? count = null, double? start = null, bool? reverse = null);
        
        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="message"></param>
        /// <returns>Chat</returns>
        Chat ChatSend (string message);
  
        /// <summary>
        /// Send a chat message.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="message"></param>
        /// <returns>Chat</returns>
        System.Threading.Tasks.Task<Chat> ChatSendAsync (string message);
        
        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <returns>ConnectedUsers</returns>
        ConnectedUsers ChatGetConnected ();
  
        /// <summary>
        /// Get connected users.
        /// </summary>
        /// <remarks>
        /// Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </remarks>
        /// <returns>ConnectedUsers</returns>
        System.Threading.Tasks.Task<ConnectedUsers> ChatGetConnectedAsync ();
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ChatApi : IChatApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public ChatApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="ChatApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ChatApi(String basePath)
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
        /// Get chat messages. 
        /// </summary>
        /// <param name="count">Number of results to fetch.</param> 
        /// <param name="start">Starting point for results.</param> 
        /// <param name="reverse">If true, will sort results newest first.</param> 
        /// <returns></returns>            
        public List<Chat> ChatGet (double? count = null, double? start = null, bool? reverse = null)
        {
            
    
            var path_ = "/chat";
    
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
            
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Chat>) ApiClient.Deserialize(response, typeof(List<Chat>));
        }
    
        /// <summary>
        /// Get chat messages. 
        /// </summary>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Chat>> ChatGetAsync (double? count = null, double? start = null, bool? reverse = null)
        {
            
    
            var path_ = "/chat";
    
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
            
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGet: " + response.Content, response.Content);

            return (List<Chat>) ApiClient.Deserialize(response, typeof(List<Chat>));
        }
        
        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <param name="message"></param> 
        /// <returns>Chat</returns>            
        public Chat ChatSend (string message)
        {
            
            // verify the required parameter 'message' is set
            if (message == null) throw new ApiException(400, "Missing required parameter 'message' when calling ChatSend");
            
    
            var path_ = "/chat";
    
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
            
            
            
            if (message != null) formParams.Add("message", ApiClient.ParameterToString(message)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatSend: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatSend: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Chat) ApiClient.Deserialize(response, typeof(Chat));
        }
    
        /// <summary>
        /// Send a chat message. 
        /// </summary>
        /// <param name="message"></param>
        /// <returns>Chat</returns>
        public async System.Threading.Tasks.Task<Chat> ChatSendAsync (string message)
        {
            // verify the required parameter 'message' is set
            if (message == null) throw new ApiException(400, "Missing required parameter 'message' when calling ChatSend");
            
    
            var path_ = "/chat";
    
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
            
            
            
            if (message != null) formParams.Add("message", ApiClient.ParameterToString(message)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatSend: " + response.Content, response.Content);

            return (Chat) ApiClient.Deserialize(response, typeof(Chat));
        }
        
        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <returns>ConnectedUsers</returns>            
        public ConnectedUsers ChatGetConnected ()
        {
            
    
            var path_ = "/chat/connected";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGetConnected: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGetConnected: " + response.ErrorMessage, response.ErrorMessage);
    
            return (ConnectedUsers) ApiClient.Deserialize(response, typeof(ConnectedUsers));
        }
    
        /// <summary>
        /// Get connected users. Returns an array with browser users in the first position and API users (bots) in the second position.
        /// </summary>
        /// <returns>ConnectedUsers</returns>
        public async System.Threading.Tasks.Task<ConnectedUsers> ChatGetConnectedAsync ()
        {
            
    
            var path_ = "/chat/connected";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling ChatGetConnected: " + response.Content, response.Content);

            return (ConnectedUsers) ApiClient.Deserialize(response, typeof(ConnectedUsers));
        }
        
    }
    
}
