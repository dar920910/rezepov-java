package com.aston.qa.java.rezepov;

public class StringEqualityChecker {
    private static final String STRINGS_ARE_EQUAL_TEXT = "Strings ARE EQUAL";
    private static final String STRINGS_ARE_NOT_EQUAL_TEXT = "Strings ARE NOT EQUAL";

    private final String first;
    private final String second;

    public StringEqualityChecker(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getEqualitySummary() {
        String summary = "EQUALITY CHECKING RESULT: ";

        if (first.equals(second)) {
            summary += STRINGS_ARE_EQUAL_TEXT;
        } else {
            summary += STRINGS_ARE_NOT_EQUAL_TEXT;
        }

        return summary;
    }
}
