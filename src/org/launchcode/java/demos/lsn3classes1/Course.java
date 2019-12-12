package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String name;
    private Teacher prof;
    private ArrayList<Student> students;

    public Course(String name, Teacher prof, ArrayList<Student> students) {
        this.name = name;
        this.prof = prof;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProf(Teacher prof) {
        this.prof = prof;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Teacher getProf() {
        return prof;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
