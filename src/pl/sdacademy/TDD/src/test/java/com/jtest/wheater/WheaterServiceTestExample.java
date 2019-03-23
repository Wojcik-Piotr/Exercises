package pl.sdacademy.TDD.src.test.java.com.jtest.wheater;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WheaterServiceTestExample {
    private WeatherStatistikService weatherStatistikService;
    private WeatherService weatherService;

    @BeforeEach
    void setUp() {
        weatherService = mock(WeatherService.class);
        weatherStatistikService = new WeatherStatistikService(weatherService);
    }

    @Test
    public void sholdFindAvarageTemperature() {
        //give
        List<Double> mocedTemperatures = Arrays.asList(1d, 2d, 3d);
        when(weatherService.getTemperatureList(anyString()))
                .thenReturn(mocedTemperatures);

        //then
        Assertions.assertThat(weatherStatistikService.getAverageTemperature("Wrocław"))
                .isEqualTo(2d);
    }

    @Test
    public void sholdFindTheBiggestTemperature() {

        //give
        List<Double> mocedTemperatures = Arrays.asList(1d, 2d, 3d);
        when(weatherService.getTemperatureList(anyString()))
                .thenReturn(mocedTemperatures);

        //then
        Assertions.assertThat(weatherStatistikService.getBiggestTemperature("Wrocław"))
                .isEqualTo(3d);
    }

    @Test
    public void sholdFindRainSum() {

        //give
        List<String> cityList = new ArrayList<String>();
        for (int i = 0; i <4 ; i++) {
            cityList.add("City"+(i+1));
        }
       when(weatherService.rainForecastSum(anyString())).thenReturn(5d);

        //then
        Assertions.assertThat(weatherStatistikService.getRainSum(cityList))
                .isEqualTo(20d);
    }
}
