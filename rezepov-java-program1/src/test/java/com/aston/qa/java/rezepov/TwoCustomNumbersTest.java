package com.aston.qa.java.rezepov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCustomNumbersTest {
    private static final CustomNumber number_1 = new CustomNumber("A", 10);
    private static final CustomNumber number_2 = new CustomNumber("B", 5);

    private static TwoCustomNumbers getTestNumbers() {
        return new TwoCustomNumbers(number_1, number_2);
    }

    @Test
    void getAdditionResult() {
        final TwoCustomNumbers testNumbers = getTestNumbers();
        assertEquals("A + B = 15", testNumbers.getAdditionResult());
    }

    @Test
    void getSubtractionResult() {
        final TwoCustomNumbers testNumbers = getTestNumbers();
        assertEquals("A - B = 5", testNumbers.getSubtractionResult());
    }

    @Test
    void getDivisionResult() {
        final TwoCustomNumbers testNumbers = getTestNumbers();
        assertEquals("A / B = 2", testNumbers.getDivisionResult());
    }

    @Test
    void getMultiplicationResult() {
        final TwoCustomNumbers testNumbers = getTestNumbers();
        assertEquals("A * B = 50", testNumbers.getMultiplicationResult());
    }

    @Test
    void getComparisonResultWhenNumbersAreEqual() {
        final CustomNumber first = new CustomNumber("A", 25);
        final CustomNumber second = new CustomNumber("B", 25);
        final TwoCustomNumbers testNumbers = new TwoCustomNumbers(first, second);

        assertEquals("A = B", testNumbers.getLogicalComparisonResult());
    }

    @Test
    void getComparisonResultWhenFirstMoreThanSecond() {
        final CustomNumber first = new CustomNumber("A", 50);
        final CustomNumber second = new CustomNumber("B", 25);
        final TwoCustomNumbers testNumbers = new TwoCustomNumbers(first, second);

        assertEquals("A > B", testNumbers.getLogicalComparisonResult());
    }

    @Test
    void getComparisonResultWhenFirstLessThanSecond() {
        final CustomNumber first = new CustomNumber("A", 25);
        final CustomNumber second = new CustomNumber("B", 50);
        final TwoCustomNumbers testNumbers = new TwoCustomNumbers(first, second);

        assertEquals("A < B", testNumbers.getLogicalComparisonResult());
    }
}
