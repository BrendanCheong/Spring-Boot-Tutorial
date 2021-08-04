package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
/* RestController means that we allow this java file to have Rest API endpoints
 * GetMapping means that this function is a GET API endpoint
 * Remember to start the server after every change
 */
@RestController
public class SpringTutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringTutorialApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}

}
