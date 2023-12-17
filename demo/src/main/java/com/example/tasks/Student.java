package com.example.tasks;

import com.example.demo.JavaDoc;
import com.example.tasks.ClassDocumentation;
import com.example.tasks.MethodDocumentation;

@ClassDocumentation(author = "Simran Ali", description = "Class representing a student")
public class Student extends JavaDoc {
    private int studentId;
    private String name;


    public Student(int studentId, String name) {
        this.name = name;
        this.studentId = studentId;
    }

    /**
     * This is an example method with Javadoc.
     *
     * @param
     * @return The squared value.
     */

    @MethodDocumentation(author = "Simran Ali", description = "Get the name of the student")
    public String getName() {
        return name;
    }

    @MethodDocumentation(author = "Simran Ali", description = "Get the student id of the student")
    public int getStudentId() {
        return studentId;
    }
}

