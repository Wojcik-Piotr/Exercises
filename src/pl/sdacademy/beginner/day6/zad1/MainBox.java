package pl.sdacademy.beginner.day6.zad1;

import pl.sdacademy.beginner.day5.zad1.Employer;
import pl.sdacademy.beginner.day5.zad1.Person;

public class MainBox {
    public static void main(String[] args) {
        Box<Person> box=new Box<>();
        box.set(new Employer("Adam","Nowak","Lotery"));
    }
}
