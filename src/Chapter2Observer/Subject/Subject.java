package Chapter2Observer.Subject;

import Chapter2Observer.Observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
