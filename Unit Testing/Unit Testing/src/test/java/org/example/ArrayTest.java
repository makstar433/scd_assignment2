package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void fill() {
        Array array = new Array();
        int[] values = {1, 2, 3, 4, 5};

        array.fill(values);

        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, array.arr);
    }

    @Test
    void max() {
        Array array = new Array();
        int[] values = {1, 2, 3, 4, 5};
        array.fill(values);

        int expected = 5;
        int actual = array.max();

        assertEquals(expected, actual);
    }

    @Test
    void min() {
        Array array = new Array();
        int[] values = {1, 2, 3, 4, 5};
        array.fill(values);

        int expected = 1;
        int actual = array.min();

        assertEquals(expected, actual);
    }
}