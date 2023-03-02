package Chapter4Factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return null;
        }else return null;
    }
}
