package Chapter1Strategy.Implementations;

import Chapter1Strategy.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
