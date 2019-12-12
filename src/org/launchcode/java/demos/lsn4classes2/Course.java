package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public void setTopic(String topic) { this.topic = topic; }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return topic + " (Instructor: " + instructor + ", Students enrolled: " + enrolledStudents.size() + ")";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared) {
        if(toBeCompared == this) {
            return true;
        }
        if(toBeCompared == null) {
            return false;
        }
        if(toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course)toBeCompared;
        return theCourse.getTopic() == topic && theCourse.getInstructor() == instructor;
    }

}
