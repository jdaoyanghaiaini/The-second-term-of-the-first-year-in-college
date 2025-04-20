package utils;

import com.bit.utils.FileUtils;
import demosingleton.allUser;
import user.AdminUser;
import user.User;
/*
这个类要将内存中的用户信息写回到文件之中进行保存
 */
public class WriteUser {
    private WriteUser() {

    }
    private final static WriteUser writeUser = new WriteUser();
    public static WriteUser getWriteUser() {
        return writeUser;
    }

    public void writeUser(User[] users) {
        //这里完成对两种用户的同时加载

    }
}
