package utils;

import com.bit.utils.FileUtils;
import constant.Constant;
import user.AdminUser;
import user.User;
/*
这个类用于将文件之中存储的用户信息全部读到内存之中，返回值为字符串
 */
public class LoadUser {
    private static final LoadUser loadUser = new LoadUser();
    public static LoadUser getLoadUser() {
        return loadUser;
    }
    private LoadUser() {

    };

    //两个加载用户的工具
    public User[] loadAllAdmin() {
        //创建一个新的User[]对象，读取文件,返回
        return null;
    }
    public User[] loadAllNormal() {
        return null;
    }


}
