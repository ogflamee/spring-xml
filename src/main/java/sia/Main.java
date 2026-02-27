package sia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sia.config.AppConfig;
import sia.controller.WeatherController;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        WeatherController controller = context.getBean(WeatherController.class);

        controller.printWeather("Minsk");
    }
}
