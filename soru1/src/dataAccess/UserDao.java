package dataAccess;

import entity.User;

import java.util.List;

public class UserDao {
    private static List<User> users;
    public void add(User user){
        users.add(user);

    }

    public UserDao() {
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        UserDao.users = users;
    }
}
