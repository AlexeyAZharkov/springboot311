package ru.zharkov.springboot.springboot311.dao;

import ru.zharkov.springboot.springboot311.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, User updatedUser);
    User getUserById(Long id);
    List<User> listUsers();
}
