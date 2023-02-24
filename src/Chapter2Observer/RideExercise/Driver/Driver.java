package Chapter2Observer.RideExercise.Driver;

import Chapter2Observer.RideExercise.Customer.Customer;

public class Driver implements Observer{
    private String name;
    private Number phoneNumber;
    private String location;
    private Customer customer;

    public Driver(Customer customer){
        this.customer = customer;
        customer.registerObserver(this);
    }

    public void display(){
        System.out.println(toString());
    }

    @Override
    public void update() {
        this.name = customer.getName();
        this.phoneNumber = customer.getPhoneNumber();
        this.location = customer.getLocation();
        display();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", location='" + location + '\'' +
                '}';
    }
}
