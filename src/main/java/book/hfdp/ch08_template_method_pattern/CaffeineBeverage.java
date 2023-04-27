package book.hfdp.ch08_template_method_pattern;

public abstract class CaffeineBeverage { // 고수준 구성요소
    final void prepareRecipe(){ // final로 오버라이드 막기
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (customerWantsCondiments()) { // hook
            addCondiments();
        }
    }
    // brew, addCondiments는 가변적
    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("물 끓이는 중");

    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    boolean customerWantsCondiments(){ // hook
        return true;
    }

}
