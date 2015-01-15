require "uri"

class Execution_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.get (symbol,filter,columns,start,reverse,start_time,end_time,count= 100,opts={})
    query_param_keys = [:symbol,:filter,:columns,:count,:start,:reverse,:start_time,:end_time]

    # set default values and merge with input
    options = {
    :symbol => symbol,
      :filter => filter,
      :columns => columns,
      :start => start,
      :reverse => reverse,
      :start_time => start_time,
      :end_time => end_time,
      :count => count}.merge(opts)

    #resource path
    path = "/execution".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Execution.new(response)}

  end

def self.get_trade_history (symbol,filter,columns,start,reverse,start_time,end_time,count= 100,opts={})
    query_param_keys = [:symbol,:filter,:columns,:count,:start,:reverse,:start_time,:end_time]

    # set default values and merge with input
    options = {
    :symbol => symbol,
      :filter => filter,
      :columns => columns,
      :start => start,
      :reverse => reverse,
      :start_time => start_time,
      :end_time => end_time,
      :count => count}.merge(opts)

    #resource path
    path = "/execution/tradeHistory".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Execution.new(response)}

  end

end

