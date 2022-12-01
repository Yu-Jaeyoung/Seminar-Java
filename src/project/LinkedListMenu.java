package project;

import java.util.*;
import java.io.FileReader;

public class LinkedListMenu {


    private static void menuReader() throws Exception {
        List<Menu> menus = new Vector<Menu>();
        int count = 0;
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
            Menu vectorMenu = menus.get(i);
            System.out.println(vectorMenu.num + "\t" + vectorMenu.menu + "\t" + vectorMenu.price + "\t" + vectorMenu.info);
        }

        fr.close();
    }
}