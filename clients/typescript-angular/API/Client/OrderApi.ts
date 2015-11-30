/// <reference path="api.d.ts" />

/* tslint:disable:no-unused-variable member-ordering */

namespace API.Client {
    'use strict';

    export class OrderApi {
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
         * Get your orders.
         * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
         * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
         * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
         * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
         * @param count Number of results to fetch.
         * @param start Starting point for results.
         * @param reverse If true, will sort results newest first.
         * @param startTime Starting date filter for results.
         * @param endTime Ending date filter for results.
         */
        public orderGetOrders (symbol?: string, filter?: string, columns?: string, count?: number, start?: number, reverse?: boolean, startTime?: date, endTime?: date, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Order>> {
            const path = this.basePath + '/order';

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
         * Create a new order.
         * This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
         * @param symbol Instrument symbol.
         * @param quantity Quantity. Use positive numbers to buy, negative to sell.
         * @param price Order price.
         * @param timeInForce Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).
         * @param type Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;
         * @param stopPrice If order type is &#39;StopLimit&#39;, this is the trigger/stop price.
         * @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
         */
        public orderNewOrder (symbol: string, quantity: number, price: number, timeInForce?: string, type?: string, stopPrice?: number, clOrdID?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Order> {
            const path = this.basePath + '/order';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling orderNewOrder');
            }
            // verify required parameter 'quantity' is set
            if (!quantity) {
                throw new Error('Missing required parameter quantity when calling orderNewOrder');
            }
            // verify required parameter 'price' is set
            if (!price) {
                throw new Error('Missing required parameter price when calling orderNewOrder');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['quantity'] = quantity;

            formParams['price'] = price;

            formParams['timeInForce'] = timeInForce;

            formParams['type'] = type;

            formParams['stopPrice'] = stopPrice;

            formParams['clOrdID'] = clOrdID;

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
         * Cancel order(s). Send multiple order IDs to cancel in bulk.
         * Either an orderID or a clOrdID must be provided.
         * @param orderID Order ID(s).
         * @param clOrdID Client Order ID(s). See POST /order.
         * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
         */
        public orderCancelOrder (orderID?: string, clOrdID?: string, text?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<Order>> {
            const path = this.basePath + '/order';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['orderID'] = orderID;

            formParams['clOrdID'] = clOrdID;

            formParams['text'] = text;

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
         * Cancels all of your orders.
         * 
         * @param symbol Optional symbol. If provided, only cancels orders for that symbol.
         * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.
         * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
         */
        public orderCancelAll (symbol?: string, filter?: string, text?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<inline_response_200> {
            const path = this.basePath + '/order/all';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['filter'] = filter;

            formParams['text'] = text;

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
         * Automatically cancel all your orders after a specified timeout.
         * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
         * @param timeout Timeout in ms. Set to 0 to cancel this timer.
         */
        public orderCancelAllAfter (timeout: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<inline_response_200> {
            const path = this.basePath + '/order/cancelAllAfter';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'timeout' is set
            if (!timeout) {
                throw new Error('Missing required parameter timeout when calling orderCancelAllAfter');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['timeout'] = timeout;

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
         * Close a position with a market order.
         * If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
         * @param symbol Symbol of position to close.
         * @param price Optional limit price.
         */
        public orderClosePosition (symbol: string, price?: number, extraHttpRequestParams?: any ) : ng.IHttpPromise<Order> {
            const path = this.basePath + '/order/closePosition';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            let formParams: any = {};

            // verify required parameter 'symbol' is set
            if (!symbol) {
                throw new Error('Missing required parameter symbol when calling orderClosePosition');
            }
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

            formParams['symbol'] = symbol;

            formParams['price'] = price;

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
         * Get open liquidation orders.
         * 
         * @param filter Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
         */
        public orderGetCloseOutOrders (filter?: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<Array<LiquidationOrder>> {
            const path = this.basePath + '/order/liquidations';

            let queryParameters: any = {};
            let headerParams: any = this.extendObj({}, this.defaultHeaders);
            if (filter !== undefined) {
                queryParameters['filter'] = filter;
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
