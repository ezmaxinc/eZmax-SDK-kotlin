/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.37
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for the /1/object/apikey/createObject API Request
 * @param aObjApikey 
 */

data class ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload (
    @Json(name = "a_objApikey")
    val aObjApikey: kotlin.collections.List<ApikeyMinusResponse>
)

