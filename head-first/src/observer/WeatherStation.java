package observer;

public class WeatherStation {
    public static void main(String[] args) {
       /* WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(11,22,33);
        weatherData.setMeasurements(12,23,34);
        */
        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionsDisplay2 currentConditionsDisplay2 = new CurrentConditionsDisplay2(weatherData2);
        weatherData2.setMeasurements(11,22,33);
        weatherData2.setMeasurements(12,23,34);
    }
}
