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
package org.openapitools.client.models


import com.google.gson.annotations.SerializedName
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
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("petId")
    val petId: Long? = null,
    @SerializedName("quantity")
    val quantity: Int? = null,
    @SerializedName("shipDate")
    val shipDate: java.time.LocalDateTime? = null,
    /* Order Status */
    @SerializedName("status")
    val status: Order.Status? = null,
    @SerializedName("complete")
    val complete: Boolean? = null
) 


{
    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    
    enum class Status(val value: String){
        @SerializedName(value="placed")  placed("placed"),
        @SerializedName(value="approved")  approved("approved"),
        @SerializedName(value="delivered")  delivered("delivered");
    }
}

