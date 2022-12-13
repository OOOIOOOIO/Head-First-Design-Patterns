package book.hfdp.ch04_factory_pattern.factory_method_pattern;

public class NYPizzaStore extends PizzaStore { // 객체 생성을 처리하는 클래스 == 팩토리
    @Override
    Pizza createPizza(String type) { // 팩토리 메서드 구현

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza(); // 서브클래스에서 인스턴스를 생성한다.
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else{
            return null;
        }
    }
}
