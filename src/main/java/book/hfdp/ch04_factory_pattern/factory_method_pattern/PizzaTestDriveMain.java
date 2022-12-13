package book.hfdp.ch04_factory_pattern.factory_method_pattern;

public class PizzaTestDriveMain {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore(); // 추상 클래스 = new 서브클래스(구상클래스)
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese"); // orderPizza에서 createPizza 가지고 있다
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

    }
}
