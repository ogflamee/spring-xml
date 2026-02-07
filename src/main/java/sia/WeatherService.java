package sia;

public class WeatherService {
    private final WeatherProvider provider;
    private final WeatherCache cache;
    private final boolean cacheEnabled;

    public WeatherService(WeatherProvider provider, WeatherCache cache, boolean cacheEnabled) {
        this.provider = provider;
        this.cache = cache;
        this.cacheEnabled = cacheEnabled;

    }

    public WeatherData getWeather(String city) {
        if (cacheEnabled) {
            WeatherData cached = cache.get(city);
            if (cached != null) {
                return cached;
            }
        }

        WeatherData data = provider.getWeather(city);
        if (cacheEnabled) {
            cache.put(city, data);
        }
        return data;
    }
}
