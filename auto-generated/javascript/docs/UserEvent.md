# BitMexApi.UserEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** |  | [optional] 
**type** | **String** |  | 
**status** | **String** |  | 
**userId** | **Number** |  | 
**createdById** | **Number** |  | 
**ip** | **String** |  | [optional] 
**geoipCountry** | **String** |  | [optional] 
**geoipRegion** | **String** |  | [optional] 
**geoipSubRegion** | **String** |  | [optional] 
**eventMeta** | **Object** |  | [optional] 
**created** | **Date** |  | 


<a name="TypeEnum"></a>
## Enum: TypeEnum


* `apiKeyCreated` (value: `"apiKeyCreated"`)

* `deleverageExecution` (value: `"deleverageExecution"`)

* `depositConfirmed` (value: `"depositConfirmed"`)

* `depositPending` (value: `"depositPending"`)

* `banZeroVolumeApiUser` (value: `"banZeroVolumeApiUser"`)

* `liquidationOrderPlaced` (value: `"liquidationOrderPlaced"`)

* `login` (value: `"login"`)

* `existingAccountRegistrationAttempt` (value: `"existingAccountRegistrationAttempt"`)

* `passwordChanged` (value: `"passwordChanged"`)

* `positionStateLiquidated` (value: `"positionStateLiquidated"`)

* `positionStateWarning` (value: `"positionStateWarning"`)

* `resetPasswordConfirmed` (value: `"resetPasswordConfirmed"`)

* `resetPasswordRequest` (value: `"resetPasswordRequest"`)

* `transferCanceled` (value: `"transferCanceled"`)

* `transferCompleted` (value: `"transferCompleted"`)

* `transferReceived` (value: `"transferReceived"`)

* `transferRequested` (value: `"transferRequested"`)

* `twoFactorDisabled` (value: `"twoFactorDisabled"`)

* `twoFactorEnabled` (value: `"twoFactorEnabled"`)

* `withdrawalCanceled` (value: `"withdrawalCanceled"`)

* `withdrawalCompleted` (value: `"withdrawalCompleted"`)

* `withdrawalConfirmed` (value: `"withdrawalConfirmed"`)

* `withdrawalRequested` (value: `"withdrawalRequested"`)

* `addressSkipConfirmRequested` (value: `"addressSkipConfirmRequested"`)

* `addressSkipConfirmVerified` (value: `"addressSkipConfirmVerified"`)

* `verify` (value: `"verify"`)

* `restrictedAccount` (value: `"restrictedAccount"`)

* `unrestrictedAccount` (value: `"unrestrictedAccount"`)

* `disabledAccount` (value: `"disabledAccount"`)

* `enabledAccount` (value: `"enabledAccount"`)

* `roleroleMappingDestroy` (value: `"role:roleMappingDestroy"`)

* `rolechatBanned` (value: `"role:chatBanned"`)

* `rolewithdrawalBanned` (value: `"role:withdrawalBanned"`)

* `roleorderBanned` (value: `"role:orderBanned"`)

* `roleapiBanned` (value: `"role:apiBanned"`)

* `rolerestrictedJurisdictionPrivilege` (value: `"role:restrictedJurisdictionPrivilege"`)




<a name="StatusEnum"></a>
## Enum: StatusEnum


* `success` (value: `"success"`)

* `failure` (value: `"failure"`)




