package book.hfdp.ch09_composite_pattern;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------");

        for (MenuComponent component : menuComponents) {
            component.print();
        }

    }
}
