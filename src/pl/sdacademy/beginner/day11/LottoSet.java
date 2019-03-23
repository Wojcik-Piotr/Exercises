package pl.sdacademy.beginner.day11;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoSet {
    private static Random generator = new Random();

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        while (set.size() < 6) {
            int number = generator.nextInt(44) + 5;
            if (set.contains(number)) {
                System.out.println("Element exist");
            } else {
                set.add(number);
            }
        }
        for (int k : set) {
            System.out.println(k + ", ");
        }
    }
}
