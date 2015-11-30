/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class TradeApi {
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
         * Get Trades.
         * 
         * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
         * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
         * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
         * @param count Number of results to fetch.
         * @param start Starting point for results.
         * @param reverse If true, will sort results newest first.
         * @param startTime Starting date filter for results.
         * @param endTime Ending date filter for results.
         */
        public tradeGet (symbol?: string, filter?: string, columns?: string, count?: number, start?: number, reverse?: boolean, startTime?: date, endTime?: date, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Trade>> {
            const path = this.basePath + '/trade';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (symbol !== undefined) {
                queryParameters['symbol'] = symbol;
            }

            if (filter !== undefined) {
                queryParameters['filter'] = filter;
            }

            if (columns !== undefined) {
                queryParameters['columns'] = columns;
            }

            if (count !== undefined) {
                queryParameters['count'] = count;
            }

            if (start !== undefined) {
                queryParameters['start'] = start;
            }

            if (reverse !== undefined) {
                queryParameters['reverse'] = reverse;
            }

            if (startTime !== undefined) {
                queryParameters['startTime'] = startTime;
            }

            if (endTime !== undefined) {
                queryParameters['endTime'] = endTime;
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
         * Get previous trades in time buckets.
         * 
         * @param binSize Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].
         * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
         * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
         * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
         * @param count Number of results to fetch.
         * @param start Starting point for results.
         * @param reverse If true, will sort results newest first.
         * @param startTime Starting date filter for results.
         * @param endTime Ending date filter for results.
         */
        public tradeGetBucketed (binSize?: string, symbol?: string, filter?: string, columns?: string, count?: number, start?: number, reverse?: boolean, startTime?: date, endTime?: date, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<TradeBin>> {
            const path = this.basePath + '/trade/bucketed';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (binSize !== undefined) {
                queryParameters['binSize'] = binSize;
            }

            if (symbol !== undefined) {
                queryParameters['symbol'] = symbol;
            }

            if (filter !== undefined) {
                queryParameters['filter'] = filter;
            }

            if (columns !== undefined) {
                queryParameters['columns'] = columns;
            }

            if (count !== undefined) {
                queryParameters['count'] = count;
            }

            if (start !== undefined) {
                queryParameters['start'] = start;
            }

            if (reverse !== undefined) {
                queryParameters['reverse'] = reverse;
            }

            if (startTime !== undefined) {
                queryParameters['startTime'] = startTime;
            }

            if (endTime !== undefined) {
                queryParameters['endTime'] = endTime;
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
         * Get trades between two dates. [Deprecated, use GET /trades]
         * 
         * @param startTime Start date.
         * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
         * @param endTime End Date.
         */
        public tradeGetByDate (startTime: date, symbol?: string, endTime?: date, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Trade>> {
            const path = this.basePath + '/trade/byDate';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'startTime' is set
            if (!startTime) {
                throw new Error('Missing required parameter startTime when calling tradeGetByDate');
            }
            if (symbol !== undefined) {
                queryParameters['symbol'] = symbol;
            }

            if (startTime !== undefined) {
                queryParameters['startTime'] = startTime;
            }

            if (endTime !== undefined) {
                queryParameters['endTime'] = endTime;
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
         * Get recent trades. [Deprecated, use GET /trades]
         * 
         * @param count Number of trades to fetch.
         * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
         */
        public tradeGetRecent (count: number, symbol?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Trade>> {
            const path = this.basePath + '/trade/recent';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            // verify required parameter 'count' is set
            if (!count) {
                throw new Error('Missing required parameter count when calling tradeGetRecent');
            }
            if (symbol !== undefined) {
                queryParameters['symbol'] = symbol;
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
    }
}
