package com.crud.boot.BootProject.dao;



import com.crud.boot.BootProject.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(int id);
    void deleteUserById(int id);
    void createTable();
}
