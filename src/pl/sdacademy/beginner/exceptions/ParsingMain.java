package pl.sdacademy.beginner.exceptions;

import java.util.*;

public class ParsingMain {

    public static void main(String[] args) {
        Collection<String> strings = new LinkedList<>();


        Iterator<String> iterator = strings.iterator();
        String current;
        while(iterator.hasNext()){
            current = iterator.next();
        }

        Integer.parseInt("");
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            try {
                System.out.println("podaj wiek: ");
                age = Integer.parseInt(sc.nextLine());
                if (age < 0) {
                    System.out.println("Wiek jest nieprawidlowy");
                } else {
                    System.out.println("Twoj wiek to " + age);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wiek nie jest liczba");
            }
        }
    }
}
