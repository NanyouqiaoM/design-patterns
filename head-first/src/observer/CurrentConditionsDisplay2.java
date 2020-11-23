package observer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Observable;
import java.util.Observer;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
    float temperature;

    float humidity;

    Observable observable;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
