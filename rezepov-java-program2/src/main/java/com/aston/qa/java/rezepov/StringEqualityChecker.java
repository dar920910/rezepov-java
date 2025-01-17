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
        if (first.equals(second)) {
            return STRINGS_ARE_EQUAL_TEXT;
        } else {
            return STRINGS_ARE_NOT_EQUAL_TEXT;
        }
    }
}
