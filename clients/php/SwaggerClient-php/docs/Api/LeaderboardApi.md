# Swagger\Client\LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboardGet**](LeaderboardApi.md#leaderboardGet) | **GET** /leaderboard | Get current leaderboard.


# **leaderboardGet**
> \Swagger\Client\Model\Leaderboard[] leaderboardGet($method)

Get current leaderboard.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LeaderboardApi();
$method = "notional"; // string | Ranking type. Options: \"notional\", \"ROE\"

try {
    $result = $api_instance->leaderboardGet($method);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LeaderboardApi->leaderboardGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **string**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**\Swagger\Client\Model\Leaderboard[]**](../Model/Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

