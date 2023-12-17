package com.example.tasks;

import java.lang.annotation.*;

// why use retention and element type
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodDocumentation {
    String author() default "Unknown";
    String description() default "";
}
