package sia.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sia.model.WeatherData;
import sia.service.WeatherService;

import java.util.List;

@Data
@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;
    private final List<String> cities;

    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }

    @GetMapping
    public WeatherData getWeatherByParam(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

@GetMapping
    public List<String> getCities() {
        return cities;
}
}

