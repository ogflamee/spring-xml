package sia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("sia")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Value("${weather.cities}")
    private String cities;

    @Bean
    public List<String> citiesList() {
        return Arrays.asList(cities.split(", "));
    }

    @Bean
    public LocalDateTime currentTime() {
        return LocalDateTime.now();
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
