package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PointsApplication

fun main(args: Array<String>) {
	runApplication<PointsApplication>(*args)
}
