require "uri"

module SwaggerClient
  class PositionApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get your positions.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
    # @option opts [String] :columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
    # @option opts [Float] :count Number of rows to fetch.
    # @return [Array<Position>]
    def position_find(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: PositionApi#position_find ..."
      end
      
      # resource path
      path = "/position".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'filter'] = opts[:'filter'] if opts[:'filter']
      query_params[:'columns'] = opts[:'columns'] if opts[:'columns']
      query_params[:'count'] = opts[:'count'] if opts[:'count']

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
        :return_type => 'Array<Position>')
      if Configuration.debugging
        Configuration.logger.debug "API called: PositionApi#position_find. Result: #{result.inspect}"
      end
      return result
    end

    # Toggle isolated (fixed) margin per-position.
    # On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off. A position must be open to isolate it.
    # @param symbol Position symbol to isolate.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :enabled If true, will enable isolated margin.
    # @return [Position]
    def position_isolate_margin(symbol, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: PositionApi#position_isolate_margin ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling position_isolate_margin" if symbol.nil?
      
      # resource path
      path = "/position/isolate".sub('{format}','json')

      # query parameters
      query_params = {}

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
      form_params["symbol"] = symbol
      form_params["enabled"] = opts[:'enabled'] if opts[:'enabled']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if Configuration.debugging
        Configuration.logger.debug "API called: PositionApi#position_isolate_margin. Result: #{result.inspect}"
      end
      return result
    end

    # Transfer equity in or out of a position.
    # When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
    # @param symbol Position symbol to isolate.
    # @param amount Amount to transfer, in satoshis. May be negative.
    # @param [Hash] opts the optional parameters
    # @return [Position]
    def position_transfer_isolated_margin(symbol, amount, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: PositionApi#position_transfer_isolated_margin ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling position_transfer_isolated_margin" if symbol.nil?
      
      # verify the required parameter 'amount' is set
      fail "Missing the required parameter 'amount' when calling position_transfer_isolated_margin" if amount.nil?
      
      # resource path
      path = "/position/transferMargin".sub('{format}','json')

      # query parameters
      query_params = {}

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
      form_params["symbol"] = symbol
      form_params["amount"] = amount

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if Configuration.debugging
        Configuration.logger.debug "API called: PositionApi#position_transfer_isolated_margin. Result: #{result.inspect}"
      end
      return result
    end
  end
end




