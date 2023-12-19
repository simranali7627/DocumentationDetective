package models;


import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

import java.lang.reflect.AnnotatedElement;

public class StudentDetails  {
    private String address;
    private int age;

    public int getAge() {
        return age;
    }

    @MethodDocumentation
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @MethodDocumentation
    public void setAge(int age) {
        this.age = age;
    }

    StudentDetails(int age, String address){
        this.age = age;
        this.address = address;
    }


}
