/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.33
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.UserMinusResponse

import com.squareup.moshi.Json

/**
 * 
 * @param objUser 
 */

data class WebhookUserUserCreatedAllOf (
    @Json(name = "objUser")
    val objUser: UserMinusResponse
)

