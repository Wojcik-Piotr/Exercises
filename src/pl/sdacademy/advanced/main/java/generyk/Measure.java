package pl.sdacademy.advanced.main.java.generyk;

import java.util.Comparator;

public class Measure implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getHeight()-o2.getHeight();
    }
}
