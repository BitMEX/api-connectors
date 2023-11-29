# BitMexApi.ExecutionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executionGet**](ExecutionApi.md#executionGet) | **GET** /execution | Get all raw executions for your account.
[**executionGetTradeHistory**](ExecutionApi.md#executionGetTradeHistory) | **GET** /execution/tradeHistory | Get all balance-affecting executions.


<a name="executionGet"></a>
# **executionGet**
> [Execution] executionGet(opts)

Get all raw executions for your account.

This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.ExecutionApi();

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
apiInstance.executionGet(opts, callback);
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

[**[Execution]**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="executionGetTradeHistory"></a>
# **executionGetTradeHistory**
> [Execution] executionGetTradeHistory(opts)

Get all balance-affecting executions.

### Example
```javascript
var BitMexApi = require('bit_mex_api');
var defaultClient = BitMexApi.ApiClient.instance;

// Configure API key authorization: apiExpires
var apiExpires = defaultClient.authentications['apiExpires'];
apiExpires.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiExpires.apiKeyPrefix = 'Token';

// Configure API key authorization: apiKey
var apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

// Configure API key authorization: apiSignature
var apiSignature = defaultClient.authentications['apiSignature'];
apiSignature.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiSignature.apiKeyPrefix = 'Token';

var apiInstance = new BitMexApi.ExecutionApi();

var opts = { 
  'targetAccountId': 1.2, // Number | AccountId fetching the trade history, must be a paired account with main user.
  'targetAccountIds': "targetAccountIds_example", // String | AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
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
apiInstance.executionGetTradeHistory(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **Number**| AccountId fetching the trade history, must be a paired account with main user. | [optional] 
 **targetAccountIds** | **String**| AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Number**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional] 
 **endTime** | **Date**| Ending date filter for results. | [optional] 

### Return type

[**[Execution]**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

