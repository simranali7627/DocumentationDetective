package models;


import annotations.ClassDocumentation;
import annotations.MethodDocumentation;

import java.lang.reflect.AnnotatedElement;

/**
 * Represents payment details for a student, including tuition fee and payment status.
 */

@ClassDocumentation
public class StudentPaymentDetails {
    private double tuitionFee;
    private boolean hasPaid;

    public StudentPaymentDetails(double tuitionFee) {
        this.tuitionFee = tuitionFee;
        this.hasPaid = false; // Default to not paid
    }

    @MethodDocumentation
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
    @MethodDocumentation
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


}
