/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.45
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Gives informations about the user that created the object and the last user to have modified it.  If the object was never modified after creation, both Created and Modified informations will be the same.  Apikey details will only be provided if the changes were made by an API key.  
 * @param fkiUserIDCreated The unique ID of the User
 * @param fkiUserIDModified The unique ID of the User
 * @param dtCreatedDate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param dtModifiedDate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param fkiApikeyIDCreated The unique ID of the Apikey
 * @param fkiApikeyIDModified The unique ID of the Apikey
 */

data class CommonMinusAudit (
    /* The unique ID of the User */
    @Json(name = "fkiUserIDCreated")
    val fkiUserIDCreated: kotlin.Int,
    /* The unique ID of the User */
    @Json(name = "fkiUserIDModified")
    val fkiUserIDModified: kotlin.Int,
    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtCreatedDate")
    val dtCreatedDate: kotlin.String,
    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtModifiedDate")
    val dtModifiedDate: kotlin.String,
    /* The unique ID of the Apikey */
    @Json(name = "fkiApikeyIDCreated")
    val fkiApikeyIDCreated: kotlin.Int? = null,
    /* The unique ID of the Apikey */
    @Json(name = "fkiApikeyIDModified")
    val fkiApikeyIDModified: kotlin.Int? = null
)

