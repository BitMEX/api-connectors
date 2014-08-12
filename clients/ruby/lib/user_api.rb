require "uri"

class User_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.user_login (body,opts={})
    query_param_keys = []

    # verify existence of params
    raise "body is required" if body.nil?
    # set default values and merge with input
    options = {
    :body => body}.merge(opts)

    #resource path
    path = "/user/login".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array

      else 
        if body.respond_to?("to_body".to_sym)
	        post_body = body.to_body
	      else
	        post_body = body
	      end
      end
    end
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    object.new(response)

  end

def self.user_logout (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/logout".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    

  end

def self.user_create (body,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :body => body}.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    if body != nil
      if body.is_a?(Array)
        array = Array.new
        body.each do |item|
          if item.respond_to?("to_body".to_sym)
            array.push item.to_body
          else
            array.push item
          end
        end
        post_body = array

      else 
        if body.respond_to?("to_body".to_sym)
	        post_body = body.to_body
	      else
	        post_body = body
	      end
      end
    end
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    user.new(response)

  end

def self.user_get_me (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    user.new(response)

  end

def self.user_update_me (firstname,lastname,phone,old_password,new_password,new_password_confirm,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :firstname => firstname,
      :lastname => lastname,
      :phone => phone,
      :old_password => old_password,
      :new_password => new_password,
      :new_password_confirm => new_password_confirm}.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:PUT, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    user.new(response)

  end

def self.user_save_preferences (prefs,opts={})
    query_param_keys = []

    # verify existence of params
    raise "prefs is required" if prefs.nil?
    # set default values and merge with input
    options = {
    :prefs => prefs}.merge(opts)

    #resource path
    path = "/user/savePrefs".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    user.new(response)

  end

def self.user_verify_phone (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/requestSMS".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.user_confirm_phone (token,opts={})
    query_param_keys = []

    # verify existence of params
    raise "token is required" if token.nil?
    # set default values and merge with input
    options = {
    :token => token}.merge(opts)

    #resource path
    path = "/user/confirmPhone".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    user.new(response)

  end

end

