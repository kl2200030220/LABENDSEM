package com.klef.jfsd.exam;

import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private Instructor instructor; // Inject Instructor here

    // Constructor injection
    public Course(int courseId, String courseName, int credits, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    // Getter and setter methods
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Setter for instructor (needed for setter injection)
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Getter for instructor
    public Instructor getInstructor() {
        return instructor;
    }
}
