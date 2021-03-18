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

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusError
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusCreateObjectMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusDeleteObjectMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse
import eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsigndocumentApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Apply an Ezsign Template to the Ezsigndocument.
    * This endpoint applies a predefined template to the ezsign document. This allows to automatically apply all the form and signature fields on a document in a single step.  The document must not already have fields otherwise an error will be returned.
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @param ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest  
    * @return EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentApplyEzsigntemplateV1(pkiEzsigndocumentID: kotlin.Int, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest: EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest) : EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse {
        val localVariableConfig = ezsigndocumentApplyEzsigntemplateV1RequestConfig(pkiEzsigndocumentID = pkiEzsigndocumentID, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest = ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest)

        val localVarResponse = request<EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsigndocumentApplyEzsigntemplateV1
    *
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @param ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsigndocumentApplyEzsigntemplateV1RequestConfig(pkiEzsigndocumentID: kotlin.Int, ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest: EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ezsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate".replace("{"+"pkiEzsigndocumentID"+"}", "$pkiEzsigndocumentID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Create a new Ezsigndocument
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsigndocumentMinusCreateObjectMinusV1MinusRequest  
    * @return EzsigndocumentMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentCreateObjectV1(ezsigndocumentMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsigndocumentMinusCreateObjectMinusV1MinusRequest>) : EzsigndocumentMinusCreateObjectMinusV1MinusResponse {
        val localVariableConfig = ezsigndocumentCreateObjectV1RequestConfig(ezsigndocumentMinusCreateObjectMinusV1MinusRequest = ezsigndocumentMinusCreateObjectMinusV1MinusRequest)

        val localVarResponse = request<EzsigndocumentMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndocumentMinusCreateObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsigndocumentCreateObjectV1
    *
    * @param ezsigndocumentMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsigndocumentCreateObjectV1RequestConfig(ezsigndocumentMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsigndocumentMinusCreateObjectMinusV1MinusRequest>) : RequestConfig {
        val localVariableBody: kotlin.Any? = ezsigndocumentMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigndocument",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Delete an existing Ezsigndocument
    * 
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return EzsigndocumentMinusDeleteObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentDeleteObjectV1(pkiEzsigndocumentID: kotlin.Int) : EzsigndocumentMinusDeleteObjectMinusV1MinusResponse {
        val localVariableConfig = ezsigndocumentDeleteObjectV1RequestConfig(pkiEzsigndocumentID = pkiEzsigndocumentID)

        val localVarResponse = request<EzsigndocumentMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndocumentMinusDeleteObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsigndocumentDeleteObjectV1
    *
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return RequestConfig
    */
    fun ezsigndocumentDeleteObjectV1RequestConfig(pkiEzsigndocumentID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replace("{"+"pkiEzsigndocumentID"+"}", "$pkiEzsigndocumentID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Retrieve an existing Ezsigndocument&#39;s children IDs
    * 
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentGetChildrenV1(pkiEzsigndocumentID: kotlin.Int) : Unit {
        val localVariableConfig = ezsigndocumentGetChildrenV1RequestConfig(pkiEzsigndocumentID = pkiEzsigndocumentID)

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
    * To obtain the request config of the operation ezsigndocumentGetChildrenV1
    *
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return RequestConfig
    */
    fun ezsigndocumentGetChildrenV1RequestConfig(pkiEzsigndocumentID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren".replace("{"+"pkiEzsigndocumentID"+"}", "$pkiEzsigndocumentID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Retrieve a URL to download documents.
    * This endpoint returns URLs to different files that can be downloaded during the signing process.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @param eDocumentType The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  
    * @return EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentGetDownloadUrlV1(pkiEzsigndocumentID: kotlin.Int, eDocumentType: kotlin.String) : EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse {
        val localVariableConfig = ezsigndocumentGetDownloadUrlV1RequestConfig(pkiEzsigndocumentID = pkiEzsigndocumentID, eDocumentType = eDocumentType)

        val localVarResponse = request<EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsigndocumentGetDownloadUrlV1
    *
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @param eDocumentType The type of document to retrieve.  1. **Initial** Is the initial document before any signature were applied. 2. **Signed** Is the final document once all signatures were applied. 3. **Proofdocument** Is the evidence report. 4. **Proof** Is the complete evidence archive including all of the above and more.  
    * @return RequestConfig
    */
    fun ezsigndocumentGetDownloadUrlV1RequestConfig(pkiEzsigndocumentID: kotlin.Int, eDocumentType: kotlin.String) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType}".replace("{"+"pkiEzsigndocumentID"+"}", "$pkiEzsigndocumentID").replace("{"+"eDocumentType"+"}", "$eDocumentType"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Retrieve an existing Ezsigndocument
    * 
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return EzsigndocumentMinusGetObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndocumentGetObjectV1(pkiEzsigndocumentID: kotlin.Int) : EzsigndocumentMinusGetObjectMinusV1MinusResponse {
        val localVariableConfig = ezsigndocumentGetObjectV1RequestConfig(pkiEzsigndocumentID = pkiEzsigndocumentID)

        val localVarResponse = request<EzsigndocumentMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndocumentMinusGetObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsigndocumentGetObjectV1
    *
    * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument 
    * @return RequestConfig
    */
    fun ezsigndocumentGetObjectV1RequestConfig(pkiEzsigndocumentID: kotlin.Int) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigndocument/{pkiEzsigndocumentID}".replace("{"+"pkiEzsigndocumentID"+"}", "$pkiEzsigndocumentID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
