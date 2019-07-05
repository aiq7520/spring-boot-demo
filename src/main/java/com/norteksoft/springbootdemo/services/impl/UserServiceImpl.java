package com.norteksoft.springbootdemo.services.impl;

import com.norteksoft.springbootdemo.controller.UserController;
import com.norteksoft.springbootdemo.entity.User;
import com.norteksoft.springbootdemo.repostitory.UserReponstitory;
import com.norteksoft.springbootdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author gege
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserReponstitory userReponstitory;
    @Override
    public Page<User> users(Integer pageNum,Integer pageSize) {
        return userReponstitory.findAll(PageRequest.of(pageNum,pageSize));
    }

    @Override
    public User save(User user) {
        return userReponstitory.save(user);
    }

    @Override
    public Optional<User> get(Long id) {
        return userReponstitory.findById(id);
    }

    @Override
    public void delete(Long id) {
        userReponstitory.deleteById(id);
    }
}
