package Chapter1;

import Chapter1.Duck;
import Chapter1.Implementations.FlyWithWings;
import Chapter1.Implementations.Quack;

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
