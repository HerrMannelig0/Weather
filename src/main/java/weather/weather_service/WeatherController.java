package weather.weather_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping
    public Info getInfo(){
        final Info steven = new Info(1, "Steven");
        return steven;
    }


}
