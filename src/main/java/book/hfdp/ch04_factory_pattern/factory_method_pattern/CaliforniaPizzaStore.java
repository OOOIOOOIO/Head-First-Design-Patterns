package book.hfdp.ch04_factory_pattern.factory_method_pattern;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else{
            return null;
        }
    }
}
