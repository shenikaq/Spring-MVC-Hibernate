package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoEntity;
import web.model.User;
import java.util.List;

@Service
public class UserServiceEntity implements UserService {
//    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private UserDao userDao;

    public UserServiceEntity () {
        userDao = new UserDaoEntity();
    }

    @Transactional
    public void create(User user) {
        userDao.create(user);
    }
    @Transactional
    public void delete(Long id) {
        User user = userDao.getById(id);
        if (user != null) {
            userDao.delete(user);
        }
    }
    @Transactional
    public List<User> getAll() {
        return userDao.getAll();
    }
    @Transactional
    public User getById(long id) {
        return userDao.getById(id);
    }
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }
}
