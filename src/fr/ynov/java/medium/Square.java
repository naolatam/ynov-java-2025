package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(@org.jetbrains.annotations.NotNull String[] args) {
        int number;
        if(args.length == 1) {
            number = Integer.parseInt(args[0]);
        }else {
            System.out.println("Please enter a number: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            scanner.close();
        }
        System.out.println(square(number));
    }

    public static int square(int number) {
        return number * number;
    }
}
