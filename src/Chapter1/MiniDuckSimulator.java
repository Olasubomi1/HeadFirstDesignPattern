package Chapter1;

import Chapter1.Implementations.FlyRocketPowered;

public class MiniDuckSimulator {
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
