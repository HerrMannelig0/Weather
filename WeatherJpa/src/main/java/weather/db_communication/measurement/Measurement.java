package weather.db_communication.measurement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "MEASUREMENT")
public class Measurement {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name = "DATE")
    private String date;
    @Column(name = "PM10")
    private String pm10;
    @Column(name = "DESCRIPTION")
    private String description;

    public Measurement() {
    }

    public Measurement(String date, String pm10, String description) {
        this.date = date;
        this.pm10 = pm10;
        this.description = description;
    }

    public Measurement(Long id, String date, String pm10, String description) {
        this.id = id;
        this.date = date;
        this.pm10 = pm10;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
