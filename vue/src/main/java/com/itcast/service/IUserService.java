package com.itcast.service;

import com.itcast.domain.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public User findById(Integer userId);

    public void updataUser(User user);
}
