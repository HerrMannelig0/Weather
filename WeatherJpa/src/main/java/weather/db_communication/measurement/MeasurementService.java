package weather.db_communication.measurement;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface MeasurementService {

    void add(Measurement measurement);

    List<Measurement> getAll();

    Optional<Measurement> getLast();

    Optional<Measurement> getById(@NotNull long id);
}
