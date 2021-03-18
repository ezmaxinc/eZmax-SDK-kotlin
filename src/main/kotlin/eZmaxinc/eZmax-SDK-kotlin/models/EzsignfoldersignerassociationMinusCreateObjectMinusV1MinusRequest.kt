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

import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/ezsignfoldersignerassociation/createObject API Request
 * @param objEzsignfoldersignerassociation 
 * @param objEzsignfoldersignerassociationCompound 
 */

data class EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objEzsignfoldersignerassociation")
    val objEzsignfoldersignerassociation: EzsignfoldersignerassociationMinusRequest? = null,
    @Json(name = "objEzsignfoldersignerassociationCompound")
    val objEzsignfoldersignerassociationCompound: EzsignfoldersignerassociationMinusRequestCompound? = null
)

