# swagger_client.InstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrument_get**](InstrumentApi.md#instrument_get) | **GET** /instrument | Get instruments.
[**instrument_get_active**](InstrumentApi.md#instrument_get_active) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrument_get_active_and_indices**](InstrumentApi.md#instrument_get_active_and_indices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrument_get_active_intervals**](InstrumentApi.md#instrument_get_active_intervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrument_get_composite_index**](InstrumentApi.md#instrument_get_composite_index) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrument_get_indices**](InstrumentApi.md#instrument_get_indices) | **GET** /instrument/indices | Get all price indices.
[**instrument_get_usd_volume**](InstrumentApi.md#instrument_get_usd_volume) | **GET** /instrument/usdVolume | Get a summary of exchange statistics in USD.


# **instrument_get**
> list[Instrument] instrument_get(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX` 

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()
symbol = 'symbol_example' # str | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional)
filter = 'filter_example' # str | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
count = 100 # int | Number of results to fetch. Must be a positive integer. (optional) (default to 100)
start = 0 # int | Starting point for results. (optional) (default to 0)
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)
start_time = '2013-10-20T19:20:30+01:00' # datetime | Starting date filter for results. (optional)
end_time = '2013-10-20T19:20:30+01:00' # datetime | Ending date filter for results. (optional)

try:
    # Get instruments.
    api_response = api_instance.instrument_get(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get: %s\n" % e)
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

[**list[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_active**
> list[Instrument] instrument_get_active()

Get all active instruments and instruments that have expired in <24hrs.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()

try:
    # Get all active instruments and instruments that have expired in <24hrs.
    api_response = api_instance.instrument_get_active()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_active: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_active_and_indices**
> list[Instrument] instrument_get_active_and_indices()

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()

try:
    # Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
    api_response = api_instance.instrument_get_active_and_indices()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_active_and_indices: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_active_intervals**
> InstrumentInterval instrument_get_active_intervals()

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()

try:
    # Return all active contract series and interval pairs.
    api_response = api_instance.instrument_get_active_intervals()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_active_intervals: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstrumentInterval**](InstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_composite_index**
> list[IndexComposite] instrument_get_composite_index(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()
symbol = '.BXBT' # str | The composite index symbol. (optional) (default to .BXBT)
filter = 'filter_example' # str | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. (optional)
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
count = 100 # int | Number of results to fetch. Must be a positive integer. (optional) (default to 100)
start = 0 # int | Starting point for results. (optional) (default to 0)
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)
start_time = '2013-10-20T19:20:30+01:00' # datetime | Starting date filter for results. (optional)
end_time = '2013-10-20T19:20:30+01:00' # datetime | Ending date filter for results. (optional)

try:
    # Show constituent parts of an index.
    api_response = api_instance.instrument_get_composite_index(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_composite_index: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| The composite index symbol. | [optional] [default to .BXBT]
 **filter** | **str**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | [optional] 
 **columns** | **str**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **int**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **datetime**| Starting date filter for results. | [optional] 
 **end_time** | **datetime**| Ending date filter for results. | [optional] 

### Return type

[**list[IndexComposite]**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_indices**
> list[Instrument] instrument_get_indices()

Get all price indices.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()

try:
    # Get all price indices.
    api_response = api_instance.instrument_get_indices()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_indices: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instrument_get_usd_volume**
> list[StatsUSDBySymbol] instrument_get_usd_volume(symbol=symbol, columns=columns)

Get a summary of exchange statistics in USD.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InstrumentApi()
symbol = 'symbol_example' # str | Filter by symbol. (optional)
columns = 'columns_example' # str | Array of column names to fetch. (optional)

try:
    # Get a summary of exchange statistics in USD.
    api_response = api_instance.instrument_get_usd_volume(symbol=symbol, columns=columns)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InstrumentApi->instrument_get_usd_volume: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Filter by symbol. | [optional] 
 **columns** | **str**| Array of column names to fetch. | [optional] 

### Return type

[**list[StatsUSDBySymbol]**](StatsUSDBySymbol.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

