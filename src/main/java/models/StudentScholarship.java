package models;


import annotations.MethodDocumentation;

/**
     * The {@code StudentScholarship} class represents a student's scholarship information.
     * It includes details such as the student's name, GPA, and scholarship amount.
     */

    public class StudentScholarship {

        private String studentName;
        private double gpa;
        private double scholarshipAmount;

        /**
         * Constructs a new {@code StudentScholarship} object with the specified student name, GPA, and scholarship amount.
         *
         * @param studentName        The name of the student.
         * @param gpa                The grade point average (GPA) of the student.
         * @param scholarshipAmount The amount of the scholarship awarded to the student.
         */

        public StudentScholarship(String studentName, double gpa, double scholarshipAmount) {
            this.studentName = studentName;
            this.gpa = gpa;
            this.scholarshipAmount = scholarshipAmount;
        }

        /**
         * Retrieves the name of the student.
         *
         * @return The name of the student.
         */
        @MethodDocumentation
        public String getStudentName() {
            return studentName;
        }

        /**
         * Sets the name of the student.
         *
         * @param studentName The name of the student.
         */
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        /**
         * Retrieves the grade point average (GPA) of the student.
         *
         * @return The GPA of the student.
         */
        @MethodDocumentation
        public double getGpa() {
            return gpa;
        }

        /**
         * Sets the grade point average (GPA) of the student.
         *
         * @param gpa The GPA of the student.
         */
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        /**
         * Retrieves the amount of the scholarship awarded to the student.
         *
         * @return The scholarship amount.
         */
        public double getScholarshipAmount() {
            return scholarshipAmount;
        }

        /**
         * Sets the amount of the scholarship awarded to the student.
         *
         * @param scholarshipAmount The scholarship amount.
         */
        @MethodDocumentation
        public void setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
        }

        /**
         * Displays information about the student's scholarship, including name, GPA, and scholarship amount.
         */
        public void displayScholarshipInfo() {
            System.out.println("Student Name: " + studentName);
            System.out.println("GPA: " + gpa);
            System.out.println("Scholarship Amount: $" + scholarshipAmount);
        }
    }


