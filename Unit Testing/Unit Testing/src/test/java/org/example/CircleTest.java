package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle();
        circle.setRadius(5);

        double expectedArea = Math.PI * 5 * 5;
        Assertions.assertEquals(expectedArea, circle.area(), 0.001);
    }

    @Test
    public void testCircum() {
        Circle circle = new Circle();
        circle.setRadius(5);

        double expectedCircum = 2 * Math.PI * 5;
        Assertions.assertEquals(expectedCircum, circle.circum(), 0.001);
    }
}
