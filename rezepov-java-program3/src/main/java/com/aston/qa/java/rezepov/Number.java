package com.aston.qa.java.rezepov;

public class Number {
    private static final int DIVISOR = 2;
    private static final int MODULO_EVEN = 0;

    private final int value;
    private final int index;

    public Number(int value, int index) {
        this.value = value;
        this.index = index;
    }

    public boolean isEven() {
        return value % DIVISOR == MODULO_EVEN;
    }

    public String getTextInfo() {
        return "[index: " + index + "] value = " + value;
    }
}
