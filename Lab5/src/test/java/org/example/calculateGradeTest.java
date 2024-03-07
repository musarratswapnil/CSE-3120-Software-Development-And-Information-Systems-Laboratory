package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculateGradeTest {
    @Test
        void testCase(){
            calculateGrade calculate= new calculateGrade();
            assertEquals("A+",calculate.grade(81));
        }
}