package uv.alez.ch2Observer.WheatherStation;

import uv.alez.ch2Observer.WheatherStation.Subject.WeatherData;
import uv.alez.ch2Observer.WheatherStation.Widget.CurrentCondition;
import uv.alez.ch2Observer.WheatherStation.Widget.Forecast;
import uv.alez.ch2Observer.WheatherStation.Widget.Statistic;
import uv.alez.ch2Observer.WheatherStation.Widget.Widget;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData wd = new WeatherData();

        Widget curCon = new CurrentCondition(wd);
        Widget stat = new Statistic(wd);
        Widget forecast = new Forecast(wd);

        wd.setMeasurements(80, 50, 50.4f);
        Thread.sleep(1000l);
        wd.setMeasurements(49, 41, 40.3f);
        Thread.sleep(1000l);
        wd.setMeasurements(66, 54, 39.4f);
    }
}
