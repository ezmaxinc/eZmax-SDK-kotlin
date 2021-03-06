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

import eZmaxApi.models.FieldMinusEEzsignsignatureType

import com.squareup.moshi.Json

/**
 * An Ezsignsignature Object
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param iEzsignpagePagenumber The page number in the document where to apply the signature
 * @param iEzsignsignatureX The X coordinate (Horizontal) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignsignatureY The Y coordinate (Vertical) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignsignatureStep The step when the Ezsignsigner will be invited to sign.
 * @param eEzsignsignatureType 
 * @param fkiEzsigndocumentID The unique ID of the Ezsigntemplate
 */

data class EzsignsignatureMinusRequest (
    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    val fkiEzsignfoldersignerassociationID: kotlin.Int,
    /* The page number in the document where to apply the signature */
    @Json(name = "iEzsignpagePagenumber")
    val iEzsignpagePagenumber: kotlin.Int,
    /* The X coordinate (Horizontal) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsignsignatureX")
    val iEzsignsignatureX: kotlin.Int,
    /* The Y coordinate (Vertical) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsignsignatureY")
    val iEzsignsignatureY: kotlin.Int,
    /* The step when the Ezsignsigner will be invited to sign. */
    @Json(name = "iEzsignsignatureStep")
    val iEzsignsignatureStep: kotlin.Int,
    @Json(name = "eEzsignsignatureType")
    val eEzsignsignatureType: FieldMinusEEzsignsignatureType,
    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int
)

