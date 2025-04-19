package utils;

import com.bit.utils.FileUtils;
import constant.Constant;
import user.AdminUser;
import user.User;

public class LoadUser {
    private LoadUser() {

    };
    private static final LoadUser loadUser = new LoadUser();
    public static LoadUser getLoadUser() {
        return loadUser;
    }
    public String loadAdmin(User user) {
       if(user instanceof AdminUser) {
           String[] users = FileUtils.readFile("allAdminUser").split("\n");
           for(int i=0;i<users.length;i++) {
               String[]userParts = users[i].split(",");
               if(user.getUserId() == Integer.parseInt(userParts[2])) {
                   return users[i];
               }
           }
           try {
               throw new NoThisUserException(Constant.NO_THIS_USER);
           }
           catch (NoThisUserException e){
               e.printStackTrace();
           }
           return "";
       }
       else {
           String[] users = FileUtils.readFile("allNormalUser").split("\n");
           for(int i=0;i<users.length;i++) {
               String[]userParts = users[i].split(",");
               if(user.getUserId() == Integer.parseInt(userParts[2])) {
                   return users[i];
               }
           }
           try {
               throw new NoThisUserException(Constant.NO_THIS_USER);
           }
           catch (NoThisUserException e){
               e.printStackTrace();
           }
           return "";
       }
    }
}
