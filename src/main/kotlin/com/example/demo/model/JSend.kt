package com.example.demo.model

data class JSendResponse(
    val status: String,
    val data: Map<String, Any>? = null,
)
