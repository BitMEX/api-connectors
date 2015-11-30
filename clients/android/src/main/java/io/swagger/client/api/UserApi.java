package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.User;
import io.swagger.client.model.Affiliate;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.UserCommission;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.Margin;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class UserApi {
  String basePath = "https://localhost/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get your user model.
   * 
   * @return User
   */
  public User  userGetMe () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update your password, name, and other attributes.
   * 
   * @param firstname 
   * @param lastname 
   * @param oldPassword 
   * @param newPassword 
   * @param newPasswordConfirm 
   * @param country Country of residence.
   * @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key.
   * @return User
   */
  public User  userUpdateMe (String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String country, String pgpPubKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (firstname != null) {
        builder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (lastname != null) {
        builder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (oldPassword != null) {
        builder.addTextBody("oldPassword", ApiInvoker.parameterToString(oldPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPassword != null) {
        builder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPasswordConfirm != null) {
        builder.addTextBody("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (country != null) {
        builder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pgpPubKey != null) {
        builder.addTextBody("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("firstname", ApiInvoker.parameterToString(firstname));
      formParams.put("lastname", ApiInvoker.parameterToString(lastname));
      formParams.put("oldPassword", ApiInvoker.parameterToString(oldPassword));
      formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
      formParams.put("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm));
      formParams.put("country", ApiInvoker.parameterToString(country));
      formParams.put("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Register a new user.
   * 
   * @param email Your email address.
   * @param password Your password.
   * @param username Desired username.
   * @param firstname First name.
   * @param lastname Last name.
   * @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).
   * @param referrerID Optional Referrer ID.
   * @param country Country of residence.
   * @return User
   */
  public User  userNewUser (String email, String password, String username, String firstname, String lastname, String acceptsTOS, String referrerID, String country) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
       throw new ApiException(400, "Missing the required parameter 'email' when calling userNewUser");
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
       throw new ApiException(400, "Missing the required parameter 'password' when calling userNewUser");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
       throw new ApiException(400, "Missing the required parameter 'username' when calling userNewUser");
    }
    

    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (email != null) {
        builder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        builder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (username != null) {
        builder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (firstname != null) {
        builder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (lastname != null) {
        builder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (acceptsTOS != null) {
        builder.addTextBody("acceptsTOS", ApiInvoker.parameterToString(acceptsTOS), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (referrerID != null) {
        builder.addTextBody("referrerID", ApiInvoker.parameterToString(referrerID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (country != null) {
        builder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
      formParams.put("password", ApiInvoker.parameterToString(password));
      formParams.put("username", ApiInvoker.parameterToString(username));
      formParams.put("firstname", ApiInvoker.parameterToString(firstname));
      formParams.put("lastname", ApiInvoker.parameterToString(lastname));
      formParams.put("acceptsTOS", ApiInvoker.parameterToString(acceptsTOS));
      formParams.put("referrerID", ApiInvoker.parameterToString(referrerID));
      formParams.put("country", ApiInvoker.parameterToString(country));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get your current affiliate/referral status.
   * 
   * @return List<Affiliate>
   */
  public List<Affiliate>  userGetAffiliateStatus () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/affiliateStatus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Affiliate>) ApiInvoker.deserialize(response, "array", Affiliate.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancel a withdrawal.
   * 
   * @param token 
   * @return Transaction
   */
  public Transaction  userCancelWithdrawal (String token) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userCancelWithdrawal");
    }
    

    // create path and map variables
    String path = "/user/cancelWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Transaction) ApiInvoker.deserialize(response, "", Transaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Check if a referral code is valid.
   * If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
   * @param referralCode 
   * @return Double
   */
  public Double  userCheckReferralCode (String referralCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/checkReferralCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "referralCode", referralCode));
    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Double) ApiInvoker.deserialize(response, "", Double.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get your account&#39;s commission status.
   * 
   * @return List<UserCommission>
   */
  public List<UserCommission>  userGetCommission () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/commission".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<UserCommission>) ApiInvoker.deserialize(response, "array", UserCommission.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Confirm your email address with a token.
   * 
   * @param token 
   * @return AccessToken
   */
  public AccessToken  userConfirmEmail (String token) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEmail");
    }
    

    // create path and map variables
    String path = "/user/confirmEmail".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AccessToken) ApiInvoker.deserialize(response, "", AccessToken.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
   * 
   * @param token Token from your selected TFA type.
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
   * @return Boolean
   */
  public Boolean  userConfirmEnableTFA (String token, String type) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEnableTFA");
    }
    

    // create path and map variables
    String path = "/user/confirmEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (type != null) {
        builder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Confirm a password reset.
   * 
   * @param token 
   * @param newPassword 
   * @return Boolean
   */
  public Boolean  userConfirmPasswordReset (String token, String newPassword) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmPasswordReset");
    }
    
    // verify the required parameter 'newPassword' is set
    if (newPassword == null) {
       throw new ApiException(400, "Missing the required parameter 'newPassword' when calling userConfirmPasswordReset");
    }
    

    // create path and map variables
    String path = "/user/confirmPasswordReset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPassword != null) {
        builder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
      formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Confirm a withdrawal.
   * 
   * @param token 
   * @return Transaction
   */
  public Transaction  userConfirmWithdrawal (String token) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmWithdrawal");
    }
    

    // create path and map variables
    String path = "/user/confirmWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Transaction) ApiInvoker.deserialize(response, "", Transaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a deposit address.
   * 
   * @param currency 
   * @return String
   */
  public String  userGetDepositAddress (String currency) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/depositAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "currency", currency));
    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable two-factor auth for this account.
   * 
   * @param token Token from your selected TFA type.
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @return Boolean
   */
  public Boolean  userDisableTFA (String token, String type) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
       throw new ApiException(400, "Missing the required parameter 'token' when calling userDisableTFA");
    }
    

    // create path and map variables
    String path = "/user/disableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (type != null) {
        builder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Log in to BitMEX.
   * 
   * @param email Your email address.
   * @param password Your password.
   * @param token OTP Token (YubiKey, Google Authenticator)
   * @return AccessToken
   */
  public AccessToken  userLogin (String email, String password, String token) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
       throw new ApiException(400, "Missing the required parameter 'email' when calling userLogin");
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
       throw new ApiException(400, "Missing the required parameter 'password' when calling userLogin");
    }
    

    // create path and map variables
    String path = "/user/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (email != null) {
        builder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        builder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
      formParams.put("password", ApiInvoker.parameterToString(password));
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AccessToken) ApiInvoker.deserialize(response, "", AccessToken.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Log out of BitMEX.
   * 
   * @return void
   */
  public void  userLogout () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/logout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
   * 
   * @return void
   */
  public void  userLogoutAll () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/logoutAll".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get your account&#39;s margin status.
   * 
   * @return Margin
   */
  public Margin  userGetMargin () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/margin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Margin) ApiInvoker.deserialize(response, "", Margin.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Save application preferences.
   * 
   * @param prefs 
   * @param overwrite If true, will overwrite all existing preferences.
   * @return User
   */
  public User  userSavePreferences (String prefs, Boolean overwrite) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'prefs' is set
    if (prefs == null) {
       throw new ApiException(400, "Missing the required parameter 'prefs' when calling userSavePreferences");
    }
    

    // create path and map variables
    String path = "/user/preferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (prefs != null) {
        builder.addTextBody("prefs", ApiInvoker.parameterToString(prefs), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (overwrite != null) {
        builder.addTextBody("overwrite", ApiInvoker.parameterToString(overwrite), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("prefs", ApiInvoker.parameterToString(prefs));
      formParams.put("overwrite", ApiInvoker.parameterToString(overwrite));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (User) ApiInvoker.deserialize(response, "", User.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
   * 
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @param token If Yubikey, send one output from the key.
   * @return Boolean
   */
  public Boolean  userRequestEnableTFA (String type, String token) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/requestEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (type != null) {
        builder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Request a password reset.
   * 
   * @param email 
   * @return Boolean
   */
  public Boolean  userRequestPasswordReset (String email) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
       throw new ApiException(400, "Missing the required parameter 'email' when calling userRequestPasswordReset");
    }
    

    // create path and map variables
    String path = "/user/requestPasswordReset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (email != null) {
        builder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Request a withdrawal to an external wallet.
   * This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
   * @param currency Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;
   * @param amount Amount of withdrawal currency.
   * @param address Destination Address.
   * @param otpToken 2FA token. Required if 2FA is enabled on your account.
   * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
   * @return Transaction
   */
  public Transaction  userRequestWithdrawal (String currency, BigDecimal amount, String address, String otpToken, Double fee) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'currency' is set
    if (currency == null) {
       throw new ApiException(400, "Missing the required parameter 'currency' when calling userRequestWithdrawal");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
       throw new ApiException(400, "Missing the required parameter 'amount' when calling userRequestWithdrawal");
    }
    
    // verify the required parameter 'address' is set
    if (address == null) {
       throw new ApiException(400, "Missing the required parameter 'address' when calling userRequestWithdrawal");
    }
    

    // create path and map variables
    String path = "/user/requestWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (otpToken != null) {
        builder.addTextBody("otpToken", ApiInvoker.parameterToString(otpToken), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (currency != null) {
        builder.addTextBody("currency", ApiInvoker.parameterToString(currency), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (amount != null) {
        builder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (address != null) {
        builder.addTextBody("address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (fee != null) {
        builder.addTextBody("fee", ApiInvoker.parameterToString(fee), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("otpToken", ApiInvoker.parameterToString(otpToken));
      formParams.put("currency", ApiInvoker.parameterToString(currency));
      formParams.put("amount", ApiInvoker.parameterToString(amount));
      formParams.put("address", ApiInvoker.parameterToString(address));
      formParams.put("fee", ApiInvoker.parameterToString(fee));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Transaction) ApiInvoker.deserialize(response, "", Transaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Re-send verification email.
   * 
   * @param email 
   * @return Boolean
   */
  public Boolean  userSendVerificationEmail (String email) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
       throw new ApiException(400, "Missing the required parameter 'email' when calling userSendVerificationEmail");
    }
    

    // create path and map variables
    String path = "/user/resendVerificationEmail".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a history of all of your wallet transactions (deposits and withdrawals).
   * 
   * @return List<Transaction>
   */
  public List<Transaction>  userGetWalletHistory () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/user/walletHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Transaction>) ApiInvoker.deserialize(response, "array", Transaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
