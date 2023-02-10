package Chapter1.Implementations;

import Chapter1.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
