
# SsprMinusValidateTokenMinusV1MinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pksCustomerCode** | **kotlin.String** | The customer code assigned to your account | 
**fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**eUserTypeSSPR** | [**FieldMinusEUserTypeSSPR**](FieldMinusEUserTypeSSPR.md) |  | 
**binUserSSPRtoken** | **kotlin.String** | Hex Encoded Secret SSPR token | 
**sEmailAddress** | **kotlin.String** | The email address. |  [optional]
**sUserLoginname** | **kotlin.String** | The Login name of the User. |  [optional]



