package com.wordnik.client.api;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;

import com.wordnik.client.model.User;
import com.wordnik.client.model.Transaction;
import com.wordnik.client.model.Affiliate;
import com.wordnik.client.model.AccessToken;
import com.wordnik.client.model.Any;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class UserApi {
  String basePath = "https://www.bitmex.com/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public String getDepositAddress (String currency) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/depositAddress".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(currency)))
      queryParams.put("currency", String.valueOf(currency));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public List<Transaction> getWalletHistory () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/walletHistory".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Transaction>) ApiInvoker.deserialize(response, "List", Transaction.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Transaction requestWithdrawal (String otpToken, Double amount, String address, String currency) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(currency == null || amount == null || address == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/requestWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("otpToken", otpToken, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("currency", currency, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("amount", amount, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("address", address, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("otpToken", String.valueOf(otpToken));
      formParams.put("currency", String.valueOf(currency));
      formParams.put("amount", String.valueOf(amount));
      formParams.put("address", String.valueOf(address));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Transaction cancelWithdrawal (String token) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/cancelWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("token", String.valueOf(token));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Transaction confirmWithdrawal (String token) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/confirmWithdrawal".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("token", String.valueOf(token));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean requestEnableTFA (String type) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/requestEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("type", type, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("type", String.valueOf(type));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean confirmEnableTFA (String token, String type) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/confirmEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("type", type, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("type", String.valueOf(type));
      formParams.put("token", String.valueOf(token));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean sendVerificationEmail (String email) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(email == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/resendVerificationEmail".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(email)))
      queryParams.put("email", String.valueOf(email));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean confirmEmail (String token) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/confirmEmail".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("token", String.valueOf(token));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean requestPasswordReset (String email) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(email == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/requestPasswordReset".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("email", email, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("email", String.valueOf(email));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public Boolean confirmPasswordReset (String email, String token, String newPassword) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(email == null || token == null || newPassword == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/confirmPasswordReset".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("email", email, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("newPassword", newPassword, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("email", String.valueOf(email));
      formParams.put("token", String.valueOf(token));
      formParams.put("newPassword", String.valueOf(newPassword));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public List<Affiliate> getAffiliateStatus () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/affiliateStatus".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Affiliate>) ApiInvoker.deserialize(response, "List", Affiliate.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public User newUser (String email, String password, String username, String firstname, String lastname, String acceptsTOS, String referrerID, String accountType) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(email == null || password == null || username == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("email", email, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("password", password, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("username", username, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("firstname", firstname, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("lastname", lastname, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("accountType", accountType, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("acceptsTOS", acceptsTOS, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("referrerID", referrerID, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("email", String.valueOf(email));
      formParams.put("password", String.valueOf(password));
      formParams.put("username", String.valueOf(username));
      formParams.put("firstname", String.valueOf(firstname));
      formParams.put("lastname", String.valueOf(lastname));
      formParams.put("accountType", String.valueOf(accountType));
      formParams.put("acceptsTOS", String.valueOf(acceptsTOS));
      formParams.put("referrerID", String.valueOf(referrerID));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public User getMe () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public User updateMe (String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String accountType) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("firstname", firstname, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("lastname", lastname, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("oldPassword", oldPassword, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("newPassword", newPassword, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("newPasswordConfirm", newPasswordConfirm, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("accountType", accountType, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("firstname", String.valueOf(firstname));
      formParams.put("lastname", String.valueOf(lastname));
      formParams.put("oldPassword", String.valueOf(oldPassword));
      formParams.put("newPassword", String.valueOf(newPassword));
      formParams.put("newPasswordConfirm", String.valueOf(newPasswordConfirm));
      formParams.put("accountType", String.valueOf(accountType));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public AccessToken login (String email, String password, String token) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(email == null || password == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/login".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("email", email, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("password", password, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("token", token, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("email", String.valueOf(email));
      formParams.put("password", String.valueOf(password));
      formParams.put("token", String.valueOf(token));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 204 reason: "Request was successful" model: <none>
  */
  public void logout () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/logout".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
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
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 204 reason: "Request was successful" model: <none>
  */
  public void logoutAll () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/logoutAll".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
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
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public User savePreferences (Object prefs) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(prefs == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/user/preferences".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("prefs", prefs, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("prefs", String.valueOf(prefs));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  */
  public List<any> getCommission () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/commission".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<any>) ApiInvoker.deserialize(response, "List", any.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

