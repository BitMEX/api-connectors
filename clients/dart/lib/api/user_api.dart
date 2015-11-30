part of api;


class UserApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  UserApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  
  /// Get your user model.
  ///
  /// 
  Future<User> userGetMe() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, User);
      }
      else {
        return null;
      }
    });
  }
  
  /// Update your password, name, and other attributes.
  ///
  /// 
  Future<User> userUpdateMe(String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String country, String pgpPubKey) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (firstname != null) {
        hasFields = true;
        mp.fields['firstname'] = apiClient.parameterToString(firstname);
      }
      
      if (lastname != null) {
        hasFields = true;
        mp.fields['lastname'] = apiClient.parameterToString(lastname);
      }
      
      if (oldPassword != null) {
        hasFields = true;
        mp.fields['oldPassword'] = apiClient.parameterToString(oldPassword);
      }
      
      if (newPassword != null) {
        hasFields = true;
        mp.fields['newPassword'] = apiClient.parameterToString(newPassword);
      }
      
      if (newPasswordConfirm != null) {
        hasFields = true;
        mp.fields['newPasswordConfirm'] = apiClient.parameterToString(newPasswordConfirm);
      }
      
      if (country != null) {
        hasFields = true;
        mp.fields['country'] = apiClient.parameterToString(country);
      }
      
      if (pgpPubKey != null) {
        hasFields = true;
        mp.fields['pgpPubKey'] = apiClient.parameterToString(pgpPubKey);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (firstname != null)
        formParams['firstname'] = apiClient.parameterToString(firstname);
      if (lastname != null)
        formParams['lastname'] = apiClient.parameterToString(lastname);
      if (oldPassword != null)
        formParams['oldPassword'] = apiClient.parameterToString(oldPassword);
      if (newPassword != null)
        formParams['newPassword'] = apiClient.parameterToString(newPassword);
      if (newPasswordConfirm != null)
        formParams['newPasswordConfirm'] = apiClient.parameterToString(newPasswordConfirm);
      if (country != null)
        formParams['country'] = apiClient.parameterToString(country);
      if (pgpPubKey != null)
        formParams['pgpPubKey'] = apiClient.parameterToString(pgpPubKey);
      
    }

    return apiClient.invokeAPI(basePath, path, 'PUT', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, User);
      }
      else {
        return null;
      }
    });
  }
  
  /// Register a new user.
  ///
  /// 
  Future<User> userNewUser(String email, String password, String username, String firstname, String lastname, String acceptsTOS, String referrerID, String country) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (email != null) {
        hasFields = true;
        mp.fields['email'] = apiClient.parameterToString(email);
      }
      
      if (password != null) {
        hasFields = true;
        mp.fields['password'] = apiClient.parameterToString(password);
      }
      
      if (username != null) {
        hasFields = true;
        mp.fields['username'] = apiClient.parameterToString(username);
      }
      
      if (firstname != null) {
        hasFields = true;
        mp.fields['firstname'] = apiClient.parameterToString(firstname);
      }
      
      if (lastname != null) {
        hasFields = true;
        mp.fields['lastname'] = apiClient.parameterToString(lastname);
      }
      
      if (acceptsTOS != null) {
        hasFields = true;
        mp.fields['acceptsTOS'] = apiClient.parameterToString(acceptsTOS);
      }
      
      if (referrerID != null) {
        hasFields = true;
        mp.fields['referrerID'] = apiClient.parameterToString(referrerID);
      }
      
      if (country != null) {
        hasFields = true;
        mp.fields['country'] = apiClient.parameterToString(country);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (email != null)
        formParams['email'] = apiClient.parameterToString(email);
      if (password != null)
        formParams['password'] = apiClient.parameterToString(password);
      if (username != null)
        formParams['username'] = apiClient.parameterToString(username);
      if (firstname != null)
        formParams['firstname'] = apiClient.parameterToString(firstname);
      if (lastname != null)
        formParams['lastname'] = apiClient.parameterToString(lastname);
      if (acceptsTOS != null)
        formParams['acceptsTOS'] = apiClient.parameterToString(acceptsTOS);
      if (referrerID != null)
        formParams['referrerID'] = apiClient.parameterToString(referrerID);
      if (country != null)
        formParams['country'] = apiClient.parameterToString(country);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, User);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get your current affiliate/referral status.
  ///
  /// 
  Future<List<Affiliate>> userGetAffiliateStatus() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/affiliateStatus".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Affiliate);
      }
      else {
        return null;
      }
    });
  }
  
  /// Cancel a withdrawal.
  ///
  /// 
  Future<Transaction> userCancelWithdrawal(String token) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/cancelWithdrawal".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Transaction);
      }
      else {
        return null;
      }
    });
  }
  
  /// Check if a referral code is valid.
  ///
  /// If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
  Future<num> userCheckReferralCode(String referralCode) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/checkReferralCode".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != referralCode)
      queryParams["referralCode"] = referralCode is List ? referralCode.join(',') : referralCode;
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, num);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get your account&#39;s commission status.
  ///
  /// 
  Future<List<UserCommission>> userGetCommission() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/commission".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, UserCommission);
      }
      else {
        return null;
      }
    });
  }
  
  /// Confirm your email address with a token.
  ///
  /// 
  Future<AccessToken> userConfirmEmail(String token) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/confirmEmail".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, AccessToken);
      }
      else {
        return null;
      }
    });
  }
  
  /// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
  ///
  /// 
  Future<bool> userConfirmEnableTFA(String token, String type) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/confirmEnableTFA".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (type != null) {
        hasFields = true;
        mp.fields['type'] = apiClient.parameterToString(type);
      }
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (type != null)
        formParams['type'] = apiClient.parameterToString(type);
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Confirm a password reset.
  ///
  /// 
  Future<bool> userConfirmPasswordReset(String token, String newPassword) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/confirmPasswordReset".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if (newPassword != null) {
        hasFields = true;
        mp.fields['newPassword'] = apiClient.parameterToString(newPassword);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      if (newPassword != null)
        formParams['newPassword'] = apiClient.parameterToString(newPassword);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Confirm a withdrawal.
  ///
  /// 
  Future<Transaction> userConfirmWithdrawal(String token) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/confirmWithdrawal".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Transaction);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get a deposit address.
  ///
  /// 
  Future<String> userGetDepositAddress(String currency) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/depositAddress".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != currency)
      queryParams["currency"] = currency is List ? currency.join(',') : currency;
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, String);
      }
      else {
        return null;
      }
    });
  }
  
  /// Disable two-factor auth for this account.
  ///
  /// 
  Future<bool> userDisableTFA(String token, String type) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/disableTFA".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (type != null) {
        hasFields = true;
        mp.fields['type'] = apiClient.parameterToString(type);
      }
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (type != null)
        formParams['type'] = apiClient.parameterToString(type);
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Log in to BitMEX.
  ///
  /// 
  Future<AccessToken> userLogin(String email, String password, String token) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/login".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (email != null) {
        hasFields = true;
        mp.fields['email'] = apiClient.parameterToString(email);
      }
      
      if (password != null) {
        hasFields = true;
        mp.fields['password'] = apiClient.parameterToString(password);
      }
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (email != null)
        formParams['email'] = apiClient.parameterToString(email);
      if (password != null)
        formParams['password'] = apiClient.parameterToString(password);
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, AccessToken);
      }
      else {
        return null;
      }
    });
  }
  
  /// Log out of BitMEX.
  ///
  /// 
  Future userLogout() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/logout".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ;
      }
      else {
        return ;
      }
    });
  }
  
  /// Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
  ///
  /// 
  Future userLogoutAll() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/logoutAll".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ;
      }
      else {
        return ;
      }
    });
  }
  
  /// Get your account&#39;s margin status.
  ///
  /// 
  Future<Margin> userGetMargin() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/margin".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Margin);
      }
      else {
        return null;
      }
    });
  }
  
  /// Save application preferences.
  ///
  /// 
  Future<User> userSavePreferences(String prefs, bool overwrite) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/preferences".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (prefs != null) {
        hasFields = true;
        mp.fields['prefs'] = apiClient.parameterToString(prefs);
      }
      
      if (overwrite != null) {
        hasFields = true;
        mp.fields['overwrite'] = apiClient.parameterToString(overwrite);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (prefs != null)
        formParams['prefs'] = apiClient.parameterToString(prefs);
      if (overwrite != null)
        formParams['overwrite'] = apiClient.parameterToString(overwrite);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, User);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
  ///
  /// 
  Future<bool> userRequestEnableTFA(String type, String token) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/requestEnableTFA".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (type != null) {
        hasFields = true;
        mp.fields['type'] = apiClient.parameterToString(type);
      }
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (type != null)
        formParams['type'] = apiClient.parameterToString(type);
      if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Request a password reset.
  ///
  /// 
  Future<bool> userRequestPasswordReset(String email) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/requestPasswordReset".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (email != null) {
        hasFields = true;
        mp.fields['email'] = apiClient.parameterToString(email);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (email != null)
        formParams['email'] = apiClient.parameterToString(email);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Request a withdrawal to an external wallet.
  ///
  /// This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
  Future<Transaction> userRequestWithdrawal(String currency, Number amount, String address, String otpToken, num fee) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/requestWithdrawal".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (otpToken != null) {
        hasFields = true;
        mp.fields['otpToken'] = apiClient.parameterToString(otpToken);
      }
      
      if (currency != null) {
        hasFields = true;
        mp.fields['currency'] = apiClient.parameterToString(currency);
      }
      
      if (amount != null) {
        hasFields = true;
        mp.fields['amount'] = apiClient.parameterToString(amount);
      }
      
      if (address != null) {
        hasFields = true;
        mp.fields['address'] = apiClient.parameterToString(address);
      }
      
      if (fee != null) {
        hasFields = true;
        mp.fields['fee'] = apiClient.parameterToString(fee);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (otpToken != null)
        formParams['otpToken'] = apiClient.parameterToString(otpToken);
      if (currency != null)
        formParams['currency'] = apiClient.parameterToString(currency);
      if (amount != null)
        formParams['amount'] = apiClient.parameterToString(amount);
      if (address != null)
        formParams['address'] = apiClient.parameterToString(address);
      if (fee != null)
        formParams['fee'] = apiClient.parameterToString(fee);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Transaction);
      }
      else {
        return null;
      }
    });
  }
  
  /// Re-send verification email.
  ///
  /// 
  Future<bool> userSendVerificationEmail(String email) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/resendVerificationEmail".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != email)
      queryParams["email"] = email is List ? email.join(',') : email;
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, bool);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get a history of all of your wallet transactions (deposits and withdrawals).
  ///
  /// 
  Future<List<Transaction>> userGetWalletHistory() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/walletHistory".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    

    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Transaction);
      }
      else {
        return null;
      }
    });
  }
  
}
