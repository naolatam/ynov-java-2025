package fr.ynov.java.easy;

public class Arrays {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Print array in old way: ");
        printArray(arr);
        System.out.println("Print array in modern way: ");
        printArrayModern(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArrayModern(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }
}
