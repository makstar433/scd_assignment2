package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void input() {
        Result student = new Result();
        int[] marks = {85, 95, 79};
        student.input(132, "Muhammad Abeer Khan", marks);

        assertEquals(132, student.rollNo);
        assertEquals("Muhammad Abeer Khan", student.name);
        assertArrayEquals(marks, student.marks);
    }

    @Test
    void total() {
        Result student = new Result();
        int[] marks = {85, 95, 79};
        student.input(132, "Muhammad Abeer Khan", marks);

        int expectedTotal = 85 + 95 + 79;
        int actualTotal = student.total();

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    void avg() {
        Result student = new Result();
        int[] marks = {85, 95, 79};
        student.input(132, "Muhammad Abeer Khan", marks);

        double expectedAvg = (double)(85 + 95 + 79) / 3.0;
        double actualAvg = student.avg();

        assertEquals(expectedAvg, actualAvg);
    }
}