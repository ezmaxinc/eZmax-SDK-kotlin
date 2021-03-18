/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.37
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.apis

import eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusCreateObjectMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusCreateObjectMinusV1MinusResponse

import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ApiClient
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ClientException
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ClientError
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ServerException
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ServerError
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.MultiValueMap
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.RequestConfig
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.RequestMethod
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ResponseType
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.Success
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.toMultiValue

class ObjectApikeyApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Apikey
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param apikeyMinusCreateObjectMinusV1MinusRequest  
    * @return ApikeyMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyCreateObjectV1(apikeyMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>) : ApikeyMinusCreateObjectMinusV1MinusResponse {
        val localVariableConfig = apikeyCreateObjectV1RequestConfig(apikeyMinusCreateObjectMinusV1MinusRequest = apikeyMinusCreateObjectMinusV1MinusRequest)

        val localVarResponse = request<ApikeyMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyMinusCreateObjectMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation apikeyCreateObjectV1
    *
    * @param apikeyMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun apikeyCreateObjectV1RequestConfig(apikeyMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>) : RequestConfig {
        val localVariableBody: kotlin.Any? = apikeyMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/apikey",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
