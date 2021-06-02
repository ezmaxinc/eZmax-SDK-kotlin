/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.45
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.apis

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsignfoldersignerassociationApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxApi.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Ezsignfoldersignerassociation
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest  
    * @return EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>) : EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfoldersignerassociationCreateObjectV1RequestConfig(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest = ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest)

        val localVarResponse = request<kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>, EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfoldersignerassociationCreateObjectV1
    *
    * @param ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationCreateObjectV1RequestConfig(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfoldersignerassociation",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfoldersignerassociationDeleteObjectV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        val localVarResponse = request<Unit, EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfoldersignerassociationDeleteObjectV1
    *
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationDeleteObjectV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfoldersignerassociation&#39;s children IDs
    * 
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationGetChildrenV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : Unit {
        val localVariableConfig = ezsignfoldersignerassociationGetChildrenV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        val localVarResponse = request<Unit, Unit>(
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
    * To obtain the request config of the operation ezsignfoldersignerassociationGetChildrenV1
    *
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationGetChildrenV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve a Login Url to allow In-Person signing
    * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse {
        val localVariableConfig = ezsignfoldersignerassociationGetInPersonLoginUrlV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        val localVarResponse = request<Unit, EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfoldersignerassociationGetInPersonLoginUrlV1
    *
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationGetInPersonLoginUrlV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfoldersignerassociationGetObjectV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        val localVarResponse = request<Unit, EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfoldersignerassociationGetObjectV1
    *
    * @param pkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation 
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationGetObjectV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
