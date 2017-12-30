package com.rohanswaby.service;

import com.rohanswaby.Model.User;

import java.util.List;

public interface UserServiceInterface {
    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);
}
