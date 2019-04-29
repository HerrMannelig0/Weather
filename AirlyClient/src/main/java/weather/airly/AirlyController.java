package weather.airly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.airly.model.AirlyMeasurement;
import weather.airly.service.CurrentMeasurementService;

@RestController
@RequestMapping("/weather/airly")
public class AirlyController {

    @Autowired
    private CurrentMeasurementService service;

    @GetMapping("example")
    public AirlyMeasurement get() {
        return service.getCurrentMeasurement();
    }

}
