package book.hfdp.ch09_iterator_pattern;

import book.hfdp.ch09_iterator_pattern.cafe.CafeMenu;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    CafeMenu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("아침식사");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("저녁식사");
        printMenu(dinerMenuIterator);
        System.out.println("카페 커피");
        printMenu(cafeMenuIterator);
    }

    // Iterator로 타입 통합
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.isVegetarian());
            System.out.println(menuItem.getPrice());

        }
    }
}
