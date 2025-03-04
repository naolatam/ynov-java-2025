package fr.ynov.java.easy;

public class While {

    public static void loop(int nMax) {
        int count = 1;
        while (count <= nMax) {
            System.out.println(count);
            count++;
        }
    }

    public static void main(String[] args) {
        loop(10);
    }
}
