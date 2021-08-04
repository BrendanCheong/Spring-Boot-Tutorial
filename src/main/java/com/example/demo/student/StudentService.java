package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
/* Here is where the Business Logic and Algorithms lie for the Service Layer
 * We have @Component/@Service to package this Student Class Component so that our Controller can use it
 * Service and Component is the same thing, but different name
 * This file is now packaged as a "Bean"
 */

@Service
public class StudentService {

    // this particular function is for @GET request
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1,
                        "Johny Doe",
                        "JohnDoe@gmail.com",
                        LocalDate.of(1999, Month.JULY, 5),
                        22
                )
        );
    }
}
