require "uri"

module SwaggerClient
  class ChatApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get chat messages.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :count Number of results to fetch.
    # @option opts [Float] :start Starting point for results.
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @return [Array<Chat>]
    def chat_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ChatApi#chat_get ..."
      end
      
      # resource path
      path = "/chat".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'count'] = opts[:'count'] if opts[:'count']
      query_params[:'start'] = opts[:'start'] if opts[:'start']
      query_params[:'reverse'] = opts[:'reverse'] if opts[:'reverse']

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
        :return_type => 'Array<Chat>')
      if Configuration.debugging
        Configuration.logger.debug "API called: ChatApi#chat_get. Result: #{result.inspect}"
      end
      return result
    end

    # Send a chat message.
    # 
    # @param message 
    # @param [Hash] opts the optional parameters
    # @return [Chat]
    def chat_send(message, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ChatApi#chat_send ..."
      end
      
      # verify the required parameter 'message' is set
      fail "Missing the required parameter 'message' when calling chat_send" if message.nil?
      
      # resource path
      path = "/chat".sub('{format}','json')

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
      form_params["message"] = message

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Chat')
      if Configuration.debugging
        Configuration.logger.debug "API called: ChatApi#chat_send. Result: #{result.inspect}"
      end
      return result
    end

    # Get connected users.
    # Returns an array with browser users in the first position and API users (bots) in the second position.
    # @param [Hash] opts the optional parameters
    # @return [ConnectedUsers]
    def chat_get_connected(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ChatApi#chat_get_connected ..."
      end
      
      # resource path
      path = "/chat/connected".sub('{format}','json')

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
        :return_type => 'ConnectedUsers')
      if Configuration.debugging
        Configuration.logger.debug "API called: ChatApi#chat_get_connected. Result: #{result.inspect}"
      end
      return result
    end
  end
end




