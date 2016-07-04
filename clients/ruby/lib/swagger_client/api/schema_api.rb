require "uri"

module SwaggerClient
  class SchemaApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get model schemata for data objects returned by this API.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :model Optional model filter. If omitted, will return all models.
    # @return [inline_response_200_1]
    def schema_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: SchemaApi#schema_get ..."
      end
      
      # resource path
      path = "/schema".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'model'] = opts[:'model'] if opts[:'model']

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
        :return_type => 'inline_response_200_1')
      if Configuration.debugging
        Configuration.logger.debug "API called: SchemaApi#schema_get. Result: #{result.inspect}"
      end
      return result
    end

    # Returns help text &amp; subject list for websocket usage.
    # 
    # @param [Hash] opts the optional parameters
    # @return [inline_response_200_1]
    def schema_websocket_help(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: SchemaApi#schema_websocket_help ..."
      end
      
      # resource path
      path = "/schema/websocketHelp".sub('{format}','json')

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
        :return_type => 'inline_response_200_1')
      if Configuration.debugging
        Configuration.logger.debug "API called: SchemaApi#schema_websocket_help. Result: #{result.inspect}"
      end
      return result
    end
  end
end




