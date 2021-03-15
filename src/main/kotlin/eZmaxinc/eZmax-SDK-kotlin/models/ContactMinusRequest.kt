/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.33
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models


import com.squareup.moshi.Json

/**
 * A Contact Object
 * @param fkiContacttitleID The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param sContactCompany The Company name of the contact
 * @param dtContactBirthdate The Birth Date of the contact
 */

data class ContactMinusRequest (
    /* The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| */
    @Json(name = "fkiContacttitleID")
    val fkiContacttitleID: kotlin.Int,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,
    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,
    /* The Company name of the contact */
    @Json(name = "sContactCompany")
    val sContactCompany: kotlin.String,
    /* The Birth Date of the contact */
    @Json(name = "dtContactBirthdate")
    val dtContactBirthdate: kotlin.String? = null
)

