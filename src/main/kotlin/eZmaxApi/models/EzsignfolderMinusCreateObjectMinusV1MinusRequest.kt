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

import eZmaxApi.models.EzsignfolderMinusRequest
import eZmaxApi.models.EzsignfolderMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignfolder/createObject API Request
 * @param objEzsignfolder 
 * @param objEzsignfolderCompound 
 */

data class EzsignfolderMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objEzsignfolder")
    val objEzsignfolder: EzsignfolderMinusRequest? = null,
    @Json(name = "objEzsignfolderCompound")
    val objEzsignfolderCompound: EzsignfolderMinusRequestCompound? = null
)

