package sia.provider;

import sia.model.WeatherData;

public interface WeatherProvider {
    WeatherData getWeather(String city);
}
