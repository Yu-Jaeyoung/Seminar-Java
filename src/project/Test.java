package project;

import java.util.*;
import java.io.FileReader;

public class Test {

    public static void main(String[] args) throws Exception {

        List<Menu> menus = new Vector<Menu>();

        FileReader fr = new FileReader("src/project/Menu.txt");

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
         Menu menu = menus.get(i);
            //System.out.println(menu.num + "\t" + menu.menu + "\t" + menu.price + "\t" + menu.info);
            System.out.printf("%-5d",menu.num);
            System.out.printf("%-13s",menu.menu);
            System.out.printf("%-8d",menu.price);
            System.out.printf("%-30s",menu.info);
            System.out.println();
        }

        fr.close();
    }
}

