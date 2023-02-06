package ru.ramkosh.CRUDBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ramkosh.CRUDBoot.dao.UserDao;
import ru.ramkosh.CRUDBoot.model.User;


import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserDao userDao;
@Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUser();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User newUser) {
        userDao.updateUser(newUser);
    }

    @Override
    public void removeUser(Long id) {
        userDao.removeUser(id);
    }

}
