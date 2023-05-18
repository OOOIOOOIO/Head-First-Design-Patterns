package book.hfdp.ch09_iterator_pattern;

import book.hfdp.ch09_iterator_pattern.cafe.CafeMenu;
import book.hfdp.ch09_iterator_pattern.dinner.DinerMenu;
import book.hfdp.ch09_iterator_pattern.pancake.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();

    }
}
