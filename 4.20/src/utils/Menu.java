package utils;

import LoginSystem.LoginSystem;
import demosingleton.MyScanner;

import java.util.Scanner;
/*
这个类负责打印菜单
已完成
 */
public class Menu {
    private static final Scanner scanner = MyScanner.getScanner();
    private static final LoginSystem loginSystem = LoginSystem.getLoginSystem();
    private static final Menu menu = new Menu();
    private Menu() {

    }
    public static Menu getMenu() {return menu;}

    public  void menu() {
       System.out.println("**********    "+"图书馆"+"    **********");
       System.out.println("1. 登录");
       System.out.println("2. 注册");
   }

   public boolean login() {
       boolean status =false;
       System.out.println("1. 管理员登录");
       System.out.println("2. 普通用户登录");
       if((scanner.nextInt()) == 1){
          return loginSystem.adminLogin();//调用管理员登录逻辑

       }
       else{
           return loginSystem.normalLogin();
       }
   }

   public void register() {
        //只有普通用户注册,自动进入系统
        loginSystem.normalRegister();
   }
}
