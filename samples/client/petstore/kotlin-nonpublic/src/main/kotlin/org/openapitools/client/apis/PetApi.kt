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
package org.openapitools.client.apis

import org.openapitools.client.models.ApiResponse
import org.openapitools.client.models.Pet

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

internal class PetApi(basePath: kotlin.String = "http://petstore.swagger.io/v2") : ApiClient(basePath) {

    /**
    * Add a new pet to the store
    * 
    * @param body Pet object that needs to be added to the store 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun addPet(body: Pet) : Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/pet",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Deletes a pet
    * 
    * @param petId Pet id to delete 
    * @param apiKey  (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deletePet(petId: Long, apiKey: String?) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("api_key" to apiKey.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Finds Pets by status
    * Multiple status values can be provided with comma separated strings
    * @param status Status values that need to be considered for filter 
    * @return Array<Pet>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun findPetsByStatus(status: Array<String>) : Array<Pet> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("status", toMultiValue(status.toList(), "csv"))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/pet/findByStatus",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Array<Pet>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Array<Pet>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Finds Pets by tags
    * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
    * @param tags Tags to filter by 
    * @return Array<Pet>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun findPetsByTags(tags: Array<String>) : Array<Pet> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("tags", toMultiValue(tags.toList(), "csv"))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/pet/findByTags",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Array<Pet>>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Array<Pet>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Find pet by ID
    * Returns a single pet
    * @param petId ID of pet to return 
    * @return Pet
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPetById(petId: Long) : Pet {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Pet>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Pet
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Update an existing pet
    * 
    * @param body Pet object that needs to be added to the store 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePet(body: Pet) : Unit {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/pet",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Updates a pet in the store with form data
    * 
    * @param petId ID of pet that needs to be updated 
    * @param name Updated name of the pet (optional)
    * @param status Updated status of the pet (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePetWithForm(petId: Long, name: String?, status: String?) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("name" to "$name", "status" to "$status")
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * uploads an image
    * 
    * @param petId ID of pet to update 
    * @param additionalMetadata Additional data to pass to server (optional)
    * @param file file to upload (optional)
    * @return ApiResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadFile(petId: Long, additionalMetadata: String?, file: java.io.File?) : ApiResponse {
        val localVariableBody: kotlin.Any? = mapOf("additionalMetadata" to "$additionalMetadata", "file" to "$file")
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/pet/{petId}/uploadImage".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<ApiResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

}
