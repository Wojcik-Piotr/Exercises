package pl.sdacademy.beginner.day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cwiczenie2 {
    public static void main(String[] args) {
        List<String> txt= Arrays.asList("ala", "samochód", "kot", "aleksandra", "pies", "azor");
        List<String> target= txt
                .stream()
                .filter(s -> s.charAt(0)=='a')
                .map(n -> Character.toUpperCase(n.charAt(0))+n.substring(1))
                .collect(Collectors.toList());

        for (String text: target){
            System.out.println(text);
        }
    }

}
