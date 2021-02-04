/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
*
* The version of the OpenAPI document: 1.0.28
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models


import com.squareup.moshi.Json

/**
 * A webhook object
 * @param pkiWebhookID The Webhook ID. This value is visible in the admin interface.
 * @param eWebhookModule The Module generating the Event.
 * @param pksCustomerCode The Customer Code in which the event was generated
 * @param sWebhookUrl The url being called
 * @param sWebhookEmailfailed The email that will receive the webhook in case all attempts fail.
 * @param eWebhookEzsignevent This Ezsign Event. This property will be set only if the Module is \"Ezsign\".
 * @param eWebhookManagementevent This Management Event. This property will be set only if the Module is \"Management\".
 */

data class WebhookMinusResponse (
    /* The Webhook ID. This value is visible in the admin interface. */
    @Json(name = "pkiWebhookID")
    val pkiWebhookID: kotlin.Int,
    /* The Module generating the Event. */
    @Json(name = "eWebhookModule")
    val eWebhookModule: WebhookMinusResponse.EWebhookModule,
    /* The Customer Code in which the event was generated */
    @Json(name = "pksCustomerCode")
    val pksCustomerCode: kotlin.String,
    /* The url being called */
    @Json(name = "sWebhookUrl")
    val sWebhookUrl: kotlin.String,
    /* The email that will receive the webhook in case all attempts fail. */
    @Json(name = "sWebhookEmailfailed")
    val sWebhookEmailfailed: kotlin.String,
    /* This Ezsign Event. This property will be set only if the Module is \"Ezsign\". */
    @Json(name = "eWebhookEzsignevent")
    val eWebhookEzsignevent: WebhookMinusResponse.EWebhookEzsignevent? = null,
    /* This Management Event. This property will be set only if the Module is \"Management\". */
    @Json(name = "eWebhookManagementevent")
    val eWebhookManagementevent: WebhookMinusResponse.EWebhookManagementevent? = null
) {

    /**
    * The Module generating the Event.
    * Values: Ezsign,Management
    */
    
    enum class EWebhookModule(val value: kotlin.String){
        @Json(name = "Ezsign") Ezsign("Ezsign"),
        @Json(name = "Management") Management("Management");
    }
    /**
    * This Ezsign Event. This property will be set only if the Module is \"Ezsign\".
    * Values: DocumentCompleted,FolderCompleted
    */
    
    enum class EWebhookEzsignevent(val value: kotlin.String){
        @Json(name = "DocumentCompleted") DocumentCompleted("DocumentCompleted"),
        @Json(name = "FolderCompleted") FolderCompleted("FolderCompleted");
    }
    /**
    * This Management Event. This property will be set only if the Module is \"Management\".
    * Values: UserCreated
    */
    
    enum class EWebhookManagementevent(val value: kotlin.String){
        @Json(name = "UserCreated") UserCreated("UserCreated");
    }
}
