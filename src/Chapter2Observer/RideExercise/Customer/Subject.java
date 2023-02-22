package Chapter2Observer.RideExercise.Customer;

import Chapter2Observer.Observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
