package book.hfdp.ch04_factory_pattern.v1;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else{
            return null;
        }
    }
}
