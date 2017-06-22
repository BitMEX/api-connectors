/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  [Changelog](/app/apiChangelog)    #### Getting Started   ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](https://www.bitmex.com/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing PositionApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class PositionApiTests
    {
        private PositionApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new PositionApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of PositionApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // test 'IsInstanceOfType' PositionApi
            Assert.IsInstanceOf<PositionApi>(instance, "instance is a PositionApi");
        }

        
        /// <summary>
        /// Test PositionGet
        /// </summary>
        [Test]
        public void PositionGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //string columns = null;
            //decimal? count = null;
            //var response = instance.PositionGet(filter, columns, count);
            //Assert.IsInstanceOf<List<Position>> (response, "response is List<Position>");
        }
        
        /// <summary>
        /// Test PositionIsolateMargin
        /// </summary>
        [Test]
        public void PositionIsolateMarginTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //bool? enabled = null;
            //var response = instance.PositionIsolateMargin(symbol, enabled);
            //Assert.IsInstanceOf<Position> (response, "response is Position");
        }
        
        /// <summary>
        /// Test PositionTransferIsolatedMargin
        /// </summary>
        [Test]
        public void PositionTransferIsolatedMarginTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //decimal? amount = null;
            //var response = instance.PositionTransferIsolatedMargin(symbol, amount);
            //Assert.IsInstanceOf<Position> (response, "response is Position");
        }
        
        /// <summary>
        /// Test PositionUpdateLeverage
        /// </summary>
        [Test]
        public void PositionUpdateLeverageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //double? leverage = null;
            //var response = instance.PositionUpdateLeverage(symbol, leverage);
            //Assert.IsInstanceOf<Position> (response, "response is Position");
        }
        
        /// <summary>
        /// Test PositionUpdateRiskLimit
        /// </summary>
        [Test]
        public void PositionUpdateRiskLimitTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //decimal? riskLimit = null;
            //var response = instance.PositionUpdateRiskLimit(symbol, riskLimit);
            //Assert.IsInstanceOf<Position> (response, "response is Position");
        }
        
    }

}
