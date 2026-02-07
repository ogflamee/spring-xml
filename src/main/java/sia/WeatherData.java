package sia;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherData {
    private String city;
    private double temperature;
    private LocalDateTime timestamp;

    public WeatherData(String city, double temperature, LocalDateTime timestamp) {
        this.city = city;
        this.temperature = temperature;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "sia.WeatherData{" +
                "city='" + city + '\'' +
                ", temperature=" + temperature +
                ", timestamp=" + timestamp +
                '}';
    }
}
