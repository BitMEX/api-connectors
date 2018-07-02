
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**title** | **String** |  | 
**body** | **String** |  | 
**ttl** | [**BigDecimal**](BigDecimal.md) |  | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**closable** | **Boolean** |  |  [optional]
**persist** | **Boolean** |  |  [optional]
**waitForVisibility** | **Boolean** |  |  [optional]
**sound** | **String** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
ERROR | &quot;error&quot;
INFO | &quot;info&quot;



