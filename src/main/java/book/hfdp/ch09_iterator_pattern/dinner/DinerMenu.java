package book.hfdp.ch09_iterator_pattern.dinner;

import book.hfdp.ch09_iterator_pattern.Menu;
import book.hfdp.ch09_iterator_pattern.MenuItem;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("핫도그", "머스타드 양파 핫도그", false, 3.99);
        addItem("샐러드", "상추 양파 깻잎", true, 3.22);


    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");

        }
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;

        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    // 기타 관련 메서드


    @Override
    public Iterator<MenuItem> createIterator() {
        return Arrays.stream(menuItems).iterator();
    }
}
