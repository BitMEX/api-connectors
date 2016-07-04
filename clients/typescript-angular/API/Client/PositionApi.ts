/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class PositionApi {
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
         * Get your positions.
         * See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
         * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
         * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
         * @param count Number of rows to fetch.
         */
        public positionGet (filter?: string, columns?: string, count?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Position>> {
            const path = this.basePath + '/position';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (filter !== undefined) {
                queryParameters['filter'] = filter;
            }

            if (columns !== undefined) {
                queryParameters['columns'] = columns;
            }

            if (count !== undefined) {
                queryParameters['count'] = count;
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
         * Enable isolated margin or cross margin per-position.
         * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
         * @param symbol Position symbol to isolate.
         * @param enabled True for isolated margin, false for cross margin.
         */
        public positionIsolateMargin (symbol: string, enabled?: boolean, extraHttpRequestParams?: any ) : ng.IHttpPromise<Position> {
            const path = this.basePath + '/position/isolate';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling positionIsolateMargin');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['enabled'] = enabled;

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
         * Choose leverage for a position.
         * On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
         * @param symbol Symbol of position to adjust.
         * @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
         */
        public positionUpdateLeverage (symbol: string, leverage: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Position> {
            const path = this.basePath + '/position/leverage';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling positionUpdateLeverage');
            }
            // verify required parameter 'leverage' is set
            if (!leverage) {
                throw new Error('Missing required parameter leverage when calling positionUpdateLeverage');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['leverage'] = leverage;

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
         * Transfer equity in or out of a position.
         * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
         * @param symbol Symbol of position to isolate.
         * @param amount Amount to transfer, in Satoshis. May be negative.
         */
        public positionTransferIsolatedMargin (symbol: string, amount: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Position> {
            const path = this.basePath + '/position/transferMargin';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling positionTransferIsolatedMargin');
            }
            // verify required parameter 'amount' is set
            if (!amount) {
                throw new Error('Missing required parameter amount when calling positionTransferIsolatedMargin');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['amount'] = amount;

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
