require "uri"

class Trade_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.get_bucketed (symbol,start_time,end_time,count,use_millisecond_time,bin_size= "1m",opts={})
    query_param_keys = [:symbol,:bin_size,:start_time,:end_time,:count,:use_millisecond_time]

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :start_time => start_time,
      :end_time => end_time,
      :count => count,
      :use_millisecond_time => use_millisecond_time,
      :bin_size => bin_size}.merge(opts)

    #resource path
    path = "/trade/bucketed".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|TradeBin.new(response)}

  end

def self.get_by_date (symbol,start_time,end_time,opts={})
    query_param_keys = [:symbol,:start_time,:end_time]

    # verify existence of params
    raise "start_time is required" if start_time.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :start_time => start_time,
      :end_time => end_time}.merge(opts)

    #resource path
    path = "/trade/byDate".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Trade.new(response)}

  end

def self.get_recent (symbol,count= 100,opts={})
    query_param_keys = [:symbol,:count]

    # verify existence of params
    raise "count is required" if count.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :count => count}.merge(opts)

    #resource path
    path = "/trade/recent".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Trade.new(response)}

  end

end

