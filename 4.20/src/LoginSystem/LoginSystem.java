package LoginSystem;

import demofactoryproxy.NormalFactory;
import demosingleton.CreateUserId;
import demosingleton.MyScanner;
import demosingleton.allUser;
import user.User;
import utils.*;
/*
框架已完成4.20
 */
public  class LoginSystem {
    private static final LoginSystem loginSystem = new LoginSystem();
    private final CreateUserId createUserId = CreateUserId.getCreateUserId();
    private final allUser allUser = demosingleton.allUser.getAllUser();

    public static LoginSystem getLoginSystem() {
        return loginSystem;
    }
    private LoginSystem() {

    }

    //登录模式：管理员
    public boolean adminLogin() {
        System.out.println("请输入你的adminId");
        int adminId = MyScanner.getScanner().nextInt();
        MyScanner.getScanner().nextLine();//清楚换行符
        //根据ID->获得一个用户->比较
        User user = allUser.byIdGetAdmin(adminId);
        if(user == null) {
            System.out.println("不存在该用户");
            return false;
        }
        //验证是否正确
        //正确：->进入系统
        //不正确->在给两次机会
        System.out.println("请输入你的密码");
        boolean flag = false;
        for(int i=0;i<=2;i++) {
            String password = MyScanner.getScanner().nextLine();
            if(user.getPassword().equals(password)) {
                //进入图书馆系统，退出循环
                flag = true;
                break;
            }
            else {
                if(i!=2) {
                    System.out.println("密码错误你还有" + (2 - i) + "次机会");
                }
            }
        }
        if(flag) {
            return true;
        }
        else {
            System.out.println("账户登录失败！");
            return false;
        }
    }
    //登录模式：普通用户
    public boolean normalLogin() {
        System.out.println("请输入你的normalId");
        int normalId = MyScanner.getScanner().nextInt();
        MyScanner.getScanner().nextLine();//清楚换行符
        User user = allUser.byIdGetNormal(normalId);
        if(user == null) {
            System.out.println("不存在该用户");
            return false;
        }

        System.out.println("请输入你的密码");
        boolean flag = false;
        for(int i=0;i<=2;i++) {
            String password = MyScanner.getScanner().nextLine();
            if(user.getPassword().equals(password)) {
                //进入图书馆系统，退出循环
                flag = true;
                break;
            }
            else {
                if(i!=2) {
                    System.out.println("密码错误你还有" + (2 - i) + "次机会");
                }
            }
        }
        if(flag) {
            return true;
        }
        else {
            System.out.println("账户登录失败！");
            return false;
        }
    }

    //注册模式:
    public  void normalRegister() {
        String userName = MyScanner.getScanner().nextLine();
        String password = MyScanner.getScanner().nextLine();
        NormalFactory normalFactory = new NormalFactory();
        //创建一个新的用户
        User newNormal = normalFactory.createUser(userName,password, createUserId.getCreateNormalId());
        allUser.createNewUser(newNormal);

    }
}
