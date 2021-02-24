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


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/franchisereferalincome/createObject API Request
 * @param aPkiFranchisereferalincomeID An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 */

data class FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload (
    /* An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiFranchisereferalincomeID")
    val aPkiFranchisereferalincomeID: kotlin.collections.List<kotlin.Int>
)

