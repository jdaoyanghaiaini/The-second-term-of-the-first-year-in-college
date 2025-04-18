import utils.Menu;
import demosingleton.*;
import utils.WriteId;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        /*
           这里完成的是用户登录的过程
         */
//        Menu.menu();
//        Scanner scanner = new Scanner(System.in);
//        if((scanner.nextInt()) == 1)    Menu.login();
//        else    Menu.register();


        System.out.println(Static.getAdmimId());
        System.out.println(Static.getAdmimId());
        WriteId.writeId();
    }
}
