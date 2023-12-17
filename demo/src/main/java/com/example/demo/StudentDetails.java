package com.example.demo;

import com.example.tasks.ClassDocumentation;
import com.example.tasks.MethodDocumentation;

import java.lang.reflect.AnnotatedElement;

public class StudentDetails  {
    private String address;
    private int age;

    public int getAge() {
        return age;
    }

    @MethodDocumentation(author = "Simran Ali", description = "Get the address of the student")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @MethodDocumentation(author = "Simran Ali", description = "Set the age of the student")
    public void setAge(int age) {
        this.age = age;
    }

    StudentDetails(int age, String address){
        this.age = age;
        this.address = address;
    }

    private static String getJavadoc(AnnotatedElement element) {
        ClassDocumentation classDoc = element.getAnnotation(ClassDocumentation.class);
        MethodDocumentation methodDoc = element.getAnnotation(MethodDocumentation.class);

        if (classDoc != null) {
            return "Author: " + classDoc.author() + ", Description: " + classDoc.description();
        } else if (methodDoc != null) {
            return "Author: " + methodDoc.author() + ", Description: " + methodDoc.description();
        } else {
            return "No Javadoc found";
        }
    }

}
