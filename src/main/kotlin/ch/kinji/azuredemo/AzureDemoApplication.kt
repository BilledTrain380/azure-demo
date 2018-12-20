package ch.kinji.azuredemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class AzureDemoApplication

fun main(args: Array<String>) {
	runApplication<AzureDemoApplication>(*args)
}

@Controller
class MainController {

	@GetMapping("", "/")
	fun index() = "index"
}