package pl.sdacademy.beginner.day7.cw1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorce {

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(5, 72, 8, 11, 9);
        List<Integer> target = source
                .stream()
                .filter(n -> n < 10)
                .map(n -> n * n)
                .collect(Collectors.toList());

        for (Integer integer : target) {
            System.out.println(target);
        }

    }
}
