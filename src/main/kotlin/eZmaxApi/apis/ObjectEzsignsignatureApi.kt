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
package eZmaxApi.apis

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV1MinusResponse

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ClientException
import eZmaxApi.infrastructure.ClientError
import eZmaxApi.infrastructure.ServerException
import eZmaxApi.infrastructure.ServerError
import eZmaxApi.infrastructure.MultiValueMap
import eZmaxApi.infrastructure.RequestConfig
import eZmaxApi.infrastructure.RequestMethod
import eZmaxApi.infrastructure.ResponseType
import eZmaxApi.infrastructure.Success
import eZmaxApi.infrastructure.toMultiValue

class ObjectEzsignsignatureApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxApi.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Ezsignsignature
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignsignatureMinusCreateObjectMinusV1MinusRequest  
    * @return EzsignsignatureMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureCreateObjectV1(ezsignsignatureMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>) : EzsignsignatureMinusCreateObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignsignatureCreateObjectV1RequestConfig(ezsignsignatureMinusCreateObjectMinusV1MinusRequest = ezsignsignatureMinusCreateObjectMinusV1MinusRequest)

        val localVarResponse = request<EzsignsignatureMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusCreateObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignsignatureCreateObjectV1
    *
    * @param ezsignsignatureMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsignsignatureCreateObjectV1RequestConfig(ezsignsignatureMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>) : RequestConfig {
        val localVariableBody: kotlin.Any? = ezsignsignatureMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignsignature",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Delete an existing Ezsignsignature
    * 
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID: kotlin.Int) : EzsignsignatureMinusDeleteObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignsignatureDeleteObjectV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        val localVarResponse = request<EzsignsignatureMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignsignatureDeleteObjectV1
    *
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return RequestConfig
    */
    fun ezsignsignatureDeleteObjectV1RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", "$pkiEzsignsignatureID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Retrieve an existing Ezsignsignature&#39;s children IDs
    * 
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureGetChildrenV1(pkiEzsignsignatureID: kotlin.Int) : Unit {
        val localVariableConfig = ezsignsignatureGetChildrenV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        val localVarResponse = request<Any?>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * To obtain the request config of the operation ezsignsignatureGetChildrenV1
    *
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return RequestConfig
    */
    fun ezsignsignatureGetChildrenV1RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren".replace("{"+"pkiEzsignsignatureID"+"}", "$pkiEzsignsignatureID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Retrieve an existing Ezsignsignature
    * 
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return EzsignsignatureMinusGetObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureGetObjectV1(pkiEzsignsignatureID: kotlin.Int) : EzsignsignatureMinusGetObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignsignatureGetObjectV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        val localVarResponse = request<EzsignsignatureMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusGetObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignsignatureGetObjectV1
    *
    * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature 
    * @return RequestConfig
    */
    fun ezsignsignatureGetObjectV1RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", "$pkiEzsignsignatureID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
