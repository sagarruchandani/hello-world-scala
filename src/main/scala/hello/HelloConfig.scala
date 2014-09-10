package hello

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import scalaj.http.Http
/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {

	@RequestMapping(value=Array("/"))
	def controller() :String = {
	return "Hello World"
	}
    		
//Greeting greeting() {
        //return new Greeting();
    	//}

//	println("Hello World")
//Http("http://localhost:8080").param("hello", "Hello World").asString


}
