require "uri"

class Instrument_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.instrument_find (filter,opts={})
    query_param_keys = [:filter]

    # set default values and merge with input
    options = {
    :filter => filter}.merge(opts)

    #resource path
    path = "/instrument".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|instrument.new(response)}

  end

end

