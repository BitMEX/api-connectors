=begin
#BitMEX API

### REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 

OpenAPI spec version: 1.2.0
Contact: support@bitmex.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.24-SNAPSHOT

=end

require 'uri'

module SwaggerClient
  class QuoteApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get Quotes.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. Must be a positive integer. (default to 100)
    # @option opts [Float] :start Starting point for results. (default to 0)
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first. (default to false)
    # @option opts [DateTime] :start_time Starting date filter for results.
    # @option opts [DateTime] :end_time Ending date filter for results.
    # @return [Array<Quote>]
    def quote_get(opts = {})
      data, _status_code, _headers = quote_get_with_http_info(opts)
      data
    end

    # Get Quotes.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. Must be a positive integer.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [DateTime] :start_time Starting date filter for results.
    # @option opts [DateTime] :end_time Ending date filter for results.
    # @return [Array<(Array<Quote>, Fixnum, Hash)>] Array<Quote> data, response status code and response headers
    def quote_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuoteApi.quote_get ...'
      end
      # resource path
      local_var_path = '/quote'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if !opts[:'symbol'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'columns'] = opts[:'columns'] if !opts[:'columns'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'start'] = opts[:'start'] if !opts[:'start'].nil?
      query_params[:'reverse'] = opts[:'reverse'] if !opts[:'reverse'].nil?
      query_params[:'startTime'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'endTime'] = opts[:'end_time'] if !opts[:'end_time'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Quote>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuoteApi#quote_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get previous quotes in time buckets.
    # Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :bin_size Time interval to bucket by. Available options: [1m,5m,1h,1d]. (default to 1m)
    # @option opts [BOOLEAN] :partial If true, will send in-progress (incomplete) bins for the current time period. (default to false)
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. Must be a positive integer. (default to 100)
    # @option opts [Float] :start Starting point for results. (default to 0)
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first. (default to false)
    # @option opts [DateTime] :start_time Starting date filter for results.
    # @option opts [DateTime] :end_time Ending date filter for results.
    # @return [Array<Quote>]
    def quote_get_bucketed(opts = {})
      data, _status_code, _headers = quote_get_bucketed_with_http_info(opts)
      data
    end

    # Get previous quotes in time buckets.
    # Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :bin_size Time interval to bucket by. Available options: [1m,5m,1h,1d].
    # @option opts [BOOLEAN] :partial If true, will send in-progress (incomplete) bins for the current time period.
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch. Must be a positive integer.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [DateTime] :start_time Starting date filter for results.
    # @option opts [DateTime] :end_time Ending date filter for results.
    # @return [Array<(Array<Quote>, Fixnum, Hash)>] Array<Quote> data, response status code and response headers
    def quote_get_bucketed_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuoteApi.quote_get_bucketed ...'
      end
      # resource path
      local_var_path = '/quote/bucketed'

      # query parameters
      query_params = {}
      query_params[:'binSize'] = opts[:'bin_size'] if !opts[:'bin_size'].nil?
      query_params[:'partial'] = opts[:'partial'] if !opts[:'partial'].nil?
      query_params[:'symbol'] = opts[:'symbol'] if !opts[:'symbol'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'columns'] = opts[:'columns'] if !opts[:'columns'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?
      query_params[:'start'] = opts[:'start'] if !opts[:'start'].nil?
      query_params[:'reverse'] = opts[:'reverse'] if !opts[:'reverse'].nil?
      query_params[:'startTime'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'endTime'] = opts[:'end_time'] if !opts[:'end_time'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Quote>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuoteApi#quote_get_bucketed\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
