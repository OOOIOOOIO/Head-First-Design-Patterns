package book.hfdp.ch09_iterator_pattern.pancake;

import book.hfdp.ch09_iterator_pattern.Menu;
import book.hfdp.ch09_iterator_pattern.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("블루베리 팬케익", "블루베리와 시럽 펜케익", true, 3.55);
        addItem("와플 팬케익", "와플과 펜케익", false, 4.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;

    }

    // 기타 관련 메서드


    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
