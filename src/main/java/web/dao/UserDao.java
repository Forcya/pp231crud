package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
