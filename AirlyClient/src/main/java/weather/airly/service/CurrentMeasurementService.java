package weather.airly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.airly.model.Measurement;

@Service
public class CurrentMeasurementService implements MeasurementService {

    @Autowired
    private AirlyConfigs configs;

    @Override
    public Measurement getCurrentMeasurement() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", configs.getApi());
        HttpEntity<Measurement> entity = new HttpEntity<>(headers);
        final ResponseEntity<Measurement> exchange = restTemplate.exchange(configs.getUrl(), HttpMethod.GET, entity, Measurement.class);

        return exchange.getBody();
    }

}
