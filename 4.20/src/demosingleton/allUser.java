package demosingleton;

import com.bit.utils.FileUtils;
import user.AdminUser;
import user.User;
import utils.LoadUser;
import utils.WriteUser;

/*
将用户的加载更新以及用户的全部成员都更新到这个里面进行统一的操作
 */
public class allUser {
    User[] allAdmin;
    User[] allNormal;
    //单例模式
    private static final allUser  allUser = new allUser();
    private final WriteUser writeUser = WriteUser.getWriteUser();
    private final LoadUser loadUser = LoadUser.getLoadUser();

    private allUser() {
      //从指定文件中读取数据
        this.allAdmin = loadUser.loadAllAdmin();
        this.allNormal = loadUser.loadAllNormal();
    };
    public static allUser getAllUser() {
        return allUser;
    }


    public User[] getAllAdmin() {
        return allAdmin;
    }
    public User[] getAllNormal() {
        return allNormal;
    }


    //加载所有的管理员
    public void loadAllAdmin() {
        this.allAdmin = loadUser.loadAllAdmin();
    }
    //加载所有普通成员
    public void loadAllNormal() {
        this.allNormal = loadUser.loadAllNormal();
    }

    //写数据到文档
    public void writeUser() {
        writeNormal();
        writeAdmin();
    }
    //根据id获取指定用户
    public User byIdGetAdmin(int id) {
        return null;
    }
    public User byIdGetNormal(int id) {
        return null;
    }
    public boolean createNewUser(User user) {
        //从用户系统拿到用户信息->检查容量是否不够了->扩容或添加;
        if(user instanceof AdminUser) {
            return true;
        }
        else {
            return true;
        }
    }

    private void writeAdmin() {
        writeUser.writeUser(this.allAdmin);
    }
    private void writeNormal() {
        writeUser.writeUser(this.allNormal);
    }


}
