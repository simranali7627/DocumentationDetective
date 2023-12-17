package com.example.tasks;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassDocumentation {
    String author() default "Unknown";
    String description() default "";
}

