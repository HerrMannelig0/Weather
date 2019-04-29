package weather.measurement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import weather.airly.model.Current;
import weather.airly.model.Values;
import weather.airly.service.CurrentMeasurementService;
import weather.db_communication.measurement.Measurement;
import weather.db_communication.measurement.MeasurementService;

import java.util.Arrays;
import java.util.Optional;

@Controller
@RequestMapping("/measurement")
public class MeasurementController {

    @Autowired
    private MeasurementService measurementService;

    @Autowired
    private CurrentMeasurementService currentMeasurementService;

    @GetMapping
    public String getMainPage() {
        return "index";
    }

    @GetMapping("/all")
    public String getAllMeasurements(Model model) {
        model.addAttribute("measurements", measurementService.getAll());
        return "all_measurements";
    }

    @GetMapping("/new")
    public String getAndSaveNewMeasurement(Model model) {

        final var currentMeasurement = currentMeasurementService.getCurrentMeasurement();
        final var current = currentMeasurement.getCurrent();

        final var date = current.getFromDateTime();
        final String pm10;
        final String description;

        try {
            pm10 = getPm10FromCurrentMeasurement(current);
            description = getDescriptionFromCurrentMeasurement(current);
        } catch (InvalidMeasurementException e) {
            return "error";
        }

        var measurement = new Measurement(date, pm10, description);
        model.addAttribute("measurement", measurement);

        return "new_measurement";
    }


    @PostMapping("/save")
    public String saveMeasurement(Measurement measurement, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "error";
        }

        measurementService.add(measurement);
        model.addAttribute("measurements", measurementService.getAll());
        return "all_measurements";
    }

    private String getDescriptionFromCurrentMeasurement(Current current) throws InvalidMeasurementException {
        final var indexes = Arrays.stream(current.getIndexes()).findFirst().orElseThrow(InvalidMeasurementException::new);
        return Optional.ofNullable(indexes.getDescription()).orElse("");
    }

    private String getPm10FromCurrentMeasurement(Current current) throws InvalidMeasurementException {
        return Arrays.stream(current.getValues()).filter(value -> "PM10".equals(value.getName())).map(Values::getValue).findFirst().orElseThrow(InvalidMeasurementException::new);
    }

}
