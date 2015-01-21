package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.User;
import com.wordnik.client.model.Transaction;
import com.wordnik.client.model.Affiliate;
import com.wordnik.client.model.AccessToken;
import com.wordnik.client.model.Any;
import java.util.*;
import java.io.File;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.content.*;
import org.apache.http.entity.ContentType;

import android.webkit.MimeTypeMap;

public class UserApi {
  String basePath = "https://www.bitmex.com/api/v1";
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

  private static String getMimeType(File file) {
    MimeTypeMap mime = MimeTypeMap.getSingleton();
    int index = file.getName().lastIndexOf('.')+1;
    String ext = file.getName().substring(index).toLowerCase();
    return mime.getMimeTypeFromExtension(ext);
  }

  //error info- code: 200 reason: "Request was successful" model: <none>
  public String getDepositAddress (String currency) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/depositAddress".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(currency)))
      queryParams.put("currency", String.valueOf(currency));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public List<Transaction> getWalletHistory () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/walletHistory".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("otpToken", otpToken));
      hasFields = true;
      mp.add(new BasicNameValuePair("currency", currency));
      hasFields = true;
      mp.add(new BasicNameValuePair("amount", amount));
      hasFields = true;
      mp.add(new BasicNameValuePair("address", address));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("otpToken", otpToken.toString());
      hasFields = true;
      builder.addTextBody("currency", currency.toString());
      hasFields = true;
      builder.addTextBody("amount", amount.toString());
      hasFields = true;
      builder.addTextBody("address", address.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("token", token.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("token", token.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public Boolean requestEnableTFA (String type) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/requestEnableTFA".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("type", type));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("type", type.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("type", type));
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("type", type.toString());
      hasFields = true;
      builder.addTextBody("token", token.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    if(!"null".equals(String.valueOf(email)))
      queryParams.put("email", String.valueOf(email));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("token", token.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("email", email));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("email", email.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("email", email));
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      hasFields = true;
      mp.add(new BasicNameValuePair("newPassword", newPassword));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("email", email.toString());
      hasFields = true;
      builder.addTextBody("token", token.toString());
      hasFields = true;
      builder.addTextBody("newPassword", newPassword.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public List<Affiliate> getAffiliateStatus () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/affiliateStatus".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("email", email));
      hasFields = true;
      mp.add(new BasicNameValuePair("password", password));
      hasFields = true;
      mp.add(new BasicNameValuePair("username", username));
      hasFields = true;
      mp.add(new BasicNameValuePair("firstname", firstname));
      hasFields = true;
      mp.add(new BasicNameValuePair("lastname", lastname));
      hasFields = true;
      mp.add(new BasicNameValuePair("accountType", accountType));
      hasFields = true;
      mp.add(new BasicNameValuePair("acceptsTOS", acceptsTOS));
      hasFields = true;
      mp.add(new BasicNameValuePair("referrerID", referrerID));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("email", email.toString());
      hasFields = true;
      builder.addTextBody("password", password.toString());
      hasFields = true;
      builder.addTextBody("username", username.toString());
      hasFields = true;
      builder.addTextBody("firstname", firstname.toString());
      hasFields = true;
      builder.addTextBody("lastname", lastname.toString());
      hasFields = true;
      builder.addTextBody("accountType", accountType.toString());
      hasFields = true;
      builder.addTextBody("acceptsTOS", acceptsTOS.toString());
      hasFields = true;
      builder.addTextBody("referrerID", referrerID.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public User getMe () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public User updateMe (String firstname, String lastname, String oldPassword, String newPassword, String newPasswordConfirm, String accountType) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("firstname", firstname));
      hasFields = true;
      mp.add(new BasicNameValuePair("lastname", lastname));
      hasFields = true;
      mp.add(new BasicNameValuePair("oldPassword", oldPassword));
      hasFields = true;
      mp.add(new BasicNameValuePair("newPassword", newPassword));
      hasFields = true;
      mp.add(new BasicNameValuePair("newPasswordConfirm", newPasswordConfirm));
      hasFields = true;
      mp.add(new BasicNameValuePair("accountType", accountType));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("firstname", firstname.toString());
      hasFields = true;
      builder.addTextBody("lastname", lastname.toString());
      hasFields = true;
      builder.addTextBody("oldPassword", oldPassword.toString());
      hasFields = true;
      builder.addTextBody("newPassword", newPassword.toString());
      hasFields = true;
      builder.addTextBody("newPasswordConfirm", newPasswordConfirm.toString());
      hasFields = true;
      builder.addTextBody("accountType", accountType.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("email", email));
      hasFields = true;
      mp.add(new BasicNameValuePair("password", password));
      hasFields = true;
      mp.add(new BasicNameValuePair("token", token));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("email", email.toString());
      hasFields = true;
      builder.addTextBody("password", password.toString());
      hasFields = true;
      builder.addTextBody("token", token.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void logout () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/logout".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void logoutAll () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/logoutAll".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("prefs", prefs));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("prefs", prefs.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public List<any> getCommission () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/user/commission".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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

