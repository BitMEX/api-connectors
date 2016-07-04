require "uri"

module SwaggerClient
  class StatsApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get exchange-wide and per-series turnover and volume statistics.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<Stats>]
    def stats_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: StatsApi#stats_get ..."
      end
      
      # resource path
      path = "/stats".sub('{format}','json')

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

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Stats>')
      if Configuration.debugging
        Configuration.logger.debug "API called: StatsApi#stats_get. Result: #{result.inspect}"
      end
      return result
    end

    # Get historical exchange-wide and per-series turnover and volume statistics.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<StatsHistory>]
    def stats_history(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: StatsApi#stats_history ..."
      end
      
      # resource path
      path = "/stats/history".sub('{format}','json')

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

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<StatsHistory>')
      if Configuration.debugging
        Configuration.logger.debug "API called: StatsApi#stats_history. Result: #{result.inspect}"
      end
      return result
    end
  end
end




