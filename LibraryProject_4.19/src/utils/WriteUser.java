package utils;

import com.bit.utils.FileUtils;
import user.AdminUser;
import user.User;

public class WriteUser {
    private WriteUser() {

    }
    private static final WriteUser writeUser = new WriteUser();

    public static WriteUser getWriteUser() {
        return writeUser;
    }

    public  void writeUser(User user) {
        if(user instanceof AdminUser) {
            FileUtils.writeFile(user.toJson(),"allAdminUser");
        }
        else {
            FileUtils.writeFile(user.toJson(),"allNormalUser");
        }
    }
}
