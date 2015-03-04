require "uri"

class Order_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.get_orders (symbol,filter,columns,start,reverse,start_time,end_time,count= 100,opts={})
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
    path = "/order".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Order.new(response)}

  end

def self.new_order (symbol,quantity,price,ioc,cl_ord_i_d,opts={})
    query_param_keys = []

    # verify existence of params
    raise "symbol is required" if symbol.nil?
    raise "quantity is required" if quantity.nil?
    raise "price is required" if price.nil?
    # set default values and merge with input
    options = {
    :symbol => symbol,
      :quantity => quantity,
      :price => price,
      :ioc => ioc,
      :cl_ord_i_d => cl_ord_i_d}.merge(opts)

    #resource path
    path = "/order".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    Order.new(response)

  end

def self.cancel_order (order_i_d,cl_ord_i_d,text,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :order_i_d => order_i_d,
      :cl_ord_i_d => cl_ord_i_d,
      :text => text}.merge(opts)

    #resource path
    path = "/order".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:DELETE, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Order.new(response)}

  end

def self.cancel_all (symbol,text,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :symbol => symbol,
      :text => text}.merge(opts)

    #resource path
    path = "/order/all".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:DELETE, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    object.new(response)

  end

def self.cancel_all_after (timeout,opts={})
    query_param_keys = []

    # verify existence of params
    raise "timeout is required" if timeout.nil?
    # set default values and merge with input
    options = {
    :timeout => timeout}.merge(opts)

    #resource path
    path = "/order/cancelAllAfter".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    object.new(response)

  end

end

