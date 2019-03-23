package pl.sdacademy.beginner.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> exampleList = new ArrayList<>();

        for (String current : exampleList) {
            System.out.println(current);
        }

        Iterator<String> iterator = exampleList.iterator();

        String current;
        while (iterator.hasNext()) {
            current = iterator.next();
            System.out.println(current);
            if (current.startsWith("a"))
                iterator.remove();
        }
    }
}
