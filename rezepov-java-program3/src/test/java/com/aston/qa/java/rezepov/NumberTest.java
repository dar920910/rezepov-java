package com.aston.qa.java.rezepov;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {
    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 10 })
    void isEvenNumber(int integer) {
        Number number = new Number(integer);
        assertTrue(number.isEven());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5, 7, 9 })
    void isOddNumber(int integer) {
        Number number = new Number(integer);
        assertFalse(number.isEven());
    }

    @Test
    void getTextInfo() {
        final int[] INTEGERS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        assertEquals("[index: 0] value = 1", new Number(INTEGERS[0]).getTextInfo(0));
        assertEquals("[index: 1] value = 2", new Number(INTEGERS[1]).getTextInfo(1));
        assertEquals("[index: 2] value = 3", new Number(INTEGERS[2]).getTextInfo(2));
        assertEquals("[index: 3] value = 4", new Number(INTEGERS[3]).getTextInfo(3));
        assertEquals("[index: 4] value = 5", new Number(INTEGERS[4]).getTextInfo(4));
        assertEquals("[index: 5] value = 6", new Number(INTEGERS[5]).getTextInfo(5));
        assertEquals("[index: 6] value = 7", new Number(INTEGERS[6]).getTextInfo(6));
        assertEquals("[index: 7] value = 8", new Number(INTEGERS[7]).getTextInfo(7));
        assertEquals("[index: 8] value = 9", new Number(INTEGERS[8]).getTextInfo(8));
        assertEquals("[index: 9] value = 10", new Number(INTEGERS[9]).getTextInfo(9));
    }
}
