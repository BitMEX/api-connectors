/* 
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
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
    ///  Class for testing InstrumentApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class InstrumentApiTests
    {
        private InstrumentApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new InstrumentApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InstrumentApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' InstrumentApi
            //Assert.IsInstanceOfType(typeof(InstrumentApi), instance, "instance is a InstrumentApi");
        }

        
        /// <summary>
        /// Test InstrumentGet
        /// </summary>
        [Test]
        public void InstrumentGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //string filter = null;
            //string columns = null;
            //int? count = null;
            //int? start = null;
            //bool? reverse = null;
            //DateTime? startTime = null;
            //DateTime? endTime = null;
            //var response = instance.InstrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
            //Assert.IsInstanceOf<List<Instrument>> (response, "response is List<Instrument>");
        }
        
        /// <summary>
        /// Test InstrumentGetActive
        /// </summary>
        [Test]
        public void InstrumentGetActiveTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InstrumentGetActive();
            //Assert.IsInstanceOf<List<Instrument>> (response, "response is List<Instrument>");
        }
        
        /// <summary>
        /// Test InstrumentGetActiveAndIndices
        /// </summary>
        [Test]
        public void InstrumentGetActiveAndIndicesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InstrumentGetActiveAndIndices();
            //Assert.IsInstanceOf<List<Instrument>> (response, "response is List<Instrument>");
        }
        
        /// <summary>
        /// Test InstrumentGetActiveIntervals
        /// </summary>
        [Test]
        public void InstrumentGetActiveIntervalsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InstrumentGetActiveIntervals();
            //Assert.IsInstanceOf<InstrumentInterval> (response, "response is InstrumentInterval");
        }
        
        /// <summary>
        /// Test InstrumentGetCompositeIndex
        /// </summary>
        [Test]
        public void InstrumentGetCompositeIndexTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //string filter = null;
            //string columns = null;
            //int? count = null;
            //int? start = null;
            //bool? reverse = null;
            //DateTime? startTime = null;
            //DateTime? endTime = null;
            //var response = instance.InstrumentGetCompositeIndex(symbol, filter, columns, count, start, reverse, startTime, endTime);
            //Assert.IsInstanceOf<List<IndexComposite>> (response, "response is List<IndexComposite>");
        }
        
        /// <summary>
        /// Test InstrumentGetIndices
        /// </summary>
        [Test]
        public void InstrumentGetIndicesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InstrumentGetIndices();
            //Assert.IsInstanceOf<List<Instrument>> (response, "response is List<Instrument>");
        }
        
        /// <summary>
        /// Test InstrumentGetUsdVolume
        /// </summary>
        [Test]
        public void InstrumentGetUsdVolumeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string symbol = null;
            //string columns = null;
            //var response = instance.InstrumentGetUsdVolume(symbol, columns);
            //Assert.IsInstanceOf<List<StatsUSDBySymbol>> (response, "response is List<StatsUSDBySymbol>");
        }
        
    }

}
