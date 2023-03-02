package Chapter4Factory;

import Chapter4Factory.PizzaStoreType.ChicagoStylePizzaStore;
import Chapter4Factory.PizzaStoreType.NYPizzaStore;

public class PizzaTestDrive {

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
