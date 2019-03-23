package pl.sdacademy.beginner.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgesMap {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Integer, String> ageMap = new HashMap<>();

    public static void main(String[] args) {
        addPeople();
        System.out.println(ageMap);
        printMapAge();
        System.out.println(ageChek());
        System.out.println(nameChek());
    }

    private static int getAge() {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        return age;
    }

    private static String getName() {
        System.out.println("Enter name: ");
        String name = scanner.next();
        return name;
    }

    private static void addPeople() {
        for (int i = 0; i < 2; i++) {
            ageMap.put(getAge(), getName());
        }
    }

    private static boolean nameChek() {
        return ageMap.containsValue(getName());
    }

    private static boolean ageChek() {
        return ageMap.containsKey(getAge());
    }

    private static void printMapAge() {
        for (Map.Entry<Integer, String> entry : ageMap.entrySet()) {
            System.out.println("Age: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
