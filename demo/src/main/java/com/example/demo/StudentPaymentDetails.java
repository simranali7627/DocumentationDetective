package com.example.demo;

import com.example.tasks.ClassDocumentation;
import com.example.tasks.MethodDocumentation;

import java.lang.reflect.AnnotatedElement;

/**
 * Represents payment details for a student, including tuition fee and payment status.
 */

@ClassDocumentation(author = "Simran Ali" ,description = "This class represents payment details for a student.")
public class StudentPaymentDetails {
    private double tuitionFee;
    private boolean hasPaid;

    public StudentPaymentDetails(double tuitionFee) {
        this.tuitionFee = tuitionFee;
        this.hasPaid = false; // Default to not paid
    }

    @MethodDocumentation(author = "Simran Ali", description = "Get the student's tuition fee.")
    public double getTuitionFee() {
        return tuitionFee;
    }


    /**
     * Checks if the student has paid the tuition fee.
     *
     * @return {@code true} if the student has paid, {@code false} otherwise.
     */
    public boolean isHasPaid() {
        return hasPaid;
    }
    @MethodDocumentation(author = "Simran Ali", description = "Check if the student has paid the tuition fee.")
    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    /**
     * Sets the tuition fee for the student.
     *
     * @param tuitionFee The new tuition fee.
     */
    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    /**
     * Displays information about the student's payment details.
     *
     * @return A string representation of the payment details.
     */
    @Override
    public String toString() {
        return "StudentPaymentDetails{" +
                "tuitionFee=" + tuitionFee +
                ", hasPaid=" + hasPaid +
                '}';
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
