package book.hfdp.ch09_composite_pattern;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancake = new Menu("아침식당", "아침");
        MenuComponent diner = new Menu("저녁식당", "점심");
        MenuComponent cafe = new Menu("카페", "디저트");

        MenuComponent allMenus = new Menu("전체", "전체메뉴");

        allMenus.add(pancake);
        allMenus.add(diner);
        allMenus.add(cafe);

        diner.add(new MenuItem("파스타", "맛있는 파스타", true, 4.99));
        diner.add(new MenuItem("파이", "맛있는 파이", true, 6.99));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
