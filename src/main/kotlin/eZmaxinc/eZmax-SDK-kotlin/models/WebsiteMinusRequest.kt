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
 * A Website Object
 * @param fkiWebsitetypeID The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|
 * @param sWebsiteAddress The URL of the website.
 */

data class WebsiteMinusRequest (
    /* The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey| */
    @Json(name = "fkiWebsitetypeID")
    val fkiWebsitetypeID: kotlin.Int,
    /* The URL of the website. */
    @Json(name = "sWebsiteAddress")
    val sWebsiteAddress: kotlin.String
)

