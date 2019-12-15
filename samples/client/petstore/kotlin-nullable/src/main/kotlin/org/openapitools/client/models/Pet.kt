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

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import com.squareup.moshi.Json
import java.io.Serializable
/**
 * A pet for sale in the pet store
 * @param id 
 * @param category 
 * @param name 
 * @param photoUrls 
 * @param tags 
 * @param status pet status in the store
 */

data class Pet (
    @Json(name = "name")
    val name: String,
    @Json(name = "photoUrls")
    val photoUrls: Array<String>,
    @Json(name = "id")
    val id: Long? = null,
    @Json(name = "category")
    val category: Category? = null,
    @Json(name = "tags")
    val tags: Array<Tag>? = null,
    /* pet status in the store */
    @Json(name = "status")
    val status: Pet.Status? = null
) 
: Serializable 

{
	companion object {
		private const val serialVersionUID: Long = 123
	}
    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    
    enum class Status(val value: String){
        @Json(name = "available") available("available"),
        @Json(name = "pending") pending("pending"),
        @Json(name = "sold") sold("sold");
    }
}

