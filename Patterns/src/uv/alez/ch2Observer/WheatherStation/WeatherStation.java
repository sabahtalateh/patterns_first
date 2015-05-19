package uv.alez.ch2Observer.WheatherStation;

import uv.alez.ch2Observer.WheatherStation.Display.CurrentConditionsDisplay;
import uv.alez.ch2Observer.WheatherStation.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
    }
}
