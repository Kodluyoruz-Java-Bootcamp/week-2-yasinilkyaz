package business;

import dataAccess.UserDao;
import entity.User;

public class UserManager {
    private UserDao userDao;

    public UserManager() {
    }

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    public void addUser(User user){
        userDao.add(user);
    }

}
