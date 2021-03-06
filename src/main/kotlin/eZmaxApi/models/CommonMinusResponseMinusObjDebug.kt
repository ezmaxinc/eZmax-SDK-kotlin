/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.46
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models

import eZmaxApi.models.CommonMinusResponseMinusObjSQLQuery

import com.squareup.moshi.Json

/**
 * This is a generic debug object that is returned by all API requests
 * @param sMemoryUsage The peak memory allocated during the API request execution. Formatted as a human readable string
 * @param sRunTime The total server execution time of the API request execution. Formatted as a human readable string
 * @param iSQLSelects The number of SQL SELECT queries that were sent to the database server during the API request execution
 * @param iSQLQueries The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution
 * @param aObjSQLQuery An array of the SQL Queries that were executed during the API request execution
 */

data class CommonMinusResponseMinusObjDebug (
    /* The peak memory allocated during the API request execution. Formatted as a human readable string */
    @Json(name = "sMemoryUsage")
    val sMemoryUsage: kotlin.String,
    /* The total server execution time of the API request execution. Formatted as a human readable string */
    @Json(name = "sRunTime")
    val sRunTime: kotlin.String,
    /* The number of SQL SELECT queries that were sent to the database server during the API request execution */
    @Json(name = "iSQLSelects")
    val iSQLSelects: kotlin.Int,
    /* The number of SQL INSERT/UPDATE/DELETE queries that were sent to the database server during the API request execution */
    @Json(name = "iSQLQueries")
    val iSQLQueries: kotlin.Int,
    /* An array of the SQL Queries that were executed during the API request execution */
    @Json(name = "a_objSQLQuery")
    val aObjSQLQuery: kotlin.collections.List<CommonMinusResponseMinusObjSQLQuery>
)

