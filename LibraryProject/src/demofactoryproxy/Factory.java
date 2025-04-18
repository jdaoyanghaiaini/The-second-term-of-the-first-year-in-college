package demofactoryproxy;

import demosingleton.Static;
import user.User;


public interface Factory {
    User createUser(String name,String password,int userId);
}
