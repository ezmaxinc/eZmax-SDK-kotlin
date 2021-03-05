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
* Frequency at which reminders will be sent to signers that haven't signed the documents
* Values: None,Daily,Weekly
*/

enum class FieldMinusEEzsignfolderSendreminderfrequency(val value: kotlin.String){


    @Json(name = "None")
    None("None"),


    @Json(name = "Daily")
    Daily("Daily"),


    @Json(name = "Weekly")
    Weekly("Weekly");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

