package pl.sdacademy.beginner.hashcode;

import java.util.HashSet;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("1" , "P", 10);
        Person p2 = new Person("2", "P", 10);
        Person p3 = new Person("3", "P", 10);
        HashSet<Person> persons = new HashSet<>();
        persons.add(p);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.size());
    }
}
