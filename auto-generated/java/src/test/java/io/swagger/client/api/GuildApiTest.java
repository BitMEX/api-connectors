/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.Error;
import io.swagger.client.model.Guild;
import io.swagger.client.model.XAny;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GuildApi
 */
@Ignore
public class GuildApiTest {

    private final GuildApi api = new GuildApi();

    
    /**
     * Archive a guild
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildArchiveTest() throws Exception {
        Object response = api.guildArchive();

        // TODO: test validations
    }
    
    /**
     * Edit guild new guild
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildEditTest() throws Exception {
        String name = null;
        String emoji = null;
        Double potDistributionPercent = null;
        String potDistributionType = null;
        Double potTraderId = null;
        String description = null;
        String twitter = null;
        String discord = null;
        String telegram = null;
        String imgUrl = null;
        Boolean isPrivate = null;
        Guild response = api.guildEdit(name, emoji, potDistributionPercent, potDistributionType, potTraderId, description, twitter, discord, telegram, imgUrl, isPrivate);

        // TODO: test validations
    }
    
    /**
     * Get all guilds
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildGetTest() throws Exception {
        List<XAny> response = api.guildGet();

        // TODO: test validations
    }
    
    /**
     * Request to Join a private guild or join a public guild
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildJoinTest() throws Exception {
        String code = null;
        Object response = api.guildJoin(code);

        // TODO: test validations
    }
    
    /**
     * Kick member from guild
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildKickTest() throws Exception {
        Double memberUserId = null;
        Object response = api.guildKick(memberUserId);

        // TODO: test validations
    }
    
    /**
     * Leave guild or cancel guild join request
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildLeaveTest() throws Exception {
        Object response = api.guildLeave();

        // TODO: test validations
    }
    
    /**
     * Creates a new guild
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildNewTest() throws Exception {
        String name = null;
        String emoji = null;
        Double potDistributionPercent = null;
        String potDistributionType = null;
        String description = null;
        String twitter = null;
        String discord = null;
        String telegram = null;
        String imgUrl = null;
        Boolean isPrivate = null;
        Guild response = api.guildNew(name, emoji, potDistributionPercent, potDistributionType, description, twitter, discord, telegram, imgUrl, isPrivate);

        // TODO: test validations
    }
    
    /**
     * Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void guildShareTradesTest() throws Exception {
        Boolean shareTrades = null;
        Object response = api.guildShareTrades(shareTrades);

        // TODO: test validations
    }
    
}
