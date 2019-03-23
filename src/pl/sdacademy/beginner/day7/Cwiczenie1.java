package pl.sdacademy.beginner.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cwiczenie1 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 4, 10, 9, 13, 6);
        List<Integer> target= num
                .stream()
                .filter(n -> n%2!=0)
                .map(n -> n* 100)
                .collect(Collectors.toList());
        for (Integer integer: target){
            System.out.println(integer);
        }

    }
}
