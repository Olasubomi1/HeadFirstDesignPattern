package Chapter1.Implementations;

import Chapter1.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
