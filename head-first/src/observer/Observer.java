package observer;

import java.util.Observable;

public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
