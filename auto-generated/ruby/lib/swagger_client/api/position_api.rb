=begin
#BitMEX API

### REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 

OpenAPI spec version: 1.2.0
Contact: support@bitmex.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.42-SNAPSHOT

=end

require 'uri'

module SwaggerClient
  class PositionApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get your positions.
    # This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}.
    # @option opts [String] :columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
    # @option opts [Integer] :count Number of rows to fetch.
    # @return [Array<Position>]
    def position_get(opts = {})
      data, _status_code, _headers = position_get_with_http_info(opts)
      data
    end

    # Get your positions.
    # This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol&#39;s default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol&#39;s default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}.
    # @option opts [String] :columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
    # @option opts [Integer] :count Number of rows to fetch.
    # @return [Array<(Array<Position>, Fixnum, Hash)>] Array<Position> data, response status code and response headers
    def position_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionApi.position_get ...'
      end
      # resource path
      local_var_path = '/position'

      # query parameters
      query_params = {}
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'columns'] = opts[:'columns'] if !opts[:'columns'].nil?
      query_params[:'count'] = opts[:'count'] if !opts[:'count'].nil?

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
      auth_names = ['apiExpires', 'apiKey', 'apiSignature']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Position>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionApi#position_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Enable isolated margin or cross margin per-position.
    # Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
    # @param symbol Position symbol to isolate.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :enabled True for isolated margin, false for cross margin. (default to true)
    # @return [Position]
    def position_isolate_margin(symbol, opts = {})
      data, _status_code, _headers = position_isolate_margin_with_http_info(symbol, opts)
      data
    end

    # Enable isolated margin or cross margin per-position.
    # Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
    # @param symbol Position symbol to isolate.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :enabled True for isolated margin, false for cross margin.
    # @return [Array<(Position, Fixnum, Hash)>] Position data, response status code and response headers
    def position_isolate_margin_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionApi.position_isolate_margin ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionApi.position_isolate_margin"
      end
      # resource path
      local_var_path = '/position/isolate'

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
      form_params['symbol'] = symbol
      form_params['enabled'] = opts[:'enabled'] if !opts[:'enabled'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['apiExpires', 'apiKey', 'apiSignature']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionApi#position_isolate_margin\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Transfer equity in or out of a position.
    # When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
    # @param symbol Symbol of position to isolate.
    # @param amount Amount to transfer, in Satoshis. May be negative.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the margin would be transfered to, must be a paired account with main user.
    # @return [Position]
    def position_transfer_isolated_margin(symbol, amount, opts = {})
      data, _status_code, _headers = position_transfer_isolated_margin_with_http_info(symbol, amount, opts)
      data
    end

    # Transfer equity in or out of a position.
    # When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
    # @param symbol Symbol of position to isolate.
    # @param amount Amount to transfer, in Satoshis. May be negative.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the margin would be transfered to, must be a paired account with main user.
    # @return [Array<(Position, Fixnum, Hash)>] Position data, response status code and response headers
    def position_transfer_isolated_margin_with_http_info(symbol, amount, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionApi.position_transfer_isolated_margin ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionApi.position_transfer_isolated_margin"
      end
      # verify the required parameter 'amount' is set
      if @api_client.config.client_side_validation && amount.nil?
        fail ArgumentError, "Missing the required parameter 'amount' when calling PositionApi.position_transfer_isolated_margin"
      end
      # resource path
      local_var_path = '/position/transferMargin'

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
      form_params['symbol'] = symbol
      form_params['amount'] = amount
      form_params['targetAccountId'] = opts[:'target_account_id'] if !opts[:'target_account_id'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['apiExpires', 'apiKey', 'apiSignature']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionApi#position_transfer_isolated_margin\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Choose leverage for a position.
    # Users can choose an isolated leverage. This will automatically enable isolated margin.
    # @param symbol Symbol of position to adjust.
    # @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the leverage would be changed on, must be a paired account with main user.
    # @return [Position]
    def position_update_leverage(symbol, leverage, opts = {})
      data, _status_code, _headers = position_update_leverage_with_http_info(symbol, leverage, opts)
      data
    end

    # Choose leverage for a position.
    # Users can choose an isolated leverage. This will automatically enable isolated margin.
    # @param symbol Symbol of position to adjust.
    # @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the leverage would be changed on, must be a paired account with main user.
    # @return [Array<(Position, Fixnum, Hash)>] Position data, response status code and response headers
    def position_update_leverage_with_http_info(symbol, leverage, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionApi.position_update_leverage ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionApi.position_update_leverage"
      end
      # verify the required parameter 'leverage' is set
      if @api_client.config.client_side_validation && leverage.nil?
        fail ArgumentError, "Missing the required parameter 'leverage' when calling PositionApi.position_update_leverage"
      end
      # resource path
      local_var_path = '/position/leverage'

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
      form_params['symbol'] = symbol
      form_params['leverage'] = leverage
      form_params['targetAccountId'] = opts[:'target_account_id'] if !opts[:'target_account_id'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['apiExpires', 'apiKey', 'apiSignature']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionApi#position_update_leverage\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update your risk limit.
    # Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
    # @param symbol Symbol of position to update risk limit on.
    # @param risk_limit New Risk Limit, in Satoshis.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the risk limit would be updated on, must be a paired account with main user.
    # @return [Position]
    def position_update_risk_limit(symbol, risk_limit, opts = {})
      data, _status_code, _headers = position_update_risk_limit_with_http_info(symbol, risk_limit, opts)
      data
    end

    # Update your risk limit.
    # Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
    # @param symbol Symbol of position to update risk limit on.
    # @param risk_limit New Risk Limit, in Satoshis.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :target_account_id AccountId for the position that the risk limit would be updated on, must be a paired account with main user.
    # @return [Array<(Position, Fixnum, Hash)>] Position data, response status code and response headers
    def position_update_risk_limit_with_http_info(symbol, risk_limit, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionApi.position_update_risk_limit ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionApi.position_update_risk_limit"
      end
      # verify the required parameter 'risk_limit' is set
      if @api_client.config.client_side_validation && risk_limit.nil?
        fail ArgumentError, "Missing the required parameter 'risk_limit' when calling PositionApi.position_update_risk_limit"
      end
      # resource path
      local_var_path = '/position/riskLimit'

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
      form_params['symbol'] = symbol
      form_params['riskLimit'] = risk_limit
      form_params['targetAccountId'] = opts[:'target_account_id'] if !opts[:'target_account_id'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['apiExpires', 'apiKey', 'apiSignature']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Position')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionApi#position_update_risk_limit\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
