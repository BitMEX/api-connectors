# BitMexApi.InsuranceApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insuranceGet**](InsuranceApi.md#insuranceGet) | **GET** /insurance | Get insurance fund history.


<a name="insuranceGet"></a>
# **insuranceGet**
> [Insurance] insuranceGet(opts)

Get insurance fund history.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.InsuranceApi();

var opts = { 
  'symbol': "symbol_example", // String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
  'filter': "filter_example", // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  'columns': "columns_example", // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  'count': 100, // Number | Number of results to fetch. Must be a positive integer.
  'start': 0, // Number | Starting point for results.
  'reverse': false, // Boolean | If true, will sort results newest first.
  'startTime': new Date("2013-10-20T19:20:30+01:00"), // Date | Starting date filter for results.
  'endTime': new Date("2013-10-20T19:20:30+01:00") // Date | Ending date filter for results.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.insuranceGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Number**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional] 
 **endTime** | **Date**| Ending date filter for results. | [optional] 

### Return type

[**[Insurance]**](Insurance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

