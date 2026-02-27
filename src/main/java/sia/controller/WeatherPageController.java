package sia.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sia.service.WeatherService;

@Controller
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherPageController {

    private final WeatherService weatherService;

    @GetMapping("/{cities}")
    public String weatherPage(@PathVariable String city, Model model) {
        model.addAttribute("weather", weatherService.getWeather(city));
        return "weather";
    }
}
