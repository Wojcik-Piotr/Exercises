package pl.sdacademy.beginner.comparing;

import java.util.Comparator;

public class User implements Comparable<User> {
    public String name;

    public String surname;

    public int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int compare = surname.compareTo(o.surname);
        if (compare != 0)
            return compare;
        return name.compareTo(o.name);
    }

    public static final Comparator<User> AGE_COMPARATOR = Comparator.comparingInt(o -> o.age);
}
