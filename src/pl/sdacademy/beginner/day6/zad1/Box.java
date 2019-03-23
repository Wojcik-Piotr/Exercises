package pl.sdacademy.beginner.day6.zad1;

import pl.sdacademy.beginner.day5.zad1.Person;

public class Box<T extends Person> {
    private T element;
    public void set(T item){
        element=item;
    }
}
