/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


import java.io.Serializable
/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
data class Order (
    val id: Long? = null,
    val petId: Long? = null,
    val quantity: Int? = null,
    val shipDate: java.time.LocalDateTime? = null,
    /* Order Status */
    val status: Order.Status? = null,
    val complete: Boolean? = null
) : Serializable 
{
	companion object {
		private const val serialVersionUID: Long = 123
	}
    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    enum class Status(val value: String){
        placed("placed"),
        approved("approved"),
        delivered("delivered");
    }
}

