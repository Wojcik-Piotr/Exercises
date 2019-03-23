package pl.sdacademy.beginner.stat;

import java.util.ArrayList;
import java.util.List;

public class User {
    public final static String DEFAULT_NAME = "No name";
    public static List<String> DEFAULT_NAMES;

    static {
        DEFAULT_NAMES = new ArrayList<>();
        DEFAULT_NAMES.add("No name 1");
        DEFAULT_NAMES.add("No name 2");
    }

    public static String name;
    public String surname;
    public int age;


    public String getName() {
        return name == null ? DEFAULT_NAME : name;
    }
}


class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }
}