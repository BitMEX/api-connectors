require "uri"

module SwaggerClient
  class OrderApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get your orders.
    # To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @option opts [Date] :start_time Starting date filter for results.
    # @option opts [Date] :end_time Ending date filter for results.
    # @return [Array<Order>]
    def order_get_orders(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_get_orders ..."
      end
      
      # resource path
      path = "/order".sub('{format}','json')

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
        :return_type => 'Array<Order>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_get_orders. Result: #{result.inspect}"
      end
      return result
    end

    # Create a new order.
    # This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
    # @param symbol Instrument symbol.
    # @param quantity Quantity. Use positive numbers to buy, negative to sell.
    # @param price Order price.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :time_in_force Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).
    # @option opts [String] :type Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;
    # @option opts [Float] :stop_price If order type is &#39;StopLimit&#39;, this is the trigger/stop price.
    # @option opts [String] :cl_ord_id Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
    # @return [Order]
    def order_new_order(symbol, quantity, price, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_new_order ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling order_new_order" if symbol.nil?
      
      # verify the required parameter 'quantity' is set
      fail "Missing the required parameter 'quantity' when calling order_new_order" if quantity.nil?
      
      # verify the required parameter 'price' is set
      fail "Missing the required parameter 'price' when calling order_new_order" if price.nil?
      
      # resource path
      path = "/order".sub('{format}','json')

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
      form_params["quantity"] = quantity
      form_params["price"] = price
      form_params["timeInForce"] = opts[:'time_in_force'] if opts[:'time_in_force']
      form_params["type"] = opts[:'type'] if opts[:'type']
      form_params["stopPrice"] = opts[:'stop_price'] if opts[:'stop_price']
      form_params["clOrdID"] = opts[:'cl_ord_id'] if opts[:'cl_ord_id']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Order')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_new_order. Result: #{result.inspect}"
      end
      return result
    end

    # Cancel order(s). Send multiple order IDs to cancel in bulk.
    # Either an orderID or a clOrdID must be provided.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :order_id Order ID(s).
    # @option opts [String] :cl_ord_id Client Order ID(s). See POST /order.
    # @option opts [String] :text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
    # @return [Array<Order>]
    def order_cancel_order(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_cancel_order ..."
      end
      
      # resource path
      path = "/order".sub('{format}','json')

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
      form_params["orderID"] = opts[:'order_id'] if opts[:'order_id']
      form_params["clOrdID"] = opts[:'cl_ord_id'] if opts[:'cl_ord_id']
      form_params["text"] = opts[:'text'] if opts[:'text']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:DELETE, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Order>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_cancel_order. Result: #{result.inspect}"
      end
      return result
    end

    # Cancels all of your orders.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Optional symbol. If provided, only cancels orders for that symbol.
    # @option opts [String] :filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.
    # @option opts [String] :text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
    # @return [inline_response_200]
    def order_cancel_all(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_cancel_all ..."
      end
      
      # resource path
      path = "/order/all".sub('{format}','json')

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
      form_params["symbol"] = opts[:'symbol'] if opts[:'symbol']
      form_params["filter"] = opts[:'filter'] if opts[:'filter']
      form_params["text"] = opts[:'text'] if opts[:'text']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:DELETE, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'inline_response_200')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_cancel_all. Result: #{result.inspect}"
      end
      return result
    end

    # Automatically cancel all your orders after a specified timeout.
    # Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
    # @param timeout Timeout in ms. Set to 0 to cancel this timer.
    # @param [Hash] opts the optional parameters
    # @return [inline_response_200]
    def order_cancel_all_after(timeout, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_cancel_all_after ..."
      end
      
      # verify the required parameter 'timeout' is set
      fail "Missing the required parameter 'timeout' when calling order_cancel_all_after" if timeout.nil?
      
      # resource path
      path = "/order/cancelAllAfter".sub('{format}','json')

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
      form_params["timeout"] = timeout

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'inline_response_200')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_cancel_all_after. Result: #{result.inspect}"
      end
      return result
    end

    # Close a position with a market order.
    # If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
    # @param symbol Symbol of position to close.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :price Optional limit price.
    # @return [Order]
    def order_close_position(symbol, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_close_position ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling order_close_position" if symbol.nil?
      
      # resource path
      path = "/order/closePosition".sub('{format}','json')

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
      form_params["price"] = opts[:'price'] if opts[:'price']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Order')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_close_position. Result: #{result.inspect}"
      end
      return result
    end

    # Get open liquidation orders.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :filter Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
    # @return [Array<LiquidationOrder>]
    def order_get_close_out_orders(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_get_close_out_orders ..."
      end
      
      # resource path
      path = "/order/liquidations".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'filter'] = opts[:'filter'] if opts[:'filter']

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
        :return_type => 'Array<LiquidationOrder>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_get_close_out_orders. Result: #{result.inspect}"
      end
      return result
    end
  end
end




