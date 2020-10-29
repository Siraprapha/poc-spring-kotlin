package com.example.poc.spring.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class PocSpringKotlinApplication

fun main(args: Array<String>) {
	runApplication<PocSpringKotlinApplication>(*args)
}
