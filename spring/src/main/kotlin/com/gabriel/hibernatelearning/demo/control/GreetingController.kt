package com.gabriel.hibernatelearning.demo.control

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("greeting")
    fun greeting() = "Hello World!"
}