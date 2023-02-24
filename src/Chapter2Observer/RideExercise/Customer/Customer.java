package Chapter2Observer.RideExercise.Customer;

import Chapter2Observer.RideExercise.Driver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Subject{
    List<Observer> observers;
    private String name;
    private long phoneNumber;
    private String location;
    private Boolean isAvailable = false;

    public Customer(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    public void setData(String name, long phoneNumber, String location){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.location = location;
        isAvailable = true;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public Number getPhoneNumber() {
        return phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
