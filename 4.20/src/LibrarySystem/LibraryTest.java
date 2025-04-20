package LibrarySystem;

import LoginSystem.LoginSystem;
import ProxyPattern.ProxyUser;
import demofactoryproxy.AdminFactory;
import demosingleton.*;
import user.AdminUser;
import user.NormalUser;
import user.User;
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
                    //直接创建一个对象进行操作
                    AdminUser admin = AdminUser.getAdmin();
                    ProxyUser proxy = new ProxyUser(admin);
                    //通过成员操作进入系统->调用display->图书馆中操作内容->直到输入退出
                    //在代理类里定义一个将指令转换为调用方法的方法，直到结束
                }else {
                    //退出系统
                }
                break;
            case REGISTER:
                menu.register();
                NormalUser normal = NormalUser.getNormal();
                ProxyUser proxy = new ProxyUser(normal);
                break;
        }
    }
}
