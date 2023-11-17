package com.acme.carpooling

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarpoolingApplication

fun main(args: Array<String>) {
	runApplication<CarpoolingApplication>(*args)
}
