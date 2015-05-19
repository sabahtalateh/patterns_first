package uv.alez.ch2Observer.WheatherStation.Observer;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
