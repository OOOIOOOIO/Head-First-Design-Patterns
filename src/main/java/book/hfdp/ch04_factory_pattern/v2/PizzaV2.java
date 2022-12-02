package book.hfdp.ch04_factory_pattern.v2;

public abstract class PizzaV2 {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();


    void bake(){
        System.out.println("175도에서 25분 동안 굽기");
    }

    void cut(){
        System.out.println("피자를 사선으로 자르기");
    }

    void box(){
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        // 피자 이름 출력 부분
        return "피자 이름 출력 부분";
    }
}
