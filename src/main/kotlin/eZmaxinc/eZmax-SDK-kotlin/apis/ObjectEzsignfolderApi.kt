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
package eZmaxinc/eZmax-SDK-kotlin.apis

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusError
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusEditObjectMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusEditObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusGetObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusSendMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusSendMinusV1MinusResponse

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

class ObjectEzsignfolderApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Ezsignfolder
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignfolderMinusCreateObjectMinusV1MinusRequest  
    * @return EzsignfolderMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderCreateObjectV1(ezsignfolderMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest>) : EzsignfolderMinusCreateObjectMinusV1MinusResponse {
        val localVariableBody: kotlin.Any? = ezsignfolderMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/1/object/ezsignfolder",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EzsignfolderMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusCreateObjectMinusV1MinusResponse
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
    * Delete an existing Ezsignfolder
    * 
    * @param pkiEzsignfolderID The unique ID of the Ezsignfolder 
    * @return EzsignfolderMinusDeleteObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderDeleteObjectV1(pkiEzsignfolderID: kotlin.Int) : EzsignfolderMinusDeleteObjectMinusV1MinusResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/1/object/ezsignfolder/{pkiEzsignfolderID}".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EzsignfolderMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusDeleteObjectMinusV1MinusResponse
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
    * Modify an existing Ezsignfolder
    * 
    * @param pkiEzsignfolderID The unique ID of the Ezsignfolder 
    * @param ezsignfolderMinusEditObjectMinusV1MinusRequest  
    * @return EzsignfolderMinusEditObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderEditObjectV1(pkiEzsignfolderID: kotlin.Int, ezsignfolderMinusEditObjectMinusV1MinusRequest: EzsignfolderMinusEditObjectMinusV1MinusRequest) : EzsignfolderMinusEditObjectMinusV1MinusResponse {
        val localVariableBody: kotlin.Any? = ezsignfolderMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/1/object/ezsignfolder/{pkiEzsignfolderID}".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EzsignfolderMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusEditObjectMinusV1MinusResponse
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
    * Retrieve an existing Ezsignfolder&#39;s children IDs
    * 
    * @param pkiEzsignfolderID The unique ID of the Ezsignfolder 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetObjectGetChildrenV1(pkiEzsignfolderID: kotlin.Int) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
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
    * Retrieve an existing Ezsignfolder
    * 
    * @param pkiEzsignfolderID The unique ID of the Ezsignfolder 
    * @return EzsignfolderMinusGetObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetObjectV1(pkiEzsignfolderID: kotlin.Int) : EzsignfolderMinusGetObjectMinusV1MinusResponse {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/1/object/ezsignfolder/{pkiEzsignfolderID}".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EzsignfolderMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusGetObjectMinusV1MinusResponse
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
    * Send the Ezsignfolder to the signatories for signature
    * 
    * @param pkiEzsignfolderID The unique ID of the Ezsignfolder 
    * @param ezsignfolderMinusSendMinusV1MinusRequest  
    * @return EzsignfolderMinusSendMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderSendV1(pkiEzsignfolderID: kotlin.Int, ezsignfolderMinusSendMinusV1MinusRequest: EzsignfolderMinusSendMinusV1MinusRequest) : EzsignfolderMinusSendMinusV1MinusResponse {
        val localVariableBody: kotlin.Any? = ezsignfolderMinusSendMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/1/object/ezsignfolder/{pkiEzsignfolderID}/send".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<EzsignfolderMinusSendMinusV1MinusResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusSendMinusV1MinusResponse
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

}