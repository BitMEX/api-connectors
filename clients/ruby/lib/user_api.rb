require "uri"

class User_api
  basePath = "https://www.bitmex.com/api/v1"
  # apiInvoker = APIInvoker

  def self.escapeString(string)
    URI.encode(string.to_s)
  end

  def self.get_deposit_address (currency= "XBt",opts={})
    query_param_keys = [:currency]

    # set default values and merge with input
    options = {
    :currency => currency}.merge(opts)

    #resource path
    path = "/user/depositAddress".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    string.new(response)

  end

def self.get_wallet_history (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/walletHistory".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Transaction.new(response)}

  end

def self.request_withdrawal (otp_token,amount,address,currency= "XBt",opts={})
    query_param_keys = []

    # verify existence of params
    raise "currency is required" if currency.nil?
    raise "amount is required" if amount.nil?
    raise "address is required" if address.nil?
    # set default values and merge with input
    options = {
    :otp_token => otp_token,
      :amount => amount,
      :address => address,
      :currency => currency}.merge(opts)

    #resource path
    path = "/user/requestWithdrawal".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    Transaction.new(response)

  end

def self.cancel_withdrawal (token,opts={})
    query_param_keys = []

    # verify existence of params
    raise "token is required" if token.nil?
    # set default values and merge with input
    options = {
    :token => token}.merge(opts)

    #resource path
    path = "/user/cancelWithdrawal".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    Transaction.new(response)

  end

def self.confirm_withdrawal (token,opts={})
    query_param_keys = []

    # verify existence of params
    raise "token is required" if token.nil?
    # set default values and merge with input
    options = {
    :token => token}.merge(opts)

    #resource path
    path = "/user/confirmWithdrawal".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    Transaction.new(response)

  end

def self.request_enable_t_f_a (type= "GA",opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :type => type}.merge(opts)

    #resource path
    path = "/user/requestEnableTFA".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.confirm_enable_t_f_a (token,type= "GA",opts={})
    query_param_keys = []

    # verify existence of params
    raise "token is required" if token.nil?
    # set default values and merge with input
    options = {
    :token => token,
      :type => type}.merge(opts)

    #resource path
    path = "/user/confirmEnableTFA".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.send_verification_email (email,opts={})
    query_param_keys = [:email]

    # verify existence of params
    raise "email is required" if email.nil?
    # set default values and merge with input
    options = {
    :email => email}.merge(opts)

    #resource path
    path = "/user/resendVerificationEmail".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:GET, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.confirm_email (token,opts={})
    query_param_keys = []

    # verify existence of params
    raise "token is required" if token.nil?
    # set default values and merge with input
    options = {
    :token => token}.merge(opts)

    #resource path
    path = "/user/confirmEmail".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.request_password_reset (email,opts={})
    query_param_keys = []

    # verify existence of params
    raise "email is required" if email.nil?
    # set default values and merge with input
    options = {
    :email => email}.merge(opts)

    #resource path
    path = "/user/requestPasswordReset".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.confirm_password_reset (email,token,new_password,opts={})
    query_param_keys = []

    # verify existence of params
    raise "email is required" if email.nil?
    raise "token is required" if token.nil?
    raise "new_password is required" if new_password.nil?
    # set default values and merge with input
    options = {
    :email => email,
      :token => token,
      :new_password => new_password}.merge(opts)

    #resource path
    path = "/user/confirmPasswordReset".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    boolean.new(response)

  end

def self.get_affiliate_status (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/affiliateStatus".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    response.map {|response|Affiliate.new(response)}

  end

def self.new_user (email,password,username,firstname,lastname,accepts_t_o_s,referrer_i_d,account_type= "Trader",opts={})
    query_param_keys = []

    # verify existence of params
    raise "email is required" if email.nil?
    raise "password is required" if password.nil?
    raise "username is required" if username.nil?
    # set default values and merge with input
    options = {
    :email => email,
      :password => password,
      :username => username,
      :firstname => firstname,
      :lastname => lastname,
      :accepts_t_o_s => accepts_t_o_s,
      :referrer_i_d => referrer_i_d,
      :account_type => account_type}.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    User.new(response)

  end

def self.get_me (opts={})
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
    User.new(response)

  end

def self.update_me (firstname,lastname,old_password,new_password,new_password_confirm,account_type,opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    :firstname => firstname,
      :lastname => lastname,
      :old_password => old_password,
      :new_password => new_password,
      :new_password_confirm => new_password_confirm,
      :account_type => account_type}.merge(opts)

    #resource path
    path = "/user".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:PUT, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    User.new(response)

  end

def self.login (email,password,token,opts={})
    query_param_keys = []

    # verify existence of params
    raise "email is required" if email.nil?
    raise "password is required" if password.nil?
    # set default values and merge with input
    options = {
    :email => email,
      :password => password,
      :token => token}.merge(opts)

    #resource path
    path = "/user/login".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    AccessToken.new(response)

  end

def self.logout (opts={})
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

def self.logout_all (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/logoutAll".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body}).make
    

  end

def self.save_preferences (prefs,opts={})
    query_param_keys = []

    # verify existence of params
    raise "prefs is required" if prefs.nil?
    # set default values and merge with input
    options = {
    :prefs => prefs}.merge(opts)

    #resource path
    path = "/user/preferences".sub('{format}','json')

    
    # pull querystring keys from options
    queryopts = options.select do |key,value|
      query_param_keys.include? key
    end
    
    headers = nil
    post_body = nil
    response = Swagger::Request.new(:POST, path, {:params=>queryopts,:headers=>headers, :body=>post_body }).make.body
    User.new(response)

  end

def self.get_commission (opts={})
    query_param_keys = []

    # set default values and merge with input
    options = {
    }.merge(opts)

    #resource path
    path = "/user/commission".sub('{format}','json')

    
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

