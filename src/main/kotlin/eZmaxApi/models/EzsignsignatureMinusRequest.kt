/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.39
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
 * An Ezsignsignature Object
 * @param fkiEzsignfoldersignerassociationID A reference to a valid Ezsignfoldersignerassociation.  That value is returned after a successful Ezsignfoldersignerassociation Creation. 
 * @param iEzsignpagePagenumber The page number in the document where to apply the signature
 * @param iEzsignsignatureX The X coordinate (Horizontal) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignsignatureY The Y coordinate (Vertical) where to put the signature block on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the signature block 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignsignatureStep The step when the Ezsignsigner will be invited to sign.  For example, if you say iEzsignsignatureStep=2, that block of signature will be available for signature only after ALL the signatures in step 1 are completed.
 * @param eEzsignsignatureType The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature.
 * @param fkiEzsigndocumentID A reference to a valid Ezsigndocument.  That value is returned after a successful Ezsigndocumentation Creation.
 */

data class EzsignsignatureMinusRequest (
    /* A reference to a valid Ezsignfoldersignerassociation.  That value is returned after a successful Ezsignfoldersignerassociation Creation.  */
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
    /* The step when the Ezsignsigner will be invited to sign.  For example, if you say iEzsignsignatureStep=2, that block of signature will be available for signature only after ALL the signatures in step 1 are completed. */
    @Json(name = "iEzsignsignatureStep")
    val iEzsignsignatureStep: kotlin.Int,
    /* The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature. */
    @Json(name = "eEzsignsignatureType")
    val eEzsignsignatureType: EzsignsignatureMinusRequest.EEzsignsignatureType,
    /* A reference to a valid Ezsigndocument.  That value is returned after a successful Ezsigndocumentation Creation. */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int
) {

    /**
     * The type of signature required.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature.
     * Values: Acknowledgement,Handwritten,Initials,Name
     */
    enum class EEzsignsignatureType(val value: kotlin.String) {
        @Json(name = "Acknowledgement") Acknowledgement("Acknowledgement"),
        @Json(name = "Handwritten") Handwritten("Handwritten"),
        @Json(name = "Initials") Initials("Initials"),
        @Json(name = "Name") Name("Name");
    }
}

