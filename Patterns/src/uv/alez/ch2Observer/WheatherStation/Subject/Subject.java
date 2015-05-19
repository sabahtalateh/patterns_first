package uv.alez.ch2Observer.WheatherStation.Subject;

import uv.alez.ch2Observer.WheatherStation.Observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
