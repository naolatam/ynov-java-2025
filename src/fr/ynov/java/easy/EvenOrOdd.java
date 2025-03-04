package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Even Or Odd!");
        while (true) {
            System.out.println("Enter a number (-1 to exit): ");
            int number = scanner.nextInt();
            if (number == -1) {
                scanner.close();
                break;
            }
            if (number % 2 == 0) {
                System.out.println(number + " is even");
                continue;
            }
            System.out.println(number + " is odd");
        }

    }
}
