package vottega.shorthand_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShorthandServiceApplication

fun main(args: Array<String>) {
	runApplication<ShorthandServiceApplication>(*args)
}
