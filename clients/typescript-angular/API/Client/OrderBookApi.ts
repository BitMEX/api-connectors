/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class OrderBookApi {
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
         * Get current orderbook.
         * 
         * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
         * @param depth Orderbook depth.
         */
        public orderBookGetOrderBook (symbol: string, depth?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<OrderBook>> {
            const path = this.basePath + '/orderBook';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling orderBookGetOrderBook');
            }
            if (symbol !== undefined) {
                queryParameters['symbol'] = symbol;
            }

            if (depth !== undefined) {
                queryParameters['depth'] = depth;
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
    }
}
