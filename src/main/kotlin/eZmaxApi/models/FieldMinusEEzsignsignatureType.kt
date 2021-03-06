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
* The type of signature.  1. **Acknowledgement** is for an acknowledgment of receipt. 2. **City** is to request the city where the document is signed. 2. **Handwritten** is for a handwritten kind of signature where users needs to \"draw\" their signature on screen. 3. **Initials** is a simple \"click to add initials\" block. 4. **Name** is a simple \"Click to sign\" block. This is the most common block of signature.
* Values: Acknowledgement,City,Handwritten,Initials,Name
*/

enum class FieldMinusEEzsignsignatureType(val value: kotlin.String) {


    @Json(name = "Acknowledgement")
    Acknowledgement("Acknowledgement"),

    @Json(name = "City")
    City("City"),

    @Json(name = "Handwritten")
    Handwritten("Handwritten"),

    @Json(name = "Initials")
    Initials("Initials"),

    @Json(name = "Name")
    Name("Name");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

