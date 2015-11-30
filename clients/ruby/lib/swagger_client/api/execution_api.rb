require "uri"

module SwaggerClient
  class ExecutionApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get all raw executions for your account.
    # This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {\&quot;execType\&quot;: [\&quot;Settlement\&quot;, \&quot;Trade\&quot;]} to filter on multiple values.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<Execution>]
    def execution_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ExecutionApi#execution_get ..."
      end
      
      # resource path
      path = "/execution".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if opts[:'symbol']
      query_params[:'filter'] = opts[:'filter'] if opts[:'filter']
      query_params[:'columns'] = opts[:'columns'] if opts[:'columns']
      query_params[:'count'] = opts[:'count'] if opts[:'count']
      query_params[:'start'] = opts[:'start'] if opts[:'start']
      query_params[:'reverse'] = opts[:'reverse'] if opts[:'reverse']
      query_params[:'startTime'] = opts[:'start_time'] if opts[:'start_time']
      query_params[:'endTime'] = opts[:'end_time'] if opts[:'end_time']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Execution>')
      if Configuration.debugging
        Configuration.logger.debug "API called: ExecutionApi#execution_get. Result: #{result.inspect}"
      end
      return result
    end

    # Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<Execution>]
    def execution_get_trade_history(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ExecutionApi#execution_get_trade_history ..."
      end
      
      # resource path
      path = "/execution/tradeHistory".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if opts[:'symbol']
      query_params[:'filter'] = opts[:'filter'] if opts[:'filter']
      query_params[:'columns'] = opts[:'columns'] if opts[:'columns']
      query_params[:'count'] = opts[:'count'] if opts[:'count']
      query_params[:'start'] = opts[:'start'] if opts[:'start']
      query_params[:'reverse'] = opts[:'reverse'] if opts[:'reverse']
      query_params[:'startTime'] = opts[:'start_time'] if opts[:'start_time']
      query_params[:'endTime'] = opts[:'end_time'] if opts[:'end_time']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Execution>')
      if Configuration.debugging
        Configuration.logger.debug "API called: ExecutionApi#execution_get_trade_history. Result: #{result.inspect}"
      end
      return result
    end
  end
end




