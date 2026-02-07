package sia;

import lombok.Data;

import java.util.List;

@Data
public class WeatherController {
    private final WeatherService weatherService;
    private final List<String> cities;

    public WeatherController(WeatherService weatherService, List<String> cities) {
        this.weatherService = weatherService;
        this.cities = cities;
    }


    public void printWeather(String city) {
        WeatherData data = weatherService.getWeather(city);
        System.out.println(data);
    }
}

