/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.32
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusRequestCompound

import com.squareup.moshi.Json

/**
 * Request for the /1/object/franchisereferalincome/createObject API Request
 * @param objFranchisereferalincome 
 * @param objFranchisereferalincomeCompound 
 */

data class FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest (
    @Json(name = "objFranchisereferalincome")
    val objFranchisereferalincome: FranchisereferalincomeMinusRequest? = null,
    @Json(name = "objFranchisereferalincomeCompound")
    val objFranchisereferalincomeCompound: FranchisereferalincomeMinusRequestCompound? = null
)

