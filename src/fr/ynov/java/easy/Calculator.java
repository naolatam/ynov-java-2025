package fr.ynov.java.easy;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Integer number1 = Integer.parseInt(args[0]);
        Integer number2 = Integer.parseInt(args[1]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        System.out.print("Choice something: ");
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your number is " + number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Your number is " + number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Your number is " + number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 4:
                System.out.println("Your number is " + number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            default:
                break;

        }


    }
}
