# eZmaxApi - Kotlin client library for eZmax API Definition

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GlobalCustomerApi* | [**globalCustomerGetEndpointV1**](docs/GlobalCustomerApi.md#globalcustomergetendpointv1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint
*ModuleAuthenticateApi* | [**authenticateAuthenticateV2**](docs/ModuleAuthenticateApi.md#authenticateauthenticatev2) | **POST** /2/module/authenticate/authenticate/{eSessionType} | Authenticate a user
*ModuleSsprApi* | [**ssprResetPasswordRequestV1**](docs/ModuleSsprApi.md#ssprresetpasswordrequestv1) | **POST** /1/module/sspr/resetPasswordRequest | Reset Password Request
*ModuleSsprApi* | [**ssprResetPasswordV1**](docs/ModuleSsprApi.md#ssprresetpasswordv1) | **POST** /1/module/sspr/resetPassword | Reset Password
*ModuleSsprApi* | [**ssprSendUsernamesV1**](docs/ModuleSsprApi.md#ssprsendusernamesv1) | **POST** /1/module/sspr/sendUsernames | Send username(s)
*ModuleSsprApi* | [**ssprUnlockAccountRequestV1**](docs/ModuleSsprApi.md#ssprunlockaccountrequestv1) | **POST** /1/module/sspr/unlockAccountRequest | Unlock Account Request
*ModuleSsprApi* | [**ssprUnlockAccountV1**](docs/ModuleSsprApi.md#ssprunlockaccountv1) | **POST** /1/module/sspr/unlockAccount | Unlock Account
*ModuleSsprApi* | [**ssprValidateTokenV1**](docs/ModuleSsprApi.md#ssprvalidatetokenv1) | **POST** /1/module/sspr/validateToken | Validate Token
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#usercreateezsignuserv1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessiongetcurrentv1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeycreateobjectv1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentdeleteobjectv1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetChildrenV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetchildrenv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren | Retrieve an existing Ezsigndocument's children IDs
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetdownloadurlv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetobjectv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdeleteobjectv1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetChildrenV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetchildrenv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder's children IDs
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetobjectv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldersendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationdeleteobjectv1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetChildrenV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetchildrenv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren | Retrieve an existing Ezsignfoldersignerassociation's children IDs
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetinpersonloginurlv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetobjectv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturedeleteobjectv1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetChildrenV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetchildrenv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren | Retrieve an existing Ezsignsignature's children IDs
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetobjectv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokergetautocompletev1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficegetautocompletev1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodgetautocompletev1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs


<a name="documentation-for-models"></a>
## Documentation for Models

 - [eZmaxApi.models.ActivesessionMinusGetCurrentMinusV1MinusResponse](docs/ActivesessionMinusGetCurrentMinusV1MinusResponse.md)
 - [eZmaxApi.models.ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload](docs/ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.AddressMinusRequest](docs/AddressMinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusRequest](docs/ApikeyMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusResponse](docs/ApikeyMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.ApikeyMinusRequest](docs/ApikeyMinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusRequestCompound](docs/ApikeyMinusRequestCompound.md)
 - [eZmaxApi.models.ApikeyMinusResponse](docs/ApikeyMinusResponse.md)
 - [eZmaxApi.models.AttemptMinusResponse](docs/AttemptMinusResponse.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusRequest](docs/AuthenticateMinusAuthenticateMinusV2MinusRequest.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusResponse](docs/AuthenticateMinusAuthenticateMinusV2MinusResponse.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusResponseMinusMPayload](docs/AuthenticateMinusAuthenticateMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.CommonMinusAudit](docs/CommonMinusAudit.md)
 - [eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse](docs/CommonMinusGetAutocompleteMinusV1MinusResponse.md)
 - [eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload](docs/CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.CommonMinusResponse](docs/CommonMinusResponse.md)
 - [eZmaxApi.models.CommonMinusResponseMinusError](docs/CommonMinusResponseMinusError.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebug](docs/CommonMinusResponseMinusObjDebug.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload](docs/CommonMinusResponseMinusObjDebugPayload.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjSQLQuery](docs/CommonMinusResponseMinusObjSQLQuery.md)
 - [eZmaxApi.models.CommonMinusWebhook](docs/CommonMinusWebhook.md)
 - [eZmaxApi.models.ContactMinusRequest](docs/ContactMinusRequest.md)
 - [eZmaxApi.models.ContactMinusRequestCompound](docs/ContactMinusRequestCompound.md)
 - [eZmaxApi.models.ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [eZmaxApi.models.ContactinformationsMinusRequest](docs/ContactinformationsMinusRequest.md)
 - [eZmaxApi.models.ContactinformationsMinusRequestCompound](docs/ContactinformationsMinusRequestCompound.md)
 - [eZmaxApi.models.EmailMinusRequest](docs/EmailMinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusRequest](docs/EzsigndocumentMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponse](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusDeleteObjectMinusV1MinusResponse](docs/EzsigndocumentMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetObjectMinusV1MinusResponse](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusRequest](docs/EzsigndocumentMinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusRequestCompound](docs/EzsigndocumentMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigndocumentMinusResponse](docs/EzsigndocumentMinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusResponseCompound](docs/EzsigndocumentMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigndocumentResponseAllOf](docs/EzsigndocumentResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfolderMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetObjectMinusV1MinusResponse](docs/EzsignfolderMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusRequest](docs/EzsignfolderMinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusRequestCompound](docs/EzsignfolderMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusResponse](docs/EzsignfolderMinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusResponseCompound](docs/EzsignfolderMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusRequest](docs/EzsignfolderMinusSendMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusResponse](docs/EzsignfolderMinusSendMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderResponseAllOf](docs/EzsignfolderResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusRequest](docs/EzsignfoldersignerassociationMinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusRequestCompound](docs/EzsignfoldersignerassociationMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusRequest](docs/EzsignsignatureMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponse](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignsignatureMinusDeleteObjectMinusV1MinusResponse](docs/EzsignsignatureMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV1MinusResponse](docs/EzsignsignatureMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusRequest](docs/EzsignsignatureMinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusRequestCompound](docs/EzsignsignatureMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignerMinusRequest](docs/EzsignsignerMinusRequest.md)
 - [eZmaxApi.models.EzsignsignerMinusRequestCompound](docs/EzsignsignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignerMinusRequestCompoundMinusContact](docs/EzsignsignerMinusRequestCompoundMinusContact.md)
 - [eZmaxApi.models.FieldMinusEEzsigndocumentStep](docs/FieldMinusEEzsigndocumentStep.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency](docs/FieldMinusEEzsignfolderSendreminderfrequency.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderStep](docs/FieldMinusEEzsignfolderStep.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureType](docs/FieldMinusEEzsignsignatureType.md)
 - [eZmaxApi.models.FieldMinusEPhoneType](docs/FieldMinusEPhoneType.md)
 - [eZmaxApi.models.FieldMinusEUserType](docs/FieldMinusEUserType.md)
 - [eZmaxApi.models.FieldMinusEUserTypeSSPR](docs/FieldMinusEUserTypeSSPR.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusRequest](docs/FranchisereferalincomeMinusRequest.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusRequestCompound](docs/FranchisereferalincomeMinusRequestCompound.md)
 - [eZmaxApi.models.GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse](docs/GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse.md)
 - [eZmaxApi.models.MultilingualMinusApikeyDescription](docs/MultilingualMinusApikeyDescription.md)
 - [eZmaxApi.models.PhoneMinusRequest](docs/PhoneMinusRequest.md)
 - [eZmaxApi.models.SsprMinusResetPasswordMinusV1MinusRequest](docs/SsprMinusResetPasswordMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusResetPasswordRequestMinusV1MinusRequest](docs/SsprMinusResetPasswordRequestMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusSendUsernamesMinusV1MinusRequest](docs/SsprMinusSendUsernamesMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusUnlockAccountMinusV1MinusRequest](docs/SsprMinusUnlockAccountMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusUnlockAccountRequestMinusV1MinusRequest](docs/SsprMinusUnlockAccountRequestMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusValidateTokenMinusV1MinusRequest](docs/SsprMinusValidateTokenMinusV1MinusRequest.md)
 - [eZmaxApi.models.UNUSEDMinusEzsigndocumentMinusEditObjectMinusV1MinusRequest](docs/UNUSEDMinusEzsigndocumentMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.UNUSEDMinusEzsigndocumentMinusEditObjectMinusV1MinusResponse](docs/UNUSEDMinusEzsigndocumentMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignfolderMinusEditObjectMinusV1MinusRequest](docs/UNUSEDMinusEzsignfolderMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignfolderMinusEditObjectMinusV1MinusResponse](docs/UNUSEDMinusEzsignfolderMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest](docs/UNUSEDMinusEzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse](docs/UNUSEDMinusEzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignsignatureMinusEditObjectMinusV1MinusRequest](docs/UNUSEDMinusEzsignsignatureMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.UNUSEDMinusEzsignsignatureMinusEditObjectMinusV1MinusResponse](docs/UNUSEDMinusEzsignsignatureMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusRequest](docs/UserMinusCreateEzsignuserMinusV1MinusRequest.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponse](docs/UserMinusCreateEzsignuserMinusV1MinusResponse.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload](docs/UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.UserMinusResponse](docs/UserMinusResponse.md)
 - [eZmaxApi.models.UserResponseAllOf](docs/UserResponseAllOf.md)
 - [eZmaxApi.models.WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [eZmaxApi.models.WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusDocumentCompleted](docs/WebhookMinusEzsignMinusDocumentCompleted.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusFolderCompleted](docs/WebhookMinusEzsignMinusFolderCompleted.md)
 - [eZmaxApi.models.WebhookMinusResponse](docs/WebhookMinusResponse.md)
 - [eZmaxApi.models.WebhookMinusUserMinusUserCreated](docs/WebhookMinusUserMinusUserCreated.md)
 - [eZmaxApi.models.WebhookUserUserCreatedAllOf](docs/WebhookUserUserCreatedAllOf.md)
 - [eZmaxApi.models.WebsiteMinusRequest](docs/WebsiteMinusRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

