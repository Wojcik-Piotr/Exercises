package pl.sdacademy.beginner.comparing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class ComparatorExample {
    public static void main(String[] args) {
        User u = new User("test", "test", 18);
        User u1 = new User("zest", "test", 15);
        User u2 = new User("test", "test", 33);
        User u3 = new User("test", "test", 20);

        List<User> users = asList(u, u1, u2,u3);

        Comparator<User> ageComparator = (o1, o2)->o1.age - o2.age;

        users.stream().sorted(ageComparator)
                .forEach(c-> System.out.println(c));

        Collections.sort(users, new UserAgeComparator());
        Collections.sort(users, ageComparator);
        Collections.sort(users, Comparator.comparingInt(o -> o.age));
    }
}
