package fr.ynov.java.medium;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

enum Nationality {
    FRENCH,
    ITALIAN,
    SPANISH,
}

public class Person {
    private String name;
    private final Date birthDate;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person(String name, Date birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.setTime(birthDate);
        int Birthyear = calendar.get(Calendar.YEAR);
        int Birthmonth = calendar.get(Calendar.MONTH)+1;
        int Birthday = calendar.get(Calendar.DAY_OF_MONTH);
        int actualYear = LocalDate.now().getYear();
        int actualMonth = LocalDate.now().getMonthValue();
        int actualDay = LocalDate.now().getDayOfMonth();
        System.out.println(Birthyear + " " + Birthmonth + " " + Birthday);
        System.out.println(actualYear + " " + actualMonth + " " + actualDay);

        if(Birthmonth > actualMonth) {
            return actualYear - Birthyear - 1;
        }
        else if(Birthmonth == actualMonth && Birthday > actualDay) {
            return actualYear - Birthyear - 1;
        }
        else {
            return actualYear - Birthyear;
        }

    }

    public void introduce() {
        System.out.println(name + " is " + getAge() + " years old");
        System.out.println(name + "is a " + gender + " and is " + height + " tall");
        System.out.println(name + "is a " + weight + " weight and come from: " + nationality);
    }

    public static void main(String[] args) {
        Person p = new Person("loan", new GregorianCalendar(2008, Calendar.MARCH, 29).getTime(), "male", 178, 70, Nationality.FRENCH);
        p.introduce();
    }
}
