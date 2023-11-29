
# UserEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Double** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**userId** | **Double** |  | 
**createdById** | **Double** |  | 
**ip** | **String** |  |  [optional]
**geoipCountry** | **String** |  |  [optional]
**geoipRegion** | **String** |  |  [optional]
**geoipSubRegion** | **String** |  |  [optional]
**eventMeta** | **Object** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
APIKEYCREATED | &quot;apiKeyCreated&quot;
DELEVERAGEEXECUTION | &quot;deleverageExecution&quot;
DEPOSITCONFIRMED | &quot;depositConfirmed&quot;
DEPOSITPENDING | &quot;depositPending&quot;
BANZEROVOLUMEAPIUSER | &quot;banZeroVolumeApiUser&quot;
LIQUIDATIONORDERPLACED | &quot;liquidationOrderPlaced&quot;
LOGIN | &quot;login&quot;
EXISTINGACCOUNTREGISTRATIONATTEMPT | &quot;existingAccountRegistrationAttempt&quot;
PASSWORDCHANGED | &quot;passwordChanged&quot;
POSITIONSTATELIQUIDATED | &quot;positionStateLiquidated&quot;
POSITIONSTATEWARNING | &quot;positionStateWarning&quot;
RESETPASSWORDCONFIRMED | &quot;resetPasswordConfirmed&quot;
RESETPASSWORDREQUEST | &quot;resetPasswordRequest&quot;
TRANSFERCANCELED | &quot;transferCanceled&quot;
TRANSFERCOMPLETED | &quot;transferCompleted&quot;
TRANSFERRECEIVED | &quot;transferReceived&quot;
TRANSFERREQUESTED | &quot;transferRequested&quot;
TWOFACTORDISABLED | &quot;twoFactorDisabled&quot;
TWOFACTORENABLED | &quot;twoFactorEnabled&quot;
WITHDRAWALCANCELED | &quot;withdrawalCanceled&quot;
WITHDRAWALCOMPLETED | &quot;withdrawalCompleted&quot;
WITHDRAWALCONFIRMED | &quot;withdrawalConfirmed&quot;
WITHDRAWALREQUESTED | &quot;withdrawalRequested&quot;
ADDRESSSKIPCONFIRMREQUESTED | &quot;addressSkipConfirmRequested&quot;
ADDRESSSKIPCONFIRMVERIFIED | &quot;addressSkipConfirmVerified&quot;
VERIFY | &quot;verify&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;



