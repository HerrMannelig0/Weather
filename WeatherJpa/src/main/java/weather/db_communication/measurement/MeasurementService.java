package weather.db_communication.measurement;

import java.util.List;

public interface MeasurementService {

    void add(Measurement measurement);

    List<Measurement> getAll();

}
