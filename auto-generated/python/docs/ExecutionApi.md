# swagger_client.ExecutionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**execution_get**](ExecutionApi.md#execution_get) | **GET** /execution | Get all raw executions for your account.
[**execution_get_trade_history**](ExecutionApi.md#execution_get_trade_history) | **GET** /execution/tradeHistory | Get all balance-affecting executions.


# **execution_get**
> list[Execution] execution_get(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)

Get all raw executions for your account.

This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ExecutionApi(swagger_client.ApiClient(configuration))
symbol = 'symbol_example' # str | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
filter = 'filter_example' # str | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
count = 100 # int | Number of results to fetch. Must be a positive integer. (optional) (default to 100)
start = 0 # int | Starting point for results. (optional) (default to 0)
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)
start_time = '2013-10-20T19:20:30+01:00' # datetime | Starting date filter for results. (optional)
end_time = '2013-10-20T19:20:30+01:00' # datetime | Ending date filter for results. (optional)

try:
    # Get all raw executions for your account.
    api_response = api_instance.execution_get(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExecutionApi->execution_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **str**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **str**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **int**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **datetime**| Starting date filter for results. | [optional] 
 **end_time** | **datetime**| Ending date filter for results. | [optional] 

### Return type

[**list[Execution]**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **execution_get_trade_history**
> list[Execution] execution_get_trade_history(target_account_id=target_account_id, target_account_ids=target_account_ids, symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)

Get all balance-affecting executions.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ExecutionApi(swagger_client.ApiClient(configuration))
target_account_id = 1.2 # float | AccountId fetching the trade history, must be a paired account with main user. (optional)
target_account_ids = 'target_account_ids_example' # str | AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional)
symbol = 'symbol_example' # str | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
filter = 'filter_example' # str | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
count = 100 # int | Number of results to fetch. Must be a positive integer. (optional) (default to 100)
start = 0 # int | Starting point for results. (optional) (default to 0)
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)
start_time = '2013-10-20T19:20:30+01:00' # datetime | Starting date filter for results. (optional)
end_time = '2013-10-20T19:20:30+01:00' # datetime | Ending date filter for results. (optional)

try:
    # Get all balance-affecting executions.
    api_response = api_instance.execution_get_trade_history(target_account_id=target_account_id, target_account_ids=target_account_ids, symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExecutionApi->execution_get_trade_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **float**| AccountId fetching the trade history, must be a paired account with main user. | [optional] 
 **target_account_ids** | **str**| AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 
 **symbol** | **str**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **str**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **str**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **int**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **datetime**| Starting date filter for results. | [optional] 
 **end_time** | **datetime**| Ending date filter for results. | [optional] 

### Return type

[**list[Execution]**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

