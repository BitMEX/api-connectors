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

import io.swagger.client.model.AccessToken;
import io.swagger.client.model.Affiliate;
import java.math.BigDecimal;
import io.swagger.client.model.CommunicationToken;
import io.swagger.client.model.Error;
import io.swagger.client.model.Margin;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.QuoteFillRatio;
import io.swagger.client.model.QuoteValueRatio;
import io.swagger.client.model.TradingVolume;
import io.swagger.client.model.Transaction;
import io.swagger.client.model.User;
import io.swagger.client.model.UserCommissionsBySymbol;
import io.swagger.client.model.Wallet;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Cancel a withdrawal.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userCancelWithdrawalTest() throws Exception {
        String token = null;
        Transaction response = api.userCancelWithdrawal(token);

        // TODO: test validations
    }
    
    /**
     * Check if a referral code is valid.
     *
     * If the code is valid, responds with the referral code&#39;s discount (e.g. &#x60;0.1&#x60; for 10%). Otherwise, will return a 404 or 451 if invalid.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userCheckReferralCodeTest() throws Exception {
        String referralCode = null;
        Double response = api.userCheckReferralCode(referralCode);

        // TODO: test validations
    }
    
    /**
     * Register your communication token for mobile clients
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userCommunicationTokenTest() throws Exception {
        String token = null;
        String platformAgent = null;
        List<CommunicationToken> response = api.userCommunicationToken(token, platformAgent);

        // TODO: test validations
    }
    
    /**
     * Confirm your email address with a token.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userConfirmTest() throws Exception {
        String token = null;
        AccessToken response = api.userConfirm(token);

        // TODO: test validations
    }
    
    /**
     * Confirm a withdrawal.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userConfirmWithdrawalTest() throws Exception {
        String token = null;
        Transaction response = api.userConfirmWithdrawal(token);

        // TODO: test validations
    }
    
    /**
     * Get your user model.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws Exception {
        User response = api.userGet();

        // TODO: test validations
    }
    
    /**
     * Get your current affiliate/referral status.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetAffiliateStatusTest() throws Exception {
        String currency = null;
        Affiliate response = api.userGetAffiliateStatus(currency);

        // TODO: test validations
    }
    
    /**
     * Get your account&#39;s commission status.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetCommissionTest() throws Exception {
        UserCommissionsBySymbol response = api.userGetCommission();

        // TODO: test validations
    }
    
    /**
     * Get a deposit address.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetDepositAddressTest() throws Exception {
        String currency = null;
        String response = api.userGetDepositAddress(currency);

        // TODO: test validations
    }
    
    /**
     * Get the execution history by day.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetExecutionHistoryTest() throws Exception {
        String symbol = null;
        OffsetDateTime timestamp = null;
        Object response = api.userGetExecutionHistory(symbol, timestamp);

        // TODO: test validations
    }
    
    /**
     * Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetMarginTest() throws Exception {
        String currency = null;
        Margin response = api.userGetMargin(currency);

        // TODO: test validations
    }
    
    /**
     * Get 7 days worth of Quote Fill Ratio statistics.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetQuoteFillRatioTest() throws Exception {
        QuoteFillRatio response = api.userGetQuoteFillRatio();

        // TODO: test validations
    }
    
    /**
     * Get Quote Value Ratio statistics over the last 3 days
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetQuoteValueRatioTest() throws Exception {
        QuoteValueRatio response = api.userGetQuoteValueRatio();

        // TODO: test validations
    }
    
    /**
     * Get your 30 days USD average trading volume
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetTradingVolumeTest() throws Exception {
        TradingVolume response = api.userGetTradingVolume();

        // TODO: test validations
    }
    
    /**
     * Get your current wallet information.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetWalletTest() throws Exception {
        String currency = null;
        Wallet response = api.userGetWallet(currency);

        // TODO: test validations
    }
    
    /**
     * Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetWalletHistoryTest() throws Exception {
        String currency = null;
        Double count = null;
        Double start = null;
        List<Transaction> response = api.userGetWalletHistory(currency, count, start);

        // TODO: test validations
    }
    
    /**
     * Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userGetWalletSummaryTest() throws Exception {
        String currency = null;
        List<Transaction> response = api.userGetWalletSummary(currency);

        // TODO: test validations
    }
    
    /**
     * Log out of BitMEX.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userLogoutTest() throws Exception {
        api.userLogout();

        // TODO: test validations
    }
    
    /**
     * Get the minimum, maximum, and recommended withdrawal fees for a currency.
     *
     * This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \&quot;fee\&quot; field is the recommended fee for fast confirmation on the blockchain.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userMinWithdrawalFeeTest() throws Exception {
        String currency = null;
        Double amount = null;
        Object response = api.userMinWithdrawalFee(currency, amount);

        // TODO: test validations
    }
    
    /**
     * Request a withdrawal to an external wallet.
     *
     * This will send a confirmation email to the email address on record.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userRequestWithdrawalTest() throws Exception {
        String currency = null;
        BigDecimal amount = null;
        String otpToken = null;
        String address = null;
        Double addressId = null;
        Double targetUserId = null;
        Double fee = null;
        String text = null;
        Transaction response = api.userRequestWithdrawal(currency, amount, otpToken, address, addressId, targetUserId, fee, text);

        // TODO: test validations
    }
    
    /**
     * Save user preferences.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSavePreferencesTest() throws Exception {
        String prefs = null;
        Boolean overwrite = null;
        User response = api.userSavePreferences(prefs, overwrite);

        // TODO: test validations
    }
    
}
