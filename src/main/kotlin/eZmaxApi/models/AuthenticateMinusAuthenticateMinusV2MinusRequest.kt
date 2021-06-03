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
 * Request for the /2/module/authenticate/authenticate API Request
 * @param pksCustomerCode The customer code assigned to your account
 * @param sEmailAddress The email address.
 * @param sUserLoginname The Login name of the User.
 * @param sPassword A Password.  Must meet complexity requirements
 * @param sPasswordEncrypted A Password encrypted and encoded in Base64  Must meet complexity requirements
 */

data class AuthenticateMinusAuthenticateMinusV2MinusRequest (
    /* The customer code assigned to your account */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,
    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String? = null,
    /* The Login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String? = null,
    /* A Password.  Must meet complexity requirements */
    @Json(name = "sPassword")
    val sPassword: kotlin.String? = null,
    /* A Password encrypted and encoded in Base64  Must meet complexity requirements */
    @Json(name = "sPasswordEncrypted")
    val sPasswordEncrypted: kotlin.String? = null
)

