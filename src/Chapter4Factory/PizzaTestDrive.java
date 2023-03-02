package Chapter4Factory;

import Chapter4Factory.PizzaStoreType.ChicagoStylePizzaStore;
import Chapter4Factory.PizzaStoreType.NYPizzaStore;

public class PizzaTestDrive {
    /**
     * The FACTORY METHOD
     * ------------------
     *The Factory Method Pattern defines an interface
     * for creating an object, but lets subclasses decide which
     * class to instantiate. Factory Method lets a class defer
     * instantiation to subclasses.
     */

    public static void main(String[] args) {
        String pizzaType = "cheese";
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza(pizzaType);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(pizzaType);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
