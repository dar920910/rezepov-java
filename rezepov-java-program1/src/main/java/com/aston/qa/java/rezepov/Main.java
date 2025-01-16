package com.aston.qa.java.rezepov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[INPUT] Inputting two custom integers ...");
        CustomNumber a = getNewNamedNumber("A");
        CustomNumber b = getNewNamedNumber("B");
        System.out.println();

        TwoCustomNumbers currentCustomNumbers = new TwoCustomNumbers(a, b);
        printTwoNumbersOperations(currentCustomNumbers);
    }

    private static CustomNumber getNewNamedNumber(String numberName) {
        System.out.printf("Input an integer (%s): ", numberName);
        Scanner scanner = new Scanner(System.in);
        int numberValue = scanner.nextInt();

        return new CustomNumber(numberName, numberValue);
    }

    private static void printTwoNumbersOperations(TwoCustomNumbers customNumbers) {
        System.out.println("[OUTPUT] Displaying operation results ...");

        String result = customNumbers.getLogicalComparisonResult();
        System.out.println("Comparison Result: " + result);

        result = customNumbers.getAdditionResult();
        System.out.println("Addition Result: " + result);

        result = customNumbers.getSubtractionResult();
        System.out.println("Subtraction Result: " + result);

        result = customNumbers.getDivisionResult();
        System.out.println("Division Result: " + result);

        result = customNumbers.getMultiplicationResult();
        System.out.println("Multiplication Result: " + result);
    }
}