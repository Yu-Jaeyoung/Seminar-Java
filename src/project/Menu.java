package project;

public class Menu {
    int num;
    String menu;
    int price;
    String info;

    public Menu(int num, String menu, int price, String info) {
        this.num = num;
        this.menu = menu;
        this.price = price;
        this.info = info;
    }

    public void printNum() {
        System.out.println(num);
    }

    public void printMenu() {
        System.out.println(menu);
    }

    public void printPrice() {
        System.out.println(price);
    }

    public void printInfo() {
        System.out.println(info);
    }

    public int getPrice() { return price;}
}
