/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.
*
* The version of the OpenAPI document: 1.0.30
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models

import eZmaxinc/eZmax-SDK-kotlin.models.AttemptMinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusWebhook
import eZmaxinc/eZmax-SDK-kotlin.models.UserMinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.WebhookMinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.WebhookUserUserCreatedAllOf

import com.squareup.moshi.Json

/**
 * This is the base Webhook object
 * @param objUser 
 * @param objWebhook 
 * @param aObjAttempt An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
 */

data class WebhookMinusUserMinusUserCreated (
    @Json(name = "objUser")
    val objUser: UserMinusResponse,
    @Json(name = "objWebhook")
    val objWebhook: WebhookMinusResponse,
    /* An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt. */
    @Json(name = "a_objAttempt")
    val aObjAttempt: kotlin.collections.List<AttemptMinusResponse>
)

