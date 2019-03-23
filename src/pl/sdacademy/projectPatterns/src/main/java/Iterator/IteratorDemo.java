package pl.sdacademy.projectPatterns.src.main.java.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    private static List<String> testData = Arrays.asList("test", "Kot", "pies");

    public static void main(String[] args) {
        Iterator<String> iterator=testData.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
