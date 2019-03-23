package pl.sdacademy.projectPatterns.src.main.java.weather;

import java.util.List;

public class TemperatuerAdapter {
    static void printCelcius(List<Double> temperaturList){
        for (Double temp: temperaturList) {
            if (temp != 0.0) {
                System.out.println(temp-272.15);
            }
        }
    }
}
