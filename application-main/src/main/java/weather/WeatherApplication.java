package weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        System.out.println("Application started");
        SpringApplication.run(WeatherApplication.class, args);
    }

}
