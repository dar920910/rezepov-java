package com.aston.qa.java.rezepov;

public class Main {
    private static final int[] INTEGERS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String[] args) {
        printAllIntegers(INTEGERS);

        System.out.println("Even Numbers: ");
        for (int index = 0; index < INTEGERS.length; index++) {
            int integer = INTEGERS[index];
            Number number = new Number(integer, index);

            if (number.isEven()) {
                String text = number.getTextInfo();
                System.out.println(text);
            }
        }
    }

    private static void printAllIntegers(int[] integers) {
        System.out.print("All Integers: { ");
        for (int integer : integers) {
            System.out.print(integer + ", ");
        }
        System.out.println("}");
    }
}