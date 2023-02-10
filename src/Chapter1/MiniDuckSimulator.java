package Chapter1;

import Chapter1.Implementations.FlyRocketPowered;

public class MiniDuckSimulator {
    /**
     * The STRATEGY Pattern
       --------------------
     *The Strategy Pattern defines a family of algorithms,
      encapsulates each one, and makes them interchangeable.
      Strategy lets the algorithm vary independently of
      clients that use it.
     * The Strategy pattern was use in design the Duck family and its algorithm,
       favoring composition over inheritance, and creating a system that's extensible.
     * */
    public static void main(String[] args) {
        System.out.println("MALLARD DUCK");
        System.out.println("------------");
        Duck mallard = new MallardDuck();
        mallard.perFormQuack();
        mallard.performFly();
        System.out.println();
        System.out.println();

        System.out.println("MODEL DUCK");
        System.out.println("------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perFormQuack();
        model.performFly();

    }
}
