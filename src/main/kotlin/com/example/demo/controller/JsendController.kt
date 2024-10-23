    package com.example.demo.controller

import com.example.demo.model.JSendResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/jsend")
class JsendController {
    @GetMapping
    fun getJSendSuccess(): JSendResponse{

        val data = mapOf(
            "id" to 1,
            "name" to "Nombre del usuario",
        )

        return JSendResponse(
            status = "success",
            data = data
        )
    }
}