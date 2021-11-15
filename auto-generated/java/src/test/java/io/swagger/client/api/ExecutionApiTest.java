/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.Execution;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExecutionApi
 */
@Ignore
public class ExecutionApiTest {

    private final ExecutionApi api = new ExecutionApi();

    
    /**
     * Get all raw executions for your account.
     *
     * This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at &#x60;/execution/tradeHistory&#x60;.  You may also use the &#x60;filter&#x60; param to target your query. Specify an array as a filter value, such as &#x60;{\&quot;execType\&quot;: [\&quot;Settlement\&quot;, \&quot;Trade\&quot;]}&#x60; to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void executionGetTest() throws Exception {
        String symbol = null;
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        BigDecimal start = null;
        Boolean reverse = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        List<Execution> response = api.executionGet(symbol, filter, columns, count, start, reverse, startTime, endTime);

        // TODO: test validations
    }
    
    /**
     * Get all balance-affecting executions.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void executionGetTradeHistoryTest() throws Exception {
        String symbol = null;
        String filter = null;
        String columns = null;
        BigDecimal count = null;
        BigDecimal start = null;
        Boolean reverse = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        List<Execution> response = api.executionGetTradeHistory(symbol, filter, columns, count, start, reverse, startTime, endTime);

        // TODO: test validations
    }
    
}
