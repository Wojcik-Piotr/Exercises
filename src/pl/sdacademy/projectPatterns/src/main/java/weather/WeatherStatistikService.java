package pl.sdacademy.projectPatterns.src.main.java.weather;

import java.util.List;

public class WeatherStatistikService {
    private final WeatherService weatherService;

    public WeatherStatistikService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public int getMeasurenebtsCount(){
        return weatherService.getTemperatureList("Wrocław").size();
    }
    public double getAverageTemperature(String cityName){
        List<Double> temperatureList=weatherService.getTemperatureList(cityName);
        double sume=0;
        for (Double temperature: temperatureList){
            sume+=temperature;
        }
        return sume/temperatureList.size();
    }
    public double getBiggestTemperature(String cityName){
        List<Double> temperatureList=weatherService.getTemperatureList(cityName);
        double theBiggestTemperature=-100d;
        for (Double temperature: temperatureList){
            if (theBiggestTemperature<temperature){
                theBiggestTemperature=temperature;
            }
        }
        return theBiggestTemperature;
    }
    public double getRainSum(List<String> cityList){
        double sum=0;
        for (String cityName: cityList){
            sum+=weatherService.rainForecastSum(cityName);
        }
        return sum;
    }
}
