package com.crud.boot.BootProject.sevice;



import com.crud.boot.BootProject.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(int id);
    void deleteUserById(int id);
    void createTable();
}
