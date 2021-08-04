package com.example.demo;

import com.example.demo.student.Student; // we import the library from the package we made, .Student is the Student class from that packaged file
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
/* RestController means that we allow this java file to have Rest API endpoints
 * GetMapping means that this function is a GET API endpoint
 * However, in order to implement the MVC model ,we will make our own controller in the student package
 * which will have its own custom url endpoint and RestController
 * Remember to start the server after every change
 */
@RestController
public class SpringTutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringTutorialApplication.class, args);
	}
	@GetMapping
	public String getUrl() {
		return "Welcome to my SpringBoot Application! Head over to the deployed API at ";
	}

}
