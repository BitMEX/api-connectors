require "uri"

module SwaggerClient
  class AnnouncementApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get site announcements.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :columns Array of column names to fetch. If omitted, will return all columns.
    # @return [Array<Announcement>]
    def announcement_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: AnnouncementApi#announcement_get ..."
      end
      
      # resource path
      path = "/announcement".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'columns'] = opts[:'columns'] if opts[:'columns']

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
        :return_type => 'Array<Announcement>')
      if Configuration.debugging
        Configuration.logger.debug "API called: AnnouncementApi#announcement_get. Result: #{result.inspect}"
      end
      return result
    end

    # Get urgent (banner) announcements.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<Announcement>]
    def announcement_get_urgent(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: AnnouncementApi#announcement_get_urgent ..."
      end
      
      # resource path
      path = "/announcement/urgent".sub('{format}','json')

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
        :return_type => 'Array<Announcement>')
      if Configuration.debugging
        Configuration.logger.debug "API called: AnnouncementApi#announcement_get_urgent. Result: #{result.inspect}"
      end
      return result
    end
  end
end




