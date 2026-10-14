package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPositiveNumbers() {
        assertEquals(89,
                App.findMaximum(new int[]{10, 45, 23, 89, 12}));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-1,
                App.findMaximum(new int[]{-5, -1, -10}));
    }

    @Test
    public void testSingleElement() {
        assertEquals(25,
                App.findMaximum(new int[]{25}));
    }

    @Test
    public void testDuplicates() {
        assertEquals(7,
                App.findMaximum(new int[]{7, 3, 7, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray() {
        App.findMaximum(new int[]{});
    }
}