package LoginSystem;

import demofactoryproxy.NormalFactory;
import demosingleton.CreateUserId;
import demosingleton.MyScanner;
import user.User;
import utils.LoadUser;
import utils.LoadUserId;
import utils.WriteUser;
import utils.WriteUserId;

public  class LoginSystem {
    private static final LoadUser loaduser = LoadUser.getLoadUser();
    private static final WriteUser writeUser = WriteUser.getWriteUser();
    private static final LoginSystem loginSystem = new LoginSystem();
    private final CreateUserId createUserId = CreateUserId.getCreateUserId();
    public static LoginSystem loginSystem() {
        return loginSystem;
    }
    private LoginSystem() {

    }
    //登录模式：管理员
    public void adminLogin() {
        System.out.println("请输入你的userId");
        int userId = MyScanner.getScanner().nextInt();
        //在指定文档中去寻找userId匹配密码是否一至

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
        User newNormal = normalFactory.createUser(userName,password, createUserId.getCreateNormalId());
        //写到指定的文档中

    }
}
