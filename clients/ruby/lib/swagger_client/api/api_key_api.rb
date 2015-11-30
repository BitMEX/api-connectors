require "uri"

module SwaggerClient
  class ApiKeyApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get your API Keys.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :reverse If true, will sort results newest first.
    # @return [Array<ApiKey>]
    def api_key_get_keys(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ApiKeyApi#api_key_get_keys ..."
      end
      
      # resource path
      path = "/apiKey".sub('{format}','json')

      # query parameters
      query_params = {}
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
        :return_type => 'Array<ApiKey>')
      if Configuration.debugging
        Configuration.logger.debug "API called: ApiKeyApi#api_key_get_keys. Result: #{result.inspect}"
      end
      return result
    end

    # Create a new API Key.
    # API Keys can also be created via &lt;a href=\&quot;https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\&quot;&gt;this Python script&lt;/a&gt;. See the &lt;a href=\&quot;/app/apiKeys\&quot;&gt;API Key Documentation&lt;/a&gt; for more information on capabilities.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :name Key name. This name is for reference only.
    # @option opts [String] :cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;
    # @option opts [String] :permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].
    # @option opts [BOOLEAN] :enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
    # @option opts [String] :token OTP Token (YubiKey, Google Authenticator)
    # @return [ApiKey]
    def api_key_create_key(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ApiKeyApi#api_key_create_key ..."
      end
      
      # resource path
      path = "/apiKey".sub('{format}','json')

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
      form_params["name"] = opts[:'name'] if opts[:'name']
      form_params["cidr"] = opts[:'cidr'] if opts[:'cidr']
      form_params["permissions"] = opts[:'permissions'] if opts[:'permissions']
      form_params["enabled"] = opts[:'enabled'] if opts[:'enabled']
      form_params["token"] = opts[:'token'] if opts[:'token']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'ApiKey')
      if Configuration.debugging
        Configuration.logger.debug "API called: ApiKeyApi#api_key_create_key. Result: #{result.inspect}"
      end
      return result
    end

    # Remove an API Key.
    # 
    # @param api_key_id API Key ID (public component).
    # @param [Hash] opts the optional parameters
    # @return [inline_response_200]
    def api_key_remove(api_key_id, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ApiKeyApi#api_key_remove ..."
      end
      
      # verify the required parameter 'api_key_id' is set
      fail "Missing the required parameter 'api_key_id' when calling api_key_remove" if api_key_id.nil?
      
      # resource path
      path = "/apiKey".sub('{format}','json')

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
      form_params["apiKeyID"] = api_key_id

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
        Configuration.logger.debug "API called: ApiKeyApi#api_key_remove. Result: #{result.inspect}"
      end
      return result
    end

    # Disable an API Key.
    # 
    # @param api_key_id API Key ID (public component).
    # @param [Hash] opts the optional parameters
    # @return [ApiKey]
    def api_key_disable(api_key_id, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ApiKeyApi#api_key_disable ..."
      end
      
      # verify the required parameter 'api_key_id' is set
      fail "Missing the required parameter 'api_key_id' when calling api_key_disable" if api_key_id.nil?
      
      # resource path
      path = "/apiKey/disable".sub('{format}','json')

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
      form_params["apiKeyID"] = api_key_id

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'ApiKey')
      if Configuration.debugging
        Configuration.logger.debug "API called: ApiKeyApi#api_key_disable. Result: #{result.inspect}"
      end
      return result
    end

    # Enable an API Key.
    # 
    # @param api_key_id API Key ID (public component).
    # @param [Hash] opts the optional parameters
    # @return [ApiKey]
    def api_key_enable(api_key_id, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: ApiKeyApi#api_key_enable ..."
      end
      
      # verify the required parameter 'api_key_id' is set
      fail "Missing the required parameter 'api_key_id' when calling api_key_enable" if api_key_id.nil?
      
      # resource path
      path = "/apiKey/enable".sub('{format}','json')

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
      form_params["apiKeyID"] = api_key_id

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'ApiKey')
      if Configuration.debugging
        Configuration.logger.debug "API called: ApiKeyApi#api_key_enable. Result: #{result.inspect}"
      end
      return result
    end
  end
end




