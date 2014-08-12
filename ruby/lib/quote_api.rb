require "uri"

class Quote_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.quote_get_bucketed (symbol,start_time,end_time,count,bin_size= "30s",opts={})
    query_param_keys = [:symbol,:bin_size,:start_time,:end_time,:count]

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :start_time => start_time,
      :end_time => end_time,
      :count => count,
      :bin_size => bin_size}.merge(opts)

    #resource path
    path = "/quote/getBucketed".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|quote.new(response)}

  end

end

