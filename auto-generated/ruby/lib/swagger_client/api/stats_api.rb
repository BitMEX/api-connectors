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
  class StatsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get exchange-wide and per-series turnover and volume statistics.
    # @param [Hash] opts the optional parameters
    # @return [Array<Stats>]
    def stats_get(opts = {})
      data, _status_code, _headers = stats_get_with_http_info(opts)
      data
    end

    # Get exchange-wide and per-series turnover and volume statistics.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Stats>, Fixnum, Hash)>] Array<Stats> data, response status code and response headers
    def stats_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StatsApi.stats_get ...'
      end
      # resource path
      local_var_path = '/stats'

      # query parameters
      query_params = {}

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
        :return_type => 'Array<Stats>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StatsApi#stats_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get historical exchange-wide and per-series turnover and volume statistics.
    # @param [Hash] opts the optional parameters
    # @return [Array<StatsHistory>]
    def stats_history(opts = {})
      data, _status_code, _headers = stats_history_with_http_info(opts)
      data
    end

    # Get historical exchange-wide and per-series turnover and volume statistics.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<StatsHistory>, Fixnum, Hash)>] Array<StatsHistory> data, response status code and response headers
    def stats_history_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StatsApi.stats_history ...'
      end
      # resource path
      local_var_path = '/stats/history'

      # query parameters
      query_params = {}

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
        :return_type => 'Array<StatsHistory>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StatsApi#stats_history\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a summary of exchange statistics in USD.
    # @param [Hash] opts the optional parameters
    # @return [Array<StatsUSD>]
    def stats_history_usd(opts = {})
      data, _status_code, _headers = stats_history_usd_with_http_info(opts)
      data
    end

    # Get a summary of exchange statistics in USD.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<StatsUSD>, Fixnum, Hash)>] Array<StatsUSD> data, response status code and response headers
    def stats_history_usd_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: StatsApi.stats_history_usd ...'
      end
      # resource path
      local_var_path = '/stats/historyUSD'

      # query parameters
      query_params = {}

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
        :return_type => 'Array<StatsUSD>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: StatsApi#stats_history_usd\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
