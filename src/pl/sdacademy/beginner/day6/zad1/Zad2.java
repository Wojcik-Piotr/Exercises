package pl.sdacademy.beginner.day6.zad1;

import pl.sdacademy.beginner.day5.zad1.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zad2 {
    private static Map<Integer, Person> map = new HashMap<>();

    public static void main(String[] args) {

        map.put(1, new Person("Adam", "Krzak"));
        map.put(1, new Person("Ziom", "Lol"));

        Set<Map.Entry<Integer, Person>> enteries = map.entrySet();
        Set<Integer> integers = map.keySet();
        Collection<Person> values = map.values();
        for (Person person : values) {
            System.out.println(integers + " " + person);
        }
        System.out.println();
        System.out.println();
    }
}
