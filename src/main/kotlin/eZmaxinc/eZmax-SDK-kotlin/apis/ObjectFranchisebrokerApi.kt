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
package eZmaxinc/eZmax-SDK-kotlin.apis

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusGetAutocompleteMinusV1MinusResponse

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

class ObjectFranchisebrokerApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Retrieve Franchisebrokers and IDs
    * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
    * @param sSelector The type of Franchisebrokers to return 
    * @param sQuery Allow to filter on the option value (optional)
    * @return CommonMinusGetAutocompleteMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun franchisebrokerGetAutocompleteV1(sSelector: kotlin.String, sQuery: kotlin.String?) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        val localVariableConfig = franchisebrokerGetAutocompleteV1RequestConfig(sSelector = sSelector, sQuery = sQuery)

        val localVarResponse = request<CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonMinusGetAutocompleteMinusV1MinusResponse
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
    * To obtain the request config of the operation franchisebrokerGetAutocompleteV1
    *
    * @param sSelector The type of Franchisebrokers to return 
    * @param sQuery Allow to filter on the option value (optional)
    * @return RequestConfig
    */
    fun franchisebrokerGetAutocompleteV1RequestConfig(sSelector: kotlin.String, sQuery: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (sQuery != null) {
                    put("sQuery", listOf(sQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/franchisebroker/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", "$sSelector"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
