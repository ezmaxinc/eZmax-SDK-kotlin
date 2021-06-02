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
package eZmaxApi.models


import com.squareup.moshi.Json

/**
* The user type of the User.
* Values: AgentBroker,Assistant,Attendance,Customer,Employee,Ezcom,EzsignSigner,EzsignUser,FranchiseCustomerServer,Normal,RewardAdministration,RewardMember,RewardRepresentative,RewardCustomer,RewardDistributorServer,Supplier,VetrxCustomer,Vetrxcustomergroup,VetrxCustomerServer,VetrxManufacturer,VetrxVendor
*/

enum class FieldMinusEUserType(val value: kotlin.String) {


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

