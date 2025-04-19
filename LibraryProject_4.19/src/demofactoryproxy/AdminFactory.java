package demofactoryproxy;

import demosingleton.CreateUserId;
import user.AdminUser;
import user.User;
import utils.LoadUserId;

public class AdminFactory implements Factory{
    CreateUserId createUserId = CreateUserId.getCreateUserId();
    @Override
    public User createUser(String name, String password, int userId) {
        return new AdminUser(name,password,createUserId.getCreateAdminId());
    }
}
