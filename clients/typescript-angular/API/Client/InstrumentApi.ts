/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class InstrumentApi {
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
         * Get instruments.
         * This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use the endpoint /instrument/active to return active instruments, or use a filter like {\&quot;state\&quot;: \&quot;Open\&quot;}.
         * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
         * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
         * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
         * @param count Number of results to fetch.
         * @param start Starting point for results.
         * @param reverse If true, will sort results newest first.
         * @param startTime Starting date filter for results.
         * @param endTime Ending date filter for results.
         */
        public instrumentGet (symbol?: string, filter?: string, columns?: string, count?: number, start?: number, reverse?: boolean, startTime?: date, endTime?: date, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Instrument>> {
            const path = this.basePath + '/instrument';

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
         * Get all active instruments and instruments that have expired in &lt;24hrs.
         * 
         */
        public instrumentGetActive (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Instrument>> {
            const path = this.basePath + '/instrument/active';

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
         * Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
         * 
         */
        public instrumentGetActiveAndIndices (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Instrument>> {
            const path = this.basePath + '/instrument/activeAndIndices';

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
         * Return all active contract series and interval pairs.
         * This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\&quot;BVOL:daily\&quot;, \&quot;BVOL:weekly\&quot;, \&quot;XBU:daily\&quot;, \&quot;XBU:monthly\&quot;, ...]`. These identifiers are usable in any query&#39;s \&quot;symbol\&quot; param. The second array is the current resolution of these intervals. Results are mapped at the same index.
         */
        public instrumentGetActiveIntervals (extraHttpRequestParams?: any ) : ng.IHttpPromise<InstrumentInterval> {
            const path = this.basePath + '/instrument/activeIntervals';

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
         * Get all price indices.
         * 
         */
        public instrumentGetIndices (extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Instrument>> {
            const path = this.basePath + '/instrument/indices';

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
