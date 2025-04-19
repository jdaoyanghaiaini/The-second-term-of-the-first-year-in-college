package utils;

import LoginSystem.LoginSystem;
import demosingleton.MyScanner;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = MyScanner.getScanner();
    private static final LoginSystem loginSystem = LoginSystem.loginSystem();

    public static void menu() {
       System.out.println("**********    "+"图书馆"+"    **********");
       System.out.println("1. 登录");
       System.out.println("2. 注册");
   }

   public static void login() {
       System.out.println("1. 管理员登录");
       System.out.println("2. 普通用户登录");
       if((scanner.nextInt()) == 1)     loginSystem.adminLogin();              //调用管理员登录逻辑
       else     loginSystem.normalLogin();
   }

   public static void register() {
        //只有普通用户注册
        loginSystem.normalRegister();
   }
}
