/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.46
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/activesession/getCurrent API Request
 * @param sCustomerCode The customer code specific to the client in which the API request is being made
 * @param eActivesessionSessiontype The type of session used for the API request call
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sCompanyNameX The name of the active Company in the current language
 * @param sDepartmentNameX The name of the active Department in the current language
 * @param aRegisteredModules An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
 * @param aPermissions An array of permissions granted to the user or api key
 * @param fkiUserID The unique ID of the User
 * @param fkiApikeyID The unique ID of the Apikey
 */

data class ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload (
    /* The customer code specific to the client in which the API request is being made */
    @Json(name = "sCustomerCode")
    val sCustomerCode: kotlin.String,
    /* The type of session used for the API request call */
    @Json(name = "eActivesessionSessiontype")
    val eActivesessionSessiontype: ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload.EActivesessionSessiontype,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The name of the active Company in the current language */
    @Json(name = "sCompanyNameX")
    val sCompanyNameX: kotlin.String,
    /* The name of the active Department in the current language */
    @Json(name = "sDepartmentNameX")
    val sDepartmentNameX: kotlin.String,
    /* An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. */
    @Json(name = "a_RegisteredModules")
    val aRegisteredModules: kotlin.collections.List<kotlin.String>,
    /* An array of permissions granted to the user or api key */
    @Json(name = "a_Permissions")
    val aPermissions: kotlin.collections.List<kotlin.Int>,
    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,
    /* The unique ID of the Apikey */
    @Json(name = "fkiApikeyID")
    val fkiApikeyID: kotlin.Int
) {

    /**
     * The type of session used for the API request call
     * Values: Normal
     */
    enum class EActivesessionSessiontype(val value: kotlin.String) {
        @Json(name = "Normal") Normal("Normal");
    }
}

