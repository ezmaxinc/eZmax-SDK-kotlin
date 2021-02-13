/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.
*
* The version of the OpenAPI document: 1.0.30
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignsignature/createObject API Request
 * @param objEzsignsignature 
 * @param objEzsignsignatureCompound 
 */

data class EzsignsignatureMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objEzsignsignature")
    val objEzsignsignature: EzsignsignatureMinusRequest? = null,
    @Json(name = "objEzsignsignatureCompound")
    val objEzsignsignatureCompound: EzsignsignatureMinusRequestCompound? = null
)

