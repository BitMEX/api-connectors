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
    public interface IAnnouncementApi
    {
        
        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.</param>
        /// <returns></returns>
        List<Announcement> AnnouncementGet (string columns = null);
  
        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetAsync (string columns = null);
        
        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        List<Announcement> AnnouncementGetUrgent ();
  
        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetUrgentAsync ();
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AnnouncementApi : IAnnouncementApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnnouncementApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AnnouncementApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="AnnouncementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AnnouncementApi(String basePath)
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
        /// Get site announcements. 
        /// </summary>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.</param> 
        /// <returns></returns>            
        public List<Announcement> AnnouncementGet (string columns = null)
        {
            
    
            var path_ = "/announcement";
    
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
            
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGet: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Announcement>) ApiClient.Deserialize(response, typeof(List<Announcement>));
        }
    
        /// <summary>
        /// Get site announcements. 
        /// </summary>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetAsync (string columns = null)
        {
            
    
            var path_ = "/announcement";
    
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
            
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGet: " + response.Content, response.Content);

            return (List<Announcement>) ApiClient.Deserialize(response, typeof(List<Announcement>));
        }
        
        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <returns></returns>            
        public List<Announcement> AnnouncementGetUrgent ()
        {
            
    
            var path_ = "/announcement/urgent";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGetUrgent: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGetUrgent: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Announcement>) ApiClient.Deserialize(response, typeof(List<Announcement>));
        }
    
        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetUrgentAsync ()
        {
            
    
            var path_ = "/announcement/urgent";
    
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
                throw new ApiException ((int)response.StatusCode, "Error calling AnnouncementGetUrgent: " + response.Content, response.Content);

            return (List<Announcement>) ApiClient.Deserialize(response, typeof(List<Announcement>));
        }
        
    }
    
}
