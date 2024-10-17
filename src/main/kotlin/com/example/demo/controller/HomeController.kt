package com.example.demo.controller

import com.example.demo.model.Model
import jakarta.websocket.server.PathParam
import org.springframework.boot.Banner.Mode
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")

class HomeController {

    @GetMapping("/{id}")
    fun home(@PathVariable("id") id: Int) : String {
        return "Values: $id"
    }

@GetMapping()
    fun homeTwo(@PathParam("id") id: Int) : String {
        return "Values: $id"
    }

    @GetMapping("/model")
    fun homeThree(@RequestBody model:Model ): String {
        return "Values: ${model.id} ${model.name} ${model.age}"
    }
}
