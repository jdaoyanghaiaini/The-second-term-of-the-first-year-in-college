package demofactoryproxy;

import demosingleton.Static;
import user.NormalUser;
import user.User;

public class NormalFactory implements Factory{
    @Override
    public User createUser(String name, String password, int userId) {
        return new NormalUser(name,password, Static.getNormalId());
    }
}
