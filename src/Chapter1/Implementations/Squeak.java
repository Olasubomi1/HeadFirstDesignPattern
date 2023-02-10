package Chapter1.Implementations;

import Chapter1.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
