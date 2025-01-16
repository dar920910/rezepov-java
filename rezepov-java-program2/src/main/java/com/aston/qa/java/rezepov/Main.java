package com.aston.qa.java.rezepov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first string: ");
        String firstStr = scanner.nextLine();

        System.out.print("Input the second string: ");
        String secondStr = scanner.nextLine();

        StringEqualityChecker checker = new StringEqualityChecker(firstStr, secondStr);
        String result = checker.getEqualitySummary();
        System.out.println(result);
    }
}