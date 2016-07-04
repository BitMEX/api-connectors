require "uri"

module SwaggerClient
  class OrderApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get your orders.
    # To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
    # @option opts [String] :filter Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
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

    # Amend the quantity or price of an open order.
    # &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
    # @param [Hash] opts the optional parameters
    # @option opts [String] :order_id Order ID
    # @option opts [String] :cl_ord_id Client Order ID. See POST /order.
    # @option opts [Float] :simple_order_qty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
    # @option opts [Float] :order_qty Optional order quantity in units of the instrument (i.e. contracts).
    # @option opts [Float] :simple_leaves_qty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
    # @option opts [Float] :leaves_qty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
    # @option opts [Float] :price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
    # @option opts [Float] :stop_px Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
    # @option opts [Float] :peg_offset_value Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
    # @option opts [String] :text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
    # @return [Order]
    def order_amend(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_amend ..."
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
      form_params["simpleOrderQty"] = opts[:'simple_order_qty'] if opts[:'simple_order_qty']
      form_params["orderQty"] = opts[:'order_qty'] if opts[:'order_qty']
      form_params["simpleLeavesQty"] = opts[:'simple_leaves_qty'] if opts[:'simple_leaves_qty']
      form_params["leavesQty"] = opts[:'leaves_qty'] if opts[:'leaves_qty']
      form_params["price"] = opts[:'price'] if opts[:'price']
      form_params["stopPx"] = opts[:'stop_px'] if opts[:'stop_px']
      form_params["pegOffsetValue"] = opts[:'peg_offset_value'] if opts[:'peg_offset_value']
      form_params["text"] = opts[:'text'] if opts[:'text']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:PUT, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Order')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_amend. Result: #{result.inspect}"
      end
      return result
    end

    # Create a new order.
    # This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
    # @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.
    # @option opts [Float] :simple_order_qty Order quantity in units of the underlying instrument (i.e. Bitcoin).
    # @option opts [Float] :quantity Deprecated: use `orderQty`.
    # @option opts [Float] :order_qty Order quantity in units of the instrument (i.e. contracts).
    # @option opts [Float] :price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
    # @option opts [Float] :display_qty Optional quantity to display in the book. Use 0 for a hidden order.
    # @option opts [Float] :stop_price Deprecated: use `stopPx`.
    # @option opts [Float] :stop_px Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
    # @option opts [String] :cl_ord_id Optional Client Order ID. This clOrdID will come back on the order and any related executions.
    # @option opts [String] :cl_ord_link_id Optional Client Order Link ID for contingent orders.
    # @option opts [Float] :peg_offset_value Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
    # @option opts [String] :peg_price_type Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
    # @option opts [String] :type Deprecated: use `ordType`.
    # @option opts [String] :ord_type Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.
    # @option opts [String] :time_in_force Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
    # @option opts [String] :exec_inst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
    # @option opts [String] :contingency_type Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
    # @option opts [String] :text Optional order annotation. e.g. &#39;Take profit&#39;.
    # @return [Order]
    def order_new(symbol, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_new ..."
      end
      
      # verify the required parameter 'symbol' is set
      fail "Missing the required parameter 'symbol' when calling order_new" if symbol.nil?
      
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
      form_params["side"] = opts[:'side'] if opts[:'side']
      form_params["simpleOrderQty"] = opts[:'simple_order_qty'] if opts[:'simple_order_qty']
      form_params["quantity"] = opts[:'quantity'] if opts[:'quantity']
      form_params["orderQty"] = opts[:'order_qty'] if opts[:'order_qty']
      form_params["price"] = opts[:'price'] if opts[:'price']
      form_params["displayQty"] = opts[:'display_qty'] if opts[:'display_qty']
      form_params["stopPrice"] = opts[:'stop_price'] if opts[:'stop_price']
      form_params["stopPx"] = opts[:'stop_px'] if opts[:'stop_px']
      form_params["clOrdID"] = opts[:'cl_ord_id'] if opts[:'cl_ord_id']
      form_params["clOrdLinkID"] = opts[:'cl_ord_link_id'] if opts[:'cl_ord_link_id']
      form_params["pegOffsetValue"] = opts[:'peg_offset_value'] if opts[:'peg_offset_value']
      form_params["pegPriceType"] = opts[:'peg_price_type'] if opts[:'peg_price_type']
      form_params["type"] = opts[:'type'] if opts[:'type']
      form_params["ordType"] = opts[:'ord_type'] if opts[:'ord_type']
      form_params["timeInForce"] = opts[:'time_in_force'] if opts[:'time_in_force']
      form_params["execInst"] = opts[:'exec_inst'] if opts[:'exec_inst']
      form_params["contingencyType"] = opts[:'contingency_type'] if opts[:'contingency_type']
      form_params["text"] = opts[:'text'] if opts[:'text']

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
        Configuration.logger.debug "API called: OrderApi#order_new. Result: #{result.inspect}"
      end
      return result
    end

    # Cancel order(s). Send multiple order IDs to cancel in bulk.
    # Either an orderID or a clOrdID must be provided.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :order_id Order ID(s).
    # @option opts [String] :cl_ord_id Client Order ID(s). See POST /order.
    # @option opts [String] :text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
    # @return [Array<Order>]
    def order_cancel(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_cancel ..."
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
        Configuration.logger.debug "API called: OrderApi#order_cancel. Result: #{result.inspect}"
      end
      return result
    end

    # Cancels all of your orders.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Optional symbol. If provided, only cancels orders for that symbol.
    # @option opts [String] :filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.
    # @option opts [String] :text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
    # @return [inline_response_200_1]
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
        :return_type => 'inline_response_200_1')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_cancel_all. Result: #{result.inspect}"
      end
      return result
    end

    # Amend multiple orders.
    # Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :orders An array of orders.
    # @return [Array<Order>]
    def order_amend_bulk(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_amend_bulk ..."
      end
      
      # resource path
      path = "/order/bulk".sub('{format}','json')

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
      form_params["orders"] = opts[:'orders'] if opts[:'orders']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:PUT, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Order>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_amend_bulk. Result: #{result.inspect}"
      end
      return result
    end

    # Create multiple new orders.
    # This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :orders An array of orders.
    # @return [Array<Order>]
    def order_new_bulk(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: OrderApi#order_new_bulk ..."
      end
      
      # resource path
      path = "/order/bulk".sub('{format}','json')

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
      form_params["orders"] = opts[:'orders'] if opts[:'orders']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Order>')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_new_bulk. Result: #{result.inspect}"
      end
      return result
    end

    # Automatically cancel all your orders after a specified timeout.
    # Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
    # @param timeout Timeout in ms. Set to 0 to cancel this timer.
    # @param [Hash] opts the optional parameters
    # @return [inline_response_200_1]
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
        :return_type => 'inline_response_200_1')
      if Configuration.debugging
        Configuration.logger.debug "API called: OrderApi#order_cancel_all_after. Result: #{result.inspect}"
      end
      return result
    end

    # Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
    # If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
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
  end
end




