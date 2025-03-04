package fr.ynov.java.easy;

public class For {

    public static void loop(int nMax) {
        for(int i = 0; i < nMax; i++) {
            System.out.println(i+1);
        }
    }

    public static void main(String[] args) {
        loop(10);
    }
}
