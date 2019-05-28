package weather.db_communication.measurement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    private MeasurementRepository repository;

    public void add(@NotNull Measurement measurement) {
        repository.save(measurement);
    }

    @Override
    public List<Measurement> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Measurement> getLast() {
        List<Measurement> allMeasurements = getAll();
        int lastMeasurementIndex = allMeasurements.size() - 1;
        return Optional.ofNullable(allMeasurements.get(lastMeasurementIndex));
    }

    @Override
    public Optional<Measurement> getById(@NotNull long id) {
        return repository.findById(id);
    }

}
