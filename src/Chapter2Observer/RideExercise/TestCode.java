package Chapter2Observer.RideExercise;

import Chapter2Observer.RideExercise.Customer.Customer;
import Chapter2Observer.RideExercise.Driver.Driver;

public class TestCode {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Driver driver = new Driver(customer);
        Driver driver1 = new Driver(customer);

        customer.setData( "Olasubomi",
                +2348154433626l,
                "Ota");

        customer.setData( "Ben",
                +2348154433626l,
                "Sabo");

        customer.setData( "Tobiloba",
                +2348154433626l,
                "Ebute");
    }
}
