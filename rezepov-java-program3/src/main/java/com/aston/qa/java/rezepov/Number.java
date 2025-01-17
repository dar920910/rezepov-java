package com.aston.qa.java.rezepov;

public class Number {
    private static final int DIVISOR = 2;
    private static final int MODULO_EVEN = 0;

    private final int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % DIVISOR == MODULO_EVEN;
    }

    public String getTextInfo(int index) {
        return "[index: " + index + "] value = " + value;
    }
}
