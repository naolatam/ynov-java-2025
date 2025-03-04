package fr.ynov.java.easy;

public class DoWhile {

    public static void loop(int nMax) {
        int count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count <= nMax);
    }

    public static void main(String[] args) {
        loop(10);
    }
}
