package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class BookTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void show() {
        Book book = new Book(1, 100, 10.0);

        book.show();

        String expected = "Book ID: 1" + System.lineSeparator() + "Number of pages: 100" + System.lineSeparator() + "Price: 10.0" + System.lineSeparator();
        String actual = outContent.toString().trim();

        assertEquals(expected.trim(), actual);
    }

    @Test
    void set() {
        Book book = new Book(1, 100, 10.0);

        book.set(2, 200, 20.0);

        assertEquals(2, book.getBookID());
        assertEquals(200, book.getPages());
        assertEquals(20.0, book.getPrice());
    }

    @Test
    void getPrice() {
        Book book = new Book(1, 100, 10.0);

        double actual = book.getPrice();
        double expected = 10.0;

        assertEquals(expected, actual);
    }
}