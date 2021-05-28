package com.nibali.demokotlin.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class FirstController {

    @GetMapping
    fun get(): ResponseEntity<String> {
        return ResponseEntity.ok("Its Ok")
    }

    @GetMapping(value = ["/www"])
    fun getTwo(): ResponseEntity<String> {
        return ResponseEntity.ok("Its Ok")
    }
}