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
 * This is a debug object containing debugging information on the actual function
 * @param iVersionMin The minimum version of the function that can be called
 * @param iVersionMax The maximum version of the function that can be called
 * @param aRequiredPermissions An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them.
 */

data class CommonMinusResponseMinusObjDebugPayload (
    /* The minimum version of the function that can be called */
    @Json(name = "iVersionMin")
    val iVersionMin: kotlin.Int,
    /* The maximum version of the function that can be called */
    @Json(name = "iVersionMax")
    val iVersionMax: kotlin.Int,
    /* An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them. */
    @Json(name = "a_RequiredPermissions")
    val aRequiredPermissions: kotlin.collections.List<kotlin.Int>
)

