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
      /// Get a deposit address. 
      /// </summary>
      /// <param name="currency"></param>
      /// <returns></returns>
      public string getDepositAddress (string currency) {
        // create path and map variables
        var path = "/user/depositAddress".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (currency != null){
          string paramStr = (currency is DateTime) ? ((DateTime)(object)currency).ToString("u") : Convert.ToString(currency);
          queryParams.Add("currency", paramStr);
		}
        try {
          if (typeof(string) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as string;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (string) ApiInvoker.deserialize(response, typeof(string));
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
      /// Get a history of all of your wallet transactions (deposits and withdrawals). 
      /// </summary>
      /// <returns></returns>
      public List<Transaction> getWalletHistory () {
        // create path and map variables
        var path = "/user/walletHistory".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(List<Transaction>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<Transaction>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<Transaction>) ApiInvoker.deserialize(response, typeof(List<Transaction>));
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
      /// Request a withdrawal to an external wallet. 
      /// </summary>
      /// <param name="amount">Amount of withdrawal currency. Note that for Bitcoin withdrawals, a standard 0.0001 XBT fee is charged by the Bitcoin network.</param>
      /// <param name="address">Destination Address.</param>
      /// <param name="currency">Currency you're withdrawing.</param>
      /// <returns></returns>
      public Transaction requestWithdrawal (double? amount, string address, string currency) {
        // create path and map variables
        var path = "/user/requestWithdrawal".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (amount == null || address == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (currency != null){
          if(currency is byte[]) {
            formParams.Add("currency", currency);
          } else {
            string paramStr = (currency is DateTime) ? ((DateTime)(object)currency).ToString("u") : Convert.ToString(currency);
            formParams.Add("currency", paramStr);
          }
		}
        if (amount != null){
          if(amount is byte[]) {
            formParams.Add("amount", amount);
          } else {
            string paramStr = (amount is DateTime) ? ((DateTime)(object)amount).ToString("u") : Convert.ToString(amount);
            formParams.Add("amount", paramStr);
          }
		}
        if (address != null){
          if(address is byte[]) {
            formParams.Add("address", address);
          } else {
            string paramStr = (address is DateTime) ? ((DateTime)(object)address).ToString("u") : Convert.ToString(address);
            formParams.Add("address", paramStr);
          }
		}
        try {
          if (typeof(Transaction) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as Transaction;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (Transaction) ApiInvoker.deserialize(response, typeof(Transaction));
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
      /// Cancel a withdrawal. 
      /// </summary>
      /// <param name="token"></param>
      /// <returns></returns>
      public Transaction cancelWithdrawal (string token) {
        // create path and map variables
        var path = "/user/cancelWithdrawal".Replace("{format}","json");

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
          if (typeof(Transaction) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as Transaction;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (Transaction) ApiInvoker.deserialize(response, typeof(Transaction));
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
      /// Confirm a withdrawal. 
      /// </summary>
      /// <param name="token"></param>
      /// <returns></returns>
      public Transaction confirmWithdrawal (string token) {
        // create path and map variables
        var path = "/user/confirmWithdrawal".Replace("{format}","json");

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
          if (typeof(Transaction) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as Transaction;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (Transaction) ApiInvoker.deserialize(response, typeof(Transaction));
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
      /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. 
      /// </summary>
      /// <param name="type">Two-factor auth type. Supported types: 'GA' (Google Authenticator)</param>
      /// <returns></returns>
      public bool? requestEnableTFA (string type) {
        // create path and map variables
        var path = "/user/requestEnableTFA".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        if (type != null){
          if(type is byte[]) {
            formParams.Add("type", type);
          } else {
            string paramStr = (type is DateTime) ? ((DateTime)(object)type).ToString("u") : Convert.ToString(type);
            formParams.Add("type", paramStr);
          }
		}
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
      /// Confirm two-factor auth for this account. 
      /// </summary>
      /// <param name="token">Token from your selected TFA type.</param>
      /// <param name="type">Two-factor auth type. Supported types: 'GA' (Google Authenticator)</param>
      /// <returns></returns>
      public bool? confirmEnableTFA (string token, string type) {
        // create path and map variables
        var path = "/user/confirmEnableTFA".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (token == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (type != null){
          if(type is byte[]) {
            formParams.Add("type", type);
          } else {
            string paramStr = (type is DateTime) ? ((DateTime)(object)type).ToString("u") : Convert.ToString(type);
            formParams.Add("type", paramStr);
          }
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
      /// Re-send verification email. 
      /// </summary>
      /// <param name="email"></param>
      /// <returns></returns>
      public bool? sendVerificationEmail (string email) {
        // create path and map variables
        var path = "/user/resendVerificationEmail".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (email == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (email != null){
          string paramStr = (email is DateTime) ? ((DateTime)(object)email).ToString("u") : Convert.ToString(email);
          queryParams.Add("email", paramStr);
		}
        try {
          if (typeof(bool?) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as bool?;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
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
      /// Confirm your email address with a token. 
      /// </summary>
      /// <param name="token"></param>
      /// <returns></returns>
      public bool? confirmEmail (string token) {
        // create path and map variables
        var path = "/user/confirmEmail".Replace("{format}","json");

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
      /// Request a password reset. 
      /// </summary>
      /// <param name="email"></param>
      /// <returns></returns>
      public bool? requestPasswordReset (string email) {
        // create path and map variables
        var path = "/user/requestPasswordReset".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (email == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (email != null){
          if(email is byte[]) {
            formParams.Add("email", email);
          } else {
            string paramStr = (email is DateTime) ? ((DateTime)(object)email).ToString("u") : Convert.ToString(email);
            formParams.Add("email", paramStr);
          }
		}
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
      /// Confirm a password reset. 
      /// </summary>
      /// <param name="email"></param>
      /// <param name="token"></param>
      /// <param name="newPassword"></param>
      /// <returns></returns>
      public bool? confirmPasswordReset (string email, string token, string newPassword) {
        // create path and map variables
        var path = "/user/confirmPasswordReset".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (email == null || token == null || newPassword == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (email != null){
          if(email is byte[]) {
            formParams.Add("email", email);
          } else {
            string paramStr = (email is DateTime) ? ((DateTime)(object)email).ToString("u") : Convert.ToString(email);
            formParams.Add("email", paramStr);
          }
		}
        if (token != null){
          if(token is byte[]) {
            formParams.Add("token", token);
          } else {
            string paramStr = (token is DateTime) ? ((DateTime)(object)token).ToString("u") : Convert.ToString(token);
            formParams.Add("token", paramStr);
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
      /// Register a new user. 
      /// </summary>
      /// <param name="email">Your email address.</param>
      /// <param name="password">Your password.</param>
      /// <param name="username">Desired username.</param>
      /// <param name="firstname">First name.</param>
      /// <param name="lastname">Last name.</param>
      /// <param name="acceptsTOS">Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).</param>
      /// <param name="accountType">Account type. Options: ['Trader', 'Hedger']. See the &lt;a href=&quot;/app/fees&quot;&gt;fees page&lt;/a&gt; for more details.</param>
      /// <returns></returns>
      public User newUser (string email, string password, string username, string firstname, string lastname, string acceptsTOS, string accountType) {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (email == null || password == null || username == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (email != null){
          if(email is byte[]) {
            formParams.Add("email", email);
          } else {
            string paramStr = (email is DateTime) ? ((DateTime)(object)email).ToString("u") : Convert.ToString(email);
            formParams.Add("email", paramStr);
          }
		}
        if (password != null){
          if(password is byte[]) {
            formParams.Add("password", password);
          } else {
            string paramStr = (password is DateTime) ? ((DateTime)(object)password).ToString("u") : Convert.ToString(password);
            formParams.Add("password", paramStr);
          }
		}
        if (username != null){
          if(username is byte[]) {
            formParams.Add("username", username);
          } else {
            string paramStr = (username is DateTime) ? ((DateTime)(object)username).ToString("u") : Convert.ToString(username);
            formParams.Add("username", paramStr);
          }
		}
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
        if (accountType != null){
          if(accountType is byte[]) {
            formParams.Add("accountType", accountType);
          } else {
            string paramStr = (accountType is DateTime) ? ((DateTime)(object)accountType).ToString("u") : Convert.ToString(accountType);
            formParams.Add("accountType", paramStr);
          }
		}
        if (acceptsTOS != null){
          if(acceptsTOS is byte[]) {
            formParams.Add("acceptsTOS", acceptsTOS);
          } else {
            string paramStr = (acceptsTOS is DateTime) ? ((DateTime)(object)acceptsTOS).ToString("u") : Convert.ToString(acceptsTOS);
            formParams.Add("acceptsTOS", paramStr);
          }
		}
        try {
          if (typeof(User) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as User;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (User) ApiInvoker.deserialize(response, typeof(User));
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
      public User getMe () {
        // create path and map variables
        var path = "/user".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(User) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as User;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (User) ApiInvoker.deserialize(response, typeof(User));
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
      /// <param name="oldPassword"></param>
      /// <param name="newPassword"></param>
      /// <param name="newPasswordConfirm"></param>
      /// <param name="accountType">Account fee schedule. Options: ['Trader', 'Hedger']. See the &lt;a href=&quot;/app/fees&quot;&gt;fees page&lt;/a&gt; for more details.</param>
      /// <returns></returns>
      public User updateMe (string firstname, string lastname, string oldPassword, string newPassword, string newPasswordConfirm, string accountType) {
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
        if (accountType != null){
          if(accountType is byte[]) {
            formParams.Add("accountType", accountType);
          } else {
            string paramStr = (accountType is DateTime) ? ((DateTime)(object)accountType).ToString("u") : Convert.ToString(accountType);
            formParams.Add("accountType", paramStr);
          }
		}
        try {
          if (typeof(User) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as User;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, null, headerParams, formParams);
            if(response != null){
               return (User) ApiInvoker.deserialize(response, typeof(User));
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
      /// Log in to BitMEX. 
      /// </summary>
      /// <param name="email">Your email address.</param>
      /// <param name="password">Your password.</param>
      /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
      /// <returns></returns>
      public AccessToken login (string email, string password, string token) {
        // create path and map variables
        var path = "/user/login".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        // verify required params are set
        if (email == null || password == null ) {
           throw new ApiException(400, "missing required params");
        }
        if (email != null){
          if(email is byte[]) {
            formParams.Add("email", email);
          } else {
            string paramStr = (email is DateTime) ? ((DateTime)(object)email).ToString("u") : Convert.ToString(email);
            formParams.Add("email", paramStr);
          }
		}
        if (password != null){
          if(password is byte[]) {
            formParams.Add("password", password);
          } else {
            string paramStr = (password is DateTime) ? ((DateTime)(object)password).ToString("u") : Convert.ToString(password);
            formParams.Add("password", paramStr);
          }
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
          if (typeof(AccessToken) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as AccessToken;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (AccessToken) ApiInvoker.deserialize(response, typeof(AccessToken));
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
      public void logout () {
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
      /// Save application preferences. 
      /// </summary>
      /// <param name="prefs"></param>
      /// <returns></returns>
      public User savePreferences (object prefs) {
        // create path and map variables
        var path = "/user/preferences".Replace("{format}","json");

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
          if (typeof(User) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as User;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, formParams);
            if(response != null){
               return (User) ApiInvoker.deserialize(response, typeof(User));
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
      /// Get your account's commission status. 
      /// </summary>
      /// <returns></returns>
      public List<any> getCommission () {
        // create path and map variables
        var path = "/user/commission".Replace("{format}","json");

        // query params
        var queryParams = new Dictionary<String, String>();
        var headerParams = new Dictionary<String, String>();
        var formParams = new Dictionary<String, object>();

        try {
          if (typeof(List<any>) == typeof(byte[])) {
            var response = apiInvoker.invokeBinaryAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            return ((object)response) as List<any>;
          } else {
            var response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, formParams);
            if(response != null){
               return (List<any>) ApiInvoker.deserialize(response, typeof(List<any>));
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
