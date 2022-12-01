/*
package project;

import java.util.*;
import java.io.FileReader;

public class Test {

    public static void main(String[] args) throws Exception {

        Menu[] menus = new Menu[10];

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

            menus[count] = new Menu(numToken, menuToken, priceToken, infoToken);

            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Printing");
            menus[i].printNum();
            menus[i].printMenu();
            menus[i].printPrice();
            menus[i].printInfo();
        }

        fr.close();
    }
}

*/
