require "uri"

class ApiKey_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.create_key (name,cidr,enabled,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :name => name,
      :cidr => cidr,
      :enabled => enabled}.merge(opts)

    #resource path
    path = "/apiKey".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    ApiKey.new(response)

  end

def self.get_keys (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/apiKey".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|ApiKey.new(response)}

  end

def self.remove (access_key,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :access_key => access_key}.merge(opts)

    #resource path
    path = "/apiKey".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:DELETE, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.disable (access_key,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :access_key => access_key}.merge(opts)

    #resource path
    path = "/apiKey/disable".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    ApiKey.new(response)

  end

def self.enable (access_key,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :access_key => access_key}.merge(opts)

    #resource path
    path = "/apiKey/enable".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    ApiKey.new(response)

  end

end

