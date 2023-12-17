package com.example.demo;

import com.example.tasks.ClassDocumentation;
import com.example.tasks.MethodDocumentation;

import java.lang.reflect.AnnotatedElement;

public class JavaDoc {
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
