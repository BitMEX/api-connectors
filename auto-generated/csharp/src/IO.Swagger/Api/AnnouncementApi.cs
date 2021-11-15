/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  - --  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  - --  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAnnouncementApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>List&lt;Announcement&gt;</returns>
        List<Announcement> AnnouncementGet (string columns = null);

        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>ApiResponse of List&lt;Announcement&gt;</returns>
        ApiResponse<List<Announcement>> AnnouncementGetWithHttpInfo (string columns = null);
        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;Announcement&gt;</returns>
        List<Announcement> AnnouncementGetUrgent ();

        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;Announcement&gt;</returns>
        ApiResponse<List<Announcement>> AnnouncementGetUrgentWithHttpInfo ();
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>Task of List&lt;Announcement&gt;</returns>
        System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetAsync (string columns = null);

        /// <summary>
        /// Get site announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Announcement&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Announcement>>> AnnouncementGetAsyncWithHttpInfo (string columns = null);
        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;Announcement&gt;</returns>
        System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetUrgentAsync ();

        /// <summary>
        /// Get urgent (banner) announcements.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;Announcement&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<Announcement>>> AnnouncementGetUrgentAsyncWithHttpInfo ();
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class AnnouncementApi : IAnnouncementApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="AnnouncementApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AnnouncementApi(String basePath)
        {
            this.Configuration = new IO.Swagger.Client.Configuration { BasePath = basePath };

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AnnouncementApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public AnnouncementApi(IO.Swagger.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = IO.Swagger.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public IO.Swagger.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Get site announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>List&lt;Announcement&gt;</returns>
        public List<Announcement> AnnouncementGet (string columns = null)
        {
             ApiResponse<List<Announcement>> localVarResponse = AnnouncementGetWithHttpInfo(columns);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Get site announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>ApiResponse of List&lt;Announcement&gt;</returns>
        public ApiResponse< List<Announcement> > AnnouncementGetWithHttpInfo (string columns = null)
        {

            var localVarPath = "/announcement";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml",
                "text/xml",
                "application/javascript",
                "text/javascript"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (columns != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "columns", columns)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AnnouncementGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Announcement>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Announcement>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Announcement>)));
        }

        /// <summary>
        /// Get site announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>Task of List&lt;Announcement&gt;</returns>
        public async System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetAsync (string columns = null)
        {
             ApiResponse<List<Announcement>> localVarResponse = await AnnouncementGetAsyncWithHttpInfo(columns);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Get site announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;Announcement&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Announcement>>> AnnouncementGetAsyncWithHttpInfo (string columns = null)
        {

            var localVarPath = "/announcement";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml",
                "text/xml",
                "application/javascript",
                "text/javascript"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (columns != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "columns", columns)); // query parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AnnouncementGet", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Announcement>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Announcement>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Announcement>)));
        }

        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>List&lt;Announcement&gt;</returns>
        public List<Announcement> AnnouncementGetUrgent ()
        {
             ApiResponse<List<Announcement>> localVarResponse = AnnouncementGetUrgentWithHttpInfo();
             return localVarResponse.Data;
        }

        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of List&lt;Announcement&gt;</returns>
        public ApiResponse< List<Announcement> > AnnouncementGetUrgentWithHttpInfo ()
        {

            var localVarPath = "/announcement/urgent";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml",
                "text/xml",
                "application/javascript",
                "text/javascript"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);


            // authentication (apiExpires) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-expires")))
            {
                localVarHeaderParams["api-expires"] = this.Configuration.GetApiKeyWithPrefix("api-expires");
            }
            // authentication (apiKey) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-key")))
            {
                localVarHeaderParams["api-key"] = this.Configuration.GetApiKeyWithPrefix("api-key");
            }
            // authentication (apiSignature) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-signature")))
            {
                localVarHeaderParams["api-signature"] = this.Configuration.GetApiKeyWithPrefix("api-signature");
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AnnouncementGetUrgent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Announcement>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Announcement>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Announcement>)));
        }

        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of List&lt;Announcement&gt;</returns>
        public async System.Threading.Tasks.Task<List<Announcement>> AnnouncementGetUrgentAsync ()
        {
             ApiResponse<List<Announcement>> localVarResponse = await AnnouncementGetUrgentAsyncWithHttpInfo();
             return localVarResponse.Data;

        }

        /// <summary>
        /// Get urgent (banner) announcements. 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>Task of ApiResponse (List&lt;Announcement&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<Announcement>>> AnnouncementGetUrgentAsyncWithHttpInfo ()
        {

            var localVarPath = "/announcement/urgent";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json", 
                "application/x-www-form-urlencoded"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json",
                "application/xml",
                "text/xml",
                "application/javascript",
                "text/javascript"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);


            // authentication (apiExpires) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-expires")))
            {
                localVarHeaderParams["api-expires"] = this.Configuration.GetApiKeyWithPrefix("api-expires");
            }
            // authentication (apiKey) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-key")))
            {
                localVarHeaderParams["api-key"] = this.Configuration.GetApiKeyWithPrefix("api-key");
            }
            // authentication (apiSignature) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("api-signature")))
            {
                localVarHeaderParams["api-signature"] = this.Configuration.GetApiKeyWithPrefix("api-signature");
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AnnouncementGetUrgent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<Announcement>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<Announcement>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<Announcement>)));
        }

    }
}
