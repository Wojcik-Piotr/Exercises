package pl.sdacademy.exercises.homework.Zad12;

import java.util.Scanner;

public class HotWater {
    private Scanner scanner = new Scanner(System.in);
    private double quantity;
    private double temperature0;
    private double temperature1;
    private final double JUOLES_PER_LITER_OF_WATER = 4200;

    public HotWater() {
        setQuantity();
        setTemperature0();
        setTemperature1();
        calculate();
    }

    private void setQuantity() {
        System.out.println("Podaj ilość wody w kg:");
        this.quantity = scanner.nextDouble();
    }

    private void setTemperature0() {
        System.out.println("Podaj początową tęperature: ");
        this.temperature0 = scanner.nextDouble();
    }

    private void setTemperature1() {
        System.out.println("Podaj czekiwaną tęperature: ");
        this.temperature1 = scanner.nextDouble();
    }

    private void calculate() {
        double result = (temperature0 - temperature1) * quantity * JUOLES_PER_LITER_OF_WATER;
        System.out.println("Wymagana energia to: " + result + " J.");
    }

}
