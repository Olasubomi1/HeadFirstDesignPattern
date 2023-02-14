package Chapter1Strategy.Implementations;

import Chapter1Strategy.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }
}
