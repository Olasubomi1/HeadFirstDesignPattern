package Chapter1Strategy;

import Chapter1Strategy.Implementations.FlyWithWings;
import Chapter1Strategy.Implementations.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck.");
    }
}
