# swagger_client.OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_book_get**](OrderBookApi.md#order_book_get) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**order_book_get_l2**](OrderBookApi.md#order_book_get_l2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


# **order_book_get**
> list[OrderBook] order_book_get(symbol, depth=depth)

Get current orderbook [deprecated, use /orderBook/L2].

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderBookApi()
symbol = 'symbol_example' # str | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
depth = 25 # float | Orderbook depth. (optional) (default to 25)

try: 
    # Get current orderbook [deprecated, use /orderBook/L2].
    api_response = api_instance.order_book_get(symbol, depth=depth)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderBookApi->order_book_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **float**| Orderbook depth. | [optional] [default to 25]

### Return type

[**list[OrderBook]**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_book_get_l2**
> list[OrderBookL2] order_book_get_l2(symbol, depth=depth)

Get current orderbook in vertical format.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderBookApi()
symbol = 'symbol_example' # str | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
depth = 25 # float | Orderbook depth per side. Send 0 for full depth. (optional) (default to 25)

try: 
    # Get current orderbook in vertical format.
    api_response = api_instance.order_book_get_l2(symbol, depth=depth)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderBookApi->order_book_get_l2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **float**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**list[OrderBookL2]**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

