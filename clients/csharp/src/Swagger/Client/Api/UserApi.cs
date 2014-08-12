  using System;
  using System.Collections.Generic;
  using Swagger.Client.Common;
  using Swagger.Client.Model;
  namespace Swagger.Client.Api {
    public class UserApi {
      string basePath;
      private readonly ApiInvoker apiInvoker = ApiInvoker.GetInstance();

      public UserApi(String basePath = "https://www.bitmex.com/api/v1")
      {
        this.basePath = basePath;
      }

      public ApiInvoker getInvoker() {
        return apiInvoker;
      }

      // Sets the endpoint base url for the services being accessed
      public void setBasePath(string basePath) {
        this.basePath = basePath;
      }

      // Gets the endpoint base url for the services being accessed
      public String getBasePath() {
        return basePath;
      }

      /// <summary>
      /// Log in to BitMEX. 
      /// </summary>
      /// <param name="body"></param>
      /// <returns></returns>
      public object user_login (object body) {
        // create path and map variables
        var path = "/user/login".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (body == null ) {
           throw new ApiException(400, "missing required params");
        }
        try {
          if (typeof(object) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as object;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, formParams);
            if(response != null){
               return (object) ApiInvoker.deserialize(response, typeof(object));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Log out of BitMEX. 
      /// </summary>
      /// <returns></returns>
      public void user_logout () {
        // create path and map variables
        var path = "/user/logout".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(void) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return ;
            }
            else {
              return ;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return ;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Register a new user. 
      /// </summary>
      /// <param name="body">Model instance data</param>
      /// <returns></returns>
      public user user_create (user body) {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(user) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as user;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, formParams);
            if(response != null){
               return (user) ApiInvoker.deserialize(response, typeof(user));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Get your user model. 
      /// </summary>
      /// <returns></returns>
      public user user_getMe () {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(user) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as user;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (user) ApiInvoker.deserialize(response, typeof(user));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Update your password, name, and other attributes. 
      /// </summary>
      /// <param name="firstname"></param>
      /// <param name="lastname"></param>
      /// <param name="phone"></param>
      /// <param name="oldPassword"></param>
      /// <param name="newPassword"></param>
      /// <param name="newPasswordConfirm"></param>
      /// <returns></returns>
      public user user_updateMe (string firstname, string lastname, string phone, string oldPassword, string newPassword, string newPasswordConfirm) {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (firstname != null){
          if(firstname is byte[]) {
            formParams.Add("firstname", firstname);
          } else {
            string paramStr = (firstname is DateTime) ? ((DateTime)(object)firstname).ToString("u") : Convert.ToString(firstname);
            formParams.Add("firstname", paramStr);
          }
		}
        if (lastname != null){
          if(lastname is byte[]) {
            formParams.Add("lastname", lastname);
          } else {
            string paramStr = (lastname is DateTime) ? ((DateTime)(object)lastname).ToString("u") : Convert.ToString(lastname);
            formParams.Add("lastname", paramStr);
          }
		}
        if (phone != null){
          if(phone is byte[]) {
            formParams.Add("phone", phone);
          } else {
            string paramStr = (phone is DateTime) ? ((DateTime)(object)phone).ToString("u") : Convert.ToString(phone);
            formParams.Add("phone", paramStr);
          }
		}
        if (oldPassword != null){
          if(oldPassword is byte[]) {
            formParams.Add("oldPassword", oldPassword);
          } else {
            string paramStr = (oldPassword is DateTime) ? ((DateTime)(object)oldPassword).ToString("u") : Convert.ToString(oldPassword);
            formParams.Add("oldPassword", paramStr);
          }
		}
        if (newPassword != null){
          if(newPassword is byte[]) {
            formParams.Add("newPassword", newPassword);
          } else {
            string paramStr = (newPassword is DateTime) ? ((DateTime)(object)newPassword).ToString("u") : Convert.ToString(newPassword);
            formParams.Add("newPassword", paramStr);
          }
		}
        if (newPasswordConfirm != null){
          if(newPasswordConfirm is byte[]) {
            formParams.Add("newPasswordConfirm", newPasswordConfirm);
          } else {
            string paramStr = (newPasswordConfirm is DateTime) ? ((DateTime)(object)newPasswordConfirm).ToString("u") : Convert.ToString(newPasswordConfirm);
            formParams.Add("newPasswordConfirm", paramStr);
          }
		}
        try {
          if (typeof(user) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as user;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, null, headerParams, formParams);
            if(response != null){
               return (user) ApiInvoker.deserialize(response, typeof(user));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Save application preferences. 
      /// </summary>
      /// <param name="prefs"></param>
      /// <returns></returns>
      public user user_savePreferences (object prefs) {
        // create path and map variables
        var path = "/user/savePrefs".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (prefs == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (prefs != null){
          if(prefs is byte[]) {
            formParams.Add("prefs", prefs);
          } else {
            string paramStr = (prefs is DateTime) ? ((DateTime)(object)prefs).ToString("u") : Convert.ToString(prefs);
            formParams.Add("prefs", paramStr);
          }
		}
        try {
          if (typeof(user) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as user;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (user) ApiInvoker.deserialize(response, typeof(user));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Request an SMS verification token. 
      /// </summary>
      /// <returns></returns>
      public bool? user_verifyPhone () {
        // create path and map variables
        var path = "/user/requestSMS".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(bool?) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as bool?;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (bool?) ApiInvoker.deserialize(response, typeof(bool?));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      /// <summary>
      /// Confirm your phone number by entering your SMS verification token. 
      /// </summary>
      /// <param name="token"></param>
      /// <returns></returns>
      public user user_confirmPhone (string token) {
        // create path and map variables
        var path = "/user/confirmPhone".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (token == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (token != null){
          if(token is byte[]) {
            formParams.Add("token", token);
          } else {
            string paramStr = (token is DateTime) ? ((DateTime)(object)token).ToString("u") : Convert.ToString(token);
            formParams.Add("token", paramStr);
          }
		}
        try {
          if (typeof(user) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as user;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (user) ApiInvoker.deserialize(response, typeof(user));
            }
            else {
              return null;
            }
          }
        } catch (ApiException ex) {
          if(ex.ErrorCode == 404) {
          	return null;
          }
          else {
            throw ex;
          }
        }
      }
      }
    }
