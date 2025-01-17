package com.aston.qa.java.rezepov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {
    private static final int integer_1 = 5;
    private static final int integer_2 = 10;
    private static final int integer_3 = 20;

    @Test
    void areEqualIntegers() {
        assertTrue(MathOperations.areEqualIntegers(integer_1, integer_1));
        assertTrue(MathOperations.areEqualIntegers(integer_2, integer_2));
        assertTrue(MathOperations.areEqualIntegers(integer_3, integer_3));
    }

    @Test
    void areNotEqualIntegers() {
        assertFalse(MathOperations.areEqualIntegers(integer_1, integer_2));
        assertFalse(MathOperations.areEqualIntegers(integer_1, integer_3));
        assertFalse(MathOperations.areEqualIntegers(integer_2, integer_1));
        assertFalse(MathOperations.areEqualIntegers(integer_2, integer_3));
        assertFalse(MathOperations.areEqualIntegers(integer_3, integer_1));
        assertFalse(MathOperations.areEqualIntegers(integer_3, integer_2));
    }

    @Test
    void isFirstMoreThanSecond() {
        assertTrue(MathOperations.isFirstMoreThanSecond(integer_3, integer_2));
        assertTrue(MathOperations.isFirstMoreThanSecond(integer_3, integer_1));
        assertTrue(MathOperations.isFirstMoreThanSecond(integer_2, integer_1));
    }

    @Test
    void isFirstLessThanSecond() {
        assertFalse(MathOperations.isFirstMoreThanSecond(integer_1, integer_2));
        assertFalse(MathOperations.isFirstMoreThanSecond(integer_1, integer_3));
        assertFalse(MathOperations.isFirstMoreThanSecond(integer_2, integer_3));
    }

    @Test
    void add() {
        assertEquals(15, MathOperations.add(integer_1, integer_2));
        assertEquals(25, MathOperations.add(integer_1, integer_3));
        assertEquals(30, MathOperations.add(integer_2, integer_3));
    }

    @Test
    void subtract() {
        assertEquals(10, MathOperations.subtract(integer_3, integer_2));
        assertEquals(15, MathOperations.subtract(integer_3, integer_1));
        assertEquals(5, MathOperations.subtract(integer_2, integer_1));
    }

    @Test
    void divide() {
        assertEquals(4, MathOperations.divide(integer_3, integer_1));
        assertEquals(2, MathOperations.divide(integer_3, integer_2));
        assertEquals(2, MathOperations.divide(integer_2, integer_1));
    }

    @Test
    void multiply() {
        assertEquals(50, MathOperations.multiply(integer_1, integer_2));
        assertEquals(100, MathOperations.multiply(integer_1, integer_3));
        assertEquals(200, MathOperations.multiply(integer_2, integer_3));
    }
}