package Chapter1Strategy.Implementations;

import Chapter1Strategy.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
