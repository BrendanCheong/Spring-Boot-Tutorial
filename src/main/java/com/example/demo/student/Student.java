package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

/* Now to Map the Student Class to the database Entity using @Entity
 * and use an SQL table using @Table
 * This all uses Hibernate's ORM API to communicate with postgresql
 * Add @Id, @SequenceGenerator, @GeneratedValue to map "student" class to an SQL database sequence
 * @Id specifies the primary key of an entity, which means that Id is unique
 * @SequenceGenerator is to generate a primary key in sequence, allocationSize means that we increment PK id by 1, so its 1,2,3,4...
 * @GeneratedValue is applied to the PK with Id as an attribute, the strategy is SEQUENCE, where we go from Id = 1,2,3 ..., generator = name of sequence to use
 */

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Integer id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    // Constructor for the student class default
    public Student() {

    }

    //Constructor for student class everything
    public Student(Integer id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    //Constructor for student class no id, because database already auto gives id
    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    //Getters and Setters below since attributes are private

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
