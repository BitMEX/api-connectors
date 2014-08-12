require "uri"

class Order_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.order_new_order (symbol,quantity,price,ioc,opts={})
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
      :ioc => ioc}.merge(opts)

    #resource path
    path = "/order/new".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    order.new(response)

  end

def self.order_cancel_order (order_i_d,opts={})
    query_param_keys = []

    # verify existence of params
    raise "order_i_d is required" if order_i_d.nil?
    # set default values and merge with input
    options = {
    :order_i_d => order_i_d}.merge(opts)

    #resource path
    path = "/order/cancel".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    order.new(response)

  end

def self.order_my_orders (filter,columns,count,opts={})
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
    response.map {|response|order.new(response)}

  end

def self.order_my_open_orders (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/order/myOpenOrders".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|order.new(response)}

  end

end

