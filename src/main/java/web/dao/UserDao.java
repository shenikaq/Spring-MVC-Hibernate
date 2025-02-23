package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void create(User user);
    void delete(User user);
    List<User> getAll();
    void update(User user);
    User getById(long id);
}
