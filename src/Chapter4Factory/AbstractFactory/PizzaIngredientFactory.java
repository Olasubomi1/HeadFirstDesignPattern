package Chapter4Factory.AbstractFactory;

public interface PizzaIngredientFactory{
    /**
     * ABSTRACT FACTORY
     * ----------------
     * The Abstract factory provides an interface for creating families of related
     * or dependent objects without specifying their concrete classes.
     *
     */
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
