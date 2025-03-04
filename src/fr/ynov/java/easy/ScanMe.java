package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        // Ask for a name and a age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Well! Processing...");
        scanner.close();
        System.out.println("Your name is " + name + " and you're " + age + " years old.");

    }
}
