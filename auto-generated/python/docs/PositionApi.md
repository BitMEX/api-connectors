# swagger_client.PositionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**position_get**](PositionApi.md#position_get) | **GET** /position | Get your positions.
[**position_isolate_margin**](PositionApi.md#position_isolate_margin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**position_transfer_isolated_margin**](PositionApi.md#position_transfer_isolated_margin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**position_update_leverage**](PositionApi.md#position_update_leverage) | **POST** /position/leverage | Choose leverage for a position.
[**position_update_risk_limit**](PositionApi.md#position_update_risk_limit) | **POST** /position/riskLimit | Update your risk limit.


# **position_get**
> list[Position] position_get(filter=filter, columns=columns, count=count)

Get your positions.

This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols do not return any position data.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 

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
api_instance = swagger_client.PositionApi(swagger_client.ApiClient(configuration))
filter = 'filter_example' # str | Table filter. For example, send {\"symbol\": \"XBTUSD\"}. (optional)
columns = 'columns_example' # str | Which columns to fetch. For example, send [\"columnName\"]. (optional)
count = 8.14 # float | Number of rows to fetch. (optional)

try:
    # Get your positions.
    api_response = api_instance.position_get(filter=filter, columns=columns, count=count)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PositionApi->position_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | [optional] 
 **columns** | **str**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **float**| Number of rows to fetch. | [optional] 

### Return type

[**list[Position]**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_isolate_margin**
> Position position_isolate_margin(symbol, enabled=enabled)

Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

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
api_instance = swagger_client.PositionApi(swagger_client.ApiClient(configuration))
symbol = 'symbol_example' # str | Position symbol to isolate.
enabled = true # bool | True for isolated margin, false for cross margin. (optional) (default to true)

try:
    # Enable isolated margin or cross margin per-position.
    api_response = api_instance.position_isolate_margin(symbol, enabled=enabled)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PositionApi->position_isolate_margin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Position symbol to isolate. | 
 **enabled** | **bool**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_transfer_isolated_margin**
> Position position_transfer_isolated_margin(symbol, amount, target_account_id=target_account_id)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

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
api_instance = swagger_client.PositionApi(swagger_client.ApiClient(configuration))
symbol = 'symbol_example' # str | Symbol of position to isolate.
amount = 8.14 # float | Amount to transfer, in Satoshis. May be negative.
target_account_id = 1.2 # float | AccountId for the position that the margin would be transfered to, must be a paired account with main user. (optional)

try:
    # Transfer equity in or out of a position.
    api_response = api_instance.position_transfer_isolated_margin(symbol, amount, target_account_id=target_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PositionApi->position_transfer_isolated_margin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to isolate. | 
 **amount** | **float**| Amount to transfer, in Satoshis. May be negative. | 
 **target_account_id** | **float**| AccountId for the position that the margin would be transfered to, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_update_leverage**
> Position position_update_leverage(symbol, leverage, target_account_id=target_account_id)

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

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
api_instance = swagger_client.PositionApi(swagger_client.ApiClient(configuration))
symbol = 'symbol_example' # str | Symbol of position to adjust.
leverage = 1.2 # float | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
target_account_id = 1.2 # float | AccountId for the position that the leverage would be changed on, must be a paired account with main user. (optional)

try:
    # Choose leverage for a position.
    api_response = api_instance.position_update_leverage(symbol, leverage, target_account_id=target_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PositionApi->position_update_leverage: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to adjust. | 
 **leverage** | **float**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 
 **target_account_id** | **float**| AccountId for the position that the leverage would be changed on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **position_update_risk_limit**
> Position position_update_risk_limit(symbol, risk_limit, target_account_id=target_account_id)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

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
api_instance = swagger_client.PositionApi(swagger_client.ApiClient(configuration))
symbol = 'symbol_example' # str | Symbol of position to update risk limit on.
risk_limit = 8.14 # float | New Risk Limit, in Satoshis.
target_account_id = 1.2 # float | AccountId for the position that the risk limit would be updated on, must be a paired account with main user. (optional)

try:
    # Update your risk limit.
    api_response = api_instance.position_update_risk_limit(symbol, risk_limit, target_account_id=target_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PositionApi->position_update_risk_limit: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to update risk limit on. | 
 **risk_limit** | **float**| New Risk Limit, in Satoshis. | 
 **target_account_id** | **float**| AccountId for the position that the risk limit would be updated on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

