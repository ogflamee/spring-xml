package sia;

import java.util.HashMap;
import java.util.Map;

public class SimpleWeatherCache implements WeatherCache{
    private final Map<String, WeatherData> cache = new HashMap<>();

    @Override
    public void put(String city, WeatherData data) {
        cache.put(city, data);
    }

    @Override
    public WeatherData get(String city) {
        return cache.get(city);
    }
}
