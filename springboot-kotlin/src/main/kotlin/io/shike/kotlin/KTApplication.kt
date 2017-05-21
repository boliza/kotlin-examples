package io.shike.kotlin

/**
 * @author Ranger Tsao(https://github.com/boliza)
 */
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KTApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KTApplication::class.java, *args)
        }
    }
}
