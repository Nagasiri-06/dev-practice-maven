package com.example.maven_demo_project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeCalculatorTest {

    @Test
    void testGradeA() {
        assertEquals("A", GradeCalculator.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", GradeCalculator.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", GradeCalculator.calculateGrade(75));
    }

    @Test
    void testGradeF() {
        assertEquals("F", GradeCalculator.calculateGrade(60));
    }

    @Test
    void testInvalidMarks() {
        assertThrows(
            IllegalArgumentException.class,
            () -> GradeCalculator.calculateGrade(105)
        );
    }
}

