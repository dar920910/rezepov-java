package com.aston.qa.java.rezepov;

public class TwoCustomNumbers {
    private final CustomNumber number_1;
    private final CustomNumber number_2;

    public TwoCustomNumbers(CustomNumber number_1, CustomNumber number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public String getLogicalComparisonResult() {
        if (MathOperations.areEqualIntegers(number_1.getValue(), number_2.getValue())) {
            return number_1.getName() + " = " + number_2.getName();
        } else if (MathOperations.isFirstMoreThanSecond(number_1.getValue(), number_2.getValue())) {
            return number_1.getName() + " > " + number_2.getName();
        } else {
            return number_1.getName() + " < " + number_2.getName();
        }
    }

    public String getAdditionResult() {
        int result = MathOperations.add(number_1.getValue(), number_2.getValue());
        return number_1.getName() + " + " + number_2.getName() + " = " + result;
    }

    public String getSubtractionResult() {
        int result = MathOperations.subtract(number_1.getValue(), number_2.getValue());
        return number_1.getName() + " - " + number_2.getName() + " = " + result;
    }

    public String getDivisionResult() {
        int result = MathOperations.divide(number_1.getValue(), number_2.getValue());
        return number_1.getName() + " / " + number_2.getName() + " = " + result;
    }

    public String getMultiplicationResult() {
        int result = MathOperations.multiply(number_1.getValue(), number_2.getValue());
        return number_1.getName() + " * " + number_2.getName() + " = " + result;
    }
}
