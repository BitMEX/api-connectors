/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class ChatApi {
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
         * Get chat messages.
         * 
         * @param count Number of results to fetch.
         * @param start Starting point for results.
         * @param reverse If true, will sort results newest first.
         */
        public chatGet (count?: number, start?: number, reverse?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Chat>> {
            const path = this.basePath + '/chat';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (count !== undefined) {
                queryParameters['count'] = count;
            }

            if (start !== undefined) {
                queryParameters['start'] = start;
            }

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
         * Send a chat message.
         * 
         * @param message 
         */
        public chatSend (message: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Chat> {
            const path = this.basePath + '/chat';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'message' is set
            if (!message) {
                throw new Error('Missing required parameter message when calling chatSend');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['message'] = message;

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
         * Get connected users.
         * Returns an array with browser users in the first position and API users (bots) in the second position.
         */
        public chatGetConnected (extraHttpRequestParams?: any ) : ng.IHttpPromise<ConnectedUsers> {
            const path = this.basePath + '/chat/connected';

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
