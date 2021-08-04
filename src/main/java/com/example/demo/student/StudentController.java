package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/* This is our student Controller which will decide on the REST API endpoints\
 * Below is the api endpoint url
 * The Controller is where all the API endpoints are
 * The Service Layer is where we execute all the business logic
 */

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;
    /*
     * Instead of writing
     * this.studentService = new StudentService();
     * We want to automatically construct the StudentService object using @Autowired
     * which will take the @Component/@Service from StudentService
     */
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Let's output a list of Students from our GET endpoint
    // Our List now contains an Object -> which turns into a list of JSON
    @GetMapping
    public List<Student> getStudentsRequest() {
        return studentService.getStudents();
    }
}
