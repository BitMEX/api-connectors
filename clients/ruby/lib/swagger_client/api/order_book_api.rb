require "uri"

module SwaggerClient
  class OrderBookApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get current orderbook.
    # 
    # @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :depth Orderbook depth.
    # @return [Array<OrderBook>]
    def order_book_get_order_book(symbol, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderBookApi#order_book_get_order_book ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling order_book_get_order_book" if symbol.nil?
      
      # resource path
      path = "/orderBook".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'symbol'] = symbol
      query_params[:'depth'] = opts[:'depth'] if opts[:'depth']

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
        :return_type => 'Array<OrderBook>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderBookApi#order_book_get_order_book. Result: #{result.inspect}"
      end
      return result
    end
  end
end




