package uv.alez.ch2Observer.WheatherStation.Widget;

import uv.alez.ch2Observer.WheatherStation.Observer.Observer;
import uv.alez.ch2Observer.WheatherStation.Subject.WeatherData;

public class Forecast implements Widget, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public Forecast(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
