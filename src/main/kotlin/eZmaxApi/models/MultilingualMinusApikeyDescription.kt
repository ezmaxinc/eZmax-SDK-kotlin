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
 * Description of the API Key  
 * @param sApikeyDescription1 Value in French
 * @param sApikeyDescription2 Value in English
 */

data class MultilingualMinusApikeyDescription (
    /* Value in French */
    @Json(name = "sApikeyDescription1")
    val sApikeyDescription1: kotlin.String? = null,
    /* Value in English */
    @Json(name = "sApikeyDescription2")
    val sApikeyDescription2: kotlin.String? = null
)

