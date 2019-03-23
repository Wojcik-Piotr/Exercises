package pl.sdacademy.projectPatterns.src.main.java.weather;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService=new WeatherService();
        TemperatuerAdapter.printCelcius(weatherService.getTemperatureList("Wroclaw"));
    }
}
