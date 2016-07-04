require "uri"

module SwaggerClient
  class LeaderboardApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get current leaderboard.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :method Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;
    # @return [Array<Leaderboard>]
    def leaderboard_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: LeaderboardApi#leaderboard_get ..."
      end
      
      # resource path
      path = "/leaderboard".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'method'] = opts[:'method'] if opts[:'method']

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
        :return_type => 'Array<Leaderboard>')
      if Configuration.debugging
        Configuration.logger.debug "API called: LeaderboardApi#leaderboard_get. Result: #{result.inspect}"
      end
      return result
    end
  end
end




