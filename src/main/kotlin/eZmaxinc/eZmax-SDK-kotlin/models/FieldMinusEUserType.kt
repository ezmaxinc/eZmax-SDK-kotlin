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
* The user type of the User.
* Values: AgentBroker,Assistant,Attendance,Customer,Employee,Ezcom,EzsignSigner,EzsignUser,FranchiseCustomerServer,Normal,RewardAdministration,RewardMember,RewardRepresentative,RewardCustomer,RewardDistributorServer,Supplier,VetrxCustomer,Vetrxcustomergroup,VetrxCustomerServer,VetrxManufacturer,VetrxVendor
*/

enum class FieldMinusEUserType(val value: kotlin.String){


    @Json(name = "AgentBroker")
    AgentBroker("AgentBroker"),


    @Json(name = "Assistant")
    Assistant("Assistant"),


    @Json(name = "Attendance")
    Attendance("Attendance"),


    @Json(name = "Customer")
    Customer("Customer"),


    @Json(name = "Employee")
    Employee("Employee"),


    @Json(name = "Ezcom")
    Ezcom("Ezcom"),


    @Json(name = "EzsignSigner")
    EzsignSigner("EzsignSigner"),


    @Json(name = "EzsignUser")
    EzsignUser("EzsignUser"),


    @Json(name = "FranchiseCustomerServer")
    FranchiseCustomerServer("FranchiseCustomerServer"),


    @Json(name = "Normal")
    Normal("Normal"),


    @Json(name = "RewardAdministration")
    RewardAdministration("RewardAdministration"),


    @Json(name = "RewardMember")
    RewardMember("RewardMember"),


    @Json(name = "RewardRepresentative")
    RewardRepresentative("RewardRepresentative"),


    @Json(name = "RewardCustomer")
    RewardCustomer("RewardCustomer"),


    @Json(name = "RewardDistributorServer")
    RewardDistributorServer("RewardDistributorServer"),


    @Json(name = "Supplier")
    Supplier("Supplier"),


    @Json(name = "VetrxCustomer")
    VetrxCustomer("VetrxCustomer"),


    @Json(name = "Vetrxcustomergroup")
    Vetrxcustomergroup("Vetrxcustomergroup"),


    @Json(name = "VetrxCustomerServer")
    VetrxCustomerServer("VetrxCustomerServer"),


    @Json(name = "VetrxManufacturer")
    VetrxManufacturer("VetrxManufacturer"),


    @Json(name = "VetrxVendor")
    VetrxVendor("VetrxVendor");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}
