# swagger_client.UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_cancel_withdrawal**](UserApi.md#user_cancel_withdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**user_check_referral_code**](UserApi.md#user_check_referral_code) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**user_communication_token**](UserApi.md#user_communication_token) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**user_confirm**](UserApi.md#user_confirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**user_confirm_withdrawal**](UserApi.md#user_confirm_withdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**user_get**](UserApi.md#user_get) | **GET** /user | Get your user model.
[**user_get_affiliate_status**](UserApi.md#user_get_affiliate_status) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**user_get_commission**](UserApi.md#user_get_commission) | **GET** /user/commission | Get your account&#39;s commission status.
[**user_get_deposit_address**](UserApi.md#user_get_deposit_address) | **GET** /user/depositAddress | Get a deposit address.
[**user_get_execution_history**](UserApi.md#user_get_execution_history) | **GET** /user/executionHistory | Get the execution history by day.
[**user_get_margin**](UserApi.md#user_get_margin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**user_get_quote_fill_ratio**](UserApi.md#user_get_quote_fill_ratio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**user_get_quote_value_ratio**](UserApi.md#user_get_quote_value_ratio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**user_get_trading_volume**](UserApi.md#user_get_trading_volume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**user_get_wallet**](UserApi.md#user_get_wallet) | **GET** /user/wallet | Get your current wallet information.
[**user_get_wallet_history**](UserApi.md#user_get_wallet_history) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_summary**](UserApi.md#user_get_wallet_summary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_logout**](UserApi.md#user_logout) | **POST** /user/logout | Log out of BitMEX.
[**user_min_withdrawal_fee**](UserApi.md#user_min_withdrawal_fee) | **GET** /user/minWithdrawalFee | Get the minimum, maximum, and recommended withdrawal fees for a currency.
[**user_request_withdrawal**](UserApi.md#user_request_withdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**user_save_preferences**](UserApi.md#user_save_preferences) | **POST** /user/preferences | Save user preferences.


# **user_cancel_withdrawal**
> Transaction user_cancel_withdrawal(token)

Cancel a withdrawal.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try:
    # Cancel a withdrawal.
    api_response = api_instance.user_cancel_withdrawal(token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_cancel_withdrawal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_check_referral_code**
> float user_check_referral_code(referral_code=referral_code)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
referral_code = 'referral_code_example' # str |  (optional)

try:
    # Check if a referral code is valid.
    api_response = api_instance.user_check_referral_code(referral_code=referral_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_check_referral_code: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referral_code** | **str**|  | [optional] 

### Return type

**float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_communication_token**
> list[CommunicationToken] user_communication_token(token, platform_agent)

Register your communication token for mobile clients

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
token = 'token_example' # str | 
platform_agent = 'platform_agent_example' # str | 

try:
    # Register your communication token for mobile clients
    api_response = api_instance.user_communication_token(token, platform_agent)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_communication_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 
 **platform_agent** | **str**|  | 

### Return type

[**list[CommunicationToken]**](CommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm**
> AccessToken user_confirm(token)

Confirm your email address with a token.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try:
    # Confirm your email address with a token.
    api_response = api_instance.user_confirm(token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_confirm: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_confirm_withdrawal**
> Transaction user_confirm_withdrawal(token)

Confirm a withdrawal.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
token = 'token_example' # str | 

try:
    # Confirm a withdrawal.
    api_response = api_instance.user_confirm_withdrawal(token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_confirm_withdrawal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get**
> User user_get()

Get your user model.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Get your user model.
    api_response = api_instance.user_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_affiliate_status**
> Affiliate user_get_affiliate_status(currency=currency)

Get your current affiliate/referral status.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt`, `all` (optional) (default to XBt)

try:
    # Get your current affiliate/referral status.
    api_response = api_instance.user_get_affiliate_status(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_affiliate_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_commission**
> UserCommissionsBySymbol user_get_commission()

Get your account's commission status.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Get your account's commission status.
    api_response = api_instance.user_get_commission()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_commission: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserCommissionsBySymbol**](UserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_deposit_address**
> str user_get_deposit_address(currency=currency)

Get a deposit address.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt` (optional) (default to XBt)

try:
    # Get a deposit address.
    api_response = api_instance.user_get_deposit_address(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_deposit_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]

### Return type

**str**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_execution_history**
> object user_get_execution_history(symbol, timestamp)

Get the execution history by day.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
symbol = 'XBTUSD' # str |  (default to XBTUSD)
timestamp = '2017-02-13T12:00:00.000Z' # datetime |  (default to 2017-02-13T12:00:00.000Z)

try:
    # Get the execution history by day.
    api_response = api_instance.user_get_execution_history(symbol, timestamp)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_execution_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**|  | [default to XBTUSD]
 **timestamp** | **datetime**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_margin**
> Margin user_get_margin(currency=currency)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt`, `all` (optional) (default to XBt)

try:
    # Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
    api_response = api_instance.user_get_margin(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_margin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_quote_fill_ratio**
> QuoteFillRatio user_get_quote_fill_ratio()

Get 7 days worth of Quote Fill Ratio statistics.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Get 7 days worth of Quote Fill Ratio statistics.
    api_response = api_instance.user_get_quote_fill_ratio()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_quote_fill_ratio: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_quote_value_ratio**
> QuoteValueRatio user_get_quote_value_ratio()

Get Quote Value Ratio statistics over the last 3 days

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Get Quote Value Ratio statistics over the last 3 days
    api_response = api_instance.user_get_quote_value_ratio()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_quote_value_ratio: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_trading_volume**
> TradingVolume user_get_trading_volume()

Get your 30 days USD average trading volume

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))

try:
    # Get your 30 days USD average trading volume
    api_response = api_instance.user_get_trading_volume()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_trading_volume: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TradingVolume**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet**
> Wallet user_get_wallet(currency=currency)

Get your current wallet information.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt`, `all` (optional) (default to XBt)

try:
    # Get your current wallet information.
    api_response = api_instance.user_get_wallet(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_history**
> list[Transaction] user_get_wallet_history(currency=currency, count=count, start=start)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt`, `all` (optional) (default to XBt)
count = 100 # float | Number of results to fetch. (optional) (default to 100)
start = 0 # float | Starting point for results. (optional) (default to 0)

try:
    # Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
    api_response = api_instance.user_get_wallet_history(currency=currency, count=count, start=start)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]

### Return type

[**list[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_summary**
> list[Transaction] user_get_wallet_summary(currency=currency)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Options: `XBt`, `USDt`, `all` (optional) (default to XBt)

try:
    # Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
    api_response = api_instance.user_get_wallet_summary(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet_summary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60;, &#x60;all&#x60; | [optional] [default to XBt]

### Return type

[**list[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_logout**
> user_logout()

Log out of BitMEX.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()

try:
    # Log out of BitMEX.
    api_instance.user_logout()
except ApiException as e:
    print("Exception when calling UserApi->user_logout: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_min_withdrawal_fee**
> object user_min_withdrawal_fee(currency=currency, amount=amount)

Get the minimum, maximum, and recommended withdrawal fees for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.  The \"fee\" field is the recommended fee for fast confirmation on the blockchain.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'XBt' # str | Options: `XBt`, `USDt` (optional) (default to XBt)
amount = 1.2 # float |  (optional)

try:
    # Get the minimum, maximum, and recommended withdrawal fees for a currency.
    api_response = api_instance.user_min_withdrawal_fee(currency=currency, amount=amount)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_min_withdrawal_fee: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [optional] [default to XBt]
 **amount** | **float**|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_request_withdrawal**
> Transaction user_request_withdrawal(currency, amount, otp_token=otp_token, address=address, address_id=address_id, target_user_id=target_user_id, fee=fee, text=text)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
currency = 'XBt' # str | Currency you're withdrawing. Options: `XBt`, `USDt` (default to XBt)
amount = 8.14 # float | Amount of withdrawal currency.
otp_token = 'otp_token_example' # str | 2FA token. Required for all external withdrawals. (optional)
address = 'address_example' # str | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
address_id = 1.2 # float | ID of the Destination Address. One of `address`, `targetUserId`, `targetUserId` has to be specified. (optional)
target_user_id = 1.2 # float | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
fee = 1.2 # float | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)
text = 'text_example' # str | Optional annotation, e.g. 'Transfer to home wallet'. (optional)

try:
    # Request a withdrawal to an external wallet.
    api_response = api_instance.user_request_withdrawal(currency, amount, otp_token=otp_token, address=address, address_id=address_id, target_user_id=target_user_id, fee=fee, text=text)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_request_withdrawal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | [default to XBt]
 **amount** | **float**| Amount of withdrawal currency. | 
 **otp_token** | **str**| 2FA token. Required for all external withdrawals. | [optional] 
 **address** | **str**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **address_id** | **float**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;targetUserId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **target_user_id** | **float**| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **fee** | **float**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 
 **text** | **str**| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_save_preferences**
> User user_save_preferences(prefs, overwrite=overwrite)

Save user preferences.

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
api_instance = swagger_client.UserApi(swagger_client.ApiClient(configuration))
prefs = 'prefs_example' # str | 
overwrite = false # bool | If true, will overwrite all existing preferences. (optional) (default to false)

try:
    # Save user preferences.
    api_response = api_instance.user_save_preferences(prefs, overwrite=overwrite)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_save_preferences: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **str**|  | 
 **overwrite** | **bool**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

