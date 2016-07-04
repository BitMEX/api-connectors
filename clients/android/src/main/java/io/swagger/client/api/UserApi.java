package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Transaction;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.User;
import io.swagger.client.model.Affiliate;
import io.swagger.client.model.UserCommission;
import io.swagger.client.model.Margin;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

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
  * Cancel a withdrawal.
  * 
   * @param token 
   * @return Transaction
  */
  public Transaction userCancelWithdrawal (String token) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userCancelWithdrawal",
      new ApiException(400, "Missing the required parameter 'token' when calling userCancelWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Transaction) ApiInvoker.deserialize(localVarResponse, "", Transaction.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Cancel a withdrawal.
   * 
   * @param token 
  */
  public void userCancelWithdrawal (String token, final Response.Listener<Transaction> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userCancelWithdrawal",
         new ApiException(400, "Missing the required parameter 'token' when calling userCancelWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Transaction) ApiInvoker.deserialize(localVarResponse,  "", Transaction.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Check if a referral code is valid.
  * If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404.
   * @param referralCode 
   * @return Double
  */
  public Double userCheckReferralCode (String referralCode) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Double) ApiInvoker.deserialize(localVarResponse, "", Double.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Check if a referral code is valid.
   * If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404.
   * @param referralCode 
  */
  public void userCheckReferralCode (String referralCode, final Response.Listener<Double> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Double) ApiInvoker.deserialize(localVarResponse,  "", Double.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Confirm your email address with a token.
  * 
   * @param token 
   * @return AccessToken
  */
  public AccessToken userConfirmEmail (String token) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmEmail",
      new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEmail"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (AccessToken) ApiInvoker.deserialize(localVarResponse, "", AccessToken.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Confirm your email address with a token.
   * 
   * @param token 
  */
  public void userConfirmEmail (String token, final Response.Listener<AccessToken> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmEmail",
         new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEmail"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AccessToken) ApiInvoker.deserialize(localVarResponse,  "", AccessToken.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
  * 
   * @param token Token from your selected TFA type.
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
   * @return Boolean
  */
  public Boolean userConfirmEnableTFA (String token, String type) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmEnableTFA",
      new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEnableTFA"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
   * 
   * @param token Token from your selected TFA type.   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
  */
  public void userConfirmEnableTFA (String token, String type, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmEnableTFA",
         new ApiException(400, "Missing the required parameter 'token' when calling userConfirmEnableTFA"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Confirm a password reset.
  * 
   * @param token 
   * @param newPassword 
   * @return Boolean
  */
  public Boolean userConfirmPasswordReset (String token, String newPassword) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmPasswordReset",
      new ApiException(400, "Missing the required parameter 'token' when calling userConfirmPasswordReset"));
      }
  
      // verify the required parameter 'newPassword' is set
      if (newPassword == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'newPassword' when calling userConfirmPasswordReset",
      new ApiException(400, "Missing the required parameter 'newPassword' when calling userConfirmPasswordReset"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (newPassword != null) {
          localVarBuilder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("token", ApiInvoker.parameterToString(token));
formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Confirm a password reset.
   * 
   * @param token    * @param newPassword 
  */
  public void userConfirmPasswordReset (String token, String newPassword, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmPasswordReset",
         new ApiException(400, "Missing the required parameter 'token' when calling userConfirmPasswordReset"));
    }
    
    // verify the required parameter 'newPassword' is set
    if (newPassword == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'newPassword' when calling userConfirmPasswordReset",
         new ApiException(400, "Missing the required parameter 'newPassword' when calling userConfirmPasswordReset"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPassword != null) {
        localVarBuilder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Confirm a withdrawal.
  * 
   * @param token 
   * @return Transaction
  */
  public Transaction userConfirmWithdrawal (String token) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmWithdrawal",
      new ApiException(400, "Missing the required parameter 'token' when calling userConfirmWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Transaction) ApiInvoker.deserialize(localVarResponse, "", Transaction.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Confirm a withdrawal.
   * 
   * @param token 
  */
  public void userConfirmWithdrawal (String token, final Response.Listener<Transaction> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userConfirmWithdrawal",
         new ApiException(400, "Missing the required parameter 'token' when calling userConfirmWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Transaction) ApiInvoker.deserialize(localVarResponse,  "", Transaction.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Disable two-factor auth for this account.
  * 
   * @param token Token from your selected TFA type.
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @return Boolean
  */
  public Boolean userDisableTFA (String token, String type) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userDisableTFA",
      new ApiException(400, "Missing the required parameter 'token' when calling userDisableTFA"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Disable two-factor auth for this account.
   * 
   * @param token Token from your selected TFA type.   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
  */
  public void userDisableTFA (String token, String type, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling userDisableTFA",
         new ApiException(400, "Missing the required parameter 'token' when calling userDisableTFA"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get your user model.
  * 
   * @return User
  */
  public User userGet () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your user model.
   * 

  */
  public void userGet (final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get your current affiliate/referral status.
  * 
   * @return List<Affiliate>
  */
  public List<Affiliate> userGetAffiliateStatus () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Affiliate>) ApiInvoker.deserialize(localVarResponse, "array", Affiliate.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your current affiliate/referral status.
   * 

  */
  public void userGetAffiliateStatus (final Response.Listener<List<Affiliate>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Affiliate>) ApiInvoker.deserialize(localVarResponse,  "array", Affiliate.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get your account&#39;s commission status.
  * 
   * @return List<UserCommission>
  */
  public List<UserCommission> userGetCommission () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<UserCommission>) ApiInvoker.deserialize(localVarResponse, "array", UserCommission.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your account&#39;s commission status.
   * 

  */
  public void userGetCommission (final Response.Listener<List<UserCommission>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<UserCommission>) ApiInvoker.deserialize(localVarResponse,  "array", UserCommission.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get a deposit address.
  * 
   * @param currency 
   * @return String
  */
  public String userGetDepositAddress (String currency) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get a deposit address.
   * 
   * @param currency 
  */
  public void userGetDepositAddress (String currency, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
  * 
   * @param currency 
   * @return Margin
  */
  public Margin userGetMargin (String currency) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/user/margin".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Margin) ApiInvoker.deserialize(localVarResponse, "", Margin.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
   * 
   * @param currency 
  */
  public void userGetMargin (String currency, final Response.Listener<Margin> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/user/margin".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Margin) ApiInvoker.deserialize(localVarResponse,  "", Margin.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get a history of all of your wallet transactions (deposits and withdrawals).
  * 
   * @param currency 
   * @return List<Transaction>
  */
  public List<Transaction> userGetWalletHistory (String currency) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/user/walletHistory".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Transaction>) ApiInvoker.deserialize(localVarResponse, "array", Transaction.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get a history of all of your wallet transactions (deposits and withdrawals).
   * 
   * @param currency 
  */
  public void userGetWalletHistory (String currency, final Response.Listener<List<Transaction>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/user/walletHistory".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Transaction>) ApiInvoker.deserialize(localVarResponse,  "array", Transaction.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
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
  public AccessToken userLogin (String email, String password, String token) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'email' is set
      if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userLogin",
      new ApiException(400, "Missing the required parameter 'email' when calling userLogin"));
      }
  
      // verify the required parameter 'password' is set
      if (password == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userLogin",
      new ApiException(400, "Missing the required parameter 'password' when calling userLogin"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (email != null) {
          localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (password != null) {
          localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (token != null) {
          localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("email", ApiInvoker.parameterToString(email));
formParams.put("password", ApiInvoker.parameterToString(password));
formParams.put("token", ApiInvoker.parameterToString(token));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (AccessToken) ApiInvoker.deserialize(localVarResponse, "", AccessToken.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Log in to BitMEX.
   * 
   * @param email Your email address.   * @param password Your password.   * @param token OTP Token (YubiKey, Google Authenticator)
  */
  public void userLogin (String email, String password, String token, final Response.Listener<AccessToken> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'email' is set
    if (email == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userLogin",
         new ApiException(400, "Missing the required parameter 'email' when calling userLogin"));
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userLogin",
         new ApiException(400, "Missing the required parameter 'password' when calling userLogin"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        localVarBuilder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
formParams.put("password", ApiInvoker.parameterToString(password));
formParams.put("token", ApiInvoker.parameterToString(token));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((AccessToken) ApiInvoker.deserialize(localVarResponse,  "", AccessToken.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Log out of BitMEX.
  * 
   * @return void
  */
  public void userLogout () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return ;
        } else {
           return ;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Log out of BitMEX.
   * 

  */
  public void userLogout (final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
  * 
   * @return Double
  */
  public Double userLogoutAll () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Double) ApiInvoker.deserialize(localVarResponse, "", Double.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
   * 

  */
  public void userLogoutAll (final Response.Listener<Double> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Double) ApiInvoker.deserialize(localVarResponse,  "", Double.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Register a new user.
  * 
   * @param email Your email address.
   * @param password Your password.
   * @param country Country of residence.
   * @param username Desired username.
   * @param firstname First name.
   * @param lastname Last name.
   * @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).
   * @param referrerID Optional Referrer ID.
   * @param tfaType Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef
   * @param tfaToken Two-Factor Token.
   * @return User
  */
  public User userNew (String email, String password, String country, String username, String firstname, String lastname, String acceptsTOS, String referrerID, String tfaType, String tfaToken) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'email' is set
      if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userNew",
      new ApiException(400, "Missing the required parameter 'email' when calling userNew"));
      }
  
      // verify the required parameter 'password' is set
      if (password == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userNew",
      new ApiException(400, "Missing the required parameter 'password' when calling userNew"));
      }
  
      // verify the required parameter 'country' is set
      if (country == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'country' when calling userNew",
      new ApiException(400, "Missing the required parameter 'country' when calling userNew"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (email != null) {
          localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (password != null) {
          localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (username != null) {
          localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (firstname != null) {
          localVarBuilder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (lastname != null) {
          localVarBuilder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (acceptsTOS != null) {
          localVarBuilder.addTextBody("acceptsTOS", ApiInvoker.parameterToString(acceptsTOS), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (referrerID != null) {
          localVarBuilder.addTextBody("referrerID", ApiInvoker.parameterToString(referrerID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (country != null) {
          localVarBuilder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (tfaType != null) {
          localVarBuilder.addTextBody("tfaType", ApiInvoker.parameterToString(tfaType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (tfaToken != null) {
          localVarBuilder.addTextBody("tfaToken", ApiInvoker.parameterToString(tfaToken), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
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
formParams.put("tfaType", ApiInvoker.parameterToString(tfaType));
formParams.put("tfaToken", ApiInvoker.parameterToString(tfaToken));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Register a new user.
   * 
   * @param email Your email address.   * @param password Your password.   * @param country Country of residence.   * @param username Desired username.   * @param firstname First name.   * @param lastname Last name.   * @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).   * @param referrerID Optional Referrer ID.   * @param tfaType Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef   * @param tfaToken Two-Factor Token.
  */
  public void userNew (String email, String password, String country, String username, String firstname, String lastname, String acceptsTOS, String referrerID, String tfaType, String tfaToken, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'email' is set
    if (email == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userNew",
         new ApiException(400, "Missing the required parameter 'email' when calling userNew"));
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userNew",
         new ApiException(400, "Missing the required parameter 'password' when calling userNew"));
    }
    
    // verify the required parameter 'country' is set
    if (country == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'country' when calling userNew",
         new ApiException(400, "Missing the required parameter 'country' when calling userNew"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (username != null) {
        localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (firstname != null) {
        localVarBuilder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (lastname != null) {
        localVarBuilder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (acceptsTOS != null) {
        localVarBuilder.addTextBody("acceptsTOS", ApiInvoker.parameterToString(acceptsTOS), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (referrerID != null) {
        localVarBuilder.addTextBody("referrerID", ApiInvoker.parameterToString(referrerID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (country != null) {
        localVarBuilder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (tfaType != null) {
        localVarBuilder.addTextBody("tfaType", ApiInvoker.parameterToString(tfaType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (tfaToken != null) {
        localVarBuilder.addTextBody("tfaToken", ApiInvoker.parameterToString(tfaToken), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
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
formParams.put("tfaType", ApiInvoker.parameterToString(tfaType));
formParams.put("tfaToken", ApiInvoker.parameterToString(tfaToken));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
  * 
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @return Boolean
  */
  public Boolean userRequestEnableTFA (String type) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("type", ApiInvoker.parameterToString(type));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
   * 
   * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
  */
  public void userRequestEnableTFA (String type, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("type", ApiInvoker.parameterToString(type));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Request a password reset.
  * 
   * @param email 
   * @return Boolean
  */
  public Boolean userRequestPasswordReset (String email) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'email' is set
      if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userRequestPasswordReset",
      new ApiException(400, "Missing the required parameter 'email' when calling userRequestPasswordReset"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (email != null) {
          localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("email", ApiInvoker.parameterToString(email));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Request a password reset.
   * 
   * @param email 
  */
  public void userRequestPasswordReset (String email, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'email' is set
    if (email == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userRequestPasswordReset",
         new ApiException(400, "Missing the required parameter 'email' when calling userRequestPasswordReset"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Request a withdrawal to an external wallet.
  * This will send a confirmation email to the email address on record, unless requested via an API Key with the &#x60;withdraw&#x60; permission.
   * @param currency Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;
   * @param amount Amount of withdrawal currency.
   * @param address Destination Address.
   * @param otpToken 2FA token. Required if 2FA is enabled on your account.
   * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
   * @return Transaction
  */
  public Transaction userRequestWithdrawal (String currency, BigDecimal amount, String address, String otpToken, Double fee) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'currency' is set
      if (currency == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling userRequestWithdrawal",
      new ApiException(400, "Missing the required parameter 'currency' when calling userRequestWithdrawal"));
      }
  
      // verify the required parameter 'amount' is set
      if (amount == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling userRequestWithdrawal",
      new ApiException(400, "Missing the required parameter 'amount' when calling userRequestWithdrawal"));
      }
  
      // verify the required parameter 'address' is set
      if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling userRequestWithdrawal",
      new ApiException(400, "Missing the required parameter 'address' when calling userRequestWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (otpToken != null) {
          localVarBuilder.addTextBody("otpToken", ApiInvoker.parameterToString(otpToken), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (currency != null) {
          localVarBuilder.addTextBody("currency", ApiInvoker.parameterToString(currency), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (amount != null) {
          localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (address != null) {
          localVarBuilder.addTextBody("address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (fee != null) {
          localVarBuilder.addTextBody("fee", ApiInvoker.parameterToString(fee), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("otpToken", ApiInvoker.parameterToString(otpToken));
formParams.put("currency", ApiInvoker.parameterToString(currency));
formParams.put("amount", ApiInvoker.parameterToString(amount));
formParams.put("address", ApiInvoker.parameterToString(address));
formParams.put("fee", ApiInvoker.parameterToString(fee));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Transaction) ApiInvoker.deserialize(localVarResponse, "", Transaction.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Request a withdrawal to an external wallet.
   * This will send a confirmation email to the email address on record, unless requested via an API Key with the &#x60;withdraw&#x60; permission.
   * @param currency Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;   * @param amount Amount of withdrawal currency.   * @param address Destination Address.   * @param otpToken 2FA token. Required if 2FA is enabled on your account.   * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
  */
  public void userRequestWithdrawal (String currency, BigDecimal amount, String address, String otpToken, Double fee, final Response.Listener<Transaction> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currency' is set
    if (currency == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currency' when calling userRequestWithdrawal",
         new ApiException(400, "Missing the required parameter 'currency' when calling userRequestWithdrawal"));
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'amount' when calling userRequestWithdrawal",
         new ApiException(400, "Missing the required parameter 'amount' when calling userRequestWithdrawal"));
    }
    
    // verify the required parameter 'address' is set
    if (address == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'address' when calling userRequestWithdrawal",
         new ApiException(400, "Missing the required parameter 'address' when calling userRequestWithdrawal"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (otpToken != null) {
        localVarBuilder.addTextBody("otpToken", ApiInvoker.parameterToString(otpToken), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (currency != null) {
        localVarBuilder.addTextBody("currency", ApiInvoker.parameterToString(currency), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (amount != null) {
        localVarBuilder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (address != null) {
        localVarBuilder.addTextBody("address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (fee != null) {
        localVarBuilder.addTextBody("fee", ApiInvoker.parameterToString(fee), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("otpToken", ApiInvoker.parameterToString(otpToken));
formParams.put("currency", ApiInvoker.parameterToString(currency));
formParams.put("amount", ApiInvoker.parameterToString(amount));
formParams.put("address", ApiInvoker.parameterToString(address));
formParams.put("fee", ApiInvoker.parameterToString(fee));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Transaction) ApiInvoker.deserialize(localVarResponse,  "", Transaction.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Save user preferences.
  * 
   * @param prefs 
   * @param overwrite If true, will overwrite all existing preferences.
   * @return User
  */
  public User userSavePreferences (String prefs, Boolean overwrite) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'prefs' is set
      if (prefs == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'prefs' when calling userSavePreferences",
      new ApiException(400, "Missing the required parameter 'prefs' when calling userSavePreferences"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (prefs != null) {
          localVarBuilder.addTextBody("prefs", ApiInvoker.parameterToString(prefs), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (overwrite != null) {
          localVarBuilder.addTextBody("overwrite", ApiInvoker.parameterToString(overwrite), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("prefs", ApiInvoker.parameterToString(prefs));
formParams.put("overwrite", ApiInvoker.parameterToString(overwrite));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Save user preferences.
   * 
   * @param prefs    * @param overwrite If true, will overwrite all existing preferences.
  */
  public void userSavePreferences (String prefs, Boolean overwrite, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'prefs' is set
    if (prefs == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'prefs' when calling userSavePreferences",
         new ApiException(400, "Missing the required parameter 'prefs' when calling userSavePreferences"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (prefs != null) {
        localVarBuilder.addTextBody("prefs", ApiInvoker.parameterToString(prefs), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (overwrite != null) {
        localVarBuilder.addTextBody("overwrite", ApiInvoker.parameterToString(overwrite), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("prefs", ApiInvoker.parameterToString(prefs));
formParams.put("overwrite", ApiInvoker.parameterToString(overwrite));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Re-send verification email.
  * 
   * @param email 
   * @return Boolean
  */
  public Boolean userSendVerificationEmail (String email) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'email' is set
      if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userSendVerificationEmail",
      new ApiException(400, "Missing the required parameter 'email' when calling userSendVerificationEmail"));
      }
  

  // create path and map variables
  String path = "/user/resendVerificationEmail".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (email != null) {
          localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("email", ApiInvoker.parameterToString(email));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Boolean) ApiInvoker.deserialize(localVarResponse, "", Boolean.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Re-send verification email.
   * 
   * @param email 
  */
  public void userSendVerificationEmail (String email, final Response.Listener<Boolean> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'email' is set
    if (email == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userSendVerificationEmail",
         new ApiException(400, "Missing the required parameter 'email' when calling userSendVerificationEmail"));
    }
    

    // create path and map variables
    String path = "/user/resendVerificationEmail".replaceAll("\\{format\\}","json");

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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("email", ApiInvoker.parameterToString(email));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Boolean) ApiInvoker.deserialize(localVarResponse,  "", Boolean.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
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
   * @param username Username can only be set once. To reset, email support.
   * @param country Country of residence.
   * @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key.
   * @return User
  */
  public User userUpdate (String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String username, String country, String pgpPubKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (firstname != null) {
          localVarBuilder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (lastname != null) {
          localVarBuilder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (oldPassword != null) {
          localVarBuilder.addTextBody("oldPassword", ApiInvoker.parameterToString(oldPassword), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (newPassword != null) {
          localVarBuilder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (newPasswordConfirm != null) {
          localVarBuilder.addTextBody("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (username != null) {
          localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (country != null) {
          localVarBuilder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (pgpPubKey != null) {
          localVarBuilder.addTextBody("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("firstname", ApiInvoker.parameterToString(firstname));
formParams.put("lastname", ApiInvoker.parameterToString(lastname));
formParams.put("oldPassword", ApiInvoker.parameterToString(oldPassword));
formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
formParams.put("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm));
formParams.put("username", ApiInvoker.parameterToString(username));
formParams.put("country", ApiInvoker.parameterToString(country));
formParams.put("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (User) ApiInvoker.deserialize(localVarResponse, "", User.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Update your password, name, and other attributes.
   * 
   * @param firstname    * @param lastname    * @param oldPassword    * @param newPassword    * @param newPasswordConfirm    * @param username Username can only be set once. To reset, email support.   * @param country Country of residence.   * @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key.
  */
  public void userUpdate (String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String username, String country, String pgpPubKey, final Response.Listener<User> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (firstname != null) {
        localVarBuilder.addTextBody("firstname", ApiInvoker.parameterToString(firstname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (lastname != null) {
        localVarBuilder.addTextBody("lastname", ApiInvoker.parameterToString(lastname), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (oldPassword != null) {
        localVarBuilder.addTextBody("oldPassword", ApiInvoker.parameterToString(oldPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPassword != null) {
        localVarBuilder.addTextBody("newPassword", ApiInvoker.parameterToString(newPassword), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (newPasswordConfirm != null) {
        localVarBuilder.addTextBody("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (username != null) {
        localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (country != null) {
        localVarBuilder.addTextBody("country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pgpPubKey != null) {
        localVarBuilder.addTextBody("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("firstname", ApiInvoker.parameterToString(firstname));
formParams.put("lastname", ApiInvoker.parameterToString(lastname));
formParams.put("oldPassword", ApiInvoker.parameterToString(oldPassword));
formParams.put("newPassword", ApiInvoker.parameterToString(newPassword));
formParams.put("newPasswordConfirm", ApiInvoker.parameterToString(newPasswordConfirm));
formParams.put("username", ApiInvoker.parameterToString(username));
formParams.put("country", ApiInvoker.parameterToString(country));
formParams.put("pgpPubKey", ApiInvoker.parameterToString(pgpPubKey));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((User) ApiInvoker.deserialize(localVarResponse,  "", User.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
