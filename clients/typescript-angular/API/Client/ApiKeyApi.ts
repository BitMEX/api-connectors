/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class ApiKeyApi {
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
         * Get your API Keys.
         * 
         * @param reverse If true, will sort results newest first.
         */
        public apiKeyGet (reverse?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<ApiKey>> {
            const path = this.basePath + '/apiKey';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (reverse !== undefined) {
                queryParameters['reverse'] = reverse;
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
         * Create a new API Key.
         * API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
         * @param name Key name. This name is for reference only.
         * @param cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;
         * @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].
         * @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
         * @param token OTP Token (YubiKey, Google Authenticator)
         */
        public apiKeyNew (name?: string, cidr?: string, permissions?: string, enabled?: boolean, token?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<ApiKey> {
            const path = this.basePath + '/apiKey';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['name'] = name;

            formParams['cidr'] = cidr;

            formParams['permissions'] = permissions;

            formParams['enabled'] = enabled;

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
         * Remove an API Key.
         * 
         * @param apiKeyID API Key ID (public component).
         */
        public apiKeyRemove (apiKeyID: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<inline_response_200> {
            const path = this.basePath + '/apiKey';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'apiKeyID' is set
            if (!apiKeyID) {
                throw new Error('Missing required parameter apiKeyID when calling apiKeyRemove');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['apiKeyID'] = apiKeyID;

            let httpRequestParams: any = {
                method: 'DELETE',
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
         * Disable an API Key.
         * 
         * @param apiKeyID API Key ID (public component).
         */
        public apiKeyDisable (apiKeyID: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<ApiKey> {
            const path = this.basePath + '/apiKey/disable';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'apiKeyID' is set
            if (!apiKeyID) {
                throw new Error('Missing required parameter apiKeyID when calling apiKeyDisable');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['apiKeyID'] = apiKeyID;

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
         * Enable an API Key.
         * 
         * @param apiKeyID API Key ID (public component).
         */
        public apiKeyEnable (apiKeyID: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<ApiKey> {
            const path = this.basePath + '/apiKey/enable';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'apiKeyID' is set
            if (!apiKeyID) {
                throw new Error('Missing required parameter apiKeyID when calling apiKeyEnable');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['apiKeyID'] = apiKeyID;

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
    }
}
