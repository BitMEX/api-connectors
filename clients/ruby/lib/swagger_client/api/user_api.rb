require "uri"

module SwaggerClient
  class UserApi
    attr_accessor :api_client

    def initialize(api_client = nil)
      @api_client = api_client || Configuration.api_client
    end

    # Get your user model.
    # 
    # @param [Hash] opts the optional parameters
    # @return [User]
    def user_get(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get ..."
      end
      
      # resource path
      path = "/user".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'User')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get. Result: #{result.inspect}"
      end
      return result
    end

    # Update your password, name, and other attributes.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :firstname 
    # @option opts [String] :lastname 
    # @option opts [String] :old_password 
    # @option opts [String] :new_password 
    # @option opts [String] :new_password_confirm 
    # @option opts [String] :username Username can only be set once. To reset, email support.
    # @option opts [String] :country Country of residence.
    # @option opts [String] :pgp_pub_key PGP Public Key. If specified, automated emails will be sentwith this key.
    # @return [User]
    def user_update(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_update ..."
      end
      
      # resource path
      path = "/user".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["firstname"] = opts[:'firstname'] if opts[:'firstname']
      form_params["lastname"] = opts[:'lastname'] if opts[:'lastname']
      form_params["oldPassword"] = opts[:'old_password'] if opts[:'old_password']
      form_params["newPassword"] = opts[:'new_password'] if opts[:'new_password']
      form_params["newPasswordConfirm"] = opts[:'new_password_confirm'] if opts[:'new_password_confirm']
      form_params["username"] = opts[:'username'] if opts[:'username']
      form_params["country"] = opts[:'country'] if opts[:'country']
      form_params["pgpPubKey"] = opts[:'pgp_pub_key'] if opts[:'pgp_pub_key']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:PUT, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'User')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_update. Result: #{result.inspect}"
      end
      return result
    end

    # Register a new user.
    # 
    # @param email Your email address.
    # @param password Your password.
    # @param country Country of residence.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :username Desired username.
    # @option opts [String] :firstname First name.
    # @option opts [String] :lastname Last name.
    # @option opts [String] :accepts_tos Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).
    # @option opts [String] :referrer_id Optional Referrer ID.
    # @option opts [String] :tfa_type Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef
    # @option opts [String] :tfa_token Two-Factor Token.
    # @return [User]
    def user_new(email, password, country, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_new ..."
      end
      
      # verify the required parameter 'email' is set
      fail "Missing the required parameter 'email' when calling user_new" if email.nil?
      
      # verify the required parameter 'password' is set
      fail "Missing the required parameter 'password' when calling user_new" if password.nil?
      
      # verify the required parameter 'country' is set
      fail "Missing the required parameter 'country' when calling user_new" if country.nil?
      
      # resource path
      path = "/user".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["email"] = email
      form_params["password"] = password
      form_params["country"] = country
      form_params["username"] = opts[:'username'] if opts[:'username']
      form_params["firstname"] = opts[:'firstname'] if opts[:'firstname']
      form_params["lastname"] = opts[:'lastname'] if opts[:'lastname']
      form_params["acceptsTOS"] = opts[:'accepts_tos'] if opts[:'accepts_tos']
      form_params["referrerID"] = opts[:'referrer_id'] if opts[:'referrer_id']
      form_params["tfaType"] = opts[:'tfa_type'] if opts[:'tfa_type']
      form_params["tfaToken"] = opts[:'tfa_token'] if opts[:'tfa_token']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'User')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_new. Result: #{result.inspect}"
      end
      return result
    end

    # Get your current affiliate/referral status.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<Affiliate>]
    def user_get_affiliate_status(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get_affiliate_status ..."
      end
      
      # resource path
      path = "/user/affiliateStatus".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Affiliate>')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get_affiliate_status. Result: #{result.inspect}"
      end
      return result
    end

    # Cancel a withdrawal.
    # 
    # @param token 
    # @param [Hash] opts the optional parameters
    # @return [Transaction]
    def user_cancel_withdrawal(token, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_cancel_withdrawal ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_cancel_withdrawal" if token.nil?
      
      # resource path
      path = "/user/cancelWithdrawal".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Transaction')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_cancel_withdrawal. Result: #{result.inspect}"
      end
      return result
    end

    # Check if a referral code is valid.
    # If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :referral_code 
    # @return [Float]
    def user_check_referral_code(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_check_referral_code ..."
      end
      
      # resource path
      path = "/user/checkReferralCode".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'referralCode'] = opts[:'referral_code'] if opts[:'referral_code']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Float')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_check_referral_code. Result: #{result.inspect}"
      end
      return result
    end

    # Get your account&#39;s commission status.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<UserCommission>]
    def user_get_commission(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get_commission ..."
      end
      
      # resource path
      path = "/user/commission".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<UserCommission>')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get_commission. Result: #{result.inspect}"
      end
      return result
    end

    # Confirm your email address with a token.
    # 
    # @param token 
    # @param [Hash] opts the optional parameters
    # @return [AccessToken]
    def user_confirm_email(token, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_confirm_email ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_confirm_email" if token.nil?
      
      # resource path
      path = "/user/confirmEmail".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AccessToken')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_confirm_email. Result: #{result.inspect}"
      end
      return result
    end

    # Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
    # 
    # @param token Token from your selected TFA type.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
    # @return [BOOLEAN]
    def user_confirm_enable_tfa(token, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_confirm_enable_tfa ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_confirm_enable_tfa" if token.nil?
      
      # resource path
      path = "/user/confirmEnableTFA".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token
      form_params["type"] = opts[:'type'] if opts[:'type']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_confirm_enable_tfa. Result: #{result.inspect}"
      end
      return result
    end

    # Confirm a password reset.
    # 
    # @param token 
    # @param new_password 
    # @param [Hash] opts the optional parameters
    # @return [BOOLEAN]
    def user_confirm_password_reset(token, new_password, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_confirm_password_reset ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_confirm_password_reset" if token.nil?
      
      # verify the required parameter 'new_password' is set
      fail "Missing the required parameter 'new_password' when calling user_confirm_password_reset" if new_password.nil?
      
      # resource path
      path = "/user/confirmPasswordReset".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token
      form_params["newPassword"] = new_password

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_confirm_password_reset. Result: #{result.inspect}"
      end
      return result
    end

    # Confirm a withdrawal.
    # 
    # @param token 
    # @param [Hash] opts the optional parameters
    # @return [Transaction]
    def user_confirm_withdrawal(token, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_confirm_withdrawal ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_confirm_withdrawal" if token.nil?
      
      # resource path
      path = "/user/confirmWithdrawal".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Transaction')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_confirm_withdrawal. Result: #{result.inspect}"
      end
      return result
    end

    # Get a deposit address.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency 
    # @return [String]
    def user_get_deposit_address(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get_deposit_address ..."
      end
      
      # resource path
      path = "/user/depositAddress".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'currency'] = opts[:'currency'] if opts[:'currency']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get_deposit_address. Result: #{result.inspect}"
      end
      return result
    end

    # Disable two-factor auth for this account.
    # 
    # @param token Token from your selected TFA type.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
    # @return [BOOLEAN]
    def user_disable_tfa(token, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_disable_tfa ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling user_disable_tfa" if token.nil?
      
      # resource path
      path = "/user/disableTFA".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["token"] = token
      form_params["type"] = opts[:'type'] if opts[:'type']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_disable_tfa. Result: #{result.inspect}"
      end
      return result
    end

    # Log in to BitMEX.
    # 
    # @param email Your email address.
    # @param password Your password.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :token OTP Token (YubiKey, Google Authenticator)
    # @return [AccessToken]
    def user_login(email, password, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_login ..."
      end
      
      # verify the required parameter 'email' is set
      fail "Missing the required parameter 'email' when calling user_login" if email.nil?
      
      # verify the required parameter 'password' is set
      fail "Missing the required parameter 'password' when calling user_login" if password.nil?
      
      # resource path
      path = "/user/login".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["email"] = email
      form_params["password"] = password
      form_params["token"] = opts[:'token'] if opts[:'token']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AccessToken')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_login. Result: #{result.inspect}"
      end
      return result
    end

    # Log out of BitMEX.
    # 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def user_logout(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_logout ..."
      end
      
      # resource path
      path = "/user/logout".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_logout"
      end
      return nil
    end

    # Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
    # 
    # @param [Hash] opts the optional parameters
    # @return [Float]
    def user_logout_all(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_logout_all ..."
      end
      
      # resource path
      path = "/user/logoutAll".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Float')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_logout_all. Result: #{result.inspect}"
      end
      return result
    end

    # Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency 
    # @return [Margin]
    def user_get_margin(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get_margin ..."
      end
      
      # resource path
      path = "/user/margin".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'currency'] = opts[:'currency'] if opts[:'currency']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Margin')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get_margin. Result: #{result.inspect}"
      end
      return result
    end

    # Save user preferences.
    # 
    # @param prefs 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :overwrite If true, will overwrite all existing preferences.
    # @return [User]
    def user_save_preferences(prefs, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_save_preferences ..."
      end
      
      # verify the required parameter 'prefs' is set
      fail "Missing the required parameter 'prefs' when calling user_save_preferences" if prefs.nil?
      
      # resource path
      path = "/user/preferences".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["prefs"] = prefs
      form_params["overwrite"] = opts[:'overwrite'] if opts[:'overwrite']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'User')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_save_preferences. Result: #{result.inspect}"
      end
      return result
    end

    # Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
    # @return [BOOLEAN]
    def user_request_enable_tfa(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_request_enable_tfa ..."
      end
      
      # resource path
      path = "/user/requestEnableTFA".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["type"] = opts[:'type'] if opts[:'type']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_request_enable_tfa. Result: #{result.inspect}"
      end
      return result
    end

    # Request a password reset.
    # 
    # @param email 
    # @param [Hash] opts the optional parameters
    # @return [BOOLEAN]
    def user_request_password_reset(email, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_request_password_reset ..."
      end
      
      # verify the required parameter 'email' is set
      fail "Missing the required parameter 'email' when calling user_request_password_reset" if email.nil?
      
      # resource path
      path = "/user/requestPasswordReset".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["email"] = email

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_request_password_reset. Result: #{result.inspect}"
      end
      return result
    end

    # Request a withdrawal to an external wallet.
    # This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.
    # @param currency Currency you&#39;re withdrawing. Options: `XBt`
    # @param amount Amount of withdrawal currency.
    # @param address Destination Address.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :otp_token 2FA token. Required if 2FA is enabled on your account.
    # @option opts [Float] :fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
    # @return [Transaction]
    def user_request_withdrawal(currency, amount, address, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_request_withdrawal ..."
      end
      
      # verify the required parameter 'currency' is set
      fail "Missing the required parameter 'currency' when calling user_request_withdrawal" if currency.nil?
      
      # verify the required parameter 'amount' is set
      fail "Missing the required parameter 'amount' when calling user_request_withdrawal" if amount.nil?
      
      # verify the required parameter 'address' is set
      fail "Missing the required parameter 'address' when calling user_request_withdrawal" if address.nil?
      
      # resource path
      path = "/user/requestWithdrawal".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["currency"] = currency
      form_params["amount"] = amount
      form_params["address"] = address
      form_params["otpToken"] = opts[:'otp_token'] if opts[:'otp_token']
      form_params["fee"] = opts[:'fee'] if opts[:'fee']

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Transaction')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_request_withdrawal. Result: #{result.inspect}"
      end
      return result
    end

    # Re-send verification email.
    # 
    # @param email 
    # @param [Hash] opts the optional parameters
    # @return [BOOLEAN]
    def user_send_verification_email(email, opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_send_verification_email ..."
      end
      
      # verify the required parameter 'email' is set
      fail "Missing the required parameter 'email' when calling user_send_verification_email" if email.nil?
      
      # resource path
      path = "/user/resendVerificationEmail".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}
      form_params["email"] = email

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:POST, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'BOOLEAN')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_send_verification_email. Result: #{result.inspect}"
      end
      return result
    end

    # Get a history of all of your wallet transactions (deposits and withdrawals).
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency 
    # @return [Array<Transaction>]
    def user_get_wallet_history(opts = {})
      if Configuration.debugging
        Configuration.logger.debug "Calling API: UserApi#user_get_wallet_history ..."
      end
      
      # resource path
      path = "/user/walletHistory".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'currency'] = opts[:'currency'] if opts[:'currency']

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript']
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = ['application/json', 'application/x-www-form-urlencoded']
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      

      auth_names = []
      result = @api_client.call_api(:GET, path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<Transaction>')
      if Configuration.debugging
        Configuration.logger.debug "API called: UserApi#user_get_wallet_history. Result: #{result.inspect}"
      end
      return result
    end
  end
end




