package com.aston.qa.java.rezepov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringEqualityCheckerTest {
    @Test
    void getEqualitySummaryWhenEqualStrings() {
        String first = "PowerBank";
        String second = "PowerBank";

        StringEqualityChecker checker = new StringEqualityChecker(first, second);
        assertEquals("Strings ARE EQUAL", checker.getEqualitySummary());
    }

    @Test
    void getEqualitySummaryWhenNotEqualStrings() {
        String first = "PowerBank";
        String second = "Power bank";

        StringEqualityChecker checker = new StringEqualityChecker(first, second);
        assertEquals("Strings ARE NOT EQUAL", checker.getEqualitySummary());
    }
}
