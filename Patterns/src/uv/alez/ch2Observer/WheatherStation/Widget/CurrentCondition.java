package uv.alez.ch2Observer.WheatherStation.Widget;

import uv.alez.ch2Observer.WheatherStation.Observer.Observer;
import uv.alez.ch2Observer.WheatherStation.Subject.Subject;
import uv.alez.ch2Observer.WheatherStation.Subject.WeatherData;

public class CurrentCondition implements Widget, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentCondition(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity + "% humidity");
    }
}
