require "uri"

class Trade_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.trade_get_bucketed (symbol,start_time,end_time,count,use_millisecond_time,bin_size= "30s",opts={})
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
    path = "/trade/getBucketed".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|tradeBin.new(response)}

  end

def self.trade_get_by_date (symbol,starttime,endtime,opts={})
    query_param_keys = [:symbol,:starttime,:endtime]

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    raise "starttime is required" if starttime.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :starttime => starttime,
      :endtime => endtime}.merge(opts)

    #resource path
    path = "/trade/getByDate".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|trade.new(response)}

  end

def self.trade_get_recent (symbol,count,opts={})
    query_param_keys = [:symbol,:count]

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    raise "count is required" if count.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :count => count}.merge(opts)

    #resource path
    path = "/trade/getRecent".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|any.new(response)}

  end

end

