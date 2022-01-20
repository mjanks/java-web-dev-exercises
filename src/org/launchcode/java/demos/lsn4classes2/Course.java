package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String toString() {
        return topic + " taught by " + instructor;
    }

    public boolean equals(Course course) {
        if (course == this)
            return true;

        if(course.getClass() != getClass())
            return false;

        if(course == null)
            return false;

        Course theCourse = (Course) course;
        return theCourse.topic == topic && theCourse.instructor == instructor;
    }

}
