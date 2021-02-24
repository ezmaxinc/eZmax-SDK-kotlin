/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.31
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.apis

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusError
import eZmaxinc/eZmax-SDK-kotlin.models.GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse

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

class GlobalCustomerApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Get customer endpoint
    * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
    * @param pksCustomerCode The customer code assigned to your account 
    * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
    * @return GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun globalCustomerGetEndpointV1(pksCustomerCode: kotlin.String, sInfrastructureproductCode: kotlin.String?) : GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse {
        val localVariableConfig = globalCustomerGetEndpointV1RequestConfig(pksCustomerCode = pksCustomerCode, sInfrastructureproductCode = sInfrastructureproductCode)

        val localVarResponse = request<GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse
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
    * To obtain the request config of the operation globalCustomerGetEndpointV1
    *
    * @param pksCustomerCode The customer code assigned to your account 
    * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
    * @return RequestConfig
    */
    fun globalCustomerGetEndpointV1RequestConfig(pksCustomerCode: kotlin.String, sInfrastructureproductCode: kotlin.String?) : RequestConfig {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (sInfrastructureproductCode != null) {
                    put("sInfrastructureproductCode", listOf(sInfrastructureproductCode.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.GET,
            path = "/1/customer/{pksCustomerCode}/endpoint".replace("{"+"pksCustomerCode"+"}", "$pksCustomerCode"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
