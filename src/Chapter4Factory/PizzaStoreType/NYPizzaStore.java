package Chapter4Factory.PizzaStoreType;

import Chapter4Factory.NYStyleCheesePizza;
import Chapter4Factory.Pizza;
import Chapter4Factory.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return null;
        }else return null;
    }
}
