/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class UserApi {
        protected basePath = 'https://localhost/api/v1';
        public defaultHeaders : any = {};

        static $inject: string[] = ['$http', '$httpParamSerializer'];

        constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
            if (basePath) {
                this.basePath = basePath;
            }
        }

        private extendObj<T1,T2>(objA: T1, objB: T2) {
            for(let key in objB){
                if(objB.hasOwnProperty(key)){
                    objA[key] = objB[key];
                }
            }
            return <T1&T2>objA;
        }

        /**
         * Get your user model.
         * 
         */
        public userGetMe (extraHttpRequestParams?: any ) : ng.IHttpPromise<User> {
            const path = this.basePath + '/user';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
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
         */
        public userUpdateMe (firstname?: string, lastname?: string, oldPassword?: string, newPassword?: string, newPasswordConfirm?: string, country?: string, pgpPubKey?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<User> {
            const path = this.basePath + '/user';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['firstname'] = firstname;

            formParams['lastname'] = lastname;

            formParams['oldPassword'] = oldPassword;

            formParams['newPassword'] = newPassword;

            formParams['newPasswordConfirm'] = newPasswordConfirm;

            formParams['country'] = country;

            formParams['pgpPubKey'] = pgpPubKey;

            let httpRequestParams: any = {
                method: 'PUT',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
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
         */
        public userNewUser (email: string, password: string, username: string, firstname?: string, lastname?: string, acceptsTOS?: string, referrerID?: string, country?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<User> {
            const path = this.basePath + '/user';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'email' is set
            if (!email) {
                throw new Error('Missing required parameter email when calling userNewUser');
            }
            // verify required parameter 'password' is set
            if (!password) {
                throw new Error('Missing required parameter password when calling userNewUser');
            }
            // verify required parameter 'username' is set
            if (!username) {
                throw new Error('Missing required parameter username when calling userNewUser');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['email'] = email;

            formParams['password'] = password;

            formParams['username'] = username;

            formParams['firstname'] = firstname;

            formParams['lastname'] = lastname;

            formParams['acceptsTOS'] = acceptsTOS;

            formParams['referrerID'] = referrerID;

            formParams['country'] = country;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get your current affiliate/referral status.
         * 
         */
        public userGetAffiliateStatus (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Affiliate>> {
            const path = this.basePath + '/user/affiliateStatus';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Cancel a withdrawal.
         * 
         * @param token 
         */
        public userCancelWithdrawal (token: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Transaction> {
            const path = this.basePath + '/user/cancelWithdrawal';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userCancelWithdrawal');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Check if a referral code is valid.
         * If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
         * @param referralCode 
         */
        public userCheckReferralCode (referralCode?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<number> {
            const path = this.basePath + '/user/checkReferralCode';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (referralCode !== undefined) {
                queryParameters['referralCode'] = referralCode;
            }

            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get your account&#39;s commission status.
         * 
         */
        public userGetCommission (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<UserCommission>> {
            const path = this.basePath + '/user/commission';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Confirm your email address with a token.
         * 
         * @param token 
         */
        public userConfirmEmail (token: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<AccessToken> {
            const path = this.basePath + '/user/confirmEmail';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userConfirmEmail');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
         * 
         * @param token Token from your selected TFA type.
         * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
         */
        public userConfirmEnableTFA (token: string, type?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/confirmEnableTFA';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userConfirmEnableTFA');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['type'] = type;

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Confirm a password reset.
         * 
         * @param token 
         * @param newPassword 
         */
        public userConfirmPasswordReset (token: string, newPassword: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/confirmPasswordReset';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userConfirmPasswordReset');
            }
            // verify required parameter 'newPassword' is set
            if (!newPassword) {
                throw new Error('Missing required parameter newPassword when calling userConfirmPasswordReset');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['token'] = token;

            formParams['newPassword'] = newPassword;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Confirm a withdrawal.
         * 
         * @param token 
         */
        public userConfirmWithdrawal (token: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Transaction> {
            const path = this.basePath + '/user/confirmWithdrawal';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userConfirmWithdrawal');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get a deposit address.
         * 
         * @param currency 
         */
        public userGetDepositAddress (currency?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<string> {
            const path = this.basePath + '/user/depositAddress';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (currency !== undefined) {
                queryParameters['currency'] = currency;
            }

            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Disable two-factor auth for this account.
         * 
         * @param token Token from your selected TFA type.
         * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
         */
        public userDisableTFA (token: string, type?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/disableTFA';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'token' is set
            if (!token) {
                throw new Error('Missing required parameter token when calling userDisableTFA');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['type'] = type;

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Log in to BitMEX.
         * 
         * @param email Your email address.
         * @param password Your password.
         * @param token OTP Token (YubiKey, Google Authenticator)
         */
        public userLogin (email: string, password: string, token?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<AccessToken> {
            const path = this.basePath + '/user/login';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'email' is set
            if (!email) {
                throw new Error('Missing required parameter email when calling userLogin');
            }
            // verify required parameter 'password' is set
            if (!password) {
                throw new Error('Missing required parameter password when calling userLogin');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['email'] = email;

            formParams['password'] = password;

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Log out of BitMEX.
         * 
         */
        public userLogout (extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const path = this.basePath + '/user/logout';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
         * 
         */
        public userLogoutAll (extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
            const path = this.basePath + '/user/logoutAll';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get your account&#39;s margin status.
         * 
         */
        public userGetMargin (extraHttpRequestParams?: any ) : ng.IHttpPromise<Margin> {
            const path = this.basePath + '/user/margin';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Save application preferences.
         * 
         * @param prefs 
         * @param overwrite If true, will overwrite all existing preferences.
         */
        public userSavePreferences (prefs: string, overwrite?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<User> {
            const path = this.basePath + '/user/preferences';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'prefs' is set
            if (!prefs) {
                throw new Error('Missing required parameter prefs when calling userSavePreferences');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['prefs'] = prefs;

            formParams['overwrite'] = overwrite;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
         * 
         * @param type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
         * @param token If Yubikey, send one output from the key.
         */
        public userRequestEnableTFA (type?: string, token?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/requestEnableTFA';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['type'] = type;

            formParams['token'] = token;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Request a password reset.
         * 
         * @param email 
         */
        public userRequestPasswordReset (email: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/requestPasswordReset';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'email' is set
            if (!email) {
                throw new Error('Missing required parameter email when calling userRequestPasswordReset');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['email'] = email;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Request a withdrawal to an external wallet.
         * This will send a confirmation email to the email address on record, unless requested via an API Key with the \&quot;withdraw\&quot; permission.
         * @param currency Currency you&#39;re withdrawing. Options: \&quot;XBt\&quot;
         * @param amount Amount of withdrawal currency.
         * @param address Destination Address.
         * @param otpToken 2FA token. Required if 2FA is enabled on your account.
         * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
         */
        public userRequestWithdrawal (currency: string, amount: number, address: string, otpToken?: string, fee?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Transaction> {
            const path = this.basePath + '/user/requestWithdrawal';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'currency' is set
            if (!currency) {
                throw new Error('Missing required parameter currency when calling userRequestWithdrawal');
            }
            // verify required parameter 'amount' is set
            if (!amount) {
                throw new Error('Missing required parameter amount when calling userRequestWithdrawal');
            }
            // verify required parameter 'address' is set
            if (!address) {
                throw new Error('Missing required parameter address when calling userRequestWithdrawal');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['otpToken'] = otpToken;

            formParams['currency'] = currency;

            formParams['amount'] = amount;

            formParams['address'] = address;

            formParams['fee'] = fee;

            let httpRequestParams: any = {
                method: 'POST',
                url: path,
                json: false,
                
                data: this.$httpParamSerializer(formParams),
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Re-send verification email.
         * 
         * @param email 
         */
        public userSendVerificationEmail (email: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<boolean> {
            const path = this.basePath + '/user/resendVerificationEmail';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'email' is set
            if (!email) {
                throw new Error('Missing required parameter email when calling userSendVerificationEmail');
            }
            if (email !== undefined) {
                queryParameters['email'] = email;
            }

            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
        /**
         * Get a history of all of your wallet transactions (deposits and withdrawals).
         * 
         */
        public userGetWalletHistory (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Transaction>> {
            const path = this.basePath + '/user/walletHistory';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let httpRequestParams: any = {
                method: 'GET',
                url: path,
                json: true,
                
                
                params: queryParameters,
                headers: headerParams
            };

            if (extraHttpRequestParams) {
                httpRequestParams = this.extendObj(httpRequestParams, extraHttpRequestParams);
            }

            return this.$http(httpRequestParams);
        }
    }
}
