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
 * A Contact Object
 * @param fkiEmailtypeID The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
 * @param sEmailAddress The email address.
 */

data class EmailMinusRequest (
    /* The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home| */
    @Json(name = "fkiEmailtypeID")
    val fkiEmailtypeID: kotlin.Int,
    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String
)

