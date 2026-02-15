package sia.cache.impl;

import org.springframework.stereotype.Component;
import sia.model.WeatherData;
import sia.cache.WeatherCache;

import java.util.HashMap;
import java.util.Map;

@Component
public class SimpleWeatherCache implements WeatherCache {
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
