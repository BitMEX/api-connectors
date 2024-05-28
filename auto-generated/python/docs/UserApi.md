# swagger_client.UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_cancel_pending_withdrawal**](UserApi.md#user_cancel_pending_withdrawal) | **DELETE** /user/withdrawal | Cancel pending withdrawal
[**user_cancel_withdrawal**](UserApi.md#user_cancel_withdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**user_check_referral_code**](UserApi.md#user_check_referral_code) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**user_communication_token**](UserApi.md#user_communication_token) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**user_confirm**](UserApi.md#user_confirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**user_confirm_withdrawal**](UserApi.md#user_confirm_withdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**user_create_sub_account**](UserApi.md#user_create_sub_account) | **POST** /user/addSubaccount | Creates a new sub-account.
[**user_create_unstaking_requests**](UserApi.md#user_create_unstaking_requests) | **POST** /user/unstakingRequests | Create unstaking request
[**user_delete_unstaking_requests**](UserApi.md#user_delete_unstaking_requests) | **DELETE** /user/unstakingRequests | Cancel unstaking request
[**user_get**](UserApi.md#user_get) | **GET** /user | Get your user model.
[**user_get_affiliate_status**](UserApi.md#user_get_affiliate_status) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**user_get_commission**](UserApi.md#user_get_commission) | **GET** /user/commission | Get your account&#39;s commission status.
[**user_get_csa**](UserApi.md#user_get_csa) | **GET** /user/csa | Get your account&#39;s CSA status.
[**user_get_deposit_address**](UserApi.md#user_get_deposit_address) | **GET** /user/depositAddress | Get a deposit address.
[**user_get_deposit_address_information**](UserApi.md#user_get_deposit_address_information) | **GET** /user/depositAddressInformation | Get a deposit address.
[**user_get_execution_history**](UserApi.md#user_get_execution_history) | **GET** /user/executionHistory | Get the execution history by day.
[**user_get_margin**](UserApi.md#user_get_margin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**user_get_quote_fill_ratio**](UserApi.md#user_get_quote_fill_ratio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**user_get_quote_value_ratio**](UserApi.md#user_get_quote_value_ratio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**user_get_staking**](UserApi.md#user_get_staking) | **GET** /user/staking | Get the current user staking amount.
[**user_get_staking_instruments**](UserApi.md#user_get_staking_instruments) | **GET** /user/staking/instruments | List staking instruments
[**user_get_staking_tiers**](UserApi.md#user_get_staking_tiers) | **GET** /user/staking/tiers | List staking tiers for a given currency
[**user_get_trading_volume**](UserApi.md#user_get_trading_volume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**user_get_unstaking_requests**](UserApi.md#user_get_unstaking_requests) | **GET** /user/unstakingRequests | Get the current user unstaking requests
[**user_get_wallet**](UserApi.md#user_get_wallet) | **GET** /user/wallet | Get your current wallet information.
[**user_get_wallet_history**](UserApi.md#user_get_wallet_history) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_summary**](UserApi.md#user_get_wallet_summary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_transfer_accounts**](UserApi.md#user_get_wallet_transfer_accounts) | **GET** /user/getWalletTransferAccounts | Get the list of accounts you can transfer funds between.
[**user_logout**](UserApi.md#user_logout) | **POST** /user/logout | Log out of BitMEX.
[**user_request_withdrawal**](UserApi.md#user_request_withdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**user_save_preferences**](UserApi.md#user_save_preferences) | **POST** /user/preferences | Save user preferences.
[**user_update_sub_account**](UserApi.md#user_update_sub_account) | **POST** /user/updateSubaccount | Updates the sub-account name.
[**user_wallet_transfer**](UserApi.md#user_wallet_transfer) | **POST** /user/walletTransfer | Execute a transfer to a paired account.


# **user_cancel_pending_withdrawal**
> object user_cancel_pending_withdrawal(transact_id)

Cancel pending withdrawal

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
transact_id = 'transact_id_example' # str | 

try:
    # Cancel pending withdrawal
    api_response = api_instance.user_cancel_pending_withdrawal(transact_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_cancel_pending_withdrawal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transact_id** | **str**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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
> object user_check_referral_code(referral_code=referral_code)

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

**object**

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

# **user_create_sub_account**
> object user_create_sub_account(account_name)

Creates a new sub-account.

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
account_name = 'account_name_example' # str | 

try:
    # Creates a new sub-account.
    api_response = api_instance.user_create_sub_account(account_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_create_sub_account: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_name** | **str**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_create_unstaking_requests**
> object user_create_unstaking_requests(symbol, amount)

Create unstaking request

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
symbol = 'symbol_example' # str | 
amount = 1.2 # float | 

try:
    # Create unstaking request
    api_response = api_instance.user_create_unstaking_requests(symbol, amount)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_create_unstaking_requests: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**|  | 
 **amount** | **float**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_delete_unstaking_requests**
> object user_delete_unstaking_requests(redemption_id)

Cancel unstaking request

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
redemption_id = 'redemption_id_example' # str | 

try:
    # Cancel unstaking request
    api_response = api_instance.user_delete_unstaking_requests(redemption_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_delete_unstaking_requests: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemption_id** | **str**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
currency = 'XBt' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

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
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

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

# **user_get_csa**
> CollateralSupportAgreement user_get_csa()

Get your account's CSA status.

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
    # Get your account's CSA status.
    api_response = api_instance.user_get_csa()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_csa: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollateralSupportAgreement**](CollateralSupportAgreement.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_deposit_address**
> str user_get_deposit_address(currency, network)

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
currency = 'currency_example' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
network = 'network_example' # str | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

try:
    # Get a deposit address.
    api_response = api_instance.user_get_deposit_address(currency, network)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_deposit_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **network** | **str**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

**str**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_deposit_address_information**
> DepositAddress user_get_deposit_address_information(currency, network)

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
currency = 'currency_example' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
network = 'network_example' # str | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

try:
    # Get a deposit address.
    api_response = api_instance.user_get_deposit_address_information(currency, network)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_deposit_address_information: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **network** | **str**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

[**DepositAddress**](DepositAddress.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_execution_history**
> list[Execution] user_get_execution_history(symbol, timestamp)

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

[**list[Execution]**](Execution.md)

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
currency = 'XBt' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

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
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_quote_fill_ratio**
> QuoteFillRatio user_get_quote_fill_ratio(target_account_id=target_account_id)

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
target_account_id = 1.2 # float | AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional)

try:
    # Get 7 days worth of Quote Fill Ratio statistics.
    api_response = api_instance.user_get_quote_fill_ratio(target_account_id=target_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_quote_fill_ratio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **float**| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_quote_value_ratio**
> QuoteValueRatio user_get_quote_value_ratio(target_account_id=target_account_id)

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
target_account_id = 1.2 # float | AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional)

try:
    # Get Quote Value Ratio statistics over the last 3 days
    api_response = api_instance.user_get_quote_value_ratio(target_account_id=target_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_quote_value_ratio: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **float**| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_staking**
> list[StakingRecord] user_get_staking(currency=currency)

Get the current user staking amount.

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
currency = 'currency_example' # str |  (optional)

try:
    # Get the current user staking amount.
    api_response = api_instance.user_get_staking(currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_staking: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**|  | [optional] 

### Return type

[**list[StakingRecord]**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_staking_instruments**
> list[XAny] user_get_staking_instruments(symbol=symbol, currency=currency)

List staking instruments

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
symbol = 'symbol_example' # str |  (optional)
currency = 'currency_example' # str |  (optional)

try:
    # List staking instruments
    api_response = api_instance.user_get_staking_instruments(symbol=symbol, currency=currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_staking_instruments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**|  | [optional] 
 **currency** | **str**|  | [optional] 

### Return type

[**list[XAny]**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_staking_tiers**
> list[XAny] user_get_staking_tiers(currency)

List staking tiers for a given currency

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserApi()
currency = 'currency_example' # str | 

try:
    # List staking tiers for a given currency
    api_response = api_instance.user_get_staking_tiers(currency)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_staking_tiers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**|  | 

### Return type

[**list[XAny]**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_trading_volume**
> list[TradingVolume] user_get_trading_volume()

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

[**list[TradingVolume]**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_unstaking_requests**
> list[StakingRecord] user_get_unstaking_requests(status)

Get the current user unstaking requests

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
status = 'status_example' # str | 

try:
    # Get the current user unstaking requests
    api_response = api_instance.user_get_unstaking_requests(status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_unstaking_requests: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **str**|  | 

### Return type

[**list[StakingRecord]**](StakingRecord.md)

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
currency = 'XBt' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)

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
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_history**
> list[Transaction] user_get_wallet_history(currency=currency, count=count, start=start, target_account_id=target_account_id, reverse=reverse)

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
currency = 'XBt' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)
count = 10000 # float | Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. (optional) (default to 10000)
start = 0 # float | Starting point for results, integer. Default 0. (optional) (default to 0)
target_account_id = 1.2 # float | AccountId to view the history of, must be a paired account with the authorised user requesting the history. (optional)
reverse = true # bool | Start from the latest transaction record. Default true. (optional) (default to true)

try:
    # Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
    api_response = api_instance.user_get_wallet_history(currency=currency, count=count, start=start, target_account_id=target_account_id, reverse=reverse)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **count** | **float**| Number of results to fetch. Fetch results from start to start + count. Max: 10,000 rows. | [optional] [default to 10000]
 **start** | **float**| Starting point for results, integer. Default 0. | [optional] [default to 0]
 **target_account_id** | **float**| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | [optional] 
 **reverse** | **bool**| Start from the latest transaction record. Default true. | [optional] [default to true]

### Return type

[**list[Transaction]**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_summary**
> list[WalletSummaryRecord] user_get_wallet_summary(currency=currency, start_time=start_time, end_time=end_time)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

Provides an aggregated view of transactions, by transaction type, over a specific time period.

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
currency = 'XBt' # str | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\" (optional) (default to XBt)
start_time = '2013-10-20T19:20:30+01:00' # datetime | Start time for the summary (optional)
end_time = '2013-10-20T19:20:30+01:00' # datetime | End time for the summary (optional)

try:
    # Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
    api_response = api_instance.user_get_wallet_summary(currency=currency, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet_summary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **start_time** | **datetime**| Start time for the summary | [optional] 
 **end_time** | **datetime**| End time for the summary | [optional] 

### Return type

[**list[WalletSummaryRecord]**](WalletSummaryRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_get_wallet_transfer_accounts**
> list[XAny] user_get_wallet_transfer_accounts()

Get the list of accounts you can transfer funds between.

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
    # Get the list of accounts you can transfer funds between.
    api_response = api_instance.user_get_wallet_transfer_accounts()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_get_wallet_transfer_accounts: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[XAny]**](XAny.md)

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

# **user_request_withdrawal**
> Transaction user_request_withdrawal(currency, network, amount, otp_token=otp_token, address=address, memo=memo, address_id=address_id, target_user_id=target_user_id, fee=fee, text=text)

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
currency = 'XBt' # str | Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a> (default to XBt)
network = 'network_example' # str | The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.
amount = 8.14 # float | Amount of withdrawal currency.
otp_token = 'otp_token_example' # str | 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. (optional)
address = 'address_example' # str | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
memo = 'memo_example' # str | Destination Memo. If `address`, is specified, Destination Memo can also be specified (optional)
address_id = 1.2 # float | ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
target_user_id = 1.2 # float | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified. (optional)
fee = 1.2 # float | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. (optional)
text = 'text_example' # str | Optional annotation, e.g. 'Transfer to home wallet'. (optional)

try:
    # Request a withdrawal to an external wallet.
    api_response = api_instance.user_request_withdrawal(currency, network, amount, otp_token=otp_token, address=address, memo=memo, address_id=address_id, target_user_id=target_user_id, fee=fee, text=text)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_request_withdrawal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Currency you&#39;re withdrawing. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | [default to XBt]
 **network** | **str**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 
 **amount** | **float**| Amount of withdrawal currency. | 
 **otp_token** | **str**| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | [optional] 
 **address** | **str**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **memo** | **str**| Destination Memo. If &#x60;address&#x60;, is specified, Destination Memo can also be specified | [optional] 
 **address_id** | **float**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
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

# **user_update_sub_account**
> object user_update_sub_account(target_account_id, account_name)

Updates the sub-account name.

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
target_account_id = 1.2 # float | 
account_name = 'account_name_example' # str | 

try:
    # Updates the sub-account name.
    api_response = api_instance.user_update_sub_account(target_account_id, account_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_update_sub_account: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **float**|  | 
 **account_name** | **str**|  | 

### Return type

**object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_wallet_transfer**
> Transaction user_wallet_transfer(currency, amount, target_account_id, from_account_id=from_account_id)

Execute a transfer to a paired account.

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
currency = 'currency_example' # str | Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>
amount = 8.14 # float | Amount of transfer.
target_account_id = 1.2 # float | AccountId to send the transfer to, must be a paired account with the user sending the transfer.
from_account_id = 1.2 # float | AccountID to send the transfer from. Must be paired account with the authenticated user. (optional)

try:
    # Execute a transfer to a paired account.
    api_response = api_instance.user_wallet_transfer(currency, amount, target_account_id, from_account_id=from_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserApi->user_wallet_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Currency you&#39;re transfering. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **amount** | **float**| Amount of transfer. | 
 **target_account_id** | **float**| AccountId to send the transfer to, must be a paired account with the user sending the transfer. | 
 **from_account_id** | **float**| AccountID to send the transfer from. Must be paired account with the authenticated user. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

