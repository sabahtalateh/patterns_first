package uv.alez.ch2Observer.WheatherStation.Observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
