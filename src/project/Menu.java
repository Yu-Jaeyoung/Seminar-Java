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
        System.out.println(this.num);
    }

    public void printMenu() {
        System.out.println(this.menu);
    }

    public void printPrice() {
        System.out.println(this.price);
    }

    public void printInfo() {
        System.out.println(this.info);
    }
}
