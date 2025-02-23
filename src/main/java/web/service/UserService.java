package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void create(User user);
    void delete(Long id);
    List<User> getAll();
    User getById(long id);
    void update(User user);
}
