package Chapter3Decorator;

public abstract class Beverage {
    /**
     *  THE DECORATOR PATTERN
     *  The decorator pattern attaches additional responsibility to an object dynamically.
     *  Decorators provide a flexible alternative to subclassing for extending functionalities.
     *
     */
    String description = "Unknown beverage.";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
