package book.hfdp.ch09_iterator_pattern.cafe;

import book.hfdp.ch09_iterator_pattern.Menu;
import book.hfdp.ch09_iterator_pattern.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("아메리카노", "따듯함", true, 0.99);
        addItem("카페라뗴", "차가움", true, 0.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }


    // Iterator로 통합
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
