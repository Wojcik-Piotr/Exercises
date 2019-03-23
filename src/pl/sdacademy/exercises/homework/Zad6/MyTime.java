package pl.sdacademy.exercises.homework.Zad6;

import java.time.LocalTime;

public class MyTime {
    private int seconds;

    public MyTime(int seconds) {
        this.seconds = seconds;
    }

    public void calculate() {
        LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds);
        System.out.println(timeOfDay.toString());
    }
}
