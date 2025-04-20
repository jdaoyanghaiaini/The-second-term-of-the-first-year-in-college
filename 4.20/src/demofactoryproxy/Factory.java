package demofactoryproxy;

import user.User;


public interface Factory {
    User createUser(String name,String password,int userId);
}
