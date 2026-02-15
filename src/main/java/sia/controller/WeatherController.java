package sia.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sia.model.WeatherData;
import sia.service.WeatherService;

import java.util.List;

@Data
@Controller
public class WeatherController {
    private final WeatherService weatherService;
    private final List<String> cities;

    public WeatherController(WeatherService weatherService,@Qualifier("citiesList") List<String> cities) {
        this.weatherService = weatherService;
        this.cities = cities;
    }

    public void printWeather(String city) {
        WeatherData data = weatherService.getWeather(city);
        System.out.println(data);
    }
}

