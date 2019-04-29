package weather.airly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.airly.model.AirlyMeasurement;

@Service
public class CurrentCurrentMeasurementServiceImpl implements CurrentMeasurementService {

    @Autowired
    private AirlyConfigs configs;

    @Override
    public AirlyMeasurement getCurrentMeasurement() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", configs.getApi());
        HttpEntity<AirlyMeasurement> entity = new HttpEntity<>(headers);
        final ResponseEntity<AirlyMeasurement> exchange = restTemplate.exchange(configs.getUrl(), HttpMethod.GET, entity, AirlyMeasurement.class);

        return exchange.getBody();
    }

}
