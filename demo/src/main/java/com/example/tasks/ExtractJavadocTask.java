package com.example.tasks;


import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.reflections.Reflections;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Set;

public class ExtractJavadocTask extends DefaultTask {




    //    String packageToBeScanned;
    @TaskAction
    public void extract(){
        // Scan for annotated class and methods
        String packageToBeScanned = null;
        Reflections reflections = new Reflections(packageToBeScanned);
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(ClassDocumentation.class);
        Set<Method> annotatedMethods =  reflections.getMethodsAnnotatedWith(MethodDocumentation.class);

        annotatedMethods.forEach(this::processMethod);
        annotatedClasses.forEach(this::processClass);

    }


    private void processClass(Class<?> inputClass) {
        ClassDocumentation classAnnotation = inputClass.getAnnotation(ClassDocumentation.class);
        String classJavadoc = getClassJavadoc(inputClass);
        System.out.println("Class: " + inputClass.getName());
        System.out.println("Author: " + classAnnotation.author());
        System.out.println("Description: " + classAnnotation.description());
        System.out.println("Javadoc: " + classJavadoc);
        System.out.println();
    }

    private void processMethod(Method inputMethod) {
        ClassDocumentation classAnnotation = inputMethod.getAnnotation(ClassDocumentation.class);
        String classJavadoc = getMethodJavadoc(inputMethod);
        System.out.println("Class: " + inputMethod.getName());
        System.out.println("Author: " + classAnnotation.author());
        System.out.println("Description: " + classAnnotation.description());
        System.out.println("Javadoc: " + classJavadoc);
    }

    private String getMethodJavadoc(Method method) {
        return getJavadoc(method) != null ? getJavadoc(method) : "No Javadoc found";
    }
    private String getClassJavadoc(Class<?> inputClass) {
        return getJavadoc(inputClass) != null ? getJavadoc(inputClass) : "No Javadoc found";
    }




    private static String getJavadoc(AnnotatedElement element) {
        ClassDocumentation classDoc = element.getAnnotation(ClassDocumentation.class);
        MethodDocumentation methodDoc = element.getAnnotation(MethodDocumentation.class);

        if (classDoc != null) {
            return "Author: " + classDoc.author() + ", Description: " + classDoc.description();
        } else if (methodDoc != null) {
            return "Author: " + methodDoc.author() + ", Description: " + methodDoc.description();
        } else {
            return null;
        }
    }


}
