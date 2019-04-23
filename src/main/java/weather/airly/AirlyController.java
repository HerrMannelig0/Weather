package weather.airly;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import weather.airly.model.Measurement;


@RestController
@RequestMapping("/weather/airly")
public class AirlyController {

    public static final String API = "QzlXjAp2XIGw3h07Al205Uj6swCxJTlz";

    @GetMapping("example")
    public Measurement get() {
        final String url = "https://airapi.airly.eu/v2/measurements/point?indexType=AIRLY_CAQI&lat=50.062006&lng=19.940984";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", API);
        HttpEntity<Measurement> entity = new HttpEntity<>(headers);
        final ResponseEntity<Measurement> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, Measurement.class);

        return exchange.getBody();
    }

}
