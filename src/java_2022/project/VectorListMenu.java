package java_2022.project;

import java.util.*;
import java.io.FileReader;
import java.util.Scanner;   

public class VectorListMenu {
    Scanner scanner = new Scanner(System.in); // 스캐너 사용을 위해 Scanner 객체 생성

    private static List<Menu> viewMenu() throws Exception {
        List<Menu> menus = new Vector<Menu>();

        FileReader fr = new FileReader("src/java_2022.project/Menu.txt");

        int readCharNo;
        char[] cbuf = new char[100];
        String data = null;
        while ((readCharNo = fr.read(cbuf)) != -1) {
            data = new String(cbuf, 0, readCharNo);
        }
        StringTokenizer st = new StringTokenizer(data, "-");


        while (st.hasMoreTokens()) {
            int numToken = Integer.parseInt(st.nextToken());
            String menuToken = st.nextToken();
            int priceToken = Integer.parseInt(st.nextToken());
            String infoToken = st.nextToken();

            menus.add(new Menu(numToken, menuToken, priceToken, infoToken));
        }
        for (int i = 0; i < menus.size(); i++) {
            Menu vectorMenu = menus.get(i);
            System.out.printf("%-5d", vectorMenu.num);
            System.out.printf("%-13s", vectorMenu.menu);
            System.out.printf("%-8d", vectorMenu.price);
            System.out.printf("%-30s", vectorMenu.info);
            System.out.println();
        }

        fr.close();

        return menus;
    }

    protected void pickMenu() throws Exception {
        List<Menu> pickMenus = new Vector<Menu>();
        System.out.println("메뉴를 선택하시오. (0 입력시 선택 초기화, -1 입력시 선택 종료)");

        List<Menu> menus = viewMenu(); // 메뉴판 보여주기

        while (true) {
            int count = -1;
            System.out.print(">> ");
            int inputInt = scanner.nextInt();

            if (inputInt > 0) {
                pickMenus.add(menus.get(inputInt - 1));
                count++;
                System.out.println(" 메뉴가 추가되었습니다.");
            } else if (inputInt == 0) {
                pickMenus.clear();
                System.out.println("메뉴 선택이 초기화되었습니다.");
                count = -1;
            } else if (inputInt == -1) {
                System.out.println("메뉴 선택 종료");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            /*System.out.println("현재까지 추가된 메뉴");
            for (int i = -1; i < count; i++) {
                pickMenus.get(i).printMenu();
            }*/
            // 수정+추가 되어야될 부분

        }
        int sum = pickMenus.stream().mapToInt(Menu::getPrice).sum();
        System.out.println("총 금액은 " + sum + "원 입니다.");
        System.out.println();
    }

    protected void payment() throws Exception {
        System.out.println("------------------");
        System.out.println("결제 방법을 선택해주세요.");
        System.out.println("1. 카드" + "\t" + "2. 현금");
        System.out.println("------------------");
        System.out.print(">> ");
        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("카드로 결제합니다.\n\n");
                System.out.println("Logout\n\n");
                break;
            case 2:
                System.out.println("현금으로 결제합니다.\n\n");
                System.out.println("Logout\n\n");
                break;

        }
    }

}