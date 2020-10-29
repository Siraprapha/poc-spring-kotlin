package com.example.poc.spring.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/hello")
    fun sayHello(): String {
        return "hello world"
    }

    @GetMapping("/hello", params = ["name", "isActive"])
    fun sayHelloUser(@RequestParam name: String, @RequestParam isActive: Boolean): Greeting {
        return Greeting(name, isActive)
    }

    @GetMapping("/hello", params = ["username"])
    fun sayHelloUser2(@RequestParam username: String) = "Hello " + username

}

data class Greeting(val name: String, val isActive: Boolean)
