package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Transaction;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.User;
import io.swagger.client.model.Affiliate;
import io.swagger.client.model.UserCommission;
import io.swagger.client.model.Margin;
import io.swagger.client.model.Wallet;
import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-03T10:34:33.567-06:00")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel a withdrawal.
   * 
   * @param token  (required)
   * @return Transaction
   * @throws ApiException if fails to make API call
   */
  public Transaction userCancelWithdrawal(String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling userCancelWithdrawal");
    }
    
    // create path and map variables
    String localVarPath = "/user/cancelWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Transaction> localVarReturnType = new GenericType<Transaction>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Check if a referral code is valid.
   * If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404.
   * @param referralCode  (optional)
   * @return Double
   * @throws ApiException if fails to make API call
   */
  public Double userCheckReferralCode(String referralCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/checkReferralCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "referralCode", referralCode));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Double> localVarReturnType = new GenericType<Double>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Confirm your email address with a token.
   * 
   * @param token  (required)
   * @return AccessToken
   * @throws ApiException if fails to make API call
   */
  public AccessToken userConfirmEmail(String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEmail");
    }
    
    // create path and map variables
    String localVarPath = "/user/confirmEmail".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AccessToken> localVarReturnType = new GenericType<AccessToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
   * 
   * @param token Token from your selected TFA type. (required)
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean userConfirmEnableTFA(String token, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEnableTFA");
    }
    
    // create path and map variables
    String localVarPath = "/user/confirmEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (type != null)
      localVarFormParams.put("type", type);
if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Confirm a withdrawal.
   * 
   * @param token  (required)
   * @return Transaction
   * @throws ApiException if fails to make API call
   */
  public Transaction userConfirmWithdrawal(String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling userConfirmWithdrawal");
    }
    
    // create path and map variables
    String localVarPath = "/user/confirmWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Transaction> localVarReturnType = new GenericType<Transaction>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Disable two-factor auth for this account.
   * 
   * @param token Token from your selected TFA type. (required)
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean userDisableTFA(String token, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling userDisableTFA");
    }
    
    // create path and map variables
    String localVarPath = "/user/disableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (type != null)
      localVarFormParams.put("type", type);
if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your user model.
   * 
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User userGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your current affiliate/referral status.
   * 
   * @return List<Affiliate>
   * @throws ApiException if fails to make API call
   */
  public List<Affiliate> userGetAffiliateStatus() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/affiliateStatus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Affiliate>> localVarReturnType = new GenericType<List<Affiliate>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your account&#39;s commission status.
   * 
   * @return List<UserCommission>
   * @throws ApiException if fails to make API call
   */
  public List<UserCommission> userGetCommission() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/commission".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<UserCommission>> localVarReturnType = new GenericType<List<UserCommission>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a deposit address.
   * 
   * @param currency  (optional, default to XBt)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String userGetDepositAddress(String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/depositAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
   * 
   * @param currency  (optional, default to XBt)
   * @return Margin
   * @throws ApiException if fails to make API call
   */
  public Margin userGetMargin(String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/margin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Margin> localVarReturnType = new GenericType<Margin>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your current wallet information.
   * 
   * @param currency  (optional, default to XBt)
   * @return Wallet
   * @throws ApiException if fails to make API call
   */
  public Wallet userGetWallet(String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/wallet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Wallet> localVarReturnType = new GenericType<Wallet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
   * 
   * @param currency  (optional, default to XBt)
   * @return List<Transaction>
   * @throws ApiException if fails to make API call
   */
  public List<Transaction> userGetWalletHistory(String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/walletHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Transaction>> localVarReturnType = new GenericType<List<Transaction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
   * 
   * @param currency  (optional, default to XBt)
   * @return List<Transaction>
   * @throws ApiException if fails to make API call
   */
  public List<Transaction> userGetWalletSummary(String currency) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/walletSummary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currency", currency));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Transaction>> localVarReturnType = new GenericType<List<Transaction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log out of BitMEX.
   * 
   * @throws ApiException if fails to make API call
   */
  public void userLogout() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/logout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
   * 
   * @return Double
   * @throws ApiException if fails to make API call
   */
  public Double userLogoutAll() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/logoutAll".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Double> localVarReturnType = new GenericType<Double>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
   * 
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) (optional)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean userRequestEnableTFA(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user/requestEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (type != null)
      localVarFormParams.put("type", type);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Boolean> localVarReturnType = new GenericType<Boolean>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request a withdrawal to an external wallet.
   * This will send a confirmation email to the email address on record, unless requested via an API Key with the &#x60;withdraw&#x60; permission.
   * @param currency Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; (required)
   * @param amount Amount of withdrawal currency. (required)
   * @param address Destination Address. (required)
   * @param otpToken 2FA token. Required if 2FA is enabled on your account. (optional)
   * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)
   * @return Transaction
   * @throws ApiException if fails to make API call
   */
  public Transaction userRequestWithdrawal(String currency, BigDecimal amount, String address, String otpToken, Double fee) throws ApiException {
    Object localVarPostBody = null;
    
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
    String localVarPath = "/user/requestWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (otpToken != null)
      localVarFormParams.put("otpToken", otpToken);
if (currency != null)
      localVarFormParams.put("currency", currency);
if (amount != null)
      localVarFormParams.put("amount", amount);
if (address != null)
      localVarFormParams.put("address", address);
if (fee != null)
      localVarFormParams.put("fee", fee);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Transaction> localVarReturnType = new GenericType<Transaction>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Save user preferences.
   * 
   * @param prefs  (required)
   * @param overwrite If true, will overwrite all existing preferences. (optional, default to false)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User userSavePreferences(String prefs, Boolean overwrite) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'prefs' is set
    if (prefs == null) {
      throw new ApiException(400, "Missing the required parameter 'prefs' when calling userSavePreferences");
    }
    
    // create path and map variables
    String localVarPath = "/user/preferences".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (prefs != null)
      localVarFormParams.put("prefs", prefs);
if (overwrite != null)
      localVarFormParams.put("overwrite", overwrite);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update your password, name, and other attributes.
   * 
   * @param firstname  (optional)
   * @param lastname  (optional)
   * @param oldPassword  (optional)
   * @param newPassword  (optional)
   * @param newPasswordConfirm  (optional)
   * @param username Username can only be set once. To reset, email support. (optional)
   * @param country Country of residence. (optional)
   * @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key. (optional)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User userUpdate(String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String username, String country, String pgpPubKey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (firstname != null)
      localVarFormParams.put("firstname", firstname);
if (lastname != null)
      localVarFormParams.put("lastname", lastname);
if (oldPassword != null)
      localVarFormParams.put("oldPassword", oldPassword);
if (newPassword != null)
      localVarFormParams.put("newPassword", newPassword);
if (newPasswordConfirm != null)
      localVarFormParams.put("newPasswordConfirm", newPasswordConfirm);
if (username != null)
      localVarFormParams.put("username", username);
if (country != null)
      localVarFormParams.put("country", country);
if (pgpPubKey != null)
      localVarFormParams.put("pgpPubKey", pgpPubKey);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
