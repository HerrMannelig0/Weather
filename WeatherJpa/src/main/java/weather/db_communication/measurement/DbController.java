package weather.db_communication.measurement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class DbController {

    @Autowired
    private MeasurementService service;

    @RequestMapping("test")
    public Measurement getMeasurement() {

        Measurement measurement = new Measurement();
        measurement.setDate("124");
        measurement.setDescription("1");
        measurement.setPm10("21455600");
        service.add(measurement);
        return measurement;

    }

    @RequestMapping("test/list")
    private List<Measurement> getMeasurements() {
        return service.getAll();
    }

}
