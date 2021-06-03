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

import eZmaxApi.models.EzsigndocumentMinusRequest
import eZmaxApi.models.EzsigndocumentMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsigndocument/createObject API Request
 * @param objEzsigndocument 
 * @param objEzsigndocumentCompound 
 */

data class EzsigndocumentMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objEzsigndocument")
    val objEzsigndocument: EzsigndocumentMinusRequest? = null,
    @Json(name = "objEzsigndocumentCompound")
    val objEzsigndocumentCompound: EzsigndocumentMinusRequestCompound? = null
)

