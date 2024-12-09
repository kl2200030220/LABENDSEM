package com.klef.jfsd.exam;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.klef.jfsd.exam") // Automatically scan beans in this package
public class AppConfig {

    // Bean for Instructor
    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(201);
        instructor.setName("Jane Smith");
        instructor.setEmail("jane.smith@example.com");
        instructor.setPhoneNumber("9876543210");
        return instructor;
    }

    // Bean for Course (constructor injection for Instructor)
    @Bean
    public Course course() {
        return new Course(301, "Spring Framework", 4, instructor());
    }

    // Bean for Employee
    @Bean
    public Employee employee() {
        return new Employee(101, "John Doe", 75000.0, "IT", List.of("Java", "Spring", "Hibernate"));
    }
}
