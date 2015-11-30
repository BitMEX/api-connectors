using System;
using System.IO;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUserApi
    {
        
        /// <summary>
        /// Get your user model.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>User</returns>
        User UserGetMe ();
  
        /// <summary>
        /// Get your user model.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>User</returns>
        System.Threading.Tasks.Task<User> UserGetMeAsync ();
        
        /// <summary>
        /// Update your password, name, and other attributes.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="firstname"></param>
        /// <param name="lastname"></param>
        /// <param name="oldPassword"></param>
        /// <param name="newPassword"></param>
        /// <param name="newPasswordConfirm"></param>
        /// <param name="country">Country of residence.</param>
        /// <param name="pgpPubKey">PGP Public Key. If specified, automated emails will be sentwith this key.</param>
        /// <returns>User</returns>
        User UserUpdateMe (string firstname = null, string lastname = null, string oldPassword = null, string newPassword = null, string newPasswordConfirm = null, string country = null, string pgpPubKey = null);
  
        /// <summary>
        /// Update your password, name, and other attributes.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="firstname"></param>
        /// <param name="lastname"></param>
        /// <param name="oldPassword"></param>
        /// <param name="newPassword"></param>
        /// <param name="newPasswordConfirm"></param>
        /// <param name="country">Country of residence.</param>
        /// <param name="pgpPubKey">PGP Public Key. If specified, automated emails will be sentwith this key.</param>
        /// <returns>User</returns>
        System.Threading.Tasks.Task<User> UserUpdateMeAsync (string firstname = null, string lastname = null, string oldPassword = null, string newPassword = null, string newPasswordConfirm = null, string country = null, string pgpPubKey = null);
        
        /// <summary>
        /// Register a new user.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email">Your email address.</param>
        /// <param name="password">Your password.</param>
        /// <param name="username">Desired username.</param>
        /// <param name="firstname">First name.</param>
        /// <param name="lastname">Last name.</param>
        /// <param name="acceptsTOS">Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).</param>
        /// <param name="referrerID">Optional Referrer ID.</param>
        /// <param name="country">Country of residence.</param>
        /// <returns>User</returns>
        User UserNewUser (string email, string password, string username, string firstname = null, string lastname = null, string acceptsTOS = null, string referrerID = null, string country = null);
  
        /// <summary>
        /// Register a new user.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email">Your email address.</param>
        /// <param name="password">Your password.</param>
        /// <param name="username">Desired username.</param>
        /// <param name="firstname">First name.</param>
        /// <param name="lastname">Last name.</param>
        /// <param name="acceptsTOS">Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/app/terms).</param>
        /// <param name="referrerID">Optional Referrer ID.</param>
        /// <param name="country">Country of residence.</param>
        /// <returns>User</returns>
        System.Threading.Tasks.Task<User> UserNewUserAsync (string email, string password, string username, string firstname = null, string lastname = null, string acceptsTOS = null, string referrerID = null, string country = null);
        
        /// <summary>
        /// Get your current affiliate/referral status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        List<Affiliate> UserGetAffiliateStatus ();
  
        /// <summary>
        /// Get your current affiliate/referral status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Affiliate>> UserGetAffiliateStatusAsync ();
        
        /// <summary>
        /// Cancel a withdrawal.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        Transaction UserCancelWithdrawal (string token);
  
        /// <summary>
        /// Cancel a withdrawal.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        System.Threading.Tasks.Task<Transaction> UserCancelWithdrawalAsync (string token);
        
        /// <summary>
        /// Check if a referral code is valid.
        /// </summary>
        /// <remarks>
        /// If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
        /// </remarks>
        /// <param name="referralCode"></param>
        /// <returns>double?</returns>
        double? UserCheckReferralCode (string referralCode = null);
  
        /// <summary>
        /// Check if a referral code is valid.
        /// </summary>
        /// <remarks>
        /// If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
        /// </remarks>
        /// <param name="referralCode"></param>
        /// <returns>double?</returns>
        System.Threading.Tasks.Task<double?> UserCheckReferralCodeAsync (string referralCode = null);
        
        /// <summary>
        /// Get your account&#39;s commission status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        List<UserCommission> UserGetCommission ();
  
        /// <summary>
        /// Get your account&#39;s commission status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<UserCommission>> UserGetCommissionAsync ();
        
        /// <summary>
        /// Confirm your email address with a token.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>AccessToken</returns>
        AccessToken UserConfirmEmail (string token);
  
        /// <summary>
        /// Confirm your email address with a token.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>AccessToken</returns>
        System.Threading.Tasks.Task<AccessToken> UserConfirmEmailAsync (string token);
        
        /// <summary>
        /// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;</param>
        /// <returns>bool?</returns>
        bool? UserConfirmEnableTFA (string token, string type = null);
  
        /// <summary>
        /// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;</param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserConfirmEnableTFAAsync (string token, string type = null);
        
        /// <summary>
        /// Confirm a password reset.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <param name="newPassword"></param>
        /// <returns>bool?</returns>
        bool? UserConfirmPasswordReset (string token, string newPassword);
  
        /// <summary>
        /// Confirm a password reset.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <param name="newPassword"></param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserConfirmPasswordResetAsync (string token, string newPassword);
        
        /// <summary>
        /// Confirm a withdrawal.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        Transaction UserConfirmWithdrawal (string token);
  
        /// <summary>
        /// Confirm a withdrawal.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        System.Threading.Tasks.Task<Transaction> UserConfirmWithdrawalAsync (string token);
        
        /// <summary>
        /// Get a deposit address.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="currency"></param>
        /// <returns>string</returns>
        string UserGetDepositAddress (string currency = null);
  
        /// <summary>
        /// Get a deposit address.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="currency"></param>
        /// <returns>string</returns>
        System.Threading.Tasks.Task<string> UserGetDepositAddressAsync (string currency = null);
        
        /// <summary>
        /// Disable two-factor auth for this account.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <returns>bool?</returns>
        bool? UserDisableTFA (string token, string type = null);
  
        /// <summary>
        /// Disable two-factor auth for this account.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserDisableTFAAsync (string token, string type = null);
        
        /// <summary>
        /// Log in to BitMEX.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email">Your email address.</param>
        /// <param name="password">Your password.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>AccessToken</returns>
        AccessToken UserLogin (string email, string password, string token = null);
  
        /// <summary>
        /// Log in to BitMEX.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email">Your email address.</param>
        /// <param name="password">Your password.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>AccessToken</returns>
        System.Threading.Tasks.Task<AccessToken> UserLoginAsync (string email, string password, string token = null);
        
        /// <summary>
        /// Log out of BitMEX.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        void UserLogout ();
  
        /// <summary>
        /// Log out of BitMEX.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task UserLogoutAsync ();
        
        /// <summary>
        /// Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        void UserLogoutAll ();
  
        /// <summary>
        /// Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task UserLogoutAllAsync ();
        
        /// <summary>
        /// Get your account&#39;s margin status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>Margin</returns>
        Margin UserGetMargin ();
  
        /// <summary>
        /// Get your account&#39;s margin status.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns>Margin</returns>
        System.Threading.Tasks.Task<Margin> UserGetMarginAsync ();
        
        /// <summary>
        /// Save application preferences.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="prefs"></param>
        /// <param name="overwrite">If true, will overwrite all existing preferences.</param>
        /// <returns>User</returns>
        User UserSavePreferences (string prefs, bool? overwrite = null);
  
        /// <summary>
        /// Save application preferences.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="prefs"></param>
        /// <param name="overwrite">If true, will overwrite all existing preferences.</param>
        /// <returns>User</returns>
        System.Threading.Tasks.Task<User> UserSavePreferencesAsync (string prefs, bool? overwrite = null);
        
        /// <summary>
        /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <param name="token">If Yubikey, send one output from the key.</param>
        /// <returns>bool?</returns>
        bool? UserRequestEnableTFA (string type = null, string token = null);
  
        /// <summary>
        /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <param name="token">If Yubikey, send one output from the key.</param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserRequestEnableTFAAsync (string type = null, string token = null);
        
        /// <summary>
        /// Request a password reset.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        bool? UserRequestPasswordReset (string email);
  
        /// <summary>
        /// Request a password reset.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserRequestPasswordResetAsync (string email);
        
        /// <summary>
        /// Request a withdrawal to an external wallet.
        /// </summary>
        /// <remarks>
        /// This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
        /// </remarks>
        /// <param name="currency">Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;</param>
        /// <param name="amount">Amount of withdrawal currency.</param>
        /// <param name="address">Destination Address.</param>
        /// <param name="otpToken">2FA token. Required if 2FA is enabled on your account.</param>
        /// <param name="fee">Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.</param>
        /// <returns>Transaction</returns>
        Transaction UserRequestWithdrawal (string currency, double? amount, string address, string otpToken = null, double? fee = null);
  
        /// <summary>
        /// Request a withdrawal to an external wallet.
        /// </summary>
        /// <remarks>
        /// This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
        /// </remarks>
        /// <param name="currency">Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;</param>
        /// <param name="amount">Amount of withdrawal currency.</param>
        /// <param name="address">Destination Address.</param>
        /// <param name="otpToken">2FA token. Required if 2FA is enabled on your account.</param>
        /// <param name="fee">Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.</param>
        /// <returns>Transaction</returns>
        System.Threading.Tasks.Task<Transaction> UserRequestWithdrawalAsync (string currency, double? amount, string address, string otpToken = null, double? fee = null);
        
        /// <summary>
        /// Re-send verification email.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        bool? UserSendVerificationEmail (string email);
  
        /// <summary>
        /// Re-send verification email.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        System.Threading.Tasks.Task<bool?> UserSendVerificationEmailAsync (string email);
        
        /// <summary>
        /// Get a history of all of your wallet transactions (deposits and withdrawals).
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        List<Transaction> UserGetWalletHistory ();
  
        /// <summary>
        /// Get a history of all of your wallet transactions (deposits and withdrawals).
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Transaction>> UserGetWalletHistoryAsync ();
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class UserApi : IUserApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public UserApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="UserApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UserApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        
        /// <summary>
        /// Get your user model. 
        /// </summary>
        /// <returns>User</returns>            
        public User UserGetMe ()
        {
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMe: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMe: " + response.ErrorMessage, response.ErrorMessage);
    
            return (User) ApiClient.Deserialize(response, typeof(User));
        }
    
        /// <summary>
        /// Get your user model. 
        /// </summary>
        /// <returns>User</returns>
        public async System.Threading.Tasks.Task<User> UserGetMeAsync ()
        {
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMe: " + response.Content, response.Content);

            return (User) ApiClient.Deserialize(response, typeof(User));
        }
        
        /// <summary>
        /// Update your password, name, and other attributes. 
        /// </summary>
        /// <param name="firstname"></param> 
        /// <param name="lastname"></param> 
        /// <param name="oldPassword"></param> 
        /// <param name="newPassword"></param> 
        /// <param name="newPasswordConfirm"></param> 
        /// <param name="country">Country of residence.</param> 
        /// <param name="pgpPubKey">PGP Public Key. If specified, automated emails will be sentwith this key.</param> 
        /// <returns>User</returns>            
        public User UserUpdateMe (string firstname = null, string lastname = null, string oldPassword = null, string newPassword = null, string newPasswordConfirm = null, string country = null, string pgpPubKey = null)
        {
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (firstname != null) formParams.Add("firstname", ApiClient.ParameterToString(firstname)); // form parameter
            if (lastname != null) formParams.Add("lastname", ApiClient.ParameterToString(lastname)); // form parameter
            if (oldPassword != null) formParams.Add("oldPassword", ApiClient.ParameterToString(oldPassword)); // form parameter
            if (newPassword != null) formParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // form parameter
            if (newPasswordConfirm != null) formParams.Add("newPasswordConfirm", ApiClient.ParameterToString(newPasswordConfirm)); // form parameter
            if (country != null) formParams.Add("country", ApiClient.ParameterToString(country)); // form parameter
            if (pgpPubKey != null) formParams.Add("pgpPubKey", ApiClient.ParameterToString(pgpPubKey)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserUpdateMe: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserUpdateMe: " + response.ErrorMessage, response.ErrorMessage);
    
            return (User) ApiClient.Deserialize(response, typeof(User));
        }
    
        /// <summary>
        /// Update your password, name, and other attributes. 
        /// </summary>
        /// <param name="firstname"></param>
        /// <param name="lastname"></param>
        /// <param name="oldPassword"></param>
        /// <param name="newPassword"></param>
        /// <param name="newPasswordConfirm"></param>
        /// <param name="country">Country of residence.</param>
        /// <param name="pgpPubKey">PGP Public Key. If specified, automated emails will be sentwith this key.</param>
        /// <returns>User</returns>
        public async System.Threading.Tasks.Task<User> UserUpdateMeAsync (string firstname = null, string lastname = null, string oldPassword = null, string newPassword = null, string newPasswordConfirm = null, string country = null, string pgpPubKey = null)
        {
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (firstname != null) formParams.Add("firstname", ApiClient.ParameterToString(firstname)); // form parameter
            if (lastname != null) formParams.Add("lastname", ApiClient.ParameterToString(lastname)); // form parameter
            if (oldPassword != null) formParams.Add("oldPassword", ApiClient.ParameterToString(oldPassword)); // form parameter
            if (newPassword != null) formParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // form parameter
            if (newPasswordConfirm != null) formParams.Add("newPasswordConfirm", ApiClient.ParameterToString(newPasswordConfirm)); // form parameter
            if (country != null) formParams.Add("country", ApiClient.ParameterToString(country)); // form parameter
            if (pgpPubKey != null) formParams.Add("pgpPubKey", ApiClient.ParameterToString(pgpPubKey)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserUpdateMe: " + response.Content, response.Content);

            return (User) ApiClient.Deserialize(response, typeof(User));
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
        /// <param name="referrerID">Optional Referrer ID.</param> 
        /// <param name="country">Country of residence.</param> 
        /// <returns>User</returns>            
        public User UserNewUser (string email, string password, string username, string firstname = null, string lastname = null, string acceptsTOS = null, string referrerID = null, string country = null)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserNewUser");
            
            // verify the required parameter 'password' is set
            if (password == null) throw new ApiException(400, "Missing required parameter 'password' when calling UserNewUser");
            
            // verify the required parameter 'username' is set
            if (username == null) throw new ApiException(400, "Missing required parameter 'username' when calling UserNewUser");
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            if (password != null) formParams.Add("password", ApiClient.ParameterToString(password)); // form parameter
            if (username != null) formParams.Add("username", ApiClient.ParameterToString(username)); // form parameter
            if (firstname != null) formParams.Add("firstname", ApiClient.ParameterToString(firstname)); // form parameter
            if (lastname != null) formParams.Add("lastname", ApiClient.ParameterToString(lastname)); // form parameter
            if (acceptsTOS != null) formParams.Add("acceptsTOS", ApiClient.ParameterToString(acceptsTOS)); // form parameter
            if (referrerID != null) formParams.Add("referrerID", ApiClient.ParameterToString(referrerID)); // form parameter
            if (country != null) formParams.Add("country", ApiClient.ParameterToString(country)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserNewUser: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserNewUser: " + response.ErrorMessage, response.ErrorMessage);
    
            return (User) ApiClient.Deserialize(response, typeof(User));
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
        /// <param name="referrerID">Optional Referrer ID.</param>
        /// <param name="country">Country of residence.</param>
        /// <returns>User</returns>
        public async System.Threading.Tasks.Task<User> UserNewUserAsync (string email, string password, string username, string firstname = null, string lastname = null, string acceptsTOS = null, string referrerID = null, string country = null)
        {
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserNewUser");
            // verify the required parameter 'password' is set
            if (password == null) throw new ApiException(400, "Missing required parameter 'password' when calling UserNewUser");
            // verify the required parameter 'username' is set
            if (username == null) throw new ApiException(400, "Missing required parameter 'username' when calling UserNewUser");
            
    
            var path_ = "/user";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            if (password != null) formParams.Add("password", ApiClient.ParameterToString(password)); // form parameter
            if (username != null) formParams.Add("username", ApiClient.ParameterToString(username)); // form parameter
            if (firstname != null) formParams.Add("firstname", ApiClient.ParameterToString(firstname)); // form parameter
            if (lastname != null) formParams.Add("lastname", ApiClient.ParameterToString(lastname)); // form parameter
            if (acceptsTOS != null) formParams.Add("acceptsTOS", ApiClient.ParameterToString(acceptsTOS)); // form parameter
            if (referrerID != null) formParams.Add("referrerID", ApiClient.ParameterToString(referrerID)); // form parameter
            if (country != null) formParams.Add("country", ApiClient.ParameterToString(country)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserNewUser: " + response.Content, response.Content);

            return (User) ApiClient.Deserialize(response, typeof(User));
        }
        
        /// <summary>
        /// Get your current affiliate/referral status. 
        /// </summary>
        /// <returns></returns>            
        public List<Affiliate> UserGetAffiliateStatus ()
        {
            
    
            var path_ = "/user/affiliateStatus";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetAffiliateStatus: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetAffiliateStatus: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Affiliate>) ApiClient.Deserialize(response, typeof(List<Affiliate>));
        }
    
        /// <summary>
        /// Get your current affiliate/referral status. 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Affiliate>> UserGetAffiliateStatusAsync ()
        {
            
    
            var path_ = "/user/affiliateStatus";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetAffiliateStatus: " + response.Content, response.Content);

            return (List<Affiliate>) ApiClient.Deserialize(response, typeof(List<Affiliate>));
        }
        
        /// <summary>
        /// Cancel a withdrawal. 
        /// </summary>
        /// <param name="token"></param> 
        /// <returns>Transaction</returns>            
        public Transaction UserCancelWithdrawal (string token)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserCancelWithdrawal");
            
    
            var path_ = "/user/cancelWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCancelWithdrawal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCancelWithdrawal: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
    
        /// <summary>
        /// Cancel a withdrawal. 
        /// </summary>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        public async System.Threading.Tasks.Task<Transaction> UserCancelWithdrawalAsync (string token)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserCancelWithdrawal");
            
    
            var path_ = "/user/cancelWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCancelWithdrawal: " + response.Content, response.Content);

            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
        
        /// <summary>
        /// Check if a referral code is valid. If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
        /// </summary>
        /// <param name="referralCode"></param> 
        /// <returns>double?</returns>            
        public double? UserCheckReferralCode (string referralCode = null)
        {
            
    
            var path_ = "/user/checkReferralCode";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (referralCode != null) queryParams.Add("referralCode", ApiClient.ParameterToString(referralCode)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCheckReferralCode: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCheckReferralCode: " + response.ErrorMessage, response.ErrorMessage);
    
            return (double?) ApiClient.Deserialize(response, typeof(double?));
        }
    
        /// <summary>
        /// Check if a referral code is valid. If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
        /// </summary>
        /// <param name="referralCode"></param>
        /// <returns>double?</returns>
        public async System.Threading.Tasks.Task<double?> UserCheckReferralCodeAsync (string referralCode = null)
        {
            
    
            var path_ = "/user/checkReferralCode";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (referralCode != null) queryParams.Add("referralCode", ApiClient.ParameterToString(referralCode)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserCheckReferralCode: " + response.Content, response.Content);

            return (double?) ApiClient.Deserialize(response, typeof(double?));
        }
        
        /// <summary>
        /// Get your account&#39;s commission status. 
        /// </summary>
        /// <returns></returns>            
        public List<UserCommission> UserGetCommission ()
        {
            
    
            var path_ = "/user/commission";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetCommission: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetCommission: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<UserCommission>) ApiClient.Deserialize(response, typeof(List<UserCommission>));
        }
    
        /// <summary>
        /// Get your account&#39;s commission status. 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<UserCommission>> UserGetCommissionAsync ()
        {
            
    
            var path_ = "/user/commission";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetCommission: " + response.Content, response.Content);

            return (List<UserCommission>) ApiClient.Deserialize(response, typeof(List<UserCommission>));
        }
        
        /// <summary>
        /// Confirm your email address with a token. 
        /// </summary>
        /// <param name="token"></param> 
        /// <returns>AccessToken</returns>            
        public AccessToken UserConfirmEmail (string token)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmEmail");
            
    
            var path_ = "/user/confirmEmail";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEmail: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEmail: " + response.ErrorMessage, response.ErrorMessage);
    
            return (AccessToken) ApiClient.Deserialize(response, typeof(AccessToken));
        }
    
        /// <summary>
        /// Confirm your email address with a token. 
        /// </summary>
        /// <param name="token"></param>
        /// <returns>AccessToken</returns>
        public async System.Threading.Tasks.Task<AccessToken> UserConfirmEmailAsync (string token)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmEmail");
            
    
            var path_ = "/user/confirmEmail";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEmail: " + response.Content, response.Content);

            return (AccessToken) ApiClient.Deserialize(response, typeof(AccessToken));
        }
        
        /// <summary>
        /// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint. 
        /// </summary>
        /// <param name="token">Token from your selected TFA type.</param> 
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;</param> 
        /// <returns>bool?</returns>            
        public bool? UserConfirmEnableTFA (string token, string type = null)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmEnableTFA");
            
    
            var path_ = "/user/confirmEnableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEnableTFA: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEnableTFA: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint. 
        /// </summary>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;</param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserConfirmEnableTFAAsync (string token, string type = null)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmEnableTFA");
            
    
            var path_ = "/user/confirmEnableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmEnableTFA: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Confirm a password reset. 
        /// </summary>
        /// <param name="token"></param> 
        /// <param name="newPassword"></param> 
        /// <returns>bool?</returns>            
        public bool? UserConfirmPasswordReset (string token, string newPassword)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmPasswordReset");
            
            // verify the required parameter 'newPassword' is set
            if (newPassword == null) throw new ApiException(400, "Missing required parameter 'newPassword' when calling UserConfirmPasswordReset");
            
    
            var path_ = "/user/confirmPasswordReset";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            if (newPassword != null) formParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmPasswordReset: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmPasswordReset: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Confirm a password reset. 
        /// </summary>
        /// <param name="token"></param>
        /// <param name="newPassword"></param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserConfirmPasswordResetAsync (string token, string newPassword)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmPasswordReset");
            // verify the required parameter 'newPassword' is set
            if (newPassword == null) throw new ApiException(400, "Missing required parameter 'newPassword' when calling UserConfirmPasswordReset");
            
    
            var path_ = "/user/confirmPasswordReset";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            if (newPassword != null) formParams.Add("newPassword", ApiClient.ParameterToString(newPassword)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmPasswordReset: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Confirm a withdrawal. 
        /// </summary>
        /// <param name="token"></param> 
        /// <returns>Transaction</returns>            
        public Transaction UserConfirmWithdrawal (string token)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmWithdrawal");
            
    
            var path_ = "/user/confirmWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmWithdrawal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmWithdrawal: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
    
        /// <summary>
        /// Confirm a withdrawal. 
        /// </summary>
        /// <param name="token"></param>
        /// <returns>Transaction</returns>
        public async System.Threading.Tasks.Task<Transaction> UserConfirmWithdrawalAsync (string token)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserConfirmWithdrawal");
            
    
            var path_ = "/user/confirmWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserConfirmWithdrawal: " + response.Content, response.Content);

            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
        
        /// <summary>
        /// Get a deposit address. 
        /// </summary>
        /// <param name="currency"></param> 
        /// <returns>string</returns>            
        public string UserGetDepositAddress (string currency = null)
        {
            
    
            var path_ = "/user/depositAddress";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (currency != null) queryParams.Add("currency", ApiClient.ParameterToString(currency)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetDepositAddress: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetDepositAddress: " + response.ErrorMessage, response.ErrorMessage);
    
            return (string) ApiClient.Deserialize(response, typeof(string));
        }
    
        /// <summary>
        /// Get a deposit address. 
        /// </summary>
        /// <param name="currency"></param>
        /// <returns>string</returns>
        public async System.Threading.Tasks.Task<string> UserGetDepositAddressAsync (string currency = null)
        {
            
    
            var path_ = "/user/depositAddress";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (currency != null) queryParams.Add("currency", ApiClient.ParameterToString(currency)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetDepositAddress: " + response.Content, response.Content);

            return (string) ApiClient.Deserialize(response, typeof(string));
        }
        
        /// <summary>
        /// Disable two-factor auth for this account. 
        /// </summary>
        /// <param name="token">Token from your selected TFA type.</param> 
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param> 
        /// <returns>bool?</returns>            
        public bool? UserDisableTFA (string token, string type = null)
        {
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserDisableTFA");
            
    
            var path_ = "/user/disableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserDisableTFA: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserDisableTFA: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Disable two-factor auth for this account. 
        /// </summary>
        /// <param name="token">Token from your selected TFA type.</param>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserDisableTFAAsync (string token, string type = null)
        {
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling UserDisableTFA");
            
    
            var path_ = "/user/disableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserDisableTFA: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Log in to BitMEX. 
        /// </summary>
        /// <param name="email">Your email address.</param> 
        /// <param name="password">Your password.</param> 
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param> 
        /// <returns>AccessToken</returns>            
        public AccessToken UserLogin (string email, string password, string token = null)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserLogin");
            
            // verify the required parameter 'password' is set
            if (password == null) throw new ApiException(400, "Missing required parameter 'password' when calling UserLogin");
            
    
            var path_ = "/user/login";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            if (password != null) formParams.Add("password", ApiClient.ParameterToString(password)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogin: " + response.ErrorMessage, response.ErrorMessage);
    
            return (AccessToken) ApiClient.Deserialize(response, typeof(AccessToken));
        }
    
        /// <summary>
        /// Log in to BitMEX. 
        /// </summary>
        /// <param name="email">Your email address.</param>
        /// <param name="password">Your password.</param>
        /// <param name="token">OTP Token (YubiKey, Google Authenticator)</param>
        /// <returns>AccessToken</returns>
        public async System.Threading.Tasks.Task<AccessToken> UserLoginAsync (string email, string password, string token = null)
        {
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserLogin");
            // verify the required parameter 'password' is set
            if (password == null) throw new ApiException(400, "Missing required parameter 'password' when calling UserLogin");
            
    
            var path_ = "/user/login";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            if (password != null) formParams.Add("password", ApiClient.ParameterToString(password)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogin: " + response.Content, response.Content);

            return (AccessToken) ApiClient.Deserialize(response, typeof(AccessToken));
        }
        
        /// <summary>
        /// Log out of BitMEX. 
        /// </summary>
        /// <returns></returns>            
        public void UserLogout ()
        {
            
    
            var path_ = "/user/logout";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogout: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogout: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Log out of BitMEX. 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task UserLogoutAsync ()
        {
            
    
            var path_ = "/user/logout";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogout: " + response.Content, response.Content);

            
            return;
        }
        
        /// <summary>
        /// Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices. 
        /// </summary>
        /// <returns></returns>            
        public void UserLogoutAll ()
        {
            
    
            var path_ = "/user/logoutAll";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogoutAll: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogoutAll: " + response.ErrorMessage, response.ErrorMessage);
    
            return;
        }
    
        /// <summary>
        /// Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices. 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task UserLogoutAllAsync ()
        {
            
    
            var path_ = "/user/logoutAll";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserLogoutAll: " + response.Content, response.Content);

            
            return;
        }
        
        /// <summary>
        /// Get your account&#39;s margin status. 
        /// </summary>
        /// <returns>Margin</returns>            
        public Margin UserGetMargin ()
        {
            
    
            var path_ = "/user/margin";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMargin: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMargin: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Margin) ApiClient.Deserialize(response, typeof(Margin));
        }
    
        /// <summary>
        /// Get your account&#39;s margin status. 
        /// </summary>
        /// <returns>Margin</returns>
        public async System.Threading.Tasks.Task<Margin> UserGetMarginAsync ()
        {
            
    
            var path_ = "/user/margin";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetMargin: " + response.Content, response.Content);

            return (Margin) ApiClient.Deserialize(response, typeof(Margin));
        }
        
        /// <summary>
        /// Save application preferences. 
        /// </summary>
        /// <param name="prefs"></param> 
        /// <param name="overwrite">If true, will overwrite all existing preferences.</param> 
        /// <returns>User</returns>            
        public User UserSavePreferences (string prefs, bool? overwrite = null)
        {
            
            // verify the required parameter 'prefs' is set
            if (prefs == null) throw new ApiException(400, "Missing required parameter 'prefs' when calling UserSavePreferences");
            
    
            var path_ = "/user/preferences";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (prefs != null) formParams.Add("prefs", ApiClient.ParameterToString(prefs)); // form parameter
            if (overwrite != null) formParams.Add("overwrite", ApiClient.ParameterToString(overwrite)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSavePreferences: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSavePreferences: " + response.ErrorMessage, response.ErrorMessage);
    
            return (User) ApiClient.Deserialize(response, typeof(User));
        }
    
        /// <summary>
        /// Save application preferences. 
        /// </summary>
        /// <param name="prefs"></param>
        /// <param name="overwrite">If true, will overwrite all existing preferences.</param>
        /// <returns>User</returns>
        public async System.Threading.Tasks.Task<User> UserSavePreferencesAsync (string prefs, bool? overwrite = null)
        {
            // verify the required parameter 'prefs' is set
            if (prefs == null) throw new ApiException(400, "Missing required parameter 'prefs' when calling UserSavePreferences");
            
    
            var path_ = "/user/preferences";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (prefs != null) formParams.Add("prefs", ApiClient.ParameterToString(prefs)); // form parameter
            if (overwrite != null) formParams.Add("overwrite", ApiClient.ParameterToString(overwrite)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSavePreferences: " + response.Content, response.Content);

            return (User) ApiClient.Deserialize(response, typeof(User));
        }
        
        /// <summary>
        /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys. 
        /// </summary>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param> 
        /// <param name="token">If Yubikey, send one output from the key.</param> 
        /// <returns>bool?</returns>            
        public bool? UserRequestEnableTFA (string type = null, string token = null)
        {
            
    
            var path_ = "/user/requestEnableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestEnableTFA: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestEnableTFA: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys. 
        /// </summary>
        /// <param name="type">Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)</param>
        /// <param name="token">If Yubikey, send one output from the key.</param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserRequestEnableTFAAsync (string type = null, string token = null)
        {
            
    
            var path_ = "/user/requestEnableTFA";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (token != null) formParams.Add("token", ApiClient.ParameterToString(token)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestEnableTFA: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Request a password reset. 
        /// </summary>
        /// <param name="email"></param> 
        /// <returns>bool?</returns>            
        public bool? UserRequestPasswordReset (string email)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserRequestPasswordReset");
            
    
            var path_ = "/user/requestPasswordReset";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestPasswordReset: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestPasswordReset: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Request a password reset. 
        /// </summary>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserRequestPasswordResetAsync (string email)
        {
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserRequestPasswordReset");
            
    
            var path_ = "/user/requestPasswordReset";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (email != null) formParams.Add("email", ApiClient.ParameterToString(email)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestPasswordReset: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Request a withdrawal to an external wallet. This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
        /// </summary>
        /// <param name="currency">Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;</param> 
        /// <param name="amount">Amount of withdrawal currency.</param> 
        /// <param name="address">Destination Address.</param> 
        /// <param name="otpToken">2FA token. Required if 2FA is enabled on your account.</param> 
        /// <param name="fee">Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.</param> 
        /// <returns>Transaction</returns>            
        public Transaction UserRequestWithdrawal (string currency, double? amount, string address, string otpToken = null, double? fee = null)
        {
            
            // verify the required parameter 'currency' is set
            if (currency == null) throw new ApiException(400, "Missing required parameter 'currency' when calling UserRequestWithdrawal");
            
            // verify the required parameter 'amount' is set
            if (amount == null) throw new ApiException(400, "Missing required parameter 'amount' when calling UserRequestWithdrawal");
            
            // verify the required parameter 'address' is set
            if (address == null) throw new ApiException(400, "Missing required parameter 'address' when calling UserRequestWithdrawal");
            
    
            var path_ = "/user/requestWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (otpToken != null) formParams.Add("otpToken", ApiClient.ParameterToString(otpToken)); // form parameter
            if (currency != null) formParams.Add("currency", ApiClient.ParameterToString(currency)); // form parameter
            if (amount != null) formParams.Add("amount", ApiClient.ParameterToString(amount)); // form parameter
            if (address != null) formParams.Add("address", ApiClient.ParameterToString(address)); // form parameter
            if (fee != null) formParams.Add("fee", ApiClient.ParameterToString(fee)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestWithdrawal: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestWithdrawal: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
    
        /// <summary>
        /// Request a withdrawal to an external wallet. This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
        /// </summary>
        /// <param name="currency">Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;</param>
        /// <param name="amount">Amount of withdrawal currency.</param>
        /// <param name="address">Destination Address.</param>
        /// <param name="otpToken">2FA token. Required if 2FA is enabled on your account.</param>
        /// <param name="fee">Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.</param>
        /// <returns>Transaction</returns>
        public async System.Threading.Tasks.Task<Transaction> UserRequestWithdrawalAsync (string currency, double? amount, string address, string otpToken = null, double? fee = null)
        {
            // verify the required parameter 'currency' is set
            if (currency == null) throw new ApiException(400, "Missing required parameter 'currency' when calling UserRequestWithdrawal");
            // verify the required parameter 'amount' is set
            if (amount == null) throw new ApiException(400, "Missing required parameter 'amount' when calling UserRequestWithdrawal");
            // verify the required parameter 'address' is set
            if (address == null) throw new ApiException(400, "Missing required parameter 'address' when calling UserRequestWithdrawal");
            
    
            var path_ = "/user/requestWithdrawal";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (otpToken != null) formParams.Add("otpToken", ApiClient.ParameterToString(otpToken)); // form parameter
            if (currency != null) formParams.Add("currency", ApiClient.ParameterToString(currency)); // form parameter
            if (amount != null) formParams.Add("amount", ApiClient.ParameterToString(amount)); // form parameter
            if (address != null) formParams.Add("address", ApiClient.ParameterToString(address)); // form parameter
            if (fee != null) formParams.Add("fee", ApiClient.ParameterToString(fee)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserRequestWithdrawal: " + response.Content, response.Content);

            return (Transaction) ApiClient.Deserialize(response, typeof(Transaction));
        }
        
        /// <summary>
        /// Re-send verification email. 
        /// </summary>
        /// <param name="email"></param> 
        /// <returns>bool?</returns>            
        public bool? UserSendVerificationEmail (string email)
        {
            
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserSendVerificationEmail");
            
    
            var path_ = "/user/resendVerificationEmail";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (email != null) queryParams.Add("email", ApiClient.ParameterToString(email)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSendVerificationEmail: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSendVerificationEmail: " + response.ErrorMessage, response.ErrorMessage);
    
            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
    
        /// <summary>
        /// Re-send verification email. 
        /// </summary>
        /// <param name="email"></param>
        /// <returns>bool?</returns>
        public async System.Threading.Tasks.Task<bool?> UserSendVerificationEmailAsync (string email)
        {
            // verify the required parameter 'email' is set
            if (email == null) throw new ApiException(400, "Missing required parameter 'email' when calling UserSendVerificationEmail");
            
    
            var path_ = "/user/resendVerificationEmail";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (email != null) queryParams.Add("email", ApiClient.ParameterToString(email)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserSendVerificationEmail: " + response.Content, response.Content);

            return (bool?) ApiClient.Deserialize(response, typeof(bool?));
        }
        
        /// <summary>
        /// Get a history of all of your wallet transactions (deposits and withdrawals). 
        /// </summary>
        /// <returns></returns>            
        public List<Transaction> UserGetWalletHistory ()
        {
            
    
            var path_ = "/user/walletHistory";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetWalletHistory: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetWalletHistory: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Transaction>) ApiClient.Deserialize(response, typeof(List<Transaction>));
        }
    
        /// <summary>
        /// Get a history of all of your wallet transactions (deposits and withdrawals). 
        /// </summary>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Transaction>> UserGetWalletHistoryAsync ()
        {
            
    
            var path_ = "/user/walletHistory";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling UserGetWalletHistory: " + response.Content, response.Content);

            return (List<Transaction>) ApiClient.Deserialize(response, typeof(List<Transaction>));
        }
        
    }
    
}
