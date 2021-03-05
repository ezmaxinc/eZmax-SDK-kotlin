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


import com.squareup.moshi.Json

/**
 * An Ezsigndocument Object
 * @param eEzsigndocumentSource Indicates where to look for the document binary content.
 * @param eEzsigndocumentFormat Indicates the format of the document.
 * @param fkiEzsignfolderID A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.
 * @param dtEzsigndocumentDuedate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param sEzsigndocumentBase64 The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.
 */

data class EzsigndocumentMinusRequest (
    /* Indicates where to look for the document binary content. */
    @Json(name = "eEzsigndocumentSource")
    val eEzsigndocumentSource: EzsigndocumentMinusRequest.EEzsigndocumentSource,
    /* Indicates the format of the document. */
    @Json(name = "eEzsigndocumentFormat")
    val eEzsigndocumentFormat: EzsigndocumentMinusRequest.EEzsigndocumentFormat,
    /* A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation. */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,
    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,
    /* The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64. */
    @Json(name = "sEzsigndocumentBase64")
    val sEzsigndocumentBase64: kotlin.ByteArray? = null
) {

    /**
    * Indicates where to look for the document binary content.
    * Values: Base64
    */
    
    enum class EEzsigndocumentSource(val value: kotlin.String){
        @Json(name = "Base64") Base64("Base64");
    }
    /**
    * Indicates the format of the document.
    * Values: Pdf
    */
    
    enum class EEzsigndocumentFormat(val value: kotlin.String){
        @Json(name = "Pdf") Pdf("Pdf");
    }
}

