package demofactoryproxy;

import demosingleton.CreateUserId;
import user.NormalUser;
import user.User;
import utils.LoadUserId;

public class NormalFactory implements Factory{
    CreateUserId createUserId = CreateUserId.getCreateUserId();
    @Override
    public User createUser(String name, String password, int userId) {
        return new NormalUser(name,password,createUserId.getCreateNormalId());
    }
}
