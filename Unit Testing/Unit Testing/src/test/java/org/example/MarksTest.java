package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MarksTest {

    @Test
    void sum() {
        Marks marks = new Marks();

        marks.mark1 = 75;
        marks.mark2 = 80;
        marks.mark3 = 85;

        int expectedSum = 75 + 80 + 85;
        Assertions.assertEquals(expectedSum, marks.sum());
        System.out.println("SUM: " + marks.sum());
        System.out.println("Expected SUM: " + expectedSum);
    }

    @Test
    void avg() {
        Marks marks = new Marks();

        marks.mark1 = 90;
        marks.mark2 = 95;
        marks.mark3 = 85;

        float expectedAvg = (float) (90 + 95 + 85) / 3.0f;
        Assertions.assertEquals(expectedAvg, marks.avg(), 0.001);
        System.out.println("Expected SUM: " + marks.avg());
        System.out.println("Expected Avg: " + expectedAvg);
    }
}