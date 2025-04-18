package demofactoryproxy;

import demosingleton.Static;
import user.AdminUser;
import user.User;

public class AdminFactory implements Factory{
    @Override
    public User createUser(String name, String password, int userId) {
        return new AdminUser(name,password, Static.getAdmimId());
    }
}
