package com.example.basic_retrofit_api

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos() :   Response<List<Todo>>


}