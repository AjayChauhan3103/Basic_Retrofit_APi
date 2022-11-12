package com.example.basic_retrofit_api

data class Todo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)