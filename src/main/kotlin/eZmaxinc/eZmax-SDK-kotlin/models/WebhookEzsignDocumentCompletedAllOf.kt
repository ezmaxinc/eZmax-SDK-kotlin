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

import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusResponse

import com.squareup.moshi.Json

/**
 * 
 * @param objEzsigndocument 
 */

data class WebhookEzsignDocumentCompletedAllOf (
    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusResponse
)

