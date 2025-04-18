package LoginSystem;

import demofactoryproxy.AdminFactory;
import demofactoryproxy.NormalFactory;
import demosingleton.MyScanner;
import demosingleton.Static;
import user.User;

import java.util.Scanner;

public  class LoginSystem {
    private static final LoginSystem loginSystem = new LoginSystem();
    public static LoginSystem loginSystem() {
        return loginSystem;
    }
    private LoginSystem() {

    }
    //登录模式：管理员
    public void adminLogin() {
        System.out.println("请输入你的userId");
        int userId = MyScanner.getScanner().nextInt();
        //在指定文档中去寻找userId匹配密码是否一直

    }
    //登录模式：普通用户
    public void normalLogin() {
        int userId = MyScanner.getScanner().nextInt();
    }
    //注册模式:
    public  void normalRegister() {
        String userName = MyScanner.getScanner().nextLine();
        String password = MyScanner.getScanner().nextLine();
        NormalFactory normalFactory = new NormalFactory();
        User newNormal = normalFactory.createUser(userName,password, Static.getNormalId());
        //写到指定的文档中

    }
}
