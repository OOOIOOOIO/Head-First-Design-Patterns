package book.hfdp.ch09_composite_pattern;

import lombok.Getter;

@Getter
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }


    @Override
    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("V");

        }
        System.out.println(", " + getPrice());
        System.out.println(" -- " + getDescription());
    }
}
