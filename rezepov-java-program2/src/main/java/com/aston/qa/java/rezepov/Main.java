package com.aston.qa.java.rezepov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String stringsAreEqual = "Строки идентичны.";
        final String stringsAreNotEqual = "Строки неидентичны.";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку A: ");
        String str_A = scanner.nextLine();

        System.out.print("Введите строку B: ");
        String str_B = scanner.nextLine();

        System.out.print("РЕЗУЛЬТАТ: ");
        if (str_A.equals(str_B)) {
            System.out.print(stringsAreEqual);
        } else {
            System.out.print(stringsAreNotEqual);
        }

        System.out.println();
    }
}