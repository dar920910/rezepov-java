package com.aston.qa.java.rezepov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer (A): ");
        int number_A = scanner.nextInt();

        System.out.print("Input an integer (B): ");
        int number_B = scanner.nextInt();

        System.out.print("Comparing Result: ");
        if (number_A == number_B) {
            System.out.println("A == B");
        } else if (number_A > number_B) {
            System.out.println("A > B");
        } else {
            System.out.println("A < B");
        }

        System.out.printf("A + B = %d\n", number_A + number_B);
        System.out.printf("A - B = %d\n", number_A - number_B);
        System.out.printf("A / B = %d\n", number_A / number_B);
        System.out.printf("A * B = %d\n", number_A * number_B);

        System.out.println();
    }
}