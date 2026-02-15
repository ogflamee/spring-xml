package sia.cache;

import sia.model.WeatherData;

public interface WeatherCache {
    void put(String city, WeatherData data);
    WeatherData get(String city);
}
