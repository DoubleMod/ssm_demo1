package com.itcast.service.Impl;

import com.itcast.dao.IUserDao;
import com.itcast.domain.User;
import com.itcast.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class IUserServiceIplm implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        List<User> userList = userDao.findAll();
        return userList;
    }

    @Override
    public User findById(Integer userId) {
        User user = userDao.findById(userId);
        return user;
    }

    @Override
    public void updataUser(User user) {
        userDao.updataUser(user);

    }
}
