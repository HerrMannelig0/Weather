package weather.db_communication.measurement;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

class MeasurementServiceImplTest {

    @Test
    void testGetLast() {
        get("http://localhost:8080/measurement/one?id=1").then().body(
                "id", is(1));
    }

}