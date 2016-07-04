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
    public interface ILeaderboardApi
    {
        
        /// <summary>
        /// Get current leaderboard.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="method">Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;</param>
        /// <returns></returns>
        List<Leaderboard> LeaderboardGet (string method = null);
  
        /// <summary>
        /// Get current leaderboard.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="method">Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Leaderboard>> LeaderboardGetAsync (string method = null);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class LeaderboardApi : ILeaderboardApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LeaderboardApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public LeaderboardApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="LeaderboardApi"/> class.
        /// </summary>
        /// <returns></returns>
        public LeaderboardApi(String basePath)
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
        /// Get current leaderboard. 
        /// </summary>
        /// <param name="method">Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;</param> 
        /// <returns></returns>            
        public List<Leaderboard> LeaderboardGet (string method = null)
        {
            
    
            var path_ = "/leaderboard";
    
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
            
            if (method != null) queryParams.Add("method", ApiClient.ParameterToString(method)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling LeaderboardGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling LeaderboardGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Leaderboard>) ApiClient.Deserialize(response, typeof(List<Leaderboard>));
        }
    
        /// <summary>
        /// Get current leaderboard. 
        /// </summary>
        /// <param name="method">Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Leaderboard>> LeaderboardGetAsync (string method = null)
        {
            
    
            var path_ = "/leaderboard";
    
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
            
            if (method != null) queryParams.Add("method", ApiClient.ParameterToString(method)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling LeaderboardGet: " + response.Content, response.Content);

            return (List<Leaderboard>) ApiClient.Deserialize(response, typeof(List<Leaderboard>));
        }
        
    }
    
}
