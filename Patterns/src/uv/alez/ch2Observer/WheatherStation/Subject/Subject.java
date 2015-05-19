package uv.alez.ch2Observer.WheatherStation.Subject;

import uv.alez.ch2Observer.WheatherStation.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
