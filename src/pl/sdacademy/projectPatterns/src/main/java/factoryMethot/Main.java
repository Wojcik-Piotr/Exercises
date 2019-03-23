package pl.sdacademy.projectPatterns.src.main.java.factoryMethot;

import java.util.Random;

public class Main {
    private static Random random=new Random();

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(new Factory(random.nextInt(3)));
    }
}
