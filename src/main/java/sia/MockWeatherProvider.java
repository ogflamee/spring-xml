package sia;


import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static sia.DateTimeFactory.now;

@Data
public class MockWeatherProvider implements WeatherProvider {
    private final Map<String, Double> data = new HashMap<>();
    private LocalDateTime now;

    public MockWeatherProvider(){
        data.put("Minsk", -16.5);
        data.put("Brest", -14.0);
        data.put("Gomel", -18.0);
    }

    @Override
    public WeatherData getWeather(String city) {
        try{
            System.out.println("достаем погоду из провайдера для: " + city);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return new WeatherData(city, data.getOrDefault(city, 0.0), now());
    }
}
