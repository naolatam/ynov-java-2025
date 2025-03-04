package fr.ynov.java.medium;

enum Nationality {
    FRENCH,
    ITALIAN,
    SPANISH,
}

public class Person {
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void introduce() {
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + "is a " + gender + " and is " + height + " tall");
        System.out.println(name + "is a " + weight + " weight and come from: " + nationality);
    }
}
