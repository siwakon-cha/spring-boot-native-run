package com.example.demonative

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoNativeApplication

fun main(args: Array<String>) {
	runApplication<DemoNativeApplication>(*args)
}
