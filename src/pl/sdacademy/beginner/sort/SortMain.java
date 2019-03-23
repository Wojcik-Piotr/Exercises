package pl.sdacademy.beginner.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        List<User> names = new ArrayList<>();
        names.add(new User("Aaaa", "red", 150));
        names.add(new User("Some name", "brown", 176));
        names.add(new User("Other name", "black", 201));
        names.add(new User("Www name", "blond", 198));
        names.add(new User("C name", "blue", 90));
        Collections.sort(names, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getHeight().compareTo(o2.getHeight());
            }
        });

        for (User user : names) System.out.println(user);
    }
}
