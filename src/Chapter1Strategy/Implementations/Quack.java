package Chapter1Strategy.Implementations;

import Chapter1Strategy.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
