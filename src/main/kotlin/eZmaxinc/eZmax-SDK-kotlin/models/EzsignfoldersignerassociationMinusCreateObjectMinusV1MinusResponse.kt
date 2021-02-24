/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.31
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusObjDebug
import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusObjDebugPayload
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload

import com.squareup.moshi.Json

/**
 * Response for the /1/object/ezsignfoldersignerassociation/createObject API Request
 * @param objDebugPayload 
 * @param objDebug 
 */

data class EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse (
    @Json(name = "objDebugPayload")
    val objDebugPayload: CommonMinusResponseMinusObjDebugPayload? = null,
    @Json(name = "objDebug")
    val objDebug: CommonMinusResponseMinusObjDebug? = null
)

