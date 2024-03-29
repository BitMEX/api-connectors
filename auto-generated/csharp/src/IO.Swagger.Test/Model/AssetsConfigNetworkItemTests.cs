/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing AssetsConfigNetworkItem
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class AssetsConfigNetworkItemTests
    {
        // TODO uncomment below to declare an instance variable for AssetsConfigNetworkItem
        //private AssetsConfigNetworkItem instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of AssetsConfigNetworkItem
            //instance = new AssetsConfigNetworkItem();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AssetsConfigNetworkItem
        /// </summary>
        [Test]
        public void AssetsConfigNetworkItemInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" AssetsConfigNetworkItem
            //Assert.IsInstanceOfType<AssetsConfigNetworkItem> (instance, "variable 'instance' is a AssetsConfigNetworkItem");
        }


        /// <summary>
        /// Test the property 'Asset'
        /// </summary>
        [Test]
        public void AssetTest()
        {
            // TODO unit test for the property 'Asset'
        }
        /// <summary>
        /// Test the property 'TokenAddress'
        /// </summary>
        [Test]
        public void TokenAddressTest()
        {
            // TODO unit test for the property 'TokenAddress'
        }
        /// <summary>
        /// Test the property 'DepositEnabled'
        /// </summary>
        [Test]
        public void DepositEnabledTest()
        {
            // TODO unit test for the property 'DepositEnabled'
        }
        /// <summary>
        /// Test the property 'WithdrawalEnabled'
        /// </summary>
        [Test]
        public void WithdrawalEnabledTest()
        {
            // TODO unit test for the property 'WithdrawalEnabled'
        }
        /// <summary>
        /// Test the property 'WithdrawalFee'
        /// </summary>
        [Test]
        public void WithdrawalFeeTest()
        {
            // TODO unit test for the property 'WithdrawalFee'
        }
        /// <summary>
        /// Test the property 'MinFee'
        /// </summary>
        [Test]
        public void MinFeeTest()
        {
            // TODO unit test for the property 'MinFee'
        }
        /// <summary>
        /// Test the property 'MaxFee'
        /// </summary>
        [Test]
        public void MaxFeeTest()
        {
            // TODO unit test for the property 'MaxFee'
        }

    }

}
