require "uri"

class Order_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
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
    path = "/order/new".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    Order.new(response)

  end

def self.new_order_Order_api_0 (symbol,quantity,price,ioc,cl_ord_i_d,opts={})
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

def self.get_orders (filter,columns,count,opts={})
    query_param_keys = [:filter,:columns,:count]

    # set default values and merge with input
    options = {
    :filter => filter,
      :columns => columns,
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

def self.cancel_order_Order_api_0 (order_i_d,cl_ord_i_d,text,opts={})
    query_param_keys = []

    # verify existence of params
    raise "order_i_d is required" if order_i_d.nil?
    # set default values and merge with input
    options = {
    :order_i_d => order_i_d,
      :cl_ord_i_d => cl_ord_i_d,
      :text => text}.merge(opts)

    #resource path
    path = "/order/cancel".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Order.new(response)}

  end

def self.get_orders_Order_api_0 (filter,columns,count,opts={})
    query_param_keys = [:filter,:columns,:count]

    # set default values and merge with input
    options = {
    :filter => filter,
      :columns => columns,
      :count => count}.merge(opts)

    #resource path
    path = "/order/myOrders".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Order.new(response)}

  end

def self.get_orders_Order_api_1 (filter,columns,count,opts={})
    query_param_keys = [:filter,:columns,:count]

    # set default values and merge with input
    options = {
    :filter => filter,
      :columns => columns,
      :count => count}.merge(opts)

    #resource path
    path = "/order/myOpenOrders".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Order.new(response)}

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

