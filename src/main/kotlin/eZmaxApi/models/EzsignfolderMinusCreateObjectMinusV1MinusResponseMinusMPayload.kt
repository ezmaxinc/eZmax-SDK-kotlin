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


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignfolder/createObject API Request
 * @param aPkiEzsignfolderID An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
 */

data class EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload (
    /* An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request. */
    @Json(name = "a_pkiEzsignfolderID")
    val aPkiEzsignfolderID: kotlin.collections.List<kotlin.Int>
)

