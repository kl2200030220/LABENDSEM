package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point for the application.
 */
public class App {
    public static void main(String[] args) {
        // Load the Spring application context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Demonstrate Constructor Dependency Injection for Employee
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details: " + employee);

        // Demonstrate Setter Autowiring for Course and Instructor
        Course course = (Course) context.getBean("course");
        System.out.println("Course Details: " + course);

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
