package com.klef.jfsd.exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {

    public static void main(String[] args) {
        // Load the Spring context from the Java configuration class
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            // Fetching beans from the container
            Course course = context.getBean(Course.class);
            Employee employee = context.getBean(Employee.class);

            // Demonstrating the bean functionality
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Instructor Name: " + course.getInstructor().getName());
            System.out.println("Employee Name: " + employee.getName());
        }
    }
}
