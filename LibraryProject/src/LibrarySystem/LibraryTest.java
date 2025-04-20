import LoginSystem.LoginSystem;
import demosingleton.*;
import utils.LoadUserId;
import utils.Menu;
import utils.WriteUserId;

import static constant.Constant.*;

public class LibraryTest {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getLoginSystem();
        Menu menu = Menu.getMenu();

        //主程序逻辑
        menu.menu();
        int select = MyScanner.getScanner().nextInt();
        switch(select) {
            case LOG_IN:
                if(menu.login()) {
                    //进入系统
                }else {
                    //退出系统
                }
                break;
            case REGISTER:
                menu.register();
                //进入系统
                break;
        }
    }
}
