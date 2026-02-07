package sia;

public interface WeatherCache {
    void put(String city, WeatherData data);
    WeatherData get(String city);
}
