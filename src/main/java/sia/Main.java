package sia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        WeatherController controller = context.getBean(WeatherController.class);

        controller.printWeather("Minsk");
    }
}
