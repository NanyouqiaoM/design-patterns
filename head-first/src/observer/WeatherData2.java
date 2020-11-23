package observer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Observable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WeatherData2 extends Observable {

    float temperature;

    float humidity;

    float pressure;

    public WeatherData2() {
    }

    public void measurementsChanger() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanger();
    }
}
