/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.42
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/ezsignfoldersignerassociation/getInPersonLoginUrl API Request
 * @param sLoginUrl The Url to login to the signing application.    Url will expire after 30 minutes.  
 */

data class EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload (
    /* The Url to login to the signing application.    Url will expire after 30 minutes.   */
    @Json(name = "sLoginUrl")
    val sLoginUrl: kotlin.String
)

