package com.example.maven_demo_project;

public class GradeCalculator {
    public static String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                "Marks must be between 0 and 100"
            );
        }

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        int marks = 95;

        String grade = calculateGrade(marks);

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}


