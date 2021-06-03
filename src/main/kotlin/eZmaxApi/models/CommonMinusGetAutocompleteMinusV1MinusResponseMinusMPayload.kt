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
 * Generic Autocomplete Response
 * @param group The Category (ie group) for the dropdown or an empty string if not categorized
 * @param id The Unique ID of the element
 * @param option The Description of the element
 */

data class CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload (
    /* The Category (ie group) for the dropdown or an empty string if not categorized */
    @Json(name = "group")
    val group: kotlin.String,
    /* The Unique ID of the element */
    @Json(name = "id")
    val id: kotlin.String,
    /* The Description of the element */
    @Json(name = "option")
    val option: kotlin.String
)

