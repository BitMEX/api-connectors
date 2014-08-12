require "uri"

class Schema_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.schema_find (model,opts={})
    query_param_keys = [:model]

    # set default values and merge with input
    options = {
    :model => model}.merge(opts)

    #resource path
    path = "/schema".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    object.new(response)

  end

end

