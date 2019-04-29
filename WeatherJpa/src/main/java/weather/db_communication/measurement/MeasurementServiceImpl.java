package weather.db_communication.measurement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementServiceImpl implements MeasurementService {

    @Autowired
    private MeasurementRepository repository;

    public void add(Measurement measurement) {
        repository.save(measurement);
    }

    @Override
    public List<Measurement> getAll() {
        return repository.findAll();
    }

}
