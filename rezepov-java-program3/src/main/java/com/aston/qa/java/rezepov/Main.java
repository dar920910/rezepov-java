package com.aston.qa.java.rezepov;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int number : numbers) {
            if (isEvenNumber(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}