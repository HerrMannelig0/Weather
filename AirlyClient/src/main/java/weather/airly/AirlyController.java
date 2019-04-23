package weather.airly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.airly.model.Measurement;
import weather.airly.service.MeasurementService;

@RestController
@RequestMapping("/weather/airly")
public class AirlyController {

    @Autowired
    private MeasurementService service;

    @GetMapping("example")
    public Measurement get() {
        return service.getCurrentMeasurement();
    }

}
